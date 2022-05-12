package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
  public static void main(String[] args) {
    
	 //Top-Casting
	 //WebDriver is a interface.
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Riyasree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver(); 
		  // Child class object referred by parent interface reference variable 
		  driver.get("https://www.google.com");
		  String t= driver.getTitle(); System.out.println(t); if(t.equals("Google")) {
		  System.out.println("Passed"); } else { System.out.println("Failed"); }
		 
	 
	  driver.getCurrentUrl();
	  driver.getPageSource();
	  driver.quit();
  }
}
