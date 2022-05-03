package arrayList;

import java.util.ArrayList;

public class arrayList001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		System.out.println(ar);
		
		System.out.println("using for loop");
		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));

		}
		System.out.println("Using foreach loop");
		for (Integer integer : ar) {
						
			System.out.println(integer);
			
		}

	}

}
