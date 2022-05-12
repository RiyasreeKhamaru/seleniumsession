package SeleniumSession.SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRootConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	      driver.get("https://selectorshub.com/xpath-practice-page/");
	      Thread.sleep(5000);
	      //document.querySelector("#snacktime").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza")	      
	      driver.switchTo().frame("pact");
	      JavascriptExecutor js =(JavascriptExecutor)driver;
	      WebElement lunchTime = (WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	      lunchTime.sendKeys("Chicken");	
	
	}

}
