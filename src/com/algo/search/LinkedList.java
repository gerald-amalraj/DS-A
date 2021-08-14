package com.algo.search;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public void push(int newData) {
		Node newNode = new Node(newData);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertNodeAt(Node prevNode, int newNodeData) {
		Node newNode = new Node(newNodeData);
		
		newNode.next = prevNode.next;
		
		prevNode.next = newNode;
						
		//System.out.println(prevNode.next.data);
	}
	
	public void nodeAtEnd(int newLastNodeData) {		
		
		Node lastNode = new Node(newLastNodeData);
		lastNode.next = null;
		Node last = head;
		while(last.next != null) {				
			last = last.next;			
		}
		System.out.println(last.data);
		last.next = lastNode;
	}
	
	public void deleteNodeAt(int deletionNode) {
		Node temp = head, prev=null;
		
		if(temp !=null && temp.data == deletionNode) {
			head = temp.next;
			return;
		}
		while(temp!=null && temp.data != deletionNode) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)return;
		
		prev.next = temp.next;
	
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;
		
		llist.push(4);
		
		llist.insertNodeAt(second, 5);
		
		llist.nodeAtEnd(7);
				
		llist.printList();
		System.out.println();
		llist.deleteNodeAt(3);
		llist.printList();
		
	}

}
