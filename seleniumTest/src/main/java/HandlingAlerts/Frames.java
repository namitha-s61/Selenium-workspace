package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://paytm.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3ac-']")).click();
		//System.out.println("Count of frames:-->" + driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='qrcode-footer-text']/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[2]/a")).click();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdef");
	}

}
