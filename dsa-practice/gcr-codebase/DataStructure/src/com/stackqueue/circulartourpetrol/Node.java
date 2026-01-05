package com.stackqueue.circulartourpetrol;

public class Node {
	   public PetrolPump data;
	   public  Node next;

	   public Node(PetrolPump data) {
	        this.data = data;
	        this.next = null;
	    }
}