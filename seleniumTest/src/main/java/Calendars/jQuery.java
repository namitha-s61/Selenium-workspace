package Calendars;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jQuery {
	
	static int targetDay =0,
			targetMonth = 0,
	        targetYear = 0;
			
		static int	currentDay = 0,
				    currentMonth =0,
				    currentYear =0;
			
		static int jumpMonthsBy=0;
		
		static boolean increment  = true;
		
			
		public static void main(String[] args) throws InterruptedException {
			
        String dateToSet=  "29/08/2020";
        getCurrentDateMonthAndYear();
        System.out.println(currentDay+"   "+currentMonth+ "  "+" "+currentYear);
        
        GetTargetDateMonthAndYear(dateToSet);
        System.out.println(targetDay+"   "+targetMonth+ "  "+" "+targetYear);
        
        CalculateHowManyMonthsToJump();
        System.out.println(jumpMonthsBy);
        System.out.println(increment);
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
        
        
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("#datepicker")).click();
        
        
        for(int i=0; i<jumpMonthsBy;i++) {
        	
        	if(increment) {
        		
        		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        	}
        
       else {
        	
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
        
        Thread.sleep(1000);
}

		}
         public static void getCurrentDateMonthAndYear() {
        	 
        	 Calendar cal = Calendar.getInstance();
        	 currentDay = cal.get(Calendar.DAY_OF_MONTH);
        	 currentMonth = cal.get(Calendar.MONTH)+1;
        	 currentYear = cal.get(Calendar.YEAR);
         }
         
         public static void GetTargetDateMonthAndYear(String dateString)
         {
        	 int firstIndex = dateString.indexOf("/");
        	 int lastIndex = dateString.lastIndexOf("/");
        	 String day = dateString.substring(0, firstIndex);
        	 targetDay = Integer.parseInt(day);
        	 String month = dateString.substring(firstIndex+1, lastIndex);
        	 targetMonth = Integer.parseInt(month);
        	 
        	 String year = dateString.substring(lastIndex+1, dateString.length());
        	 targetYear = Integer.parseInt(year);
         }
        public static void CalculateHowManyMonthsToJump() {	 
        	 
        	if((targetMonth-currentMonth)>0){
        		 
        		jumpMonthsBy = (targetMonth-currentMonth);
        		 
        	 }else {
        		 
        		 jumpMonthsBy = (currentMonth-targetMonth);
        		 increment = false;
        	 }
        	  
        }   	 
        
}