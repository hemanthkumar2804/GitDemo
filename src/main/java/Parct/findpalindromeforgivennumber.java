package Parct;

public class findpalindromeforgivennumber {

	public static void main(String[] args) {
		int num = 121;
		int temp=num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("number is palindrome ");
		} else {
			System.out.println("number is not palindrome ");
		}

	}

}
