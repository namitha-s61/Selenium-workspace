package TrialsAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial1 {
	
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("email")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("dummy01123");
        
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//			       .pollingEvery(5, TimeUnit.SECONDS)
//			       .withMessage("Userdefined timed out after 10 seconds")
//		            .ignoring(NoSuchElementException.class);
//		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"u_0_b\"]"))).click();
//		
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_2')]")).click();
        driver.get("http://google.com");
		
		//driver.findElement(By.cssSelector("input[data-ved*='9UDCAY']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("a[ping*='QCC']")).click();
		
	}
	
	
	

}
