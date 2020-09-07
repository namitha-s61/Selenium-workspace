package AjaxDropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ComboBox {
	
public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to("https://americangolf.co.uk/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Clothing & Shoes')]"))).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='CLOTHFOOTW_1']//span[@class='name'][contains(text(),'Shirts')]")).click();
	
	    
}
}