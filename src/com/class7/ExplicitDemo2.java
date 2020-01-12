package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.classUtility.CommonMethods;

public class ExplicitDemo2 extends CommonMethods {
/*
 * navigate to google
 * search wegmans
 * click on link wegmans grocery delviery 
 * click log in
 * 
 */
	
	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", "https://google.com");
		//send Wegmans text and hit enter
		driver.findElement(By.name("q")).sendKeys("Wegmans", Keys.ENTER);
		//click on first link on results page
		driver.findElement(By.xpath("//h3[@class=‘LC20lb’]")).click();
		//click on sign in 

		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in")));

		driver.findElement(By.id("sign-in")).click();
		System.out.println("button was clicked-----------------");

		Thread.sleep(3000);
		driver.quit();
		}
		}
