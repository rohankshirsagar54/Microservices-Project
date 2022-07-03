package com.rohan.Queue;

import java.util.Stack;

public class QueueStack {

	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	int size;
	
	//size 
	public int size() {
		return size++;
	}
	
	//pushing data in to stack 1
	
	public void add(int val) {
		int result=s1.push(val);
		System.out.println(result);
	
	}
	
	//poping the data from stack 2
	public int remove() {
		 int x, y;
		    while(s1.isEmpty()) 
		    {
		        // take an element out of first stack
		        x = s1.pop();
		        // insert it into the second stack
		        s2.push(x);
		    }
		
		    // removing the element
		    y = s2.pop();
		  
		    // moving back the elements to the first stack
		    while(!s2.isEmpty()) 
		    {
		        x = s2.pop();
		        s1.push(x);
		    }
		  
		    return y;
		    
			}
	/*
	public void empty() {
		if(size==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	//move operation from s1 to s2
	public void move() {
		while(s1.isEmpty()) {
			int x=s1.pop();
			s2.push(x);
			
		}
	}
	*/
	//traversing the data
	
	
	public static void main(String args[]) {
		QueueStack q=new QueueStack();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.remove();
	}
}
