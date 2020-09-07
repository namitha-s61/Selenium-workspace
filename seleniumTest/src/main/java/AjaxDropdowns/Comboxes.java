package AjaxDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Comboxes {
	
public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to("https://www.jobserve.com/in/en/Job-Search/");
		driver.manage().window().maximize();
		String industry = "Education";
		driver.findElement(By.xpath("//span[contains(text(),'27 Industries Selected')]")).click();
		driver.findElement(By.xpath("//input[@id='ddcl-selInd-i0']")).click();
	    List<WebElement> allindustries = driver.findElements(By.xpath(("//div[@id='industryDisplay']/div/div/div/label")));
	    
	    for(int i=0;i < allindustries.size();i++) 
	    {
	    	System.out.println(allindustries.get(i).getText());
	    	if(allindustries.get(i).getText().equalsIgnoreCase(industry))
	    	{
	    		allindustries.get(i).click();
	    	}
	    	
	    }	
}
}