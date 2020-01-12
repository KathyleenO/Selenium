package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeAllMethodsSelenium {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "drivers/geckoDriver");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.redfin.com/");

		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");

		// GETTING TITLE
		String title = driver.getTitle();
		System.out.println(title);

		// IF ISDISPLAYED
		boolean is = driver.findElement(By.cssSelector("span.nav-sprite.nav-logo-base")).isDisplayed();
		System.out.println(is);

		driver.quit();

		
		
		
		
		
	}
}
