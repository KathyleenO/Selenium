package SeleniumReviewClasses;

import org.openqa.selenium.By;

import com.classUtility.CommonMethods;

public class Frames extends CommonMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
	
			SetUp("chrome", "https://amazon.com");
			Thread.sleep(3000);
			switchToFrame(driver.findElement(By.xpath("//div[@id='ape_Gateway_right-2_desktop_placement']/iframe")));
			/*
			 * xpath to locate frame
			 * div[@id='ape_Gateway_right-2_desktop_placement']/iframe
			 */
			driver.findElement(By.className("clickthrough")).click();
		}}