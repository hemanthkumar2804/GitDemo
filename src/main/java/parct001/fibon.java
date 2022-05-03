package parct001;

public class fibon {

	public static void main(String[] args) {
		fidons(8);

	}

	public static void fidons(int rang) {
		// 0 1 1 2 3 5 8 13 21
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2);
		for (int i = 1; i < rang; i++) {
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}

	}
}
