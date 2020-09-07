package TrialsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial7 {
	
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		driver.manage().window().maximize();
		System.out.println("Total links on entire page-->"  + driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.xpath("//*[@id=\"home\"]/footer/div[2]/div[1]/div[4]/div/ul"));
		System.out.println("Total links on footer section-->"  + footerdriver.findElements(By.tagName("a")).size());
		 
		
		
		
		

}
}