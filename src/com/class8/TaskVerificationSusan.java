package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;
/*Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table

 * 
Click on customer details
Update customers last name and credit card info
Verify updated customers name and credit card number is displayed in table
Close browser

 * 
 */
public class TaskVerificationSusan extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input.txt")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
		
		String expectedValue="Susan Maclaren";
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	
	for(int i=1; i<rows.size(); i++) {
		String rowText=rows.get(i-1).getText();
		//System.out.println(rowText);
		if(rowText.contains(expectedValue)) {
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[2]")).click();
		}
	}

	Thread.sleep(4000);
	
		driver.findElement(By.xpath("//input[contains(@onclick,'editOrder$4')]")).click();

		//UPDATE INFO		
		
	driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName\']")).clear();
	driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName\']")).sendKeys("Susan Lopez");
	driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")).clear();
	driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("67880090987");
	driver.findElement(By.cssSelector("a.btn_light")).click();
		
		
		
		
	}
}
