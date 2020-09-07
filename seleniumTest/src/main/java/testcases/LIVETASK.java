package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import org.openqa.selenium.Alert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LIVETASK {
	
	public static void main(String[] args ) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.check24.de/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#c24-meinkonto > span > span.c24-customer-hover.c24-header-hover > span")).click();
		//driver.findElement(By.partialLinkText("Anmelden")).click();
		//driver.findElement(By.cssSelector("#oauth-container > div > div.c24-kb-form-column > div > div:nth-child(2) > button > div.oauth-wording")).click();
		
//		Set<String> allWindows = driver.getWindowHandles();
//		for(String currentWindow : allWindows) {
//			driver.switchTo().window(currentWindow);
//		}
////		driver.switchTo().window(currentWindow);
//		driver.findElement(By.name("identifier")).sendKeys("namithas61@gmail.com");
//		Set<String> allWindows1 = driver.getWindowHandles();
//		for(String currentWindow : allWindows1) {
//			driver.switchTo().window(currentWindow);
//		}
//		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
//		//driver.findElement(By.id("password")).sendKeys("Saibaba@1990");
	
		WebElement  menu = driver.findElement(By.cssSelector(("#c24-header-bottom > div > nav > div > div > div.c24-nav-ele.c24-nav-insurance > a > span")));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.partialLinkText("Handyversicherung")).click();
		
		
		
		
	}
	
	
	
			
 
}
