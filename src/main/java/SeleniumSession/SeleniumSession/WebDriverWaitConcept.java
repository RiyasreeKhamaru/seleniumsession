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

public class WebDriverWaitConcept {
	private static final Duration Durations = null;
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		ElementUtil el = new ElementUtil(driver);
		driver.get("https://connect.mheducation.com");
		 By email = By.cssSelector("#login-email");
	       By password = By.cssSelector("input[name*= 'password']");
		
	  	/*
		 * implicitly wait - global wait, only for web elements, dynamic wait
		 * 
		 */
	  	/*
		 * //ImplicitlyWait //
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * 
		 * 
		 * el.doSendKeys(email, "riya.ins@mheqa.com");
		 * System.out.println("Name entered"); //
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * el.doSendKeys(password, "Qa@123456"); System.out.println("password entered");
		 * 
		 */     
		/*
		 * el.doSendKeys(password, "Qa@123456"); System.out.println("password entered");
		 * 
		 * driver.close();
		 */    /* 
       
        //explicitly wait
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       /**
        *An expectation for checking that an element is present on the DOM of a page. 
        *This does not necessarily mean that the element is visible.
        * Present in DOM
        */
      //WebElement email_type =wait.until(ExpectedConditions.presenceOfElementLocated(email));
   /*    el.waitForElementPresent(email,10).sendKeys("riya.ins@mheqa.com");
      el.doSendKeys(password, "Qa@123456");
      /**
       * An expectation for checking that an element is present on the DOM of a page and visible.
       * Visibility means that the element is not only displayed but also has a height and width that is greater than 0
       * visibility with height and width
       */
    /*  wait.until(ExpectedConditions.visibilityOfElementLocated(email));
       */
	
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      //wait.until(ExpectedConditions.) 
      
          
    
	   
	   
      
	
	}

	
	
	
}
