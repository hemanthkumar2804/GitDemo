package Parct;

public class findingevenandoddingivenrangevalues {

	public static void main(String[] args) {
		findevenandoddingiven(600,1000);

	}
	
	public static void findevenandoddingiven(int startingnumber,int endingnumber) {
		int eventcount = 0;
		int oddcount = 0;
		for (int i = startingnumber; i <=endingnumber; i++) {
			if (i % 2 == 0) {
				System.out.println("number is event: " + i);
				eventcount++;
			} else {
				oddcount++;
				System.out.println("number is odd: " + i);
			}
		}
		System.out.println("Number of event count is: " + eventcount);
		System.out.println("Number of odd count is: " + oddcount);
	}

}
