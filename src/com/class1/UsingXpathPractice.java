package com.class1;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

public class UsingXpathPractice extends CommonMethods {

	public static void main(String[] args) {
		
		
		SetUp("chrome", Constants.HRMS_URL);
		//COMMON FORMAT = "//tagname[@attribute='value']"
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Syntax");
		
		//STARTS WITH = //tagname[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//input[starts-with(@name,'txtP')]")).sendKeys("Syntax123!");
		//CONTAINS = //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'Log')]")).click();
        //TEXT    "//tagname[text()='value']"
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
	}

}
