package Arrays;

public class findTargetedValue {
	
	
	public static void value(int arr[], int num) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			
			int mid= left+(right-left)/2;
			
			if(num==arr[mid]) {
				System.out.println(mid);
				
				left=mid+1;
			}
			else if(num < arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,66,6,7,8,9};
		value(arr, 66);

	}

}
