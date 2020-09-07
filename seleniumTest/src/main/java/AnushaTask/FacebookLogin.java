package AnushaTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .withMessage("Userdefined timed out after 10 seconds")
		            .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname"))).sendKeys("Meghana");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname"))).sendKeys("Prakash");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email__"))).sendKeys("meghanaprakash464@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"u_0_w\"]"))).sendKeys("meghanaprakash464@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_passwd__"))).sendKeys("meghana990206");
		
		WebElement  dropdown = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Jun");
		
		WebElement  dropdown1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("11");
		
		WebElement  dropdown2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("1998");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"checkpointSubmitButton\"]")).click();
		
		
		
		
		
		
		
			
}
}