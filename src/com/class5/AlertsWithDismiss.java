package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class AlertsWithDismiss extends CommonMethods {

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntac Practice Website using chrome browser
		SetUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		
		// finding element Alerts and Modals and Click
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts&Modals']")).click();
		
		// finding Javascript Alerts and click on it
		driver.findElement(By.linkText("Javascript Alerts")).click();

		// finding the second alert button and click on it
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(2000);

		// HANDLING ALERT
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("");

		// TO DISMISS OR CANCEL ALERT, NO,
		alert.dismiss();
		driver.close();
	}
}