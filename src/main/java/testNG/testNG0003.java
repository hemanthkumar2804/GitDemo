package testNG;

import org.testng.annotations.Test;

public class testNG0003 {

	@Test(priority = 0)
	public static void testNGTC004() {
		System.out.println("Fourth program of testNG");
	}

	@Test(priority = 0)
	public static void testNGTC005() {
		System.out.println("5th program of testNG");
	}

	@Test(priority = 2)
	public static void testNGTC0006() {
		System.out.println("6th program of testNG");
	}

}
