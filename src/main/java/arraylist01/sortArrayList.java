package arraylist01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sortArrayList {

	public static void main(String[] args) {
		List<String> StrList = new ArrayList<String>();
		StrList.add("Hemanth");
		StrList.add("Kumar");
		StrList.add("Hemanth");
		StrList.add("Kumar");
		StrList.add("Roopa");
		StrList.add("Chirasmi");
		Collections.sort(StrList);
		Iterator<String> it = StrList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<Integer> ListNumber = new ArrayList<Integer>();
		ListNumber.add(2098);
		ListNumber.add(1098);
		ListNumber.add(2698);
		ListNumber.add(2998);
		ListNumber.add(2018);
		ListNumber.add(2012);

		Collections.sort(ListNumber);
		System.out.println("----Using lamda Function---------");
		ListNumber.forEach(a -> {
			System.out.println(a);
		});

	}

}
