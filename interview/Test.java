package com.interview;

class Parent {
	public void sum() {
		System.out.println("parent");
	}

}

class Child extends Parent {
	public void sum() {
		System.out.println("child");
	}

}

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent p2 = new Child();
		//Child c2 = (Child) new Parent();
		p.sum();
		c.sum();
		p2.sum();
		//c2.sum();
		
	}

}