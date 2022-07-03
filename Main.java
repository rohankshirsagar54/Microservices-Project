package com.rohan.Queue;

public class Main {
	
	public static void main(String args[]) {
		
		Queue1 q=new Queue1();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(5);
		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}
