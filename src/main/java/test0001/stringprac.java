package test0001;

public class stringprac {

	public static void main(String[] args) {
		String str = "I am hemanthkumar s";
		String temp[] = str.split(" ");
		String rev01 = "";
		for (int j = 0; j <= temp.length - 1; j++) {
			System.out.println(temp[j]);
			rev01 = rev01 + temp[j].toString()  ;
		}
		System.out.println(rev01);
		String rev = "";
		for (int i = temp.length - 1; i >= 0; i--) {
			rev = rev + temp[i].toString() + " ";
		}
		System.out.println(rev);   

	}

}
