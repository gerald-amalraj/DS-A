package com.algo.search;

import java.util.Stack;

public class ReverseStackwithoutLoops {

	static Stack<Character> st = new Stack<>();

	static void insert_at_bottom(char x) {
		System.out.println("Char::: " + x);
		if (st.isEmpty()) {
			System.out.println("ST:::: "+x);
			st.push(x);

		}else {

			// All items are held in Function
			// Call Stack until we reach end
			// of the stack. When the stack becomes
			// empty, the st.size() becomes 0, the
			// above if part is executed and
			// the item is inserted at the bottom
			char a = st.peek();
			System.out.println("A:: " + a);
			System.out.println("Pop::: " + st.pop());
			insert_at_bottom(x);

			// push allthe items held
			// in Function Call Stack
			// once the item is inserted
			// at the bottom
			st.push(a);
		}
	}

	// Below is the function that
	// reverses the given stack using
	// insert_at_bottom()
	static void reverse() {
		if (st.size() > 0) {

			// Hold all items in Function
			// Call Stack until we
			// reach end of the stack
			char x = st.peek();
			System.out.println("Reverse: X "+x);
			System.out.println("Pop Reverse::: " + st.pop());
			System.out.println("Size::: "+st.size());
			reverse();

			// Insert all the items held
			// in Function Call Stack
			// one by one from the bottom
			// to top. Every item is
			// inserted at the bottom
			insert_at_bottom(x);
		}
	}

	public static void main(String[] args) {

		st.push('1');
		st.push('2');
		//st.push('3');
		//st.push('4');

		System.out.println("Original Stack");

		System.out.println(st);

		// function to reverse
		// the stack
		reverse();

		System.out.println("Reversed Stack");

		System.out.println(st);

	}

}
