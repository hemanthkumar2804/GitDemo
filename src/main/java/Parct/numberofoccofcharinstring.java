package Parct;

public class numberofoccofcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "I love testing and codingi";
		usingCharArray(value, 'o');
		usingCharAt(value, 'i');

	}

	public static void usingCharArray(String str, char val) {
		int count = 0;
		for (char c : str.toCharArray()) {

			if (c == val) {
				count++;
			}
		}
		System.out.println("duplicate charters are " + val + ": " + count);

	}

	public static void usingCharAt(String str, char val) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println("duplicate charters are " + val + ": " + count);
	}

}
