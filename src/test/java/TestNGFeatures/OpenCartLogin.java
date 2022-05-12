package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLogin extends BaseTest{

	
	By username = By.cssSelector("#input-username");
	By password = By.cssSelector("input[name=password]");
	By dashboard = By.tagName("h1");
	By submit = By.xpath("//button[@type='submit']");
    
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	@DataProvider
	public Object[][] loginData()
	{
		return new Object[][] {
			{"demo","1234"},
				/*
				 * {"demo1","12345"}, {"demo2","demo2"}, {"demo3","admin"}
				 */
		};
	}
	
	
	@Test(dataProvider = "loginData", priority = 1)
	public void loginOpenCart(String user, String pass)
	{
		doSendKeys(username,user);
		doSendKeys(password,pass);
		driver.findElement(submit).click();
	}
	
	@Test(priority = 2, enabled = false)
	public void alertDismiss()
	{
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "Check password");
		alert.dismiss();
		
	}
	@Test(priority = 3)
	public void verifyLoginPage()
	{
		Assert.assertTrue(driver.findElement(dashboard).getText().equals("Dashboard"));
	
	}
	
	
}

