package mak.ds.section4.linkedlist;

import java.util.Random;
import java.util.stream.IntStream;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		Random randomNumberGenerator = new Random();
		
		IntStream.generate(()->randomNumberGenerator.nextInt(10))
				 .limit(10)
				 .forEach(dataToInsert -> {System.out.println(dataToInsert);
				 							linkedList.makeSortedLinkedList(dataToInsert);
				 						  }
						 );
	
		System.out.println(linkedList);
		//System.out.println("The length of linked list:" + linkedList.length());
		//System.out.println("Find 3: " + linkedList.find(3));
	}
}
