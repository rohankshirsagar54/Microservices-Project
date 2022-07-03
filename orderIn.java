package com.rohan.inOrder;

import java.util.Stack;

public class orderIn {

	Node root;
	
	orderIn(){
		root=null;
	}
	
	
	public void bTree() {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		
		
		root=n1;
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		
	}
	
	
	public void in() {
		
		if(root==null) {
			System.out.println("Empty tree");
		}
		
		Stack<Node> s=new Stack<>();
		Node temp=root;
		while(!s.isEmpty() || temp!=null) {
			
			if(temp!=null) {
				
				s.push(temp);
				temp=temp.left;
			}
			else {
				temp=s.pop();
				System.out.println(temp.data);
				temp=temp.right;
			}
		}
		
	}
	
}
