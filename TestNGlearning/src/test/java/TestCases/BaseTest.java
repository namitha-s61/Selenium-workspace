package TestCases;

import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Initializing Everything!!!");
	}

	public void tearDown() {
		
		System.out.println("Quitting Everything!!!");
	}
}
