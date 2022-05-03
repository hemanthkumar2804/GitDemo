package test0001;

import org.testng.annotations.Test;

public class test1234 {

	@Test(invocationCount=10,threadPoolSize=10)
	public void test() {
		System.out.println("Test same data multipul times"+ " :"+Thread.currentThread().getId());
		

	}

}
