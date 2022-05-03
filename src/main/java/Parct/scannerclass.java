package Parct;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("what is your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hi " + name);
		sc.close();

	}

}
