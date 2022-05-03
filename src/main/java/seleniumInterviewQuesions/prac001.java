package seleniumInterviewQuesions;

public class prac001 {

	public static void main(String[] args) {

		rev("HemanthkumarS");
	}

	public static void rev(String str) {
		String rev = "";
		int length = str.length() - 1;
		for (int i = length; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse tsring value is:=" + rev);
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palendrome");
		} else {
			System.out.println("Given String is not palendrome");
		}
	}

	public static void revInt(int val) {
		int rem = 0;
		int rev = 0;
		while (val != 0) {
			rev = rev * 10 + val % 10;
			val = val / 10;
		}
		System.out.println(rev);
	}

}
