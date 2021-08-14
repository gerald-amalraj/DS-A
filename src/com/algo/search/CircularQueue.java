package com.algo.search;

import java.util.Arrays;

public class CircularQueue<E> {
	
	int capacity;
	int currentSize;
	int front;
	int rear;
	E[] circularArray;
	
	CircularQueue(int capacity){
		this.capacity = capacity;
		currentSize = 0;
		front = -1;
		rear = -1;
		circularArray = (E[]) new Object[this.capacity];
	}
	
	void enqueue(E item) {
		rear = (rear+1)%capacity;
		circularArray[rear] = item;
		currentSize++;
		if(front == -1)
			front = rear;
		
		System.out.println(Arrays.toString(circularArray));
	}
	
	void dequeue() {
		E dequeEle = circularArray[front];
		circularArray[front] = null;
		front = (front+1)%capacity;
		currentSize--;
		
		System.out.println(Arrays.toString(circularArray));
	}
	
	void front() {
		System.out.println("Front value is "+ circularArray[front]);
	}
	
	void rear() {
		System.out.println("Rear value is "+circularArray[rear]);
	}

	public static void main(String[] args) {
	
		CircularQueue circularQueue = new CircularQueue(5);
		
		circularQueue.enqueue(10);
		circularQueue.enqueue(40);
		circularQueue.enqueue(50);
		circularQueue.enqueue(70);
		circularQueue.enqueue(30);
		
		circularQueue.rear();
		circularQueue.front();
		
		circularQueue.dequeue();
		
		circularQueue.rear();
		circularQueue.front();
		
		circularQueue.enqueue(20);
		
		
	}

}
