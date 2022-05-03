package test;

import java.util.HashSet;
import java.util.Set;

public class test03252022 {

	public static void main(String[] args) {
		FindDuplicateValuesinGivenString("HemanthKumarS");
		FindDuplicatesinGivenArray();
		fidon();
		fact(5);
		primeNumber(5);
		primeNumber(2);
		primeNumber(4);
		primeNumber(0);
		primenumberfrom1to100();

	}

	public static void FindDuplicateValuesinGivenString(String name) {
		boolean flag = false;
		Set<Character> cha = new HashSet<Character>();
		for (Character ch : name.toCharArray()) {

			if (cha.add(ch) == false) {
				System.out.println("Found duplicate values: " + ch);
			}

		}
		if (flag == true) {
			System.out.println("Did not found deplicate values");
		}

	}

	public static void FindDuplicatesinGivenArray() {
		String arr[] = { "Java", "C", "Test", "Python", "C++", "Java", "C" };
		boolean flag = false;
		Set<String> name = new HashSet<String>();
		for (String s : arr) {

			if (name.add(s) == false) {
				System.out.println("Found duplicate :" + s);
			}

		}
		if (flag == true) {
			System.out.println("Did not found duplicates");
		}
	}

	public static void fidon() {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= 8; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

	public static void fact(int num) {
		int factor = 1;
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			factor = factor * i;
		}
		System.out.println("Factorial of a Number 5 is: " + factor);
	}

	public static void primeNumber(int num) {

		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num +": "+"Number is prime");
			} else {
				System.out.println(num +": "+"Number is not prime");
			}
		} else {
			System.out.println(num +": "+"Number is not prime");
		}
	}
	public static void primenumberfrom1to100() {
		for (int i=1;i<=100;i++) {
			primeNumber(i);
		}
	}

}
