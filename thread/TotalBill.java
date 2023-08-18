package com.thread;

public class TotalBill extends Thread {

	public int totalAmount;

	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				totalAmount = totalAmount + 100;
			}
			this.notify();
		}
	}
}
