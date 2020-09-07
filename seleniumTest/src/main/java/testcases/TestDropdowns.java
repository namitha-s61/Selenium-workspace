package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;


public class TestDropdowns {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("searchLanguage")).sendKeys("Deutsch");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Deutsch");
		
		select.selectByValue("eo");
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		System.out.println("Total values are : " + values.size());
		System.out.println(values.get(12).getText());
		
		for(int i=0; i<values.size(); i++) {
			
		  System.out.println(values.get(i).getAttribute("lang"));
		}
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println("----printing links-----");
		
		System.out.println("Total links are :" +links.size());
		
		for(WebElement link : links) {
			
			System.out.println(link.getText()+"-- URL ---"+link.getAttribute("href"));
		}
		
//		WebElement secondBlock = driver.findElement(By.id("block id"));
//		
//		 secondBlock.findElements(By.id("abc")).get(2).click();
	}

}



