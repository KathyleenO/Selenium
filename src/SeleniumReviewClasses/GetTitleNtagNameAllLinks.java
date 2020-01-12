package SeleniumReviewClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleNtagNameAllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");

		String title=driver.getTitle();
		System.out.println(title);
       if(title.equals("Demo Form for practicing Selenium Automatio")) {
    	   System.out.println("you are in right location");
       }else {
    	   System.out.println("wrong location");
       }
       
       driver.findElement(By.name("firstname")).sendKeys("Firstname");
     List<WebElement>links=driver.findElements(By.tagName("a"));
 
     for(WebElement link: links) {
    	 System.out.println(link.getText());
     }
		driver.quit();
		
	}

}
