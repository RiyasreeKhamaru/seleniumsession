package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
  static WebDriver driver; // WebDriver will always be static , so that we can use it without creating an object
  public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//id
		/*
		 * WebElement email = driver.findElement(By.id("input-email")); //By is class //
		 * name, id is a static method name thats why calling using By class name
		 * email.sendKeys("rims20193@gmail.com");
		 * 
		 */    
		//By locator:
		//does not hit the server
		/*
		 * By emailId = By.id("input-email"); By Password = By.id("input-password");
		 */
		/*
		 * //hit the server 
		 * 
		 * WebElement email = driver.findElement(emailId); 
		 * WebElement pword = driver.findElement(Password);
		 */
		
		/*
		 * email.sendKeys("rims20193@gmail.com"); pword.sendKeys("123456");
		 */
		By emailId = By.id("input-email");
		By Password = By.id("input-password");
		doSendKeys(emailId,"rims20193@gmail.com");
		doSendKeys(Password, "12345");
		
		
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
    public static void doSendKeys(By locator,String Value)
    {
    	getElement(locator).sendKeys(Value);
    }
}
