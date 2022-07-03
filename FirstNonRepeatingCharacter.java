package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		
		String str="Rohan Ramesh Kshirsagar";
		
		char a[]=str.replaceAll("\\s+","").toCharArray();
		
		
		Map<Character, Integer> h=new LinkedHashMap<>();
		
		
		for(char c: a) {
			
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}
			else {
				h.put(c, 1);
			}
			
		}
		
		
		Set<Entry<Character,Integer>> set= h.entrySet();
		
		for(Entry<Character,Integer> e: set) {
			
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}
			
		}

	}

}
