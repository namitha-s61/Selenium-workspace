import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testSample {
	
	@Test
	public void testLogin() throws MalformedURLException  , InterruptedException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("raman@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("sdfdsfsf");
		
		
		
		
	}

}
