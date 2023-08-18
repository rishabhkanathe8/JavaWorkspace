package com.thread;
//the main purpose of join is to put the thread into temprorary waiting state

//if we want to execute completly any perticular thread among all the thread available

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		Join t1 = new Join();
		Join t2 = new Join();
		Join t3 = new Join();
		t1.setName("first");
		t2.setName("second");
		t3.setName("third");
		t2.start();
		t2.join();
		t1.start();
		t3.start();
		System.out.println("Ending ");

	}
}

class Join extends Thread {

	public void run() {
		for (int i = 1; i < 50; i++) {
			System.out.println("name " + this.getName() + " " + i);
		}
	}
}
