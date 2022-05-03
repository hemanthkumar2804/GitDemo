package seleniumInterviewQuesions;

public class reverceString {

	public static void main(String[] args) {
		String str = "Chirasmi";
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
