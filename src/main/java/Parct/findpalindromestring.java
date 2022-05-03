package Parct;

public class findpalindromestring {

	public static void main(String[] args) {
		palindromestring("redivider");	

	}
	
	public static void palindromestring(String s) {
		
		int len=s.length();
		String rev="";
		for (int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		//System.out.println(s);
		if(s.equals(rev)) {
			System.out.println("Is palindrome ");
		}
		
		else {
			System.out.println("Not palindrome");
		}
		
	}

}
