package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
         
		//adding thread bc it will give error cuz selenium too fast
		//using LINKTEXT BUT WILL FAIL IF YOU CHANGE USERNAME OR PASSWORD SOO... USE PARTIAL LINKTEXT
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Welcome Admin")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("logout")).click();
		
		//PARTIAL LINKTEX=stable, never change
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		driver.close();

	}

}
