package TrialsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iterator {
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		WebElement footerdriver = driver.findElement(By.cssSelector("#home > footer > div.desktop > div.footer__grid-col--container > div.footer__info-links.grid-col.grid-col-2 > ul > li:nth-child(1)"));
		System.out.println("Total links on footer section-->"  + footerdriver.findElements(By.tagName("a")).size());
		for(int i=0; i<footerdriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(1000);
		}
	  java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		while(iter.hasNext())
		{
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
	  
}
}