package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	
//public static void main(String[] args) throws InterruptedException  {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.W3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("/html/body/button")).click();
//		driver.switchTo().defaultContent();
//		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//        System.out.println(frames.size());
//        for(WebElement frame : frames) {
//        	
//        	System.out.println(frame.getAttribute("id"));
//        }		
//}
//}
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
     driver.get("https://jqueryui.com/datepicker");
     driver.manage().window().maximize();
     
     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .withMessage("Userdefined timed out after 10 seconds")
		            .ignoring(NoSuchElementException.class);
     
     
     
     
	}
	}
     

	
	
	
	
	