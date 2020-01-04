package com.class4;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class RadioButtonTask extends CommonMethods {

	/*TC 2: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct checkbox is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser

	 * 
	 */
	public static void main(String[] args) {
	
		CommonMethods.SetUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
	}

}
