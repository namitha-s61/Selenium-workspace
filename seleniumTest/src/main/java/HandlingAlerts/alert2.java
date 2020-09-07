package HandlingAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert2 {
	
public static void main(String[] args)   {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wishpond.com/pricing/?utm_source=blog%20overlay&blog_overlay=true&popup");
		driver.manage().window().maximize();

}

}

