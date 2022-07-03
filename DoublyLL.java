package DoublyLinkedList;

public class DoublyLL {
	
	Node head;
	Node tail;
	int size;
	
	
	DoublyLL(){
		head=null;
		tail=null;
		size=0;
	}
	
	
	public int length() {
		return size;
	}
	
	
	public boolean isEmpty() {
		if(length()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	// insert at beginning
	
	
	public void insert(int val) {
		
		Node n=new Node();
		n.data=val;
		
		if(isEmpty()) {
			tail=n;
		}
		else {
			head.prev=n;
		}
		
		n.next=head;
		head=n;
		size++;
	}
	
	
	//insert at end
	
	public void end(int val) {
		
		Node n=new Node();
		n.data=val;
		
		if(isEmpty()) {
			head=n;
		}
		else {
			tail.next=n;
		}
		
		n.prev=tail;
		tail=n;
		size++;
	}
	
	
	
	//insert at middle
	
	public void middle(int val, int pos) {
		
		Node n=new Node();
		n.data=val;
		
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		
		else {
			Node temp=head;
			if(pos > 1 && pos<=size) {
				for(int i=1; i<pos-1; i++) {
					temp=temp.next;
				}
				
				n.prev=temp;
				n.next=temp.next;
				temp.next=n;
				temp.next.prev=n;
				size++;
				
			}
			else {
				System.out.println("Wrong position");
			}
			
		}
		
	}
	
	
	//print
	
	public void print() {
		if(isEmpty()) {
			System.out.println("List is Empty");
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
	
	public void delete() {
		
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else if(head==tail) {
			tail=null;
		}
		else {
			head.next.prev=null;
		}
		
		Node temp=head;
		head=head.next;
		temp.next=null;
		size--;
	}
	
	
	
	public void deleteEnd() {
		
		
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else if(head==tail) {
			head=null;
		}
		else {
			tail.prev.next=null;
		}
		
		Node temp=tail;
		tail=tail.prev;
		temp.prev=null;
		size--;
	}
	
	
	
	public void deleteMiddle(int pos) {
		
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			
			Node temp=head;
			if(pos > 1 && pos<=size) {
				for(int i=1; i<pos-1; i++) {
					temp=temp.next;
				}
			
				Node t=temp.next;
				temp.next=t.next;	
				if(t.next!=null) {
				t.next.prev=t.prev;	
				}
				size--;
				}
				
		}
		
	}
	
	
}
