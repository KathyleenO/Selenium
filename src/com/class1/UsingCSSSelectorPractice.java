package com.class1;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

public class UsingCSSSelectorPractice extends CommonMethods {

	public static void main(String[] args) {
		
		SetUp("chrome","https://facebook.com" );
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcde@gmail.com");
		//CSS SELECTOR
//		driver.findElement(By.cssSelector("input[name='firstname'"));
//		driver.findElement(By.cssSelector("input[name='lastname']"));
		//REGULAR FORMAT  "tagname[attribute='value']"
		driver.findElement(By.cssSelector("input[name='lastname']"));
		driver.findElement(By.cssSelector("input[name='firstname']"));
		
		//               "input[name='value']"
		//ID  #############
		driver.findElement(By.cssSelector("input#pass"));
		driver.findElement(By.cssSelector("input#u_0_k"));
		driver.findElement(By.cssSelector("input#u_0_b"));
		//   tagname#id    or input#no
		//CLASS .
		driver.findElement(By.cssSelector("input.login"));
		driver.findElement(By.cssSelector("input.holabutton"));
		//       tagname.login
		
		//STARTS WITH 
		//   input[name^='log']"
		
		//ENDS WITH 
		
		//     "input[name$='']"
		
		//contains
		
		//input[@name*='']"
		
		
		//XPATH
		driver.findElement(By.xpath("//input[@name='firstname']"));
		driver.findElement(By.xpath("//input[@name='lastname']"));
		

		
		
	}

}
