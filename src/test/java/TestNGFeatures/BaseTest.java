package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Configuration;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
   WebDriver driver;
   
    
	@Parameters({"browser" , "url" , "timeout"})
	@BeforeTest

	public void launchBrowser(String browser, String URL, String timeout)
	{
       switch (browser) 
       {
       case "Chrome" :
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
    	   break;
    	   
       case "Firefox" :
    	    WebDriverManager.firefoxdriver().setup();
    	    driver = new FirefoxDriver();
    	    break;
       }
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	int timeout_int = Integer.parseInt(timeout);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout_int));
	driver.get(URL);
	}
	

	@AfterTest
	public void closeBrowser() {
		 driver.quit();
		
	}
}
