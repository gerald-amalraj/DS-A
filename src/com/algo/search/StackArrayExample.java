package com.algo.search;

import java.util.Arrays;

public class StackArrayExample<E> {

	int capacity;
	int front;
	int rear;
	int currentSize;
	E[] stackArr;  
	
	StackArrayExample(int capacity){
		this.capacity = capacity;
		currentSize=0;
		front=0;
		rear=capacity-1;
		stackArr = (E[]) new Object[this.capacity-1];
	}
	
	void push(E item) {
		rear = rear%capacity-1;
		stackArr[rear] = item;
		front = rear;
		currentSize++;
		System.out.println(Arrays.toString(stackArr));
	}
	
	void pop() {
		System.out.println(stackArr[front]);		
		for(int i=0;i<currentSize-1;i++) {
			stackArr[i]=stackArr[i+1];			
		}
		currentSize--;
	}
	
	
	

	public static void main(String[] args) {
		StackArrayExample stackArrExample = new StackArrayExample(5);
		
		stackArrExample.push(10);
		stackArrExample.push(30);
		stackArrExample.push(50);
		stackArrExample.push(70);
		
		stackArrExample.pop();
		stackArrExample.pop();
		stackArrExample.pop();
		stackArrExample.pop();
		
	}

}
