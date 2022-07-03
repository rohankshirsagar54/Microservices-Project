package Arrays;

public class MaxAndMin {
	
	
	public static void find(int arr[]) {
		
		
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
		
		
	}

	public static void main(String[] args) {


		int arr[]= {2,1,4,5,6,99,2,4,9,0,8,7,9,66,5,4};
		
find(arr);
	}

}
