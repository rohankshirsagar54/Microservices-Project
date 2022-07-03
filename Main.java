package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		SinglyLL s=new SinglyLL();
		s.insert(1);
		s.insert(2);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		s.insert(5);
		//s.palindrome();
		s.duplicates();
		//s.removeDuplicates();
		s.sortedRemove();
		s.listMiddle();
		s.Nth(1);
		s.reverse();
       s.print();
	}

}
