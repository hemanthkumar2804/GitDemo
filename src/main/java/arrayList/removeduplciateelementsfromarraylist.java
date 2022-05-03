package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplciateelementsfromarraylist {

	public static void main(String[] args) {
		// 1. Removing duplicate in Array List
		ArrayList<Integer> numarrlist = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0));
		LinkedHashSet<Integer> linkhas = new LinkedHashSet<Integer>(numarrlist);
		ArrayList<Integer> newlistwithoutdup = new ArrayList<Integer>(linkhas);
		System.out.println(newlistwithoutdup);
		// newlistwithoutdup.stream().forEach(ele -> System.out.println(ele));

		// 2. Removing duplicates using stream Java8
		ArrayList<Integer> numarrlist01 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0));
		List<Integer> withoutdupnames = numarrlist01.stream().distinct().collect(Collectors.toList());
		System.out.println(withoutdupnames);
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Hemanth","Kumar","Java","Ruby","Test","Test","Hemanth","Chirasmi"));
		List<String>Afterremovedup=names.stream().distinct().collect(Collectors.toList());
		System.out.println(Afterremovedup);
	}

}
