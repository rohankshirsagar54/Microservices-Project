package Arrays;

import java.util.LinkedHashSet;

public class DuplicatesReomveCollection {

	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5,6,7,8,4,32,1,3,4,5,6,7,8,9,4,9};
		
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		
		for(int i: arr) {
			set.add(i);
		}
		
		System.out.println(set);

	}

}
