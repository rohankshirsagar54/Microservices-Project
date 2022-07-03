package Arrays;

import java.util.Arrays;

public class DuplicatesRemove {
	
	
	public static void remove(int arr[]) {
		
		int current=arr[0];
		int temp[]=new int[arr.length];
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(current!=arr[i]) {
				current=arr[i];
				temp[k++]=arr[i];
			}
			
		}
		
		for(int j=0; j<temp.length; j++) {
			System.out.println(temp[j]);
		}
		
	}

	public static void main(String[] args) {

		int[] arr ={1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		remove(arr);
		
	}

}
