package testNG;

public class test198918 {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		for(int i=600;i<=1000;i++) {
			if(i%2==0) {
				even++;
				System.out.println("even number"+i);
			}
			else {
				System.out.println("Odd number"+i);
				odd++;
			}
		}
		
		System.out.println("odd numbers in the given range is"+" "+ even);
		System.out.println("odd numbers in the given range is"+ "" + odd);

	}

}
