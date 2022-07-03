package Strings;

public class countChar {

	public static void main(String[] args) {
		
		String s1="strings2";
		int count=0;
		int num=0;
		
	  for(int i=0; i<s1.length(); i++) {
		  
		  if(s1.charAt(i)!=' ') {
			  count++;
		  }
		  else {
			  num++;
		  }
	  }
	  
	  System.out.println(count+" "+num);

	}

}
