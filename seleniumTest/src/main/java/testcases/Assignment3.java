package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .withMessage("Userdefined timed out after 10 seconds")
		            .ignoring(NoSuchElementException.class);
			       
		
		String question = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText();
		System.out.println(question);
		
		int op1 = Character.getNumericValue(question.charAt(0));
		int op2 = Character.getNumericValue(question.charAt(4));
		
		char operator = question.charAt(2);
		int answer = 0;
		if(operator == '+')
		{
			answer = op1 + op2;
		}
		else if(operator == '-')
		{
			answer = op1 - op2 ;
		}
		else
		{
			answer = 0;
		}
		System.out.println(Integer.toString(answer));
		//driver.findElement(By.id("mathans2")).sendKeys(Integer.toString(answer));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mathuserans2"))).sendKeys(Integer.toString(answer));	  

}
}