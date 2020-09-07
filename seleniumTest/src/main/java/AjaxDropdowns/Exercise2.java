package AjaxDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise2 {
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector(".lbl_input.latoBold.appendBottom5")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Mum");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.ENTER);
		

}
}