package testNG;

import org.testng.annotations.Test;

public class day1 {

	
	@Test
	public void demo() {
		System.out.println("hello day1 ");
	}
	
	@Test
	public void demoTwo() {
		System.out.println("hello day1 ");
	}
	@Test(groups= {"smoke"})
	public void smoke() {
		System.out.println("hello day1 smoke ");
	}

}
