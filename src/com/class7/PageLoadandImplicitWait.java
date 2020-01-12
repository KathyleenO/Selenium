package com.class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class PageLoadandImplicitWait extends CommonMethods {

	public static void main(String[] args) {
		
		
		CommonMethods.SetUp("Chrome", "https://google.com");
		//Page load waits until ALL ELEMENTS on page are FULLY LOADED
		//if element wont load in 30sec you will get TimeOutEception
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Tell webdriver to wait for the ELEMENT before throwing expection\
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("wrongname")).sendKeys("iPhone");
		
		driver.quit();
		
		
	}

}
