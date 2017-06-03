package mak.ds.section4.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	
	public void insertToHead(int dataToInsert){
		Node newNode = new Node(dataToInsert);
		if (head == null){
			head = newNode;
			return;
		}
		
		newNode.setNext(head);
		head.setPrevious(newNode);
		head = newNode;
	}
}
