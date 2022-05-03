package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList0001 {

	public static void main(String[] args) {
		List<String> arr0001=new ArrayList<String>();
		arr0001.add("Hemanth");
		arr0001.add("Kumar");
		arr0001.add("Roopa");
		arr0001.add("Chirasmi");
		
		System.out.println("----Using for each loop-----");
		System.out.println(arr0001);
		for (String arr : arr0001) {
			System.out.println(arr);
		}
		System.out.println("-----Uisng for loop-----");
		for(int i=0;i<arr0001.size();i++) {
			System.out.println(arr0001.get(i));
		}
		
		System.out.println("-----Uisng the Java 8---------------");
		arr0001.forEach(ar -> 
		{System.out.println(ar);
		});
		
		System.out.println("-----Uisng Iterator-----------");
		//Traversing list through Iterator 
		Iterator<String> it= arr0001.iterator();//getting the Iterator 
		while(it.hasNext()) {//check if iterator has the elements  
			System.out.println(it.next());//printing the element and move to next  
		}

	}

}
