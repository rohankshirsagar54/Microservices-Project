package com.rohan.levelOrder;

import java.util.LinkedList;
import java.util.Queue;

import com.rohan.Tree.BFS.TreeNode;

public class BFS {

	
Node root;
	
	BFS(){
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
	
	public void BST() {
		
		if(root==null) {
			System.out.println("empty tree");
		}
		
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.println(temp.data);
			
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right!=null) {
				q.offer(temp.right);
			}
		}
		
		
	}
}
