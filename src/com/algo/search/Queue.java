package com.algo.search;

import java.util.Arrays;

class Queue {
	
	int front,rear,size;
	int capacity;
	int[] arr;
	
	Queue(int capacity){
		this.capacity= capacity;
		front=this.size =0;
		rear=capacity-1;
		
		arr =new int[this.capacity];
	}
	
	  public void enqueue(int item) {

		this.rear = (this.rear+1)%this.capacity;
		this.arr[this.rear]=item;
		this.size = this.size+1;
		    
		    System.out.println(Arrays.toString(arr));
	  }
	
	private void dequeue() {
		int item = this.arr[this.front];
		System.out.println("===> "+item);
		
		this.front = this.front+1;
		this.size = this.size-1;
				
	}
	
	int front() {	
		return this.arr[this.front];
	}
	
	int rear() {
		return this.arr[this.rear];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.dequeue();

		queue.dequeue();

		System.out.println("Front item is " + queue.front());

		System.out.println("Rear item is " + queue.rear());
	}
}
