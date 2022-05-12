package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	private static WebDriver driver;
	public static void main(String[] args) {
		/*
		 * WebDriverManager.chromedriver().setup();// this will check the browser
		 * compatibility and set up driver = new ChromeDriver();
		 */
		 
		 BrowserUtils br = new BrowserUtils();		 
		 WebDriver driver = br.launchbrowser("Chrome");
		 //ElementUtil el = new ElementUtil(driver);
		 br.EnterUrl("https://www.amazon.com");
		 
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 System.out.println(link.size());
			/*
			 * int c = 0; for (WebElement e : link) { if(!(e.getText().isEmpty())) {
			 * System.out.println(c + " : " +e.getText()); } String hrefLink =
			 * e.getAttribute("href"); System.out.println(hrefLink); c++; }
			 */
		 
		 for (int i=0; i< link.size() ; i++)
		 {
			 if (!(link.get(i).getText().isEmpty()))
			 {
				 System.out.println(i +" : " +link.get(i).getText());
			 }
		 }
		 
	}

}
