package LinkedList;

import java.util.Stack;

public class SinglyLL {
	
	Node head;
	int size;
	
	SinglyLL(){
		head=null;
		size=0;
	}
	
	public int length() {
		return size;
	}
	
	
	// insert at start	
	public void insert(int val) {
		
		Node n=new Node();
		n.data=val;
		n.next=head;
		head=n;
		size++;
				
	}
	
    // insert at end
	public void end(int val) {
		Node n=new Node();
		n.data=val;
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
			size++;
		}
				
	}
	
	
	//insert at middle

	public void middle(int val, int pos) {
		Node n=new Node();
		n.data=val;
		Node temp=head;
		if(pos>1 && pos<=size) {
			for(int i=1; i<pos-1; i++) {
				temp=temp.next;
			}
			
			n.next=temp.next;
			temp.next=n;
			size++;
			
		}
		else {
			System.out.println("Wrong Position");
		}
	}
	
	//if LL is empty
	
	public boolean isEmpty() {
		
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// to print
	public void print() {
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println("");
		}
		
	}
	
	//delete at first
	public void first() {
		
		if(head==null) {
			System.out.println("Empty");
		}
		
		Node temp=head;
		head=head.next;
		temp.next=null;
		size--;
	}
	
	
	//delet at last
	
	public void last(){
		
		if(head==null) {
			System.out.println("Empty");
		}
		
		Node temp=head;
		for(int i=1; i<length()-1; i++) {
			temp=temp.next;
		}
		
		temp.next=null;
		size--;
		
	}
	
	
	//delete at middle
	public void deletMiddle(int pos) {
		Node temp=head;
	if(head==null) {
		System.out.println("Empty");
	}
	
	else if(pos>1 && pos<=size) {
			for(int i=1; i<pos-1; i++) {
			temp=temp.next;
			}
		
		Node t=temp.next;
		t.next=null;
		temp.next=t.next;
		size--;
		}
		else {
			System.out.println("Wrong input");
		}
	}
	
	
	// insert in sorted order
	
	public void sortedOrder(int val) {
		Node n=new Node();
		n.data=val;
		Node current=head;
		Node temp=null;
		
		while(current!=null && current.data<n.data) {
			temp=current;
			current=current.next;
		}
		
		temp.next=n;
		n.next=current;
		size++;
		
	}
	
	
	//palindrome
	
	public void palindrome() {
		
		Node temp=head;
		Stack<Integer> stack=new Stack<>();
		while(temp!=null) {
			stack.push(temp.data);
			temp=temp.next;
		}
		
		temp=head;
		while(temp!=null) {
			if(temp.data!=stack.pop()) {
				System.out.println("Not Palindrome");
			}
			else {
				temp=temp.next;
				System.out.println("Palindrome");
			}
			
		}
		
	}
	
	// find duplicates
	
	public void duplicates() {
		
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			
			Node current=head;
			while(current!=null) {
				Node temp=current;
				while(temp.next!=null) {
					
					if(temp.next.data==current.data) {
						System.out.println("Duplicate :"+ temp.next.data);
						temp=temp.next;
					}
					else {
						temp=temp.next;
					}
					
				}
				current=current.next;
			}
			
		}
		
	}
	
	
	// remove duplicates from unsorted
	
	public void removeDuplicates() {
		
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node current=head;
			while(current!=null) {
				Node temp=current;
				while(temp.next!=null) {
					
					if(temp.next.data==current.data) {
						temp.next=temp.next.next;
					}
					else {
						temp=temp.next;
					}
				}
				current=current.next;
			}
		}
		
	}
 
	
	//remove duplicates from sorted list
	
	public void sortedRemove() {
		
		if(head==null) {
			System.out.println("empty");
		}
		else {
			Node current=head;
			while(current.next!=null) {
				
				if(current.data==current.next.data) {
					current.next=current.next.next;
				}
				else {
					current=current.next;
				}
			}
		}
	}
	
	
	// middle of the list
	
	public void listMiddle() {
		
		Node fast=head;
		Node slow=head;
		
		while(fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("middle data:"+ slow.data);
	}
	
	//finding nth node
	
	public void Nth(int pos) {
		
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node temp=head;
			if(pos>=1 && pos<=size) {
				for(int i=1; i<pos-1; i++) {
					temp=temp.next;
				}
				System.out.println("Nth data:"+ temp.next.data);
			}
			else {
				System.out.println("Wrong position");
			}
			
		}
	}
	
	//reverse
	
	public void reverse() {
		
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node current=head;
			Node prev=null;
			Node next=null;
			while(current!=null) {
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
					head=prev;
		}
	}
	
}
