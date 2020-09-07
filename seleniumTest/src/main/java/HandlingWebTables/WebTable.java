package HandlingWebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
public static void main(String[] args)  {
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		String companyName = "REC";
		
	   List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	   List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		
		for(int i=0; i < companyNames.size() ; i++)
		{
			
			if(companyName.equals(companyNames.get(i).getText()))
            System.out.println(companyNames.get(i).getText() + "---------------"  + currentPrices.get(i).getText());
		}
		
	
}
}