package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack implements StackInterface {
	private Integer stack[];
	private Integer top;

	public Stack(Integer length) {
		this.stack = new Integer[length];
		this.top = -1;
	}

	@Override
	public boolean isFull() {
		if (stack.length - 1 == top) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (this.top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void push(Integer data) {

		if (isFull()) {
			return;
		} else {
			top++;
			stack[top] = data;
		}
	}

	@Override
	public Integer pop() {
		int temp = 0;
		if (isEmpty()) {
			return null;
		} else {
			temp = stack[top];
			stack[top] = null;
			top--;
			return temp;
		}

	}

	@Override
	public void display() {

		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i] + ", ");
		}
	}

	@Override
	public Integer findMax() {
		int max = 0;

		for (int i = 0; i < stack.length; i++) {

			if (stack[i] != null && stack[max] < stack[i]) {
				stack[max] = stack[i];
			}
		}
		return stack[max];
	}

	@Override
	public void stackReverse() {

		Queue<Integer> queue = new LinkedList<>();

		while (!this.isEmpty()) {
			int temp = this.pop();
			queue.add(temp);

		}
		while (!queue.isEmpty()) {
			int temp = queue.remove();
			this.push(temp);
		}
	}

	@Override
	public void reverseArray(Integer[] array) {

		// Stack stack = new Stack(array.length);
		Stack stack = new Stack(array.length);
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			stack.push(temp);
		}
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
			System.out.print(array[i] + ", ");
		}
		System.out.print("] \n");
	}

}
