package HandlingAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notifications {
	
public static void main(String[] args)   {
	
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver(ops);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
        
}
}