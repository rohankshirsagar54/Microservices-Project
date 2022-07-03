package Arrays;

import java.util.HashSet;

public class ConsecutiveSequence {

	public static void main(String[] args) {
		
		
		int arr[]= {3,9,2,10,4,1,20,11};
		int no=0;
		int long_length=0;
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			
			hs.add(arr[i]);
		}
		
		
		for(int j=0; j <arr.length; j++) {  
			
			// this to check if current no=9 has value 8 in list then dont take that value
			// as we are counting forward not backward, so take next no
			
			if(!hs.contains(arr[j]-1)) {    //3-1=2   so dont take this value 
				                            // go to next index 9 and then again check if contains 8, if not
				
				//if not present then assign to no
				no=arr[j];
				
				while(hs.contains(no)) {     //then this will check in while loop, if it conatins 9 then ++--> 10
					                          //again it will check for 10 then ++ ---> 11
					no++;
				}
				
				if(long_length < no-arr[j]) {   // 0 < 11-arr[j]-----> 0 < 11-9   ------->  0 < 2 
					
					long_length=no-arr[j];
				}
				
			}
			
			
		}
		
		System.out.println(long_length);

	}

}
