package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		By titleBar = By.xpath("/html/body/h2");
		
		
		//driver.switchTo().frame(2);
		driver.switchTo().frame("main");
		String titleName = driver.findElement(titleBar).getText();
		System.out.println(titleName);
		
		driver.switchTo().defaultContent();
		
		
		By title = By.xpath("/html/body/h1");
		driver.switchTo().frame("content");
		
		String emp = driver.findElement(title).getText();
		System.out.println(emp);
		driver.close();

	}

}
