package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurence {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8,4,32,1,3,4,5,6,7,8,9,4,9};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i: arr) {
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
			
		}
		
		
		Set<Entry<Integer,Integer>> set=map.entrySet();
		
		
		for(Entry<Integer,Integer> entry:set) {
			
			System.out.println(entry.getKey()+" value= "+ entry.getValue());
			
		}

	}

}
