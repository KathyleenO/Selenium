package com.class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.classUtility.CommonMethods;

public class Task extends CommonMethods{
/*TC 1: Verify element is present

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
 * 
 */
	
	public static void main(String[] args) {
		
		
		SetUp("chrome","https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Start']")));
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		boolean displayed=driver.findElement(By.xpath("//button[text()='Start']")).isDisplayed();
		if(displayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}


	}
}
