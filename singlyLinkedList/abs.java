package com.singlyLinkedList;

abstract class animal {
	abstract void show();
}

class dog extends animal {
	@Override
	void show() {
		System.out.println("dog");
	}
}

class abs {
	public static void main(String args[]) {
		dog d = new dog();
		d.show();
	}
}