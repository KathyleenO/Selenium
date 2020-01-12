package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

/*
 * got to HRMs
 * enter user and password
 * thne  click using mouse
 */
public class ActionClassDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");

		// To perform Mouse or Keyboard Operations
		// We need to have an OBJECT OF ACTIONS CLASS

		Actions act = new Actions(driver);
		WebElement loginbutton = driver.findElement(By.cssSelector("input#btnLogin"));
		Thread.sleep(5000);

		// RIGHT CLICK
		act.moveToElement(loginbutton).contextClick().perform();
		// DOUBLE CLICK
//		act.moveToElement(loginbutton).doubleClick().perform();

		// identify on log in button, then click, then perform to move mouse
		act.moveToElement(loginbutton).click().perform();

		Thread.sleep(5000);

		// Hover over PIM

		WebElement n = driver.findElement(By.linkText("PIM"));
		act.moveToElement(n).perform();

		Thread.sleep(3000);
		// click on addEmployee Link

		WebElement adEmp = driver.findElement(By.cssSelector("a[id= 'menu_pim_addEmployee']"));
		act.moveToElement(adEmp).click().perform();
		Thread.sleep(1000);
		//act.keyUp(Keys.SHIFT).sendKeys("hello") --> if you perform this on txt box
				// it will hold shift key and type hello in upper case
	
		
		
		
	}
}
