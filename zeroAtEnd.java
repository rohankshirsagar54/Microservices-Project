package Arrays;

public class zeroAtEnd {
	
	int arr[]= {1,2,9,0,9,0,7,8,9,0,6,7,8,9};
	int array[]=new int[arr.length];
	int k=0; 
	
	public void number(int num) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]!=num) {
				array[k]=arr[i];
				k++;
			}
		}
		
		while(k<array.length) {
			array[k]=num;
			k++;
		}
		
		
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]);
		}
		
	}

	public static void main(String[] args) {
		
		zeroAtEnd z=new zeroAtEnd();
		z.number(9);
		

	}

}
