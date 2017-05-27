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
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		urlNode.setNext(getHead());
		getHead().setPrevious(urlNode);
		pointHeadTowards(urlNode);
		return urlNode;
	}
	
	public void moveUrlToHead(Node urlNode){
		if (urlNode == null || urlNode == getHead())
			return;
		
		if (urlNode == tail){
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		
		Node previous = urlNode.getPrevious();
		Node next = urlNode.getNext();
		
		previous.setNext(next);
		
		if (next != null)
			next.setPrevious(previous);
		
		urlNode.setPrevious(null);
		urlNode.setNext(getHead());
		getHead().setPrevious(urlNode);
		pointHeadTowards(urlNode);
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
