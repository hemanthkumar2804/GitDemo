package test0001;

import org.testng.annotations.Test;

public class parallelTesting2 {
	
	@Test
	public void test04() {
		System.out.println("I am in test04-method004-ID: " + Thread.currentThread().getId());
	}
	
	@Test
	public void test05() {
		System.out.println("I am in test05-method005-ID: " + Thread.currentThread().getId());
	}
	
	@Test
	public void test06() {
		System.out.println("I am in test06-method006-ID: " + Thread.currentThread().getId());
	}
	
	

}
