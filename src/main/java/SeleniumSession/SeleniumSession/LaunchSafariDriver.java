package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafariDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.safari.driver", "C:\\Users\\Riyasree\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new SafariDriver();
        driver.get("https://www.amazon.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
		
		 String pageSource = driver.getPageSource(); System.out.println(pageSource);
		 /* if(pageSource.contains("var ue_pti")) { System.out.println("Passed");
		 * 
		 * } else { System.out.println("Failed"); }
		 */
        driver.quit();
	}

}
