package Arrays;

public class QuickSort {
	
	
	public int partition(int arr[], int low, int high) {
		
		int pivot=arr[(low+high)/2];
		
		
		while(low<=high) {
			
			
			while(arr[low]<pivot) {
				low++;
			}
			
			while(arr[high]>pivot) {
				high--;
			}
			
			// If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values
			
			if(low <= high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}	
		}
		return low;
		
	}
	
	void recursion(int arr[], int low, int high) {
		
		
		int pi=partition(arr, low, high);
		
		if(low<pi-1) {
			recursion(arr, low, pi-1);
		}
		
		if(high>pi) {
			recursion(arr, pi, high);
		}
	}
	
	
	public void print(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		

		int arr[]= {2,3,4,5,9,8,7,0,4,5,6,7};
		int length=arr.length-1;
		
		QuickSort q=new QuickSort();
		q.recursion(arr, 0, length-1);
        q.print(arr);
		
	}

}
