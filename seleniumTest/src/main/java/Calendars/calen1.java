package Calendars;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calen1 {
	
	public static void main(String[] args) throws ParseException , InterruptedException, java.text.ParseException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("departureCalendar")).click();
		Thread.sleep(3000);
		String d = "16/07/2021";
		
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date mydate = df.parse(d);
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(mydate);
        int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
        int month = cal.get(java.util.Calendar.MONTH);
        int year = cal.get(java.util.Calendar.YEAR);
        System.out.println(day);
        System.out.println(months[month]);
        System.out.println(year);
        
        String forwardArrow = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
        String travelMonth = months[month] +" "+year;
        System.out.println(travelMonth);
        String xpathMonthYearSection = "//div[contains(@class,'fareCalFlt')]/div/div[2]/div";
        while(!driver.findElement(By.xpath(xpathMonthYearSection)).getText().equals(travelMonth)) {
        driver.findElement(By.xpath(forwardArrow)).click();
        }
        
       driver.findElement(By.xpath("//div[text()='" + day +"']")).click();
       driver.quit();
       
       
       
       
}

}


