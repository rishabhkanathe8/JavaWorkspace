package com.test;

 class Test1 {

	public void foo() {
		System.out.println("test 1 foo ");
	}
	
}

class Test2 extends Test1{
	public void foo() {
		System.out.println("test 2 foo ");
	}
}

public class Test extends Test2{
	public void foo() {
		System.out.println("test  foo ");
	}
	
	public static void main(String[] args) {
		//final Test t = (Test) new Test1();
		final Test t = new Test();
		t.foo();
		Test t2 = new Test();
		
	}
}
