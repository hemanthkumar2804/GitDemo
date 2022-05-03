package Parct;

public class sumofnumberingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of arr values is: " + sum);
	}

}
