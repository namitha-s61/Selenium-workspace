package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcsae3 {
	
	@Test(priority=1,groups= {"functional","smoke"})
public void doUserreg() {
		
		System.out.println("Executing User Reg test");
	    Assert.fail("User not registered successfully");
		
	}
	
	    @Test(priority=2,dependsOnMethods="doUserreg",groups= {"functional","smoke"})
        public void doLogin() {
        	
        	System.out.println("Executing Login Test");
        }

	
	@Test(priority=3,dependsOnMethods="doUserreg" , alwaysRun=true,groups= {"functional","smoke"})
	public void thirdTest() {
		
		System.out.println("Executing Third Test");
	}
		
	@Test(priority=4, groups="bvt")
	public void fourthTest() {
		
		System.out.println("Executing Fourth Test");
	}
       

}