package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

//		 String actualTitle= driver.getTitle();
//		 System.out.println(actualTitle);  //the front page of web titlename; GOOGLE

		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("the titles match ");
		} else {
			System.err.println("no title match");
		}

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl = "https://www.google.com/?gws_rd=ssl";

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("both url match ");
		} else {
			System.err.println("no url match");
		}

		driver.close();
	}

}
