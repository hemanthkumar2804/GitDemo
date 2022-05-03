package Parct;

public class evenandoddingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int eventcount = 0;
		int oddcount = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] % 2 == 0) {
				eventcount++;
				System.out.println("event " + arr[i]);
			} else {
				oddcount++;
				System.out.println("odd " + arr[i]);
			}
		}
		System.out.println("number of event count is: " + eventcount);
		System.out.println("number of odd count is: " + oddcount);
	}

}
