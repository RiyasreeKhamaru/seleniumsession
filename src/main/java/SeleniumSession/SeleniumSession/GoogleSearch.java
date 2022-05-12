package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br = new BrowserUtils();
		WebDriver driver =br.launchbrowser("Chrome");
		
		br.EnterUrl("https://www.google.com");
		ElementUtil el = new ElementUtil(driver);
		
		By sugg_xpath = By.xpath("//ul[@role='listbox']//div[contains(@class,'wM6W7d')]//span"); 
		By searchBox = By.name("q");
        el.doSendKeys(searchBox, "naveen automation labs");
        Thread.sleep(5000);
		System.out.println(el.getElementCount(sugg_xpath));
		/*
		 * List<WebElement> sugg_list = el.doGetElements(sugg_xpath);
		 * System.out.println(el.doGetElements(sugg_xpath).size()); for(WebElement e :
		 * sugg_list) { System.out.println(e.getText()); }
		 */
       
        //el.printElements(sugg_xpath);
		
        el.ClickOnLink(sugg_xpath, "naveen automationlabs resume");
	}

}
