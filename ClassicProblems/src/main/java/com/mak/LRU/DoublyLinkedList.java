package com.mak.LRU;

public class DoublyLinkedList {
	private final int capacity;
	private int size;
	private Node head;
	private Node tail;
	
	public Node getTail(){
		return tail;
	}

	public Node getHead() {
		return head;
	}

	public void pointHeadTowards(Node head) {
		this.head = head;
	}
	
	public int getCapacity() {
		return capacity;
	}
	

	public int getListSize() {
		return size;
	}

	public DoublyLinkedList(int capacity){
		this.capacity = capacity;
		this.size=0;
	}
	
	public Node addUrlToHistory(String url){
		Node urlNode = new Node(url);
		if (getHead() == null){
			urlNode.setUrl(url);
			pointHeadTowards(urlNode);
			tail = urlNode;
			size=1;
			return urlNode;
		}else if (getListSize() < getCapacity()){
			size++;
		}else{
			deleteNodeAtTail();
		}
		urlNode.setNext(getHead());
		getHead().setPrevious(urlNode);
		pointHeadTowards(urlNode);
		return urlNode;
	}

	private void deleteNodeAtTail() {
		tail = tail.getPrevious();
		tail.setNext(null);
	}
	
	public void moveUrlToHead(Node urlNodeToMove){
		if (urlNodeToMove == null || urlNodeToMove == getHead())
			return;
		
		if (urlNodeToMove == tail){
			deleteNodeAtTail();
		}
		
		Node previous = urlNodeToMove.getPrevious();
		Node next = urlNodeToMove.getNext();
		
		previous.setNext(next);
		
		if (next != null)
			next.setPrevious(previous);
		
		urlNodeToMove.setPrevious(null);
		urlNodeToMove.setNext(getHead());
		getHead().setPrevious(urlNodeToMove);
		pointHeadTowards(urlNodeToMove);
	}
	

	public void printList(){
		if (getHead() == null){
			return;
		}
		
		Node tmp = getHead();
		while (tmp != null){
			System.out.println(tmp);
			tmp = tmp.getNext();
		}
	
	}
}
