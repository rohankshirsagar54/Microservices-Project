package Strings;

import java.util.HashSet;

public class RemoveDupl {

	public static void main(String[] args) {
		
		String s1="java";
		
		char s[]=s1.replaceAll("\\s+", "").toCharArray();
		
		HashSet<Character> h=new HashSet<>();
		
		for(char c: s) {
			h.add(c);
		}
		
		System.out.println(h);

	}

}
