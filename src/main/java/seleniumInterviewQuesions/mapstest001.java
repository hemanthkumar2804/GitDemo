package seleniumInterviewQuesions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapstest001 {

	public static void main(String[] args) {
		Map<Integer, String> maps=new HashMap<Integer, String>();
		maps.put(01, "Hemanth");
		maps.put(02, "Kumar");
		maps.put(03, "S");
		maps.put(04, "Chirasmi");
		maps.put(05, "Roopa");
		//maps.put(null, "Mohan");
		maps.put(06, null);
		maps.put(07, null);
		Iterator<Integer>it=maps.keySet().iterator();
		while(it.hasNext()) {
			int key=it.next();
			String value=maps.get(key);
			System.out.println("key is: "+key + "Value is: "+ value);
		}
		
	}

}
