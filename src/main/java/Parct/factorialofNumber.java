package Parct;

public class factorialofNumber {

	public static void main(String[] args) {
		findfactorialofNumber(5);

	}

	public static void findfactorialofNumber(int num) {

		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;

		}
		System.out.println(fac);

	}
}
