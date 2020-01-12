package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.classUtility.CommonMethods;

public class DragNDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", "https://jqueryui.com/droppable/");
		
	//FIRST SWITCH TO FRAME 1 THE DRAG
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	//FIND ELEMENT TO DRAG AND STORE 
	WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
	//FIND ELEMENT TO DROP IT IN AND STORE
	WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
	//CREATE THE ACTION CLASS
	Actions act=new Actions(driver);
	//EASY AND FAST WAY TO DROP AND DRAG  1 STEP 
	act.dragAndDrop(drag, drop).perform();
	
	//3 STEP TO DRAG AND DROP 
	act.clickAndHold(drag).perform();
	act.moveToElement(drop).perform();
	act.release(drop).perform();
	
	Thread.sleep(3000);
	driver.quit();
	}

}
