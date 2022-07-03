package com.rohan.postOrder;

import java.util.Stack;

public class orderPost {

	Node root;
	
	orderPost(){
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
	
	public void post() {
		
		if(root==null) {
			System.out.println("empty tree");
		}
		
		Stack<Node> s=new Stack<>();
		
		s.push(root);
		while(!s.isEmpty()) {
			Node temp=s.peek();
			if(temp.right==null && temp.left==null) {
				Node x=s.pop();
				System.out.println(x.data);
			}
			
			else if(temp.right!=null) {
				s.push(temp.right);
				temp.right=null;
			}
			if(temp.left!=null) {
				s.push(temp.left);
				temp.left=null;
			}
		}
		
	}
	
	
	
	
}
