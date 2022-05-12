package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// new session id
		driver.get("Https://www.flipkart.com");
		System.out.println(driver.getTitle());
		//driver.quit();//session id is null
		driver.close();// session id will be same but invalid
		driver = new ChromeDriver();
		System.out.println(driver.getTitle()); // session id is null , so to get the title we have initialize the browser again.
	}

}
