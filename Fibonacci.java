package Arrays;

public class Fibonacci {
	
	static int fib(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	
		
	}
	
	
	

	public static void main(String[] args) {
		
		
         int n=9;
		
	for(int i=1; i<=n; i++) {
		System.out.println("Fib recurrsion:"+ fib(i));
	}

		
///////////////////////////////////////////////////// without recurssion
		int x=9; int a=1; int b=1;
		for(int i=1; i<=x; i++) {
			
			System.out.println(a);
			
			
			int sum=a+b;
			
			a=b;
			
			b=sum;
			
			
		}
		
		
	}

}
