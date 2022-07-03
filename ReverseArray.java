package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		int length=arr.length;
		
		int temp[]=new int[length];
		
		for(int i=0; i<length; i++) {
			temp[i]=arr[length-i-1];
		}
		
		for(int j=0; j<temp.length; j++) {
			System.out.println(temp[j]);
		}

	}

}
