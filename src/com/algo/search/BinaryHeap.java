package com.algo.search;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeap {

	public final int INITIAL_SIZE = 20;
	public int[] heapArray;
	public int heapSize;

	public BinaryHeap() {
		heapArray = new int[INITIAL_SIZE];
		heapSize = 0;
		// TODO
	}

	public int getMax() {
		int root = 0;
		if (heapSize != 0)
			root = heapArray[0];
		return root;
		// TODO
	}

	/*
	 * NOTE. parent and isNodeValid are utility methods. You may or may not use them
	 * depending on how you write your code.
	 */

	private int parent(int i) {
		if (i % 2 == 0) // right
			return (i - 2) / 2;
		else // left
			return (i - 1) / 2;
	}

	private boolean isNodeValid(int i) {
		return i < heapSize;
	}

	// siftup
	private void makeHeap_insert(int i) {
		int parentI, temp;
		if (i != 0) {
			parentI = parent(i);
			if (heapArray[parentI] > heapArray[i]) {
				temp = heapArray[parentI];
				heapArray[parentI] = heapArray[i];
				heapArray[i] = temp;
				//makeHeap_insert(parentI);
			}
		}
	} // TODO

	// siftdown
	private void makeHeap_remove(int i) {
		int leftChildIndex, rightChildIndex, minIndex, tmp;
		leftChildIndex = (2 * i) + 1;
		rightChildIndex = (2 * i) + 2;
		if (rightChildIndex >= heapSize) {
			if (leftChildIndex >= heapSize)
				return;
			else
				minIndex = leftChildIndex;
		} else {
			if (heapArray[leftChildIndex] <= heapArray[rightChildIndex])
				minIndex = leftChildIndex;
			else
				minIndex = rightChildIndex;
		}
		if (heapArray[i] > heapArray[minIndex]) {
			tmp = heapArray[minIndex];
			heapArray[minIndex] = heapArray[i];
			heapArray[i] = tmp;
			makeHeap_remove(minIndex);
		}
		// TODO
	}

	public void insert(int newVal) {
		if (heapSize == heapArray.length)
			throw new IllegalArgumentException("Can't Insert anymore ");
		else {
			heapSize++;
			heapArray[heapSize - 1] = newVal;
			makeHeap_insert(heapSize - 1);
			// TODO
		}
	}

	public int removeMax() {
		if (heapSize == 0)
			throw new IllegalArgumentException("Heap is empty ");
		else {
			heapArray[0] = heapArray[heapSize - 1];
			heapSize--;
			if (heapSize > 0)
				makeHeap_remove(0);
			return heapArray[0];
		}
	}

	// Since tree is ALWAYS complete, printLevelOrder simply prints
	// entire tree from 0 to heapSize-1
	public void printLevelOrder() {
		for (int i = 0; i < heapSize; i++)
			System.out.print(heapArray[i] + ", ");
		System.out.println();
	}

	public static void main(String[] args) {
		BinaryHeap h = new BinaryHeap();

		h.printLevelOrder();

		System.out.print("Inserting 5: ");
		h.insert(5);
		h.printLevelOrder();

		System.out.print("Inserting 3: ");
		h.insert(3);
		h.printLevelOrder();

		System.out.print("Inserting 7: ");
		h.insert(7);
		h.printLevelOrder();

		System.out.print("Inserting 2: ");
		h.insert(2);
		h.printLevelOrder();

		System.out.print("Inserting 8: ");
		h.insert(8);
		h.printLevelOrder();

		System.out.println("Max Value is: " + h.getMax());

		System.out.print("Inserting 11: ");
		h.insert(11);
		h.printLevelOrder();

		System.out.println("Max Value is: " + h.getMax());

		System.out.println("Removing max: " + h.removeMax());
		h.printLevelOrder();

		System.out.println("Removing max: " + h.removeMax());
		h.printLevelOrder();

		System.out.print("Inserting 1: ");
		h.insert(1);
		h.printLevelOrder();

		System.out.print("Inserting 12: ");
		h.insert(12);
		h.printLevelOrder();

		System.out.println("Max Value is: " + h.getMax());
	}
}
