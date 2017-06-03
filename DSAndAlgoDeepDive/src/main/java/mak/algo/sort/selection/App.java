package mak.algo.sort.selection;

import java.util.Arrays;

public class App {
	public static void main(String[] args){
		int[] data = {4,7,2,9,3,8,1,5};
		System.out.println("Before Sorting:");
		Arrays.stream(data).forEach(i -> System.out.print(i+" "));
		new SelectionSort().sort(data);
		System.out.println("\nAfter Sorting:");
		Arrays.stream(data).forEach(i -> System.out.print(i+" "));
	}
}
