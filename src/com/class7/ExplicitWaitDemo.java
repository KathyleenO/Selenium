package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

public class ExplicitWaitDemo extends CommonMethods {

	/*navigate to page
	 * click on others
	 * select dynamic data loading
	 * click get new user
	 * verify that first and last name is displayed
	 * 
	 */
	public static void main(String[] args) {
	
		CommonMethods.SetUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		
		//EXPLICIT WAIT OR WEBDRIVER WAIT----> wait for specific element to appear on the 
		//it will wait until expected condition is met or time is met
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[starts-with(text(),'First Name')]")));
		
		boolean displayed=driver.findElement(By.xpath("//p[starts-with(text(),'First Name')]")).isDisplayed();
		if(displayed) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}
		
		driver.quit();
		
		
		
	}

}
