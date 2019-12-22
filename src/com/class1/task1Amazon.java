package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		

		driver.navigate().to("https://www.amazon.com/");
		
		String actualTitle= driver.getTitle();
    	 System.out.println(actualTitle);
    	 

	}

}
