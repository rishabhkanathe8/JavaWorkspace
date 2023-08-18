package com.thread;

public class TestYeild {
	public static void main(String[] args) {

		Yeild y = new Yeild();
		y.start();
		for (int i = 11; i < 20; i++) {
			System.out.println("Main thread exectuing " + i);
		}
		System.out.println("Exiting main thread ");
	}

}

class Yeild extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				Thread.yield();
			}
			System.out.println("In second thread " + i);
		}
		System.out.println("ENding second Thread");
	}
}