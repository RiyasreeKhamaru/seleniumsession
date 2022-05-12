package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragNdDrop {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();	
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement source_el = driver.findElement(By.id("draggable"));
    WebElement target_el = driver.findElement(By.id("droppable"));
    
    Actions act = new Actions(driver);
    act
       .clickAndHold(source_el)
         .moveToElement(target_el)
          .release()
           .build()
             .perform();
    
    
    act.dragAndDrop(source_el, target_el).perform();
    
    
    
    
	}

}
