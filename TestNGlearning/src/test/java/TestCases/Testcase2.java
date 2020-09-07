package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 extends BaseTest {
	
	@Test(groups="smoke")
	public void validateTitles() {
		
		System.out.println("Begining");
		
		String expected_title = "Yahoo.com";//excel
		String actual_title = "Gmail.com";//selenium
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating Title");
		
		
		softAssert.assertEquals(actual_title, expected_title);
		// example : selenium isElementPresent("xpath") - True, False.
		//Assert.assertTrue(false,"Element not found");
		System.out.println("Validating image");
		softAssert.assertEquals(true, false , "image not present");
		
		System.out.println("validate text box presence");
		softAssert.assertEquals(true, false,"test box not present");
		//Assert.fail("Failing the test as the condition is not met");
		System.out.println("Ending");
		
		softAssert.assertAll();
		
	}

}
