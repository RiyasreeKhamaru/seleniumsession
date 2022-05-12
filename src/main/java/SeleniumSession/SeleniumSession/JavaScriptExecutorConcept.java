package SeleniumSession.SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver; //casting
	  
	  js.executeScript("return document.title;");	  
	  System.out.println(js.executeScript("return document.title;").toString());
	  
	  String innerText = js.executeScript("return document.documentElement.innerText;").toString();
	  System.out.println(innerText);
	  
	  if(innerText.contains("India"))
	  {
		  System.out.println("Java Script has been passed");
	  }
	  else
	  {
		  System.out.println("not found");
	  }
	  By footer = By.cssSelector(".navFooterDescText");
	  
	  js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(footer));
	  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     wait.until(ExpectedConditions.presenceOfElementLocated(footer));
      js.executeScript("arguments[0].style.border='5px solid red'", driver.findElement(footer));
      driver.navigate().to("https://www.google.com");
      
      System.out.println( js.executeScript("return document.title;").toString());
      System.out.println(innerText);
      driver.navigate().to("https://connect.mheducation.com");
      //By password = By.cssSelector("#login-password");
      By password = By.xpath("//input[@id='login-password']");
      //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     // wait.until(ExpectedConditions.presenceOfElementLocated(password));
      //Thread.sleep(5000);
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
      wait.until(ExpectedConditions.presenceOfElementLocated(password));
      
      js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(password));
      js.executeScript("history.go(0);");
      
      
      
      
	}

}
