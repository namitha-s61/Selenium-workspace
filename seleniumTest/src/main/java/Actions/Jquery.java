package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {
	
	public static void main(String[] args) throws InterruptedException  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();		
	driver.navigate().to("https://jqueryui.com/resources/demos/slider/default.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement mainslider = driver.findElement(By.id("slider"));
	int width = mainslider.getSize().width/2;
	WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	new Actions(driver).dragAndDropBy(slider, 400, 0).perform();

}
}