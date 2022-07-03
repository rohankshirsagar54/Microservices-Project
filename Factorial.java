package Arrays;

public class Factorial {

	 static int fact(int n) {
		
		 if(n==1) {
				return 1;
			}
			else {
				
				return fact(n-1)*n;
			}
	}
	
	
	
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println(fact(n));
		
		
		int num=4;
		//int k=1;
		int result=1;
		for(int i=0 ;i<num; i++) {
			result=result*(num-i);
		}
		System.out.println(result);
		
		

	}

}
