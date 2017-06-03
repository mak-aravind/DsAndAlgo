package mak.ds.section4.linkedlist;

public class LinkedList {
	private Node head;
	private int length;
	
	public Node find(int searchKey){
		if (head == null)
			return null;
		Node current = head;
		while (current.getNext() != null){
			if (current.getData() == searchKey)
				return current;
			current = current.getNext();
		}
		return null;
	}
	
	public void insertAtHead(int data){
		length++;
		Node newNode = new Node(data);
		if (head == null){
			newNode.setNext(null);
			head = newNode;
		}else{
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void makeSortedLinkedList(int dataToInsert){
		Node newNode = new Node(dataToInsert);
		if (head == null){
			head = newNode;
			return;
		}
		Node nodeToInsertAfter = head;
		
		if (dataToInsert < nodeToInsertAfter.getData()){
			newNode.setNext(nodeToInsertAfter);
			head = newNode;
			return;
		}
		
		while(nodeToInsertAfter !=null && 
				dataToInsert > nodeToInsertAfter.getData() &&
				(nodeToInsertAfter.getNext()!=null && 
				dataToInsert > nodeToInsertAfter.getNext().getData())) {
				
			nodeToInsertAfter = nodeToInsertAfter.getNext();
		}
		newNode.setNext(nodeToInsertAfter.getNext());
		nodeToInsertAfter.setNext(newNode);
	}
	
	public void deleteNodeAtHead(){
		if (head == null)
			return;
		head = head.getNext();
	}
	
	public int length(){
		if (head == null) return 0;
		Node current = head;
		int length=0;
		while (current.getNext() != null){
			length++;
			current = current.getNext();
		}
		return length;
	}

	@Override
	public String toString() {
		if (head == null) return "Empty List";
		StringBuilder result = new StringBuilder();
		result.append("Contents of Linkedlist :");
		Node current = head;
		while (current != null){
			result.append(current);
			current = current.getNext();
			if (current != null)
				result.append("->");
			else
				result.append("->null");
		}
		return result.toString();
	}
}
