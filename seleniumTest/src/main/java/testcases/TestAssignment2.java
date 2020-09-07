package testcases;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssignment2 {
	
	
	public static void main(String[] args)  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://qa.way2automation.com//");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .withMessage("Userdefined timed out after 10 seconds")
	            .ignoring(NoSuchElementException.class);
		       
	driver.findElement(By.name("name")).sendKeys("Name");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input"))).click();
	
	driver.findElement(By.name("phone")).sendKeys("99076436764");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input"))).click();

	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/input")).sendKeys("meghanaprakash464@gmail.com");
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input"))).click();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"));
	Select select = new Select (dropdown);
	//select.selectByVisibleText("Guinea");
	select.selectByValue("Guinea");
	List<WebElement> values = dropdown.findElements(By.tagName("option"));
	
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[5]/input")).sendKeys("Munich");
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("user");
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("password");
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input"))).click();
	System.out.println("Total values are : " + values.size());
	System.out.println(values.get(12).getText());
	
	
}
}