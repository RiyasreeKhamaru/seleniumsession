package SeleniumSession.SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		driver.get("https://connect.mheducation.com");
		By email = By.cssSelector("#login-email");
	       By password = By.cssSelector("input[name*= '']");
		// WebDriverWait WebWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         
	         
	    /**
	   	 * Fluent Wait
	   	 * 
	   	 */
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(2))
		 * .ignoring(NoSuchElementException.class)
		 * .ignoring(StaleElementReferenceException.class); //
		 * .withMessage("Not found");
		 * 
		 * 
		 */    //wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("riya.ins@mheqa.com");
	       presenceOfElementFluentWait(email,20,2).sendKeys("riya.ins@mheqa.com");
		   //sdriver.findElement(email).sendKeys("riya.ins@mheqa.com");   
	       System.out.println("Name entered");
	      driver.findElement(password).sendKeys("Qa@123456");		  
	       System.out.println("password entered");
	       
	       driver.close();

	}
	
	public static WebElement presenceOfElementFluentWait(By locator, int timeOut, int pollingTime)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				             .withTimeout(Duration.ofSeconds(timeOut))  
				             .pollingEvery(Duration.ofSeconds(pollingTime))
				             .ignoring(NoSuchElementException.class)
				             .ignoring(StaleElementReferenceException.class)
				             .withMessage("Element not found within the given time");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
