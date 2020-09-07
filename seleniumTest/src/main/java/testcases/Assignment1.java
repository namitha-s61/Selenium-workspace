package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		 int linkCount = links.size();
		 System.out.println("Total Number of link count on webpage = "  + linkCount); 
		 
			System.out.println("----printing links-----");
			
			System.out.println("Total links are :" +links.size());
			
			for(WebElement link : links) {
				
				System.out.println(link.getText()+"-- URL ---"+link.getAttribute("href"));
			}
		 
		 
		 
	}
}