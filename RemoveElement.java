package Arrays;

public class RemoveElement {
	
	public static void remove(int arr[], int key) {
		
		int arr2[]=new int[arr.length];
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==key) {
				continue;
			}
			
			arr2[k]=arr[i];
			k++;
			
		}
		
		
		for(int j=0; j<arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		
	}

	public static void main(String[] args) {
		

		int arr[]= {1,2,3,4,5,6};
		remove(arr,4);
		
	}

}
