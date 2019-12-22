package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		 Thread.sleep(100);
		
		 //BROWSER navigation commands;
		
		//NAVIGATE to a WEBPAGE  
		// GOOGLE--> FACEBOOK
		 
		driver.navigate().to("http://www.facebook.com");
		
		//GOOGLE--> FACEBOOK--> GOOGLE 
	    driver.navigate().back();
	    
	    //it will navigate one step forward
	    driver.navigate().forward();
        
	    //CLOSE WEBPAGE
	    driver.close();
	    
	   //PAGE COMMANDS
	 String actualTitle= driver.getTitle();
	 System.out.println(actualTitle);  //the front page of web title Log In or Sign up
	    
		

	}

}
