package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestion {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		By searchBox = By.id("search_query_top");
		By printedDress = By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed ')]");
		
		Thread.sleep(5000);
		driver.findElement(searchBox).sendKeys("Dress");
		Thread.sleep(10000);
		selectSuggestion("Casual Dresses > Printed");
		
		
		
	}
	public static void selectSuggestion(String value)
	{
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+value+"')]")).click();
	}
	
}
