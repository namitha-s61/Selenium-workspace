package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowsers {
	
	public static String browser  =  "firefox";
	public static ChromeDriver driver;
	

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}else if(browser.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		driver.close();
		driver.quit();
		
		

	}

}
