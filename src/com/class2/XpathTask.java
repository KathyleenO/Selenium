package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {

	public static void main(String[] args) {
		/*
		 *  enter firs,lastname, movile number ans click sign up button task
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kathleen");
		driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-")).sendKeys("ochoa");
		
		
	}

}
