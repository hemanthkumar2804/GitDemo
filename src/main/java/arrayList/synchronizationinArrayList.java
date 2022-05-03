package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizationinArrayList {

	public static void main(String[] args) {
		// 1. Collections.synchronizedList
		System.out.println("-----Using Collections.synchronizedList--------");
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("Java");
		nameslist.add("Selenium");
		nameslist.add("Phyton");
		nameslist.add("Ruby");
		// To add and remove we don't need explicit synchronization
		// To fetch and traverse a value we need use explicit synchronization
		synchronized (nameslist) {
			Iterator<String> Iter = nameslist.iterator();
			while (Iter.hasNext()) {
				System.out.println(Iter.next());
			}
		}
		System.out.println("-------CopyOnWriteArrayList----------");
		// 2. CopyOnWriteArrayList--Its a class : Thread safe/synchronized already.
		CopyOnWriteArrayList<String> copywrite = new CopyOnWriteArrayList<String>();
		copywrite.add("Hemanth");
		copywrite.add("Chirasmi");
		copywrite.add("Roopa");
		// No need to mention synchronized explicitly
		for (String S : copywrite) {
			System.out.println(S);
		}

	}

}
