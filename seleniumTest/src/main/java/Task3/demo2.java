package Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
	
public static void main(String[] args) throws InterruptedException  {
		
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = null;
			driver = new ChromeDriver();
			driver.get("https://www.skyscanner.de/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='fsc-origin-search']")).click();
            driver.findElement(By.xpath("//input[@id='fsc-origin-search']")).sendKeys("Beng");
            driver.findElement(By.xpath("//input[@id='fsc-origin-search']")).sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            driver.findElement(By.xpath("////input[@id='fsc-origin-search']")).sendKeys(Keys.DOWN);
            
            JavascriptExecutor js = (JavascriptExecutor)driver;
            String script =  "return document.getElementById(\"fsc-origin-search\").value;";
            String text = (String) js.executeScript(script);
            System.out.println(text); 
            
            
            
			
			
}
}