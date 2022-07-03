package Strings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcd";
		String s2="cdab";
		
		if(s1.length()!=s2.length()) {
			System.out.println("no rotation");
		}
		else if((s1+s1).contains(s2)) {
			System.out.println("yes");
		}

	}

}
