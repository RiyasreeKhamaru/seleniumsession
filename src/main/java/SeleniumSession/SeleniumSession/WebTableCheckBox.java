package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {
	static WebDriver  driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//Top Casting 
	/*
	 * WebDriver is an Interface, ChromeDriver is a class
	 * 
	 */
		driver = new ChromeDriver();
      driver.get("https://selectorshub.com/xpath-practice-page/");
      checkBoxClick("Joe.Root");
      
      driver.close();
      
      
      
      
	}
	public static void checkBoxClick(String name) 
	{
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		WebElement first_check =driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input"));
		first_check.click();
		
	}
	
	public static void selectAllcheckBoxClick(String... name) 
	{
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		WebElement first_check =driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input"));
		first_check.click();
		
	}
	
}
