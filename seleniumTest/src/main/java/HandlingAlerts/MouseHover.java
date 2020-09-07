package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException   {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://americangolf.co.uk");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs')]"))).build().perform();
		//driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs'")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='CLUBS_1']//span[@class='name'][contains(text(),'Drivers')]")).click();
}
}
