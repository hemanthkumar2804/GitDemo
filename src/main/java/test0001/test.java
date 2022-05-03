package test0001;

public class test {

	public static void main(String[] args) {
		String name = "My name is HemanthKumar";
		String arr[] = name.split(" ");
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i].toString() + " ";
		}
		System.out.println(rev);
	}
}
