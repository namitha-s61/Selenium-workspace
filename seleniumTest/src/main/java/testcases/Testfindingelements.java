package testcases;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Testfindingelements {
	

	public static void main(String[] args)  {
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("http://gmail.com");
			// to maximize a window
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS)
				       .pollingEvery(5, TimeUnit.SECONDS)
				       .withMessage("Userdefined timed out after 10 seconds")
			            .ignoring(NoSuchElementException.class);
				       
					
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shuntiputti@gmail.com");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("shuntiputti@gmail.com");
			
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("subbikutte");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("subbikutti");
		    
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	         //System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]")).getText());
	         System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]"))).getText());
		}

	}


