package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptDemo {
	
	public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = null;
			driver = new ChromeDriver();
			driver.get("https://ksrtc.in");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
			driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String script =  "return document.getElementById(\"fromPlaceName\").value";
			String text = (String) js.executeScript(script);
			System.out.println(text);
			
			
			

}
}