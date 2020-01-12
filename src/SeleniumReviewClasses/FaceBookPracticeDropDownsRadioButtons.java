package SeleniumReviewClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookPracticeDropDownsRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");

		//DROP DOWNS
		WebElement month=driver.findElement(By.cssSelector("select#month"));
		Select select=new Select(month);
		select.selectByVisibleText("Aug");
		
		WebElement dayS=driver.findElement(By.cssSelector("select#day"));
		Select day=new Select(dayS);
		day.selectByIndex(5);
		
		WebElement year=driver.findElement(By.cssSelector("select#year"));
		Select yearS=new Select(year);
		yearS.selectByValue("1996");
		
		//Go through each radio button until find value 2= MAle
		List<WebElement>sex=driver.findElements(By.cssSelector("input[name='sex']"));
	      Thread.sleep(2000);
		for(WebElement fe:sex) {
			String tex=fe.getAttribute("value");
			if(tex.equals("2")) {
		        fe.click();
			}	
		}
		
		Thread.sleep(3000);
		//RADIO BUTTON select FEMALE
		driver.findElement(By.cssSelector("input[value='1']")).click();
		
		
		}
	
	}


