package com.class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;

public class PracticeAACalendar extends CommonMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", "https://www.aa.com/homePage.do");
		driver.findElement(By.cssSelector("input#aa-leavingOn")).click();
		
		
		
		WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String depart=m.getText();
		if(depart.equals("May")) {
			List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for (WebElement cell:cells){
				if (cell.getText().equals("14")){
					Thread.sleep(1000);
				cell.click();
				System.out.println("14 clicked");
				break;
				}
			}
			}else{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
	
	driver.findElement(By.id("aa-returningFrom")).click();
	for(int i=0;i<12;i++) {
		//WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String deart=m.getText();
		if(depart.equals("November")) {
			List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for (WebElement cell:cells){
				if (cell.getText().equals("8")){
					Thread.sleep(1000);
				cell.click();
				System.out.println("8 clicked");
				Thread.sleep(1000);
				break;
				}
			}break;
			}else{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
	}
	}
}
