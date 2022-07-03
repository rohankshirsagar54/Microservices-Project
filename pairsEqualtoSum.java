package Arrays;
import java.util.Arrays;

public class pairsEqualtoSum {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int sum=10;
		
		int i= 0;
		int j=arr.length-1;
		
		
		Arrays.sort(arr);
		
		while(arr[i]<arr[j]) {
			
			int total=arr[i]+arr[j];
			
			if(total==sum) {
				System.out.println(arr[i]+"   "+arr[j]);
				
				i=i+1;
				j=j-1;
				
			}
			
			else if(total<sum) {
				i=i+1;
			}
			else if(total>sum) {
				j=j-1;
			}
				
			}
		}
		
		
	}


