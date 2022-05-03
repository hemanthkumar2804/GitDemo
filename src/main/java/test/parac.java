package test;

public class parac {

	public static void main(String[] args) {
		palindrome("Madam");
		revstringusingstringbuffer("Automation");
		revvalue(121);
		fibon(5);
		findevenandodd();
		factorial(6);
		// 1*2*3*4*5*6
		primenumber(3);

	}

	public static void palindrome(String name) {

		// String name="madam";
		String rev = "";
		int length = name.length() - 1;
		for (int i = length; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverce of the string name is: " + rev);
		if (name.equalsIgnoreCase(rev)) {

			System.out.println(name + ": " + "is palindrome ");
		} else {
			System.out.println(name + ":" + "Is not palindrome ");
		}

	}

	public static void revstringusingstringbuffer(String name) {
		StringBuffer sb1 = new StringBuffer(name);
		System.out.println(sb1.reverse());
	}

	public static void revvalue(int num) {
		// int num=121;
		int rev = 0;
		int temp = num;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverce value os number is: " + rev);
		if (temp == rev) {
			System.out.println(temp + ":is palindrome");
		} else {
			System.out.println(temp + ":is not palindrome");
		}
	}

	public static void fibon(int rang) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		// int rang = 5;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i <= rang; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;

		}

	}

	public static void findevenandodd() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("number is even");
				even++;

			} else {
				System.out.println("number is off");
				odd++;
			}

		}
		System.out.println("number of even numbers in given array: " + even);
		System.out.println("number of odd numbers in given array: " + odd);
	}

	public static void factorial(int num) {
		// int num=5;
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;

		}
		System.out.println("factorial numberof " + num + "is : " + fac);

	}

	public static void primenumber(int num) {
		// int num=10;
		int count = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("Given number is prime");
			} else {
				System.out.println("Given number is nor prime");
			}

		} else {
			System.out.println("Given number is not prime");
		}
	}

}
