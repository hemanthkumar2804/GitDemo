package Parct;

public class FindEventandoddingivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456;
		int eventcount = 0;
		int oddcount = 0;
		while (number > 0) {
			int rem = number % 10;
			// System.out.println(rem);
			if (rem % 2 == 0) {
				eventcount++;
			} else {
				oddcount++;
			}
			number = number / 10;
			// System.out.println(number);
		}
		System.out.println("Numer of event count is " + eventcount);
		System.out.println("Numer of event count is " + oddcount);

	}

}
