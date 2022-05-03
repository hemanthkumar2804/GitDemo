package testNG;

import org.testng.annotations.Test;

public class testNG001 {

	@Test(priority=0)
	public void testNGtc01() {
		System.out.println("First test case of TestNG ");
	}

	@Test(priority=1)
	public void testNGtc02() {
		System.out.println("Second test cases of TestNG");
	}
}
