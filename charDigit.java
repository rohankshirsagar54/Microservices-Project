package Strings;

public class charDigit {

	public static void main(String[] args) {
		
		int count=0;
		int num=0;
		
		
		
		
		String s1="strings22";
		
		for(int i=0; i<s1.length(); i++) {
			if(Character.isDigit(s1.charAt(i))){
				
				count++;
			}
			else if(Character.isLetter(s1.charAt(i))) {
				num++;
			}
		}
		
		System.out.println(count+"  "+ num);

	}

}
