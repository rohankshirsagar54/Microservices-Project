package Arrays;

import java.util.Arrays;

public class secongLargest {

	public static void main(String[] args) {
		
		
		int arr[]= {3,4,2,4,5,3,5,6,66,99,00};
		
		int largest=0;
		int secondLargest=0;
		
		for(int i=0; i<arr.length; i++) {
			largest=Math.max(largest, arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=largest) {
				secondLargest=Math.max(secondLargest, arr[i]);
			}
		}
		
		
		System.out.println(secondLargest);
		
	}

}
