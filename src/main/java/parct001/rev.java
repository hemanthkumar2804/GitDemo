package parct001;

public class rev {

	public static void main(String[] args) {
		revString("Selenium");
		revStringUsingStringbuffer("test");
		revnumeric(12345);
		stringpalindrome("Madam");
		findingnumpalindrome(12345);

	}

	public static void revString(String name) {
		// Revering the String.
		System.out.println("---Reversing the String using foe loop--");
		// String name="Hemanth";
		String rev = "";
		int len = name.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void revStringUsingStringbuffer(String name) {
		System.out.println("----Reversing the String using String buffer ---------");
		StringBuffer sb1 = new StringBuffer(name);
		System.out.println(sb1.reverse());
	}

	public static void revnumeric(int num) {
		System.out.println("-------Reversing the numeric numberr------- ");
		// int num=12345;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}

	public static void stringpalindrome(String name) {
		System.out.println("------Finding string is palindrome or not--------");

		// String name="redivider";
		String rev = "";
		int len = name.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		// System.out.println(rev);
		// System.out.println(name);
		if (name.equalsIgnoreCase(rev)) {
			System.out.println(name + ": Is palindrome");
		} else {
			System.out.println(name + ": Is not palindrome");
		}
	}

	public static void findingnumpalindrome(int num) {

		// int num=123456;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println(temp + ": Is palindrome");
		} else {
			System.out.println(temp + ": Is not palindrome");
		}
	}

}
