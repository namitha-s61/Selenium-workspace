package org.openqa.selenium.firefox;

public class FirefoxDriver {
	
	public FirefoxDriver() {
		
		System.out.println("Launching Firefox");
	}
	
	public void get(String url) {
		
		System.out.println("Navigating to the url in firefox");
	}
	
	public void getTitle() {
		
		System.out.println("Getting the title from current page in Firefox");
	}
       public void click() {
    	   
    	   System.out.println("Clicking on an Element in Firefox");
       }
	
       public void sendkeys() {
    	   
    	   System.out.println("Typing in an element in firefox");
       }
	}
     