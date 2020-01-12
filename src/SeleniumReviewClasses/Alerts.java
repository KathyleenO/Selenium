package SeleniumReviewClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.classUtility.CommonMethods;

public class Alerts extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		SetUp("chrome", "https://www.toolsqa.com/automation-practice-switch-windows/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("timingAlert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
//		
//		driver.findElement(By.cssSelector("button#timingAlert")).click();
        acceptAlert();
	
		
		
		
	}

}
