package com.class5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.classUtility.CommonMethods;

public class DropDownRecap extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
	     // The method is opening syntac Practice Website using chrome browser
		SetUp("chrome", SYNTAX_PRACTICE_URL);
		
		//Finding element input form and click on it
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		//finding element select dropdown list and click
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		WebElement dd=driver.findElement(By.id("select-demo"));
		   Select days=new Select(dd);//dd or driver.findElement(By.id("select-demo"));
		   //1. SELECING BY INDEX
		   days.selectByIndex(3);  //start from 1.2..3..4
		   //2. SELECTING BY VISIBLE TEXT
		   days.selectByVisibleText("Friday");
		   //3. SELECTING BY VAKUE
		   days.selectByValue("Wednesday");
		   Thread.sleep(2000);
	
		   
		   
		   //USING OPTIONS
		   
		  List<WebElement> options=days.getOptions();
		  System.out.println(options.size());
		 Iterator<WebElement> getAllOptions= options.iterator();
		 while(getAllOptions.hasNext()) {
			 getAllOptions.next().click();
			 Thread.sleep(1000);
		 }
		 
		System.out.println(days.isMultiple());
		
		driver.quit();

	}

}
