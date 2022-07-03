package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MaximumOcuuringCharacter {

	public static void main(String[] args) {
		
		
		
String str="Rohan Ramesh Kshirsagar";
		
		char a[]=str.replaceAll("\\s+","").toCharArray();
		
		
		Map<Character, Integer> h=new HashMap<>();
		
		
		for(char c: a) {
			
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}
			else {
				h.put(c, 1);
			}
			
		}
		
		
		Set<Entry<Character,Integer>> set= h.entrySet();
		
		int max=0;
		char charMax=0;
		
		for(Entry<Character,Integer> e: set) {
			
			if(e.getValue()>max) {
				max=e.getValue();
				charMax=e.getKey();
				
			}

			
			

	}
		
		System.out.println("Max character:"+ charMax +"  "+ max);


	}

}
