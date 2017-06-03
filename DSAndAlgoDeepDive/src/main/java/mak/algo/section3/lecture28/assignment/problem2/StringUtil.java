package mak.algo.section3.lecture28.assignment.problem2;

public class StringUtil {

	public boolean hasDuplicate(String data){
		
		char[] dataAsArray = data.toCharArray();
		
		int[] mapToPosition = new int[128];
		
		for (int c : dataAsArray) {
			if (mapToPosition[c] == 0)
				mapToPosition[c]++;
			else
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String data = "aravind";
		//String data = "duplicate";
		System.out.println(new StringUtil().hasDuplicate(data));
	}
	
}
