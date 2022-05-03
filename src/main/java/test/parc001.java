package test;

public class parc001 {

	public static void main(String[] args) {
		stringrevpal("Madam");
		numrevpal(121);

	}

	public static void stringrevpal(String name) {
		// String name = "Madam";
		String rev = "";
		int length = name.length() - 1;
		for (int i = length; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		if (name.equalsIgnoreCase(rev)) {
			System.out.println(name + ": " + "Given String is palindrome");
		} else {
			System.out.println(name + ": " + "Given string is not palindrome");
		}
	}

	public static void numrevpal(int number) {
		// int number=123;
		int temp = number;
		int rev = 0;
		while (number > 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("Given number is palendrome");
		} else {
			System.out.println("Given number is not palendrome");
		}
	}

}
