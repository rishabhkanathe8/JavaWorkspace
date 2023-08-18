package com.wolterskluwer;

public class CircularQueue {

	Object queue[];
	int front;
	int rear;
	int size;

	public CircularQueue(int size) {
		this.queue = new Object[size];
		this.front = -1;
		this.rear = -1;
		this.size = size;

	}

	public boolean inQueue(int value) {

		if (rear == size - 1 && front == 0 || rear == front - 1) {
			return false;
		} else if (rear == -1 && front == -1) {
			rear = front = 0;
			queue[rear] = value;
			return true;
		} else if (rear == size - 1 && front != 0) {
			rear = 0;
			queue[rear] = value;
			return true;
		} else {

			rear++;
			queue[rear] = value;
		}
		return true;

	}

	public int deQueue() {
		if (rear == -1 && front == -1) {
			return -1;
		} else if (front == rear) {
			int temp = (int) queue[front];
			queue[front] = null;
			rear = front = -1;
			return temp;
		} else if (front == size - 1) {
			int temp = (int) queue[front];
			queue[front] = null;
			front = 0;
			return temp;
		}
		int temp = (int) queue[front];
		queue[front] = null;
		front++;

		return temp;
	}

}
