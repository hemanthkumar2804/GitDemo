package seleniumInterviewQuesions;

public class testparc0001 {

	public static void main(String[] args) {
		revString("HemanthKumarS");
		revNum(12345);

	}

	public static void revString(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverce String is: " + rev);

	}
	
	public static void revNum(int value) {
		int reverse=0;
		while(value!=0) {
		reverse=reverse*10+value%10;
		value=value/10;
		}
		System.out.println(reverse);
	}

}
