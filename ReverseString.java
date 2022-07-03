package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev="";
		String s1="java";
		
		for(int i=s1.length()-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
		
	System.out.println(rev);	

	}

}
