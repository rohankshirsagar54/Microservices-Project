package com.rohan.stack;

public class Main {

	public static void main(String[] args) {
		
		
		Stack1 s=new Stack1();
		
		s.push(2);
		s.push(4);
		s.push(6);
		s.display();
		
		s.push(8);
		s.display();
		
		s.pop();
		s.peek();

	}

}
