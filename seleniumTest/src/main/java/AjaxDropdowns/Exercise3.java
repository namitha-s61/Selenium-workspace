package AjaxDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3 {
	
public static void main(String[] args) throws InterruptedException  {
	
	ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/div[3]/div/form/button[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		Thread.sleep(5000);
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@type='normal']"));
		for(int i=0;i < values.size();i++)
		{
			System.out.println(values.get(i).getText());
		}
		
		
		
		

}
}