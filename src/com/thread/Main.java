package com.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		TotalBill t2 = new TotalBill();
//		Thread t1 = new Thread(t2);
//		t1.start();
		t2.start();
		synchronized (t2) {
			t2.wait();
			System.out.println("The total bill is " + t2.totalAmount + " Rs");
		}

	}
}
