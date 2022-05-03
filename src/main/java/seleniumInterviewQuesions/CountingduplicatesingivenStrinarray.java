package seleniumInterviewQuesions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingduplicatesingivenStrinarray {

	public static void main(String[] args) {
		String srt[]= {"Hemanth","Chirasmi","Roopa","Chirasmi","Roopa","Kumar"};
		Map<String,Integer> basemap=new HashMap<String,Integer>();
		for (String string : srt) {
			if(basemap.containsKey(string)) {
				basemap.put(string, basemap.get(string)+1);
			}
			else {
				basemap.put(string, 1);
			}
		}
		Set<String> key=basemap.keySet();
		for (String string : key) {
			if(basemap.get(string)>1) {
				System.out.println(string+ " is "+ basemap.get(string));
			}
			
		}
		
		

	}

}
