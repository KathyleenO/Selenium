package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

/*
 * TC 1: Delete Employee

Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Add Employee

Verify Employee has been added
Go to Employee List
Delete added Employee
Quit the browser

 */
public class DeleteEmployee extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", Constants.HRMS_URL);
//log in
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.linkText("PIM")).click();

//adding employee
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Jake");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input#employeeId")).clear();
		driver.findElement(By.cssSelector("input#employeeId")).sendKeys("056");
		String empId = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.cssSelector("input#btnSave")).click();

		/*
		 * Verify Employee has been added Go to Employee List Delete added Employee Quit
		 * the browser
		 * 
		 */

		String empDetails=driver.findElement(By.id("personal_txtEmployeeId")).getText();
		if(empDetails.equals("Jake Smith")) {
			System.out.println("employee Succesfulluy added");
		}else
			System.out.println("they did not");
		
		
		
		// navigate to the employee list
		driver.findElement(By.linkText("Employee List")).click();
		// define the flag variable
		boolean found = false;
		while (!found) {
			// Get all rows from from the employee list
			List<WebElement> rows_f = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (int i = 1; i <= rows_f.size(); i++) {
				// get text from each row
				String rowsText = rows_f.get(i - 1).getText();
				// verify if row contains employee id
				if (rowsText.contains(empId)) {
					// change the flag variable
					found = true;
					// deleting an employee
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("btnDelete")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("dialogDeleteBtn")).click();
					break;
				}
			}
			// if emp id was not found in the first page --> click next
			driver.findElement(By.xpath("//a[text()='Next']")).click();
		}
		driver.quit();
	
		
		
		
		
		
		
		
	}
	
}
