package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.classUtility.CommonMethods;

public class HWUploadNScreenShot extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
SetUp("chrome","http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload" );
	Thread.sleep(3000);
driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys("/Users/kathyochoa/Desktop/hola.docx");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='button']")).click();
		
Thread.sleep(4000);
Alert alert= driver.switchTo().alert();
String text=alert.getText();
System.out.println(text);
alert.accept();

TakesScreenshot shot=(TakesScreenshot)driver;
File screen=shot.getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(screen, new File("screenshots/HRMS/UploadScreenShot.jpg"));
} catch (IOException e) {
	e.printStackTrace();
}
	
}
	}


