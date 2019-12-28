package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		
		//FIRE FOX
//		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://Firefox.com");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		//Maximize Webpage
		driver.manage().window().fullscreen();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		//storing USERNAME TEXTBOX INISIDE VARIABLE
		WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
		username.sendKeys("John");
		Thread.sleep(1000);
		username.clear();
		username.sendKeys("Tester");
		
		//storing PASSWORD TEXTBOX INISIDE VARIABLE
		WebElement password=driver.findElement(By.cssSelector("input[type='password"));
		password.sendKeys("Test");
		
		//LOGIN BUTTTON USING CSS SELECTOR
		
		driver.findElement(By.cssSelector("input.button")).click();
	
            Thread.sleep(3000);
		     driver.quit();
	}

}
