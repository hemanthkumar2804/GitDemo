package Parct;

public class FindingDupinArrayString {

	public static void main(String[] args) {
		String arr[] = { "Java", "C", "C++", "Phyon", "Java", "Raj", "Raj" };

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Contains duplicate value " + ":" + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Didn't find duplicate values");
		}

	}

}
