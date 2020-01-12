import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.classUtility.CommonMethods;
import com.classUtility.Constants;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) {

		String userName = "Admin";
		String password = "Hum@nhrm123";

		SetUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		String welcomeText = driver.findElement(By.id("welcome")).getText();

		if (welcomeText.contains(userName)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			//call the method gwtScreenshotsAs() and specify output type
			File screen = ts.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(screen, new File("screenshots/HRMS/WrongLogin.jpg"));
			
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// How to take screen shot using selenium?
		// We can use TakesScreenshot interFace
		// step 1. downcast webdriver to the type of TakesSceenShot

		TakesScreenshot ts = (TakesScreenshot) driver;
		//call the method gwtScreenshotsAs() and specify output type
		File screen = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.jpg"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();

		// from homework take scrrenShots as a proof that "No record message is
		// displayed"
	}

}
