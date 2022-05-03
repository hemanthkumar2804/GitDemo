package parct001;

public class DiffStringStringbuffer {

	public static void main(String[] args) {
		DiffStringStringbuffer01();
		stringrev("Hemanth");
		numrev(123456);
		fidonicseries(10);
	}

	public static void DiffStringStringbuffer01() {
		String s1 = new String("Tesing");
		System.out.println(s1);
		StringBuffer sb1 = new StringBuffer("Tesing");
		sb1.append("Application");
		System.out.println(sb1);

	}

	public static void stringrev(String s) {
		int len = s.length() - 1;
		String rev = "";
		for (int i = len; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

	public static void numrev(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}
	
	public static void fidonicseries(int count) {
		int n1=0,n2=1;
		System.out.print(n1 +" "+n2+ " ");
		for(int i=2;i<count;i++) {
			int n3=n1+n2;
			System.out.print(n3 +" ");
			n1=n2;
			n2=n3;
		}
	}

}
