package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class differentmethodsofarraylist {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>(
				Arrays.asList("Ram", "Ravi", "Rajesh", "Mukesh", "Suresh", "Kumar","Ram","Kumar"));
		ArrayList<String> ar2 = new ArrayList<String>(
				Arrays.asList("Hemanth", "Chirashmi", "Roopa", "Somshekaraiah", "Indira"));
		// Adding two ArrayList using addall method
		// ar1.addAll(ar2);
		// System.out.println(ar1);
		// Adding the second array list from some index
		// ar1.addAll(2, ar2);
		// System.out.println(ar1);
		// ar1.clear();
		// System.out.println(ar1);
		ArrayList<String> ar3 = (ArrayList<String>) ar1.clone();
		System.out.println(ar3);
		System.out.println(ar1.contains("test"));
		System.out.println(ar1.indexOf("Mukesh"));
		System.out.println(ar1.lastIndexOf("Kumar"));
	}

}
