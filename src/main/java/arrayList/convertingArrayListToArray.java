package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class convertingArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlist0002 = new ArrayList<String>(
				Arrays.asList("Java", "Selenium", "PHP", "Phyton", "C#", "Ruby"));
		Object arr[] = arlist0002.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("---Using For Each Loop----");
		for (Object object : arr) {
			System.out.println(object);
		}

	}

}
