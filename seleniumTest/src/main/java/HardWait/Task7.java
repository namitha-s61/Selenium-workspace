package HardWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 {
	
public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//meso-native-marquee//li[3]")).click();
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("che");
		Thread.sleep(2000);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("n");
		Thread.sleep(2000);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("10/06/2020");
		driver.findElement(By.id("package-departing-hp-package")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("package-returning-hp-package")).sendKeys("17/06/2020");
//		driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.ENTER);
//		
//		WebDriverWait d = new WebDriverWait(driver , 25);
////		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'Hilton')]")));
////		driver.findElement(By.xpath("//a[contains(@href,'Hilton')]")).click();
//		
//		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex-linl-wrap']/a")));
		driver.findElement(By.xpath("//div[@class='flex-link-wrap']/a")).click();
		
		
		
		
		
		
		
		
		
		
		
				
}
}