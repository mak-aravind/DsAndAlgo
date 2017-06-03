package mak.algo.sort.insertion;

import java.util.Arrays;

public class App {
	public static void main(String[] args){
		int[] array = {4,7,2,9,3,8,1,5,4};
		System.out.println("Before Sorting:");
		Arrays.stream(array).forEach(i -> System.out.print(i+" "));
		new InsertionSort().sort(array);
		System.out.println("\nAfter Sorting:");
		Arrays.stream(array).forEach(i -> System.out.print(i+" "));
	}
}
