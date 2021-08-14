package com.algo.search;


public class DoubleLinkLists {
	   Node head;
	
	public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }
	
	
	public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();

        while (current != null) {
            sb.append(current.data)
              .append(" ");
            current = current.next;
        }

        return sb.toString();
    }
	
	 public Node insertBefore(Node givenNode, int data) {
         Node newNode = new Node(data);
         newNode.prev = givenNode.prev;
         givenNode.prev = newNode;
         newNode.next = givenNode;

         if (newNode.prev != null) {
             newNode.prev.next = newNode;
         }

         return newNode;
     }
	 
	 public Node insertInFront(int data) {
         Node newNode = new Node(data);
        
         if(head != null)
        	  System.out.println("== "+head.data);
         
         newNode.next = head;
         newNode.prev = null;

         if (head != null) {
             head.prev = newNode;
         }

         head = newNode;
       
         return newNode;
     }

    public static void main(String[] args) {
    	DoubleLinkLists dll = new DoubleLinkLists();
        
    	DoubleLinkLists.Node node5 = dll.insertInFront(5);
    	DoubleLinkLists.Node node4 = dll.insertInFront(4);
    	DoubleLinkLists.Node node2 = dll.insertInFront(2);
    	DoubleLinkLists.Node node1 = dll.insertInFront(1);
    	DoubleLinkLists.Node node3 = dll.insertBefore(node4, 3);
    	

        System.out.println(dll);
    }

}