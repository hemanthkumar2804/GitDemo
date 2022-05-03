package Parct;

import java.util.HashSet;

public class rev0001 {

	public static void main(String[] args) {
		revString("Selenium");
		revStringusingStringBuffer();
		revInt(12345);
		stringPalindrome("Selemiun");
		stringPalindrome("redivider");
		integerPalindrome(1234);
		integerPalindrome(121);
		revStringusingStringbuilder(new StringBuilder("HemanthKumar"));
		comp();
		stringStringbuffer();
		findDuplicateelementsinarray();
		findDuplciateingivenString();

	}

	public static void revString(String s1) {

		String rev = "";
		int len = s1.length() - 1;
		for (int i = len; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("reverce of rev= " + rev);

	}

	public static void revStringusingStringBuffer() {
		StringBuffer sb = new StringBuffer("Selenium");
		System.out.println(sb.reverse());
	}

	public static void revInt(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}

	public static void stringPalindrome(String s1) {
		String rev = "";
		int len = s1.length() - 1;
		for (int i = len; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("reverce of rev= " + rev);
		if (s1.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

	public static void integerPalindrome(int num) {
		int rev = 0;
		int temp = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Given number is not Palindrome");
		}

	}
	public static void revStringusingStringbuilder(StringBuilder sb1) {
		System.out.println(sb1.reverse());
		}
	public static void comp() {
		String s1=new String("Hemanth");
		String s2=new String("Hemanth");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
	public static void stringStringbuffer() {
		String s1=new String("Automation");
		s1.concat("Testing");
		System.out.println(s1);
		StringBuffer sb1=new StringBuffer("Automation");
		sb1.append("Testing");
		System.out.println(sb1);
	}
	public static void findDuplicateelementsinarray() {
		String arr[]= {"java","c","c++","python","java","c"};
		HashSet<String>num=new HashSet<String>();
		boolean flag=false;
		for (String i : arr) {
			if(num.add(i)==false) {
				flag=true;
				System.out.println("Duplicate elements found: " +i);
			}			
		}
		if(flag==false) {
			System.out.println("not found duplcaite elements");
		}
		
	}
	public static void findDuplciateingivenString() {
		String s1="Hemanthkumar";
		boolean flag=false;
		HashSet<Character>cha=new HashSet<Character>();
		for (Character c : s1.toCharArray()) {
			if(cha.add(c)==false) {
				System.out.println("Found duplicate char: "+c);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Not found doplicate charecters");
		}
	}

}
