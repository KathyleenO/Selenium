package SeleniumReviewClasses;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.classUtility.CommonMethods;

public class WequasREview1FindElements extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		SetUp("chrome", "https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> print = driver.findElements(By.cssSelector("input[name='exp']"));

		for (WebElement ele : print) {
			if (ele.isEnabled()) {
				ele.click();
				Thread.sleep(2000);
			}

			driver.close();
		}

		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='exp']"));

		Iterator<WebElement> printr = list.iterator();
		while (printr.hasNext()) {
			printr.next().click();
			Thread.sleep(2000);
		}

		driver.close();

	}

}
