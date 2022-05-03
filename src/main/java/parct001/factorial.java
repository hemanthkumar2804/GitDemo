package parct001;

public class factorial {

	public static void main(String[] args) {
		factorialofNum(6);
		factorialnumchange(6);

	}

	public static void factorialofNum(int num) {
		// int num=5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number is: " + fact);
	}

	public static void factorialnumchange(int num01) {
		// int num01= 6;
		int fact01 = 1;
		for (int i = num01; i > 0; i--) {
			fact01 = fact01 * i;
		}
		System.out.println("Factorial of a number is: " + fact01);
	}
}
