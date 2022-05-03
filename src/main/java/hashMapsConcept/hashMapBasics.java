package hashMapsConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapBasics {

	public static void main(String[] args) {
		HashMap<String, String> studentmap = new HashMap<String, String>();
		studentmap.put("Hemanth", "0001");
		studentmap.put("Kumar", "0002");
		studentmap.put("Chirasmi", "0003");
		studentmap.put("Ravi", "0004");
		studentmap.put("Ram", "0005");
		studentmap.put("Suresh", "0006");
		studentmap.put(null, "0007");
		studentmap.put(null, "0008");
		System.out.println(studentmap.get("Hemanth"));
		System.out.println(studentmap.get(null));
		System.out.println("------Using foreach lamda Java8---------");
		studentmap.forEach((k, v) -> System.out.println("Key: " + k + " " + "Value: " + v));
		System.out.println("------------Using keyset iterator-------");
		Iterator<String> it = studentmap.keySet().iterator();
		while (it.hasNext()) {
			String Key = it.next();
			String value = studentmap.get(Key);
			System.out.println("Key: " + Key + " " + "Value: " + value);
		}
		System.out.println("------Using enteryset---------");
		Iterator<Entry<String, String>> it01 = studentmap.entrySet().iterator();
		while (it01.hasNext()) {
			Entry<String, String> entery = it01.next();
			System.out.println("Key: " + entery.getKey() + " & " + "Value: " + entery.getValue());
		}

	}

}
