package TrialsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trial9 {
	
	public static void main(String[] args)   {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://goair.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"bookflights\"]/div[2]/div[2]/div[1]/form/table/tbody/tr[2]/td[6]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"myDropdown_round\"]/div/div[1]/div[2]/div/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"myDropdown_round\"]/div/div[2]/div[2]/div/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"myDropdown_round\"]/div/div[3]/div[2]/div/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"traveler_done_round\"]")).click();
        
        
        
        
}
}