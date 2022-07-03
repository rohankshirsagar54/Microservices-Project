package Arrays;
import java.util.*;

public class duplicatesArrayList {

	public static void main(String[] args) {
		
	ArrayList<String> al=new ArrayList<String>();
		
		al.add("Rohan");
		al.add("Ramesh");
		al.add("Kshirsagar");
		al.add("Sangita");
		al.add("Manik");
		al.add("Shamrao");
		al.add("Rohan");
		
		System.out.println(al);
		
		
		LinkedHashSet<String> h1=new LinkedHashSet<String>(al);
		
		ArrayList<String> al1=new ArrayList<String>(h1);
		
		System.out.println(al1);
		
		
		}
		

	}


