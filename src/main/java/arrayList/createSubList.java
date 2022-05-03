package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class createSubList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList001= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
		System.out.println(arrList001);
		ArrayList<Integer> arrSubList=new ArrayList<Integer>(arrList001.subList(2, 6));
		System.out.println(arrSubList);
		
		

	}

}
