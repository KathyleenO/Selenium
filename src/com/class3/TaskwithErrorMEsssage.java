package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*TC 1: HRMS Application Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password
Click on login button
Then verify Syntax Logo is displayed.d

TC 2: HRMS Application Negative Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Verify error message with text “Password cannot be empty” is displayed.

 * 
 */
public class TaskwithErrorMEsssage {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
//		
//		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		username.sendKeys("sohilaryan");
//		
//		WebElement  pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
//		pass.sendKeys("Syntax@12");
//		driver.findElement(By.name("Submit")).click();
//		WebElement logo=driver.findElement(By.cssSelector("img[src^='/human'"));
//		
//		
//		if(logo.isDisplayed()) {
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo NOT displayed");
//		}
//		driver.quit();
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver2=new ChromeDriver();
		driver2.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement user2=driver2.findElement(By.xpath("//input[@name='txtUsername']"));
		user2.sendKeys("sohilaryan");
		WebElement pass2=driver2.findElement(By.xpath("//input[@id='txtPassword']"));
		pass2.sendKeys("");
		driver2.findElement(By.cssSelector("input.button")).click();

		WebElement emptypass=driver2.findElement(By.id("spanMessage"));
		
		if(emptypass.isDisplayed()) {
			System.out.println("“Password cannot be empty” is displayed.");
		}else {
			System.out.println("Password cannot be empty” NOT displayed.");
		}
		
		driver2.quit();
	}

}
