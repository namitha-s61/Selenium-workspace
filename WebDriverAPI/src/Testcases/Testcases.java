package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebdriverManager;

public class Testcases {
	
	public static void main(String[] args) {
		
		WebdriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
	}

}
