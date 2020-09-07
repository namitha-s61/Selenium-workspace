package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://americangolf.co.uk");
        Actions a = new Actions(driver);
       a.moveToElement(driver.findElement(By.xpath("//input[@id='q']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
       
}
}