package Arrays;

public class MergeSort {
	
	
	int arr[];
	int array[];
	int length;
	
	
	public void sort(int arr[]) {
		
		this.arr=arr;
		this.length=arr.length;
		this.array=new int[length];
		divide(0,length-1);
	}
	
	
	public void divide(int lowerIndex, int higherIndex) {
		
		if(lowerIndex < higherIndex) {
			
			int mid=lowerIndex+(higherIndex-lowerIndex)/2;
			
			divide(lowerIndex,mid);
			divide(mid+1, higherIndex);
			merge(lowerIndex, mid, higherIndex);
			
		}
		
	}
	
		public void merge(int lowerIndex, int mid, int higherIndex) {
			
			for(int i=lowerIndex; i<=higherIndex; i++) {
				array[i]=arr[i];
			}
			
			int i=lowerIndex;
			int j=mid+1;
			int k=lowerIndex;
			
			
			while(i<=mid && j<=higherIndex) {
				
				if(array[i] < array[j]) {
					
					arr[k]=array[i];
					i++;
				}
				else {
					
					arr[k]=array[j];
					j++;
				}
				k++;
			}
			
			
			while(i<=mid) {
				arr[k]=array[i];
				i++;
				k++;
			}
			
			
		}
	
	
	

	public static void main(String[] args) {
		
int arr[]={66,22,44,11,2};
	
MergeSort ms=new MergeSort();
ms.sort(arr);


for(int i: arr) {
	System.out.println(arr[i]);
}

		
	}

}
