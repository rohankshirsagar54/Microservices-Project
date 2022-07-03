package Arrays;

import java.util.Arrays;

public class SmallestDifference {
	
	
	public static int missing(int arr[], int length) {
		
		Arrays.sort(arr);
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<length; i++) {
			
			if(arr[i+1]-arr[i]<min) {
				min=arr[i+1]-arr[i];
			}
		}
		
		return min;
		
	}
	

	public static void main(String[] args) {
		
         int arr[]= {1, 5, 3, 19, 18, 25};
         int length=arr.length-1;
         System.out.println(missing(arr, length));
		
	}

}
