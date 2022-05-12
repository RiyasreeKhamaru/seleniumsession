package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com"); // get the URL
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.ultimatix.net");// get the URL
		System.out.println(driver.getTitle());
		
		
		/**
		 * driver.get() and driver.navigate().to(); - both are the synonym 
		 * there is no difference
		 * navigate().to() - internally calls get method.
		 * 
		 * difference - driver.navigate().to() is overloaded method
		 *  where driver.get() is not.
		 */
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
	}

}
