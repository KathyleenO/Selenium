package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class TaskAlerts extends CommonMethods {
/*
 * TC 1: JavaScript alert text verification



Click on button in “Java Script Alert Box” section
Verify alert box with text “I am an alert box!” is present

Click on button in “Java Script Confirm Box” section

Verify alert box with text “Press a button!” is present
Click on button in “Java Script Alert Box” section
Enter text in the alert box
Quit browser
 */
	
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.SetUp("chrome", SYNTAX_PRACTICE_URL);
		
		Thread.sleep(2000);
		//find the element Alerts and Modals and clicking on it
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		//finding Javascript Alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		// finding the button and click on it
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		Thread.sleep(2000);
	
		
		//handle the alert.
		Alert alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    
	    driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(2000);
	     
		
		

	}

}
