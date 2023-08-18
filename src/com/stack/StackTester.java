package com.stack;

public class StackTester {

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(20);
		stack.push(40);
		stack.push(410);
		stack.push(30);
		stack.display();
//		stack.pop();
//		stack.pop();
	//	stack.display();
		System.out.println();
//		System.out.println(stack.findMax());
		System.out.println();
		stack.stackReverse();
		stack.display();
		Integer arr[]= {1,2,3,4,5,6,7};
		stack.reverseArray(arr);

	}

}
