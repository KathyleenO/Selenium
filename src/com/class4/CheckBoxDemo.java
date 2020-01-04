package com.class4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;




public class CheckBoxDemo extends CommonMethods  {

	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.SetUp("chrome", HRMS_URL);
		driver.manage().window().fullscreen();
driver.findElement(By.linkText("Input Forms")).click();
		
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		WebElement ageCheckBox=driver.findElement(By.id("isAgeSelected"));
		//checking if checkboxes selected
		if(!ageCheckBox.isSelected()) {
			ageCheckBox.click();
		}
		Thread.sleep(1000);
		ageCheckBox.click();
		
		System.out.println("**********Group of Check Boxes********");
		
		//storing group of check boxes
		List<WebElement> groupCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if(!groupCheckBox.isEmpty()) { //checking if group checkbox is empty or not
			
			Iterator<WebElement> it=groupCheckBox.iterator(); //adding list to iterator
			while(it.hasNext()) {
				it.next().click();
				Thread.sleep(1000);
			}
			
		}else {
			System.err.println("List is empty, check your xpath");
		}
		
		
	}

}