package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// OPEN GOOGLE
		
		//system is a class
		//setProperty(); is a static method
		
//		System.setProperty("webdriver.chrome.driver", "/Users/kathyochoa/eclipse-workspace/Selenium/drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//      http===> hypertext transfer protocol 
		// driver.get("http://www.google.com" );

		// OPEN GOOGLE
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    

		// OPEN FIREFOX
//		System.setProperty("webdriver.gecko.driver", "/Users/kathyochoa/eclipse-workspace/Selenium/drivers/geckodriver");
//	    WebDriver drivers=new FirefoxDriver();
//	    drivers.get("http://www.Firefox.com" );
		
		
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");

	}

}
