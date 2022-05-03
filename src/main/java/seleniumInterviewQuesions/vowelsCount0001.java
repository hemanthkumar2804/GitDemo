package seleniumInterviewQuesions;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class vowelsCount0001 {

	public static void main(String[] args) {
		
		System.out.println("Enter the string value");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vCount=0;
		for(int i=0;i<str.length();i++) {
			if(vowelis(str.charAt(i))){
				vCount++;
				
			}
		}
		System.out.println("vowelsCount is: "+ vCount);
		
		System.out.println("Using Java 8");
		IntPredicate vowel=new IntPredicate() {
			
			@Override
			public boolean test(int c) {
				// TODO Auto-generated method stub
				return c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='O';
			}
		};
		
		String str1="I am hemanthkumar s";
		long count=str1.chars().filter(vowel).count();
		System.out.println("Number of vowels is: "+ count);
		
		

	}
	public static boolean vowelis(char c) {
		return c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='O';
	}

}
