package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();// checking the compatibility of browser version and setup
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
