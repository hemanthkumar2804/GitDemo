package seleniumInterviewQuesions;

public class repOfChar {

	public static void main(String[] args) {
		countrep("Hemanthkumar");

	}
	public static void countrep(String str) {
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 1; j < str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				else {
					count=0;
				}
				
			}
			System.out.println(str.charAt(i)+ "is repated:"+ count);
		}
		
		
	}

}
