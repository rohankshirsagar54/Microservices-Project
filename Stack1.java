package com.rohan.stack;

public class Stack1 {

	Node top;
	int length;
	
	Stack1(){
		top=null;
		length=0;
	}
	
	//if stack is empty
	public boolean isEmpty() {
		if(length==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// size of stack
	
	public int size() {
		return length;
	}
	
	
	//pushing the data into stack
	
	public void push(int val) {
		Node n=new Node();
		n.data=val;
		n.next=top;
		top=n;
		length++;
	}
	
	//removing the data from stack
	
	public void pop() {
		if(isEmpty()) {
			System.out.println( "list is empty");
		}
		else {
			int result=top.data;
			System.out.println("Top of the stack is :"+ result);
			top=top.next;
			length--;
		}
	}
	
	
	//just get the top of data
	
	public void peek() {
		if(isEmpty()) {
			System.out.println( "list is empty");
		}
		else {
			int result=top.data;
			System.out.println("Peek of the stack is :"+ result);
		}
	}
	
	//display the data in stack
	
	public void display() {
		if(isEmpty()) {
			System.out.println( "list is empty");
		}
		Node t=top;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	
}
