package Testcases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbrowser {

	public static void main(String[] args) {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.getTitle();
		driver.click();
		driver.sendkeys();

	}

}
