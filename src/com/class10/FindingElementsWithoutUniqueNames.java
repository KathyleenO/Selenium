package com.class10;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class FindingElementsWithoutUniqueNames extends CommonMethods {
	/*
	 * TC 1: HRMS Login
	 * 
	 * Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * Login to the application by writing xpath based on “parent and child
	 * relation”
	 * 
	 * TC 2: HRMS Login
	 * 
	 * Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	 * Login to the application by writing xpath based on “following and preceding
	 * siblings”
	 * 
	 * 
	 */
	public static void main(String[] args) {

		
		//PARENT TO CHILD
		SetUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("UserOne");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Syntax123!");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		driver.quit();
		
		
		// YOUNG SIBLINGS TO OLD SIBLINGS
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("admin");
		//driver.findElement(By.xpath("input[@id=‘txtUsername’]/../following-sibling::div/input[@id=‘txtPassword’]")).sendKeys();

		//OLD TO YOUNG
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input[2]")).sendKeys("Syntax123!");
		
		driver.quit();
	}

}
