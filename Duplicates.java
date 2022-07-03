package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		
		
		String str="Rohan Ramesh";
		
		char a[]=str.replaceAll("\\s+", "").toCharArray();
		
		HashMap<Character, Integer> h=new HashMap<>();
		
		for(char s: a) {
			
			
			if(h.containsKey(s)) {
				h.put(s, h.get(s)+1);
			}
			else {
				h.put(s, 1);
			}
			
		}
		
		
		
		Set<Entry<Character, Integer>> set=h.entrySet();
		
		for(Entry<Character, Integer> e: set) {
			
			if(e.getValue()> 1) {
				System.out.println(e.getKey());
			}
			
		}
		

	}

}
