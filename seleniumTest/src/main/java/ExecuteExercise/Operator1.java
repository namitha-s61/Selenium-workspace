package ExecuteExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operator1 {
	
public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
	    
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromCity")).sendKeys("delhi");
		driver.findElement(By.id("fromCity")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.DOWN);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script =  "return document.getElementById(\"fromCity\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while(!text.equalsIgnoreCase("Delhi"))
		{
			driver.findElement(By.id("fromCity")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
				break;
		}
	 if(i>10)
	 {
		 System.out.println("Element not found");
	 }else
		 System.out.println("Element found");		 
}
}