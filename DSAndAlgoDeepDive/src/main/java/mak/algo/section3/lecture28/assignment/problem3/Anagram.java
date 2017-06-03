package mak.algo.section3.lecture28.assignment.problem3;

public class Anagram {

	public boolean isAnagram(String word1, String word2){
		
		if (word1.length() != word2.length()){
			return false;
		}
		
		char[] word1AsArray = word1.toCharArray();
		char[] word2AsArray = word2.toCharArray();
		int[] mapToPosition = new int[128];
		
		int uniqueCharacterInWord1=0;
		for (int c : word1AsArray) {
			if (mapToPosition[c] == 0)
				uniqueCharacterInWord1++;
			mapToPosition[c]++;
		}

		int uniqueCharacterInWord2=0;
		for (int c : word2AsArray) {
			mapToPosition[c]--;
			if(mapToPosition[c] < 0)
				return false;
			else if (mapToPosition[c] == 0)
				uniqueCharacterInWord2++;
		}
		return uniqueCharacterInWord1 == uniqueCharacterInWord2; 
	}
	
	public static void main(String[] args) {
		System.out.println(new Anagram().isAnagram("god", "dogi"));
	}
}
