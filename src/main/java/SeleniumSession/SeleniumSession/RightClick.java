package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.contextClick(rightClick).build().perform();
		
		
		List<WebElement> ls = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]"));
		for(WebElement e : ls)
		{
			String st = e.getText();
			if(st.equals("Edit"))
			{
				e.click();
				System.out.println("click on :" + st);
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				
			}
		}
		driver.close();
		
		
	}
	

}
