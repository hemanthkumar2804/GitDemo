package Parct;

import java.util.HashSet;

public class FindingDupUsingHashSet {

	public static void main(String[] args) {

		String arr[] = { "Java", "C", "C++", "Python", "Java" };
		HashSet<String> FindDup = new HashSet<String>();
		boolean tag = false;
		for (String s : arr) {
			if (FindDup.add(s) == false) {
				System.out.println("Found duplicate values" + ": " + s);
				tag = true;
			}

		}
		if (tag == false) {
			System.out.println("No Duplicate values");
		}

	}

}
