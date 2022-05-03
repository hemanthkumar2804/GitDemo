package seleniumInterviewQuesions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findingDuplicateCharectrs {

	public static void main(String[] args) {
		
		String str="HemanthkumarS";
		Map<Character, Integer> maps=new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(maps.containsKey(c)) {
				maps.put(c, maps.get(c)+1);
			}
			else {
				maps.put(c, 1);
			}
			
		}
		
		Set<Character>keys=maps.keySet();
		for (Character c : keys) {
			if(maps.get(c)>1) {
				System.out.println(c+" is: " + maps.get(c)+ " times");
			}
			
		}
		

	}

}
