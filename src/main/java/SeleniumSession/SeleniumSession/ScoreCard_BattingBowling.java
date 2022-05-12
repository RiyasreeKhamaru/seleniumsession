package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard_BattingBowling {
	static WebDriver  driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-1st-odi-1277082/full-scorecard");
		nameOfplayer("Quinton de Kock");
		scoreOfplayer("Temba Bavuma");
		driver.close();
	}
    
	
	
	public static String nameOfplayer(String value)
	{
		WebElement name =driver.findElement(By.xpath("//span[text()='"+value+"']/ancestor::td/following-sibling::td/child::span//span"));
		System.out.println(name.getText());
		return name.getText();
	}
	public static void scoreOfplayer(String value)
	{
		String xpath = "//div/span[text()='South Africa INNINGS']/ancestor::div[contains(@class,' ds-mb-4')]//th[text()='BATTING']/ancestor::table/tbody/tr//span[text()='"+value+"']/ancestor::td/following-sibling::td";
		//span[text()='South Africa INNINGS']/following::tr/*[text()='BATTING']/following::tr//span[text()='Quinton de Kock']/following::td[3]	
		List<WebElement> scores =
				driver.findElements(By.xpath(xpath));
				
		for(int i = 1; i<scores.size(); i++)
		{
			String num = scores.get(i).getText();
			System.out.println(num);
		}
		
	}
}
