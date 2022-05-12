package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgConceptIndiaMap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mapsvg.com/maps/india");
		Thread.sleep(4000);
		String svg_xpath = "//*[local-name()='svg' and @id='svg2']/*[name()='path']";
		List<WebElement> allName =driver.findElements(By.xpath(svg_xpath));
		Actions act = new Actions(driver);
		for(WebElement e : allName)
		{
			String name = e.getAttribute("title");
			act.moveToElement(e).perform();
			//System.out.println(name);
			Thread.sleep(1000);
			if(name.equals("Delhi"))
			{
				act.click().perform();
				break;
			}
		}

	}

}
