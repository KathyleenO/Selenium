package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;

public class FileUpload extends CommonMethods {
/* navigate to website
 * then upload a fike
 * 
 */
	public static void main(String[] args) {
		SetUp("chrome", "https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("/Users/kathyochoa/Desktop/hola.docx");
		driver.findElement(By.cssSelector("input#file-submit")).click();
		
		WebElement upload=driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(upload.isDisplayed()) {
			System.out.println("file succesfully uploaded");
		}else {
			System.out.println("file not uploaded");
		}
		
		driver.quit();
	}

}
