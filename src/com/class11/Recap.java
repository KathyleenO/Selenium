package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.classUtility.CommonMethods;

public class Recap extends CommonMethods {
	/*
	 * navigate to google and seach for item
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("iphone 11 pro", Keys.ESCAPE);
		// STEP 1 IDENTIFY ELEMENT AND STORE
		WebElement button = driver.findElement(By.name("btnK"));
		// STEP 2 CALL ACTIONS CLASS
		Actions act = new Actions(driver);

		// 1 way - move to the desire element and perform click
		// act.moveToElement(button).click().perform();
		// 2 way - click and specify the element on which to click
		act.click(button).perform();
		Thread.sleep(5000);
		driver.quit();

	}
}
