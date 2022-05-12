package SeleniumSession.SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement signIn = driver.findElement(By.xpath("//input[@value='Sign in']"));
	    signIn.click();
	    
	    Alert alertPopUp = driver.switchTo().alert();
	    String txt = alertPopUp.getText();
	    System.out.println(txt);
	    Thread.sleep(2000);
	    alertPopUp.accept();
	    driver.close();
	    

	}

}
