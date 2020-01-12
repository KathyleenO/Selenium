package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForwardPractice {
	/*
	 * Open chrome browser
	 * 2.Navigate to 
	 * “https://www.zillow.com/”
	 * 3.Navigate to “https://www.google.com/”
	 * 4.Navigate back to Zillow Page
	 * 5.Refresh current page
	 * 6.Verify url contains “Zillow”
	 */

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String URL="https://www.zillow.com/";
		
		if (URL.contains("zillow")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		driver.quit();
		
		
	}
}
