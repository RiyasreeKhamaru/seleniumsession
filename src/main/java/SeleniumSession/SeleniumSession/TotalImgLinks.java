package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImgLinks {
 static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();
		 driver = br.launchbrowser("Chrome");			
        br.EnterUrl("https://www.amazon.com");
        //List<WebElement> imgList = driver.findElements(By.tagName("img"));
        //int s = imgList.size();
        By imgTag = By.tagName("img");
        By testLink = By.tagName("a");
        By divTag = By.tagName("div");
        ElementUtil el = new ElementUtil(driver);
        System.out.println(el.getElementCount(imgTag));
        System.out.println(el.getElementCount(divTag));
       // el.printElements(testLink);
      
       // el.printImgAttribute(imgTag, "alt");
        
        if(el.printElementsTextList(testLink).contains("Today's Deals"))
        {
        	System.out.println("Today's Deals - present");
        }
        
        if(el.printImgAttributeList(imgTag, "alt").contains("Keyboards"))
        {
        	System.out.println("Keyboards - present");
        }
	}
   
}
