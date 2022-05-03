package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class OddeveninUsingArrayList {

	public static void main(String[] args) {

		System.out.println("------printing odd numbers from the list--------");
		ArrayList<Integer> arrlist01 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		arrlist01.removeIf(odd -> odd % 2 == 0);
		System.out.println(arrlist01);

		System.out.println("------printing even numbers from the list--------");
		ArrayList<Integer> arrlist02 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		arrlist02.removeIf(odd -> odd % 2 != 0);
		System.out.println(arrlist02);
	}

}
