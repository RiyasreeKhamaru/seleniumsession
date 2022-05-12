package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//C:\Users\Riyasree\Documents\code1.txt
		/*
		 * html tag should be type = 'file'
		 * 
		 */
		
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Riyasree\\Documents\\code1.txt");

	}

}
