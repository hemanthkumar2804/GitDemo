package parct001;

public class primeNumber {

	public static void main(String[] args) {
		primeNum(10);

	}
	
	public static void primeNum(int num) {
		//int num = 0;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Given number is Prime");
			} else {
				System.out.println("Given numbver is not Prime");
			}

		} else {
			System.out.println("Given number is not prime");
		}
	}
}
