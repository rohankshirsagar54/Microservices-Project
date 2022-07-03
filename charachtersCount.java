package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class charachtersCount {

	public static void main(String[] args) {
		
		String s1="javaiseasy";
		
		char c1[]=s1.replaceAll("\\s+", "").toCharArray();
		
		HashMap<Character, Integer> h=new HashMap<>();
		
      for(char c: c1) {
    	  
    	  if(h.containsKey(c)) {
    		  h.put(c, h.get(c)+1);
    	  }
    	  else {
    		  h.put(c,1);
    	  }
    	  
      }		
      
      
      Set<Entry<Character,Integer>> s=h.entrySet();
      
      for(Entry<Character,Integer> f: s) {
    	  System.out.println(f.getKey()+"  "+f.getValue());
      }
      

	}

}
