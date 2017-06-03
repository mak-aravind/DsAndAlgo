package mak.ds.section4.doublylinkedlist;

public class Node {
	
	private Node previous;
	private Node next;
	private int data;
	
	public Node(int data){
		this.data = data;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
