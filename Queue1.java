package com.rohan.Queue;

public class Queue1 {

	Node front;
	Node rear;
	int length;
	
	Queue1(){
		
		front=null;
		rear=null;
		length=0;
	}
	
	
	//if queue is empty
	
	public boolean isEmpty() {
		if(length==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//size of the queue
	
	public int size() {
		return length;
	}
	
	//performing enqueue operation
	
	public void enqueue(int val) {
		Node n= new Node();
		n.data=val;
		if(isEmpty()) {
			front=n;
		}
		else {
			rear.next=n;
			
		}
		rear=n;
		length++;
		
	}
	
	//performing dequeue operation
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else if(front==rear) {
			rear=null;
		}
		else {
			Node t=front;
			int result=t.data;
			System.out.println("dequeue operation:"+ result);
			front=front.next;
			t.next=null;
			length--;
		}
		
	}
	
	//display the data
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		Node t=front;
		while(t!=null) {
			System.out.println("diplay the data: "+ t.data);
			t=t.next;
		}
	}
	
	
}
