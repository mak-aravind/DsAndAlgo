package mak.algo.sort.selection;

public class SelectionSort {
	public void sort(int[] data){
		for (int i = 0;i<data.length-1;i++){
			int minIndex = findIndexOfMinElement(data, i);
			swapElements(data, i, minIndex);
		}
	}

	private int findIndexOfMinElement(int[] data, int startIndex) {
		int minIndex = startIndex;
		for(int j=startIndex+1;j<data.length;j++){
			if (data[j] < data[minIndex]){
				minIndex = j;
			}
		}
		return minIndex;
	}

	private void swapElements(int[] data, int i, int minIndex) {
		int tmp = data[i];
		data[i] = data[minIndex];
		data[minIndex] = tmp;
	}
}
