package mak.algo.sort.bubble;

public class BubbleSort {
	public void sort(int[] data){
		for (int i = 0;i<data.length-1;i++){
			for (int j = 0;j<data.length-1-i;j++){
				if (data[j] > data[j+1]){
					swap(data, j);
				}
			}
		}
	}

	private void swap(int[] data, int j) {
		int temp = data[j+1];
		data[j+1] = data[j];
		data[j] = temp;
	}
}
