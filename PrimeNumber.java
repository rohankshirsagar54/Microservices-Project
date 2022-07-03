package Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int x=17;
		boolean flag=true;
		int value=0;
		
		
		for(int i=2; i<x/2; i++) {
			
			if(x%i==0) {
				value=value+1;
			}
			
		}
		
		if(value>0) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println(" prime number");
		}
		
		

	}

}
