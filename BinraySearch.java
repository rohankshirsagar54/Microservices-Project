package Arrays;

public class BinraySearch {
	
	public static void binary(int arr[], int key) {
		
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			
			
			int mid=left+(right-left)/2;
			
			if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}
			else if(key<arr[mid]) {
				right=mid-1;
			}
			else if(key>arr[mid]) {
				left=mid+1;
			}
			else {
				System.out.println("no element");
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {0,9,0,0,1,4,4,3,2,5,5,5,8,8,8,8,9,7};
		
		binary(arr, 7);
		

	}

}
