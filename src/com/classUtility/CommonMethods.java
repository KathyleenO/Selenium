package com.classUtility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver driver;

	/**
	 * 
	 * @param browser insert in String any browser "Chrome or "Firefox"
	 * @param url     put any url you want to be open
	 */

	public static void SetUp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
			driver = new ChromeDriver();
			driver.get(url);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.get(url);
		} else {
			System.err.println("Browser Not Supported");
		}

	}
/**
 * This method will accept the alert 
 * @throws will throw an NoAlertPresentException if alert is NOt present
 * 
 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}

	}
/**
 * This method will dismiss the alert
 * 
 * @throws  will throw an NoAlertPresentException if alert is NOt present
 * 
 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("");
		}
	}
	/**
	 * This method will get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws will throw an NoAlertPresentException if alert is NOt present
	 */

	public static String getAlertText() {
		String text=null;
		try {
			Alert alert = driver.switchTo().alert();
			 text=alert.getText();	
	
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	      return text;
	}
	
	
}
