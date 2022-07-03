package com.rohan.Tree.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	TreeNode root;
	
	BreadthFirstSearch(){
		root=null;
	}
	
	public void Tree() {
		
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(3);
		TreeNode third=new TreeNode(17);
		TreeNode fourth=new TreeNode(27);
		TreeNode fifth=new TreeNode(9);
		TreeNode sixth=new TreeNode(11);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=sixth;
	}
	
	
	
	public void BST() {
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
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
