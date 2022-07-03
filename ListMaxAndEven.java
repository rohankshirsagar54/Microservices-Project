package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMaxAndEven {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		
		// finding even value
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			
			Integer int1=(Integer) itr.next();
			if(int1%2==1) {
				System.out.println("odd");
			}
			else {
				System.out.println("even");
			}
			
		}
		
		
		// finding max value
		int max=0;
		Iterator itr1=al.iterator();
		while(itr1.hasNext()) {
			
			Integer i=(Integer) itr1.next();
			if(i>max) {
				max=i;
			}
		}
		
System.out.println(max);
	}

}
