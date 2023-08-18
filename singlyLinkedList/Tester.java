package com.singlyLinkedList;

public class Tester {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addAtFirst(10);
		list.addAtFirst(30);
		list.addAtFirst(50);
		list.addAtLst(40);
		list.addAtLst(60);
		list.addAtLst(60);
		list.print();
		//list.deleteAtFirst();
//		list.deleteAtLast();
//		list.deleteAtLast();
		
		list.print();
		//list.reverse();
		list.print();
		list.getMiddle();
		list.getMiddleElement();
		
		
	}
}
