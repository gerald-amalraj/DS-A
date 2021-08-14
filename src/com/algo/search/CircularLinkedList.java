package com.algo.search;

public class CircularLinkedList {
	Node last;
	
	static class Node{
		Node next;
		int data;				
		Node(int data){
			this.data = data;
		}
	}
	
	void createCircularLinkedList() {
		Node first = new Node(1);
		Node second = new Node(5);
		Node third = new Node(10);
		Node fourth = new Node(15);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	void display() {
		if(last == null) { // If list is empty
			return;
		}		
		Node first = last.next; // last.next node is assigned to first node		
		while(first != last) {
			System.out.print(first.data+" ");
			first = first.next; //traverse first.next to first
		}
		System.out.print(first.data+" "); // To print the last element
	}
	
	
	void removeFirstNode() {		
		Node temp = last.next;		
		if(last.next == last) {
			return;
		}		
		last.next = temp.next;
		temp.next = null;		
	}
	
	void removeLastNode() {
		Node firstNode = last.next;
		Node lastButOne = firstNode;
		Node temp=null;
		while(lastButOne!=null && lastButOne.data != last.data) {
			temp = lastButOne;
			lastButOne = lastButOne.next;
		}
		last.next = null;
		temp.next = firstNode;
		last = temp;
	}
	
	void removeNodeAt(int removeNode) {
		Node temp = last.next;
		Node current =null;
		while(temp!=null && temp.data != removeNode) {
			current = temp;
			temp = temp.next;
		}		
		current.next = temp.next;
	}
	
	void addNodeAtLast(int data) {
		Node newNode = new Node(16);
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
	}
	
	void addNodeAtFirst(int data) {
	Node newNode = new Node(8);
	Node firstNode = last.next;
	last.next = newNode;
	newNode.next = firstNode;
	}
	
	public static void main(String...strings ) {
		CircularLinkedList cll = new CircularLinkedList();		
		cll.createCircularLinkedList();	
		cll.display();
		
		System.out.println();
		cll.removeFirstNode();
		cll.display();
		
		System.out.println();
		cll.removeNodeAt(10);
		cll.display();
		
		System.out.println();
		cll.addNodeAtLast(16);
		cll.display();
		
		System.out.println();
		cll.addNodeAtFirst(8);
		cll.display();
		
		System.out.println();
		cll.removeLastNode();
		cll.display();
		
		
	}
}
