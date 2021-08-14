package com.algo.search;



public class DoublyLinkedList {
	Node head;
	
	static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	
	}
	
	
	void printNodes() {
		Node n = head;			
			while(n!=null) {				
				System.out.print(n.data+ " ");	
				n = n.next;
			}		
	}
	
	void addElementAtFirst(int data) {		
		Node newNode = new Node(data);		
		newNode.next = head;
		newNode.prev = null;		
		head.prev = newNode;		
		head = newNode;
	}
	
	void addNodeAtEnd(int data) {
		Node n = head;
		Node newNode = new Node(data);
		Node temp=null;
		
		while(n != null) {
			temp=n;
			n = n.next;
		}		
		newNode.prev = temp;
		newNode.next = null;
		temp.next=newNode;
	}
	
	void addAfterGivenNode(Node prevNode, int data){
		Node newNode = new Node(data);		
		newNode.next = prevNode.next;
		prevNode.next = newNode; 		
	}
	
	void addBeforeGivenNode(Node givenNode, int data) {
		
		 Node newNode = new Node(data);
         newNode.prev = givenNode.prev;
         givenNode.prev = newNode;
         newNode.next = givenNode;

         if (newNode.prev != null) {
             newNode.prev.next = newNode;
         }
				
	}
	
	void deleteNode(int key) {
		Node temp = null;
		Node pre=null;
		System.out.println("$$$ "+head.data);
		if(head!=null && head.data == key) {
			head.next.prev=null;
			head = head.next;
			
		}else {
			temp = head;
			while(temp!=null && temp.data != key) {
				pre = temp;
				temp = temp.next;
			}
			System.out.println("==> "+temp.data);
			temp.next.prev = temp.prev;
			
			//temp.prev.next=temp.next;
			
		}
		
	}	
	
	 public void delete(Node head, int position) {
	        Node current = head;
	        Node previous = null;
	 
	        int i = 1;
	        while (i < position) {
	            previous = current;
	            System.out.println("=>====> "+previous.data);
	            current = current.next;
	            System.out.println("==>===> "+current.data);
	            i++;
	        }
	 
	        if (previous != null) {
	            previous.next = current.next;
	            if (current.next != null) {
	                current.next.prev = previous;
	            System.out.println("==>>>===> "+current.next.prev.data);
	            }
	        } else {
	            head = current.next;
	            head.prev = null;
	        }
	 
	        System.out.print("Output : ");
	        
	        // head;
	    }
	
	
			
	public static void main(String[] args) {
		DoublyLinkedList dll  = new DoublyLinkedList();
		dll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);	
		
		dll.head.next = second;
		second.next = third;
		dll.printNodes();
		
		System.out.println();		
		dll.addBeforeGivenNode(third, 6);
		dll.printNodes();
		
		System.out.println();		
		dll.addElementAtFirst(0);
		dll.printNodes();
		
		System.out.println();		
		dll.addNodeAtEnd(4);
		dll.printNodes();
		
		System.out.println();		
		dll.addAfterGivenNode(second, 5);
		dll.printNodes();
		
		System.out.println();		
		dll.deleteNode(0);
		dll.printNodes();
		
		System.out.println();		
		dll.delete(dll.head,3);
		dll.printNodes();
		
		
	}

}
