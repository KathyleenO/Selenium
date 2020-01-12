package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;
/*navigate to Hrms
 * enter USEr and pass
 * click in login button with JavaScriptExecutor
 * 
 */
public class JavaScriptExcecutorDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));

		//change color
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn);
		Thread.sleep(5000);
		//CLICK
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,22050)");


		Thread.sleep(5000);
		driver.quit();
		

	}

}
