package AjaxDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1 {
	
	public static void main(String[] args)  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = null;
	driver = new ChromeDriver();
	driver.get("https://www.skyscanner.de/");
	driver.manage().window().maximize();
	driver.findElement(By.id("fsc-origin-search")).sendKeys("Mun");
	driver.findElement(By.id("fsc-origin-search")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("fsc-origin-search")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("fsc-origin-search")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.id("fsc-origin-search")).getAttribute("value"));
	
	
	
	
	}
	
}	
	

	
	







