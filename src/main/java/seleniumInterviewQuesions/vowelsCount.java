package seleniumInterviewQuesions;

import java.util.function.IntPredicate;

public class vowelsCount {

	public static void main(String[] args) {
		String str = "aeiouAEIOU";
		int vowelcount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isvowel(str.charAt(i))) {
				vowelcount++;
			}
		}

		System.out.println("vowel count is: " + vowelcount);
		
		System.out.println("Using Java 8");
		IntPredicate vowel=new  IntPredicate() {
			
			@Override
			public boolean test(int c) {
				// TODO Auto-generated method stub
				return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
			}
		};
		String str1="I am chirasmi";
		long value=str1.chars().filter(vowel).count();
		System.out.println(value);

	}

	public static boolean isvowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

	}

}
