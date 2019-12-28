package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)

 * 
 */
public class Task2MercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.partialLinkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Kathleen");
		
//		driver.findElement(By.name("lastName")).sendKeys("Lopez");
//		driver.findElement(By.name("phone")).sendKeys("703567897");
//		driver.findElement(By.name("userName")).sendKeys("1234@gmail.com");
//		driver.findElement(By.name("address1")).sendKeys("789 Strawberry st");
//        driver.findElement(By.name("city")).sendKeys("Alexandria");
//        driver.findElement(By.name("state")).sendKeys("NY");
//        driver.findElement(By.name("postalCode")).sendKeys("22087");
//        driver.findElement(By.name("country")).sendKeys("USA");
//        driver.findElement(By.id("email")).sendKeys("1234@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("love");
//        driver.findElement(By.name("confirmPassword")).sendKeys("love");
        
        
    	driver.findElement(By.name("lastName")).sendKeys("Lopez");
		driver.findElement(By.id("phone")).sendKeys("703567897");
		driver.findElement(By.className("userName")).sendKeys("1234@gmail.com");
		driver.findElement(By.tagName("address1")).sendKeys("789 Strawberry st");
        driver.findElement(By.name("city")).sendKeys("Alexandria");
        driver.findElement(By.name("state")).sendKeys("NY");
        driver.findElement(By.name("postalCode")).sendKeys("22087");
        driver.findElement(By.name("country")).sendKeys("usa");
        driver.findElement(By.id("email")).sendKeys("1234@gmail.com");
        driver.findElement(By.name("password")).sendKeys("love");
        driver.findElement(By.name("confirmPassword")).sendKeys("love");
        
        
        
        
	}

}
