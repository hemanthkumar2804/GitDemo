package test0001;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class testNumberofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicateCharinString("i am hemanth kumar s");
		findDuplicateCharinString("h");
		findDuplicateCharinString(null);
		findDuplicateCharinString("");
		

	}

	public static void findDuplicateCharinString(String str) {

		if (str == null) {
			System.out.println("String is null");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		if (str.length() == 1) {
			System.out.println("String length is one");
			return;
		}
		char word[] = str.trim().toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (Character c : word) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}

		}
		Set<Map.Entry<Character, Integer>> enteryset = charmap.entrySet();
		for (Entry<Character, Integer> entry : enteryset) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}

		}

	}

}
