package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		/*
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("rims20193@gmail.com");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("12345");
		*/
		
		By email_id = By.id("input-email");
		By password1 = By.id("input-password");
	/*	getElement(email_id).sendKeys("rims20193@gmail.com");
		getElement(password1).sendKeys("12345");
		
      */ 
		ElementUtil el = new ElementUtil(driver);
		
		el.doSendKeys(email_id,"rims20193@gmail.com");
		el.doSendKeys(password1,"12345678");
	}
	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); } public static void doSendKeys(By locator,
	 * String value) { getElement(locator).sendKeys(value); }
	 */
	    
}
