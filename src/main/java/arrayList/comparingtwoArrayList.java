package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comparingtwoArrayList {

	public static void main(String[] args) {
		//Sort then equal
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "PHP"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "PHP"));
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "C"));
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1.equals(arr3));
		
		//Comparing two array list and finding the additional element  
		ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "PHP"));
		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "C"));
		//arr4.removeAll(arr5);
		//System.out.println(arr4);
		arr5.removeAll(arr4);
		System.out.println(arr5);
		ArrayList<String> arr6 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "PHP"));
		ArrayList<String> arr7 = new ArrayList<String>(Arrays.asList("Java", "Ruby", "Phyon", "C#", "C"));
		arr6.retainAll(arr7);
		System.out.println(arr6);
		
	}

}
