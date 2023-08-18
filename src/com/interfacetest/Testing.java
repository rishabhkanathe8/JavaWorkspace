package com.interfacetest;

public class Testing implements one {
	private final int i =1;
	private static int j=1;
	private int k=1;
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	public void hello() {
		System.out.println("Class ");
		one.super.hello();
	}
	
	public static void main(String[] args) {
		Testing t = new Testing();
	System.out.println(t.i);
	t.j=2;
	t.k=2;
	System.out.println(t.j);
	System.out.println(t.k);
		t.hello();
		Testing tt= new Testing();
		tt.j++;
		tt.k++;
		System.out.println(tt.j);
		System.out.println(tt.k);
				
	}

}
