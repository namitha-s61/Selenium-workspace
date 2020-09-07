package TrialsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trial2 {
	
	
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("dummy@gmail.com");
		
		//driver.findElement(By.cssSelector("td:nth-of-type(1) input.inputtext")).sendKeys("dummy@gmail.com");
		
		//driver.findElement(By.cssSelector("tr > td:nth-child(2) input.inputtext")).sendKeys("dummy@gmail.com");
		// driver.findElement(By.cssSelector("div[class='a4bIc'] input")).sendKeys("home");
//	    driver.findElement(By.xpath("(//span[@class='_5k_3']/span)")).click();
//		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[1]")).click();
//		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following-sibling::span[2]")).click();
		driver.findElement(By.cssSelector(".inputtext.login_form_input_box")).sendKeys("dummy@gmail.com");
		
		
		
}
}