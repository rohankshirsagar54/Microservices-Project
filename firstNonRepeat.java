package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class firstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String s = "javaj"; 
		 * for(Character ch:s.toCharArray()) { 
		 * if(s.indexOf(ch) ==s.lastIndexOf(ch)) {
		 *  System.out.println("First non repeat character = " +ch); 
		 *  break;
		 *   }
		 *    }
		 */
		
		String s1="java";
		
		char c[]=s1.replace("\\s+", "").toCharArray();
		
		HashMap<Character,Integer> h=new HashMap<>();
		
		
		for(char ch: c) {
			
			if(h.containsKey(ch)) {
				h.put(ch, h.get(ch)+1);
			}
			else {
				h.put(ch, 1);
			}
			
		}
		
		
		Set<Entry<Character,Integer>> s=h.entrySet();
		
		for(Entry<Character,Integer> entry: s){
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		

	}

}
