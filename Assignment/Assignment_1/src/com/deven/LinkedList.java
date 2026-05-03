package com.deven;


public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size()
	{
		Node trav = head;
		int count=1;
		if(head==null)
		{
			return 0;
		}
		while(trav!=null)
		{
			count++;
			trav = trav.next;
		}
		return count;
	}
	
	public void addFirst(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. add first node into next of newnode
		newnode.next = head;
		//3. move head on newnode
		head = newnode;
	}
	
	public void addLast(int value) {
		//1. create a newnode
		Node newnode = new Node(value);
		//2. if list is empty, add newnode into head
		if(head == null)
			head = newnode;
		//3. if list is not empty
		else {
			//a. traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			//b. add newnode into next of last node
			trav.next = newnode;
		}
	}
	
	public void addAtNode(int value,int key)
	{
		Node newnode = new Node(value);
		 Node trav = head;
		 
		 while(trav!=null)
		 {
			 if(trav.data==key)
			 {
				 break;
			 }
			 trav=trav.next;
		 }
		 newnode.next=trav.next;
		 trav.next=newnode;
	}
	
	public void addBeforeNode(int value,int key)
	{
		Node newnode = new Node(value);
		 Node trav = head;
		 
		while(trav!=null)
		 {
			 if(trav.next.data==key)
			 {
				 break;
			 }
			 trav=trav.next;

			 
		 }
		 newnode.next=trav.next;
		 trav.next=newnode;
	}

	public void addSort(int value) {
		Node newnode = new Node(value);
		 Node trav = head;
		 
		 if(head==null || value<head.data)
		 {
			 head=newnode;
			 display();
			 return;
		 }
		 while(trav.next!=null && trav.next.data<value)
		 {
				 trav=trav.next;
		 }
		 newnode.next=trav.next;
		 trav.next=newnode;
		 display();
		 return;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list is not empty, move head on second node
		head = head.next;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == null)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. add null into nextof second last node
			trav.next = null;
		}
	}
	
	public void deleteposition(int pos) {
		
	}
	
	public void display() {
		//1. create trav and start at head
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void deleteAll() {
		head = null;
	}
	
	public void search(int key)
	{
		Node trav = head;
		int pos = 1;
		while(trav != null)
		{
			if(trav.data==key)
			{
				System.out.println("Key Found in List at position "+pos);
				return;
			}
			trav = trav.next;
			pos++;
		}
		return;
	}
}














