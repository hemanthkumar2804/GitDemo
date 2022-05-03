package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arraylistIteration {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Hemanth");
		ar.add("Kumar");
		ar.add("Chirasmi");
		ar.add("Roopa");
		ar.add("Mohan");

		System.out.println("-------Using for loop----------");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("---------Using for each---------");
		for (String S : ar) {
			System.out.println(S);
		}
		System.out.println("-----Using java 8 streams------");
		ar.stream().forEach(ele -> System.out.println(ele));
		System.out.println("--------Using Iterator--------");
		Iterator<String> iter = ar.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------Using Iterartor ArrayList as Array--------");
		ArrayList<Integer> ar01 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		Iterator<Integer> Iter = ar01.iterator();
		while (Iter.hasNext()) {
			System.out.println(Iter.next());
		}
		System.out.println("-------Using Stream ArrayList as Array-----------");
		ArrayList<String> ar02 = new ArrayList<String>(Arrays.asList("Raj", "Ram", "Suresh", "Ramesh", "Ravi"));
		ar02.stream().forEach(elem -> System.out.println(elem));

	}

}
