package com.singlyLinkedList;

public class SinglyLinkedList implements SinglyInterface {
	Node head;

	public SinglyLinkedList() {
		super();
		this.head = null;

	}

	@Override
	public void addAtFirst(int data) {

		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;

		} else {
			newNode.next = head;
			head = newNode;

		}
	}

	@Override
	public void addAtLst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	@Override
	public void deleteAtFirst() {

		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;
		}
		head = head.next;

	}

	@Override
	public void deleteAtLast() {
		Node current = head;
		Node previous = null;

		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;
		}
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
	}

	@Override
	public void print() {

		Node current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}

		System.out.print("] \n");
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void reverse() {
		Node current = head;
		Node previous = null;
		Node temp = null;
		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		head = previous;
		
		//Node current = head;
		//Node previous =null;
		// Node temp = null;
		//while(current != null){
		//temp = current.next;
		// current.next = previous;
		//preious = current;
		//current = temp;
		//}
		//Head = previous;
	}
	
	public int length() {
		Node current = head;
		int counter=0;
		while(current != null) {
			counter++;
			current = current.next;
		}
		return counter;
	}
	public void getMiddle() {
		int lengths = length()/2;
		Node current = head;
		while(lengths != 0) {
			lengths--;
			current= current.next;
		}
		System.out.println(current.data);
	}
	
	public void getMiddleElement() {
		Node temp = head;
		Node current = head;
		while(current!=null &&current.next != null) {
			temp = temp.next;
			current = current.next.next;
		}
		System.out.println(temp.data);
	}
//	 Node slow = head;
//	    Node fast = head;
//	    while (fast != null && fast.next != null) {
//	        slow = slow.next;
//	        fast = fast.next.next;
//	    }
//	    System.out.println(slow.data);
}
