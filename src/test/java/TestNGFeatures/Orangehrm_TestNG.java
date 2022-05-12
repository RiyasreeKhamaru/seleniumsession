package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Orangehrm_TestNG extends BaseTest{

	
	
	
	@Test(priority = 1)
	public void pageLaunchVerification()
	{		
		Assert.assertTrue(driver.getCurrentUrl().contains("demo"));
	}
	
	
	@Test(priority = 2)
	public void headerTextDisplayed()
	{
		Assert.assertEquals((driver.findElement(By.cssSelector(".form-content>h3"))).getText(), "Manage Your People and Operations in One Place");
	    
	}
	
}
