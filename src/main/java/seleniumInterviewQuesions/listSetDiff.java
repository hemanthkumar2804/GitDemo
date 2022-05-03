package seleniumInterviewQuesions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class listSetDiff {

	public static void main(String[] args) {
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("Hemanth");
		lis.add("Roopa");
		lis.add("Chirasmi");
		lis.add(null);
		lis.add(null);
		lis.add(null);
		lis.add("Chirasmi");
		for (String lt : lis) {
			System.out.println(lt);

		}
		System.out.println("-------using get method while accessing the list----");
		lis.get(0);
		lis.get(1);
		lis.get(2);
		lis.get(3);

		demoSet();

	}

	public static void demoSet() {
		Set<String> s1 = new HashSet<String>();
		s1.add("Hemanth");
		s1.add("Kumar");
		s1.add("Kumar");
		s1.add("Chirasmi");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);

		System.out.println("--Using for each------");
		for (String s : s1) {
			System.out.println(s);
		}
	}

}
