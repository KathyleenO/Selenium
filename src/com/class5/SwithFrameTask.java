package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;

public class SwithFrameTask extends CommonMethods {
	/*
	 * TC 1: Syntax Frame verification Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on
	 * “Others” link Click on “Iframe” link Click on the “Home” link inside the 1
	 * frame
	 * 
	 * Verify “Syntax logo” is displayed in another frame
	 * 
	 * Quit browser
	 * 
	 */
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.SetUp("chrome", SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		driver.switchTo().frame("FrameOne");

		driver.findElement(By.linkText("Home")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("FrameTwo");


		WebElement logodisplayed = driver.findElement(By.cssSelector("img[src='https://syntaxtechs.com/wp-content/uploads/2018/12/syntax-logo.png']"));
		System.out.println(logodisplayed.isDisplayed());
		driver.quit();
	}

}
