package com.class6;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class TestAlertCommonMethods extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		//driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		
		String alert=getAlertText();
		System.out.println(alert);
		acceptAlert();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
