package com.list;

public class Tester {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtFirst(10);
		list.addAtFirst(2);
		list.addAtFirst(30);
		list.addAtLast(59);
		list.addAtLast(529);
		list.addAtLast(159);
		list.print();
		list.reverseList();
		list.print();
		
		System.out.println(list.isPresent(300));
	}

}
