package arraylist01;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistprac01 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(10);
		System.out.println(ar.size());
		System.out.println("Uisng for loop");
		for (int i = 0; i <= ar.size() - 1; i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("Using for each loop");
		for (Integer in : ar) {

			System.out.println(in);

		}
		System.out.println("Uisng Iterator");
		Iterator<Integer> ir = ar.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Java");
		ar2.add("C");
		ar2.add("C++");

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Java");
		ar3.add("C");
		ar3.add("Selenium");
		System.out.println("Combiniing two arrays");
		ar2.addAll(ar3);
		for (String arr : ar2) {
			System.out.println(arr);
		}
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Java");
		ar4.add("C");
		ar4.add("C++");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Java");
		ar5.add("C");
		ar5.add("Selenium");
		System.out.println("feting matching elements");
		ar4.retainAll(ar5);
		for (String str : ar4) {
			System.out.println(str);

		}

		System.out.println("Removing elements");
		ar2.removeAll(ar3);
		for (String st : ar2) {
			System.out.println(st);
		}
	}

}
