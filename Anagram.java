package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String s1="grab1";
		String s2="brag133";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram due to lenght");
		}
		else {
			
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Equal");
			}
			else {
				System.out.println("Not Equal");
			}
			
		}

	}

}
