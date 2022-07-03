package Arrays;

public class LastTargetValue {

	
	public static int last(int arr[], int n) {
		
		int left=0;
		int right=arr.length-1;
		int result=-1;
		
		while(left<=right) {
			
			int mid=(left+right)/2;
			
			if(arr[mid]==n) {
				
				result=mid;
				left=mid+1;
			}
			
			else if(n<arr[mid]) {
				right=mid-1;
			}
			else {
			left=mid+1;
			}
			
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
int arr[]= {1,2,5,9,9,3,2,4,5,69,6};
int n=5;

int value=last(arr,n);
		
if(value!=-1) {
	System.out.println(value);
}
else {
	System.out.println("not found");
}
		
	}

}
