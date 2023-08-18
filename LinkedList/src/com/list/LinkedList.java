package com.list;

public class LinkedList {

	Node root;

	public LinkedList() {
		this.root = null;
	}

	public void addAtFirst(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			newNode.next = root;
			root = newNode;
		}
	}

	public void addAtLast(int data) {
		Node newNode = new Node(data);
		Node current = root;
		if (root == null) {
			root = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void reverse() {
		Node current = root;
		Node previous = null;
		Node temp = null;

		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		root = previous;
	}
	
	public void reverseList() {
		Node current = root;
		Node previous = null;
		Node temp = null;
		while(current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		root = previous;
	}

	public boolean isPresent(int search) {
		Node current = root;
		if (root == null) {
			return false;
		}
		while (current != null) {
			if (current.data == search) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void print() {
		Node current = root;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.print("]\n");
	}

}
