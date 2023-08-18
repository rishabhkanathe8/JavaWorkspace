package com.stack;

public interface StackInterface {

	public boolean isFull();
	
	public boolean isEmpty();
	
	public void push(Integer data);
	
	public Integer pop();
	
	public void display();
	
	public Integer findMax();
	
	public void stackReverse();
	
	public void reverseArray(Integer array[]);
}
