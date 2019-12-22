package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Syntax {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.syntaxtechs.com/");
		
		
		driver.navigate().to("http://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
	
		String actualUrl = driver.getCurrentUrl();

		boolean str= driver.getCurrentUrl().contains("syntax");
		System.out.println(str);
		
	}

}
