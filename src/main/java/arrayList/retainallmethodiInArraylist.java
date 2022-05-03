package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class retainallmethodiInArraylist {

	public static void main(String[] args) {
		ArrayList<String> arlist01=new ArrayList<String>(Arrays.asList("Java","Phyon","PHP","Perl","C#","C","Java"));
		System.out.println(arlist01);
		arlist01.retainAll(Collections.singleton("Java"));
		System.out.println(arlist01);

	}

}
