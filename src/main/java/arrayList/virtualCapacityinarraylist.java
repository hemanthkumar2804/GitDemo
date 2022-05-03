package arrayList;

import java.util.ArrayList;

public class virtualCapacityinarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar=new ArrayList<Object>(10);
		System.out.println(ar.size());
		ar.add(20);
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);

	}

}
