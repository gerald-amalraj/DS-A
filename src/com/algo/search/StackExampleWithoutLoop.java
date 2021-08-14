package com.algo.search;

public class StackExampleWithoutLoop {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		return (top < 0);
	}

	StackExampleWithoutLoop() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack "+top);
			return true;
		}
	}

	int pop() {
		System.out.println("===> "+top);
		
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int val = top--;
			System.out.println("###### "+val);
			int x = a[val];
			return x;
		}
	}



	public static void main(String args[]) {
		StackExampleWithoutLoop s = new StackExampleWithoutLoop();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack");
	}
}
