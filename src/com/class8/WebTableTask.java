package com.class8;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

public class WebTableTask extends CommonMethods {

	/*Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 5 rows and 4 columns
Print name of all column headers 
Print data of all rows
Quit Browser
	 * 
	 */
	
	public static void main(String[] args) {
		
	
	SetUp("chrome", Constants.SYNTAX_PRACTICE_URL);
	//navigate to the table we need
	driver.findElement(By.linkText("Table")).click();
	driver.findElement(By.linkText("Table Data Search")).click();
	
	//Find how many rows of data table has
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
	System.out.println("Number of rows in the table is ="+rows.size());
	
	for(WebElement print:rows) {
		String allrows=print.getText();
		System.out.println(allrows);
	}
	
	//Number of Columns
			List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
			System.out.println("Number of cols in the table is ="+cols.size());
			
		Iterator<WebElement> printcolums=cols.iterator();	
			while(printcolums.hasNext()) {
				String printallC=printcolums.next().getText();
				System.out.println(printallC);
			}
		

			System.out.println("Printing data cell by cell using advamced for loop------------------------------------");
			/*
			 * xpath("//table[@class='table']/tbody/tr/td" 1. //table[@class='table'] -
			 * table element 2. /tbody - from table going inside tbody 3. tr/ from tbody
			 * going into rows (not specific row) 4. /td - going into table data --> cell
			 */
			List<WebElement> cells = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
			for (WebElement cell : cells) {
				String cellData = cell.getText();
				System.out.println(cellData);
			}

			System.out.println("Printing data cell by cell using for loop------------------------------------");
			for (int i = 1; i <= rows.size(); i++) {// controlling rows
				for (int y = 1; y <= cols.size(); y++) {// controlling cols
					String cellText = driver
							.findElement(By.xpath("//table[@class='table']/tbody/tr[" + i + "]/td[" + y + "]")).getText();
					System.out.println(cellText);
				}
			}

			driver.quit();	
	
	
}
}