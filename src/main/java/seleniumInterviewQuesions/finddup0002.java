package seleniumInterviewQuesions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class finddup0002 {

	public static void main(String[] args) {
		String str="ChirasmiHemanthRoopaHmenathHemanthKumar";
		Map<Character,Integer>basemap=new HashMap<Character,Integer>();
		char c[]=str.toCharArray();
		for (char d : c) {
			if(basemap.containsKey(d)) {
				basemap.put(d, basemap.get(d)+1);				
			}
			else {
				basemap.put(d, 1);
			}
			
		}
		
		Set<Character>key=basemap.keySet();
		for (Character character : key) {
			
			if(basemap.get(character)>1) {
				System.out.println(character+" is "+basemap.get(character));
			}
			
		}
		

	}

}
