package Actions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeStamp {
	
	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString().replace(":", "_").replace("  ", "_")+".jpg");
		
		

}
}