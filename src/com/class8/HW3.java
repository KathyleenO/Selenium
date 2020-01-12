package com.class8;
/*TC 1: Leave List Search Validation


Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Select Leave List
Select from December 1, 2019 until January 31, 2020
Check only Pending approval
Click on Search
Validate “No Records Found” is displayed
Quit the browser

 * 
 */
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;




public class HW3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		//navigate to the leave
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		//click on the input to bring calendar view
		driver.findElement(By.id("calFromDate")).click();
		Thread.sleep(2000);
		
		//SELECTING MONTH "DECEMBER
		WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dec=new Select(months);
		dec.selectByValue("11");
		
		//SELECTING YEAR "2019
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select nineteen=new Select(year);
		nineteen.selectByValue("2019");
		
		List <WebElement>wholeCalendar=driver.findElements(By.cssSelector("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		//SELECTING DAY "1"
		for(WebElement all:wholeCalendar) {
			String text=all.getText();
			if(text.equals("1")) {
				all.click();
				break;
			}
		}
		


		Thread.sleep(3000);
		//click on the input to bring calendar view TO
		driver.findElement(By.id("calToDate")).click();
		
		//SELECTING "JANUARY
		WebElement toMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select slctToMonth = new Select(toMonth);
		slctToMonth.selectByVisibleText("Jan");
		
		//SELECTING YEAR 2020
		WebElement toYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select slctToYear = new Select(toYear);
		slctToYear.selectByVisibleText("2020");
		
		//SELECTING DATE 31 BY looping all data
		List<WebElement> toDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement toCell : toDate) {
			String toDay = toCell.getText();
			if (toDay.equals("31")) {
				toCell.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("btnSearch")).click();
		boolean nameVerify = driver.findElement(By.xpath("//td[text()='No Records Found']")).isDisplayed();
		if (nameVerify) {
			System.out.println("No Records Found is Displayed");
		} else {
			System.out.println("Failed");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}
