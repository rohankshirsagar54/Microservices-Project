package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveFirst {

	public static void main(String[] args) {
		
		
		String s1="java is";
		String s2="java is best";
		
		char c1[]=s1.toCharArray();
		//char c2[]=s2.toCharArray();
		
		HashSet<Character> a=new HashSet();
		
		for(char c: c1) {
			a.add(c);
		}
		
		System.out.println(a);
		
		
		ArrayList<Character> h=new ArrayList<>();
		for(int i=0; i<s2.length(); i++) {
			
			if(!a.contains(s2.charAt(i))) {
				h.add(s2.charAt(i));
			}
			
		}
		
		System.out.println(h);
		
	}

}
