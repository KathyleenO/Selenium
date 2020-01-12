package SeleniumReviewClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoopFindElementS {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	List<WebElement>sex=driver.findElements(By.xpath("//input[@name='sex']"));
	for(WebElement print:sex) {
		if(print.isEnabled()) {
			print.click();
			Thread.sleep(2000);
		}
	}
	
	driver.close();
	
	
}
}
