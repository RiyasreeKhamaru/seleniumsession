package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        BrowserUtils br = new BrowserUtils();
        
        WebDriver driver = br.launchbrowser("Chrome");
        //br.EnterUrl("https://www.google.com");
        br.EnterUrl("https://connect.mheducation.com");
        ElementUtil el = new ElementUtil(driver);
		
        By nameId = By.xpath("//div[@id='SIvCob']/a");
        By footerLink = By.xpath("//div[@id='footerTextInfo']//a");
        By emailId = By.id("login-email");
		By password = By.id("login-password");
		By loginBtn = By.xpath("//button[@id='login-submit-btn']");
			
      /*
		 * List<WebElement> languageList = driver.findElements(nameId);
		 * System.out.println(languageList.size()); for(WebElement e :languageList ) {
		 * System.out.println(e.getText()); if(e.getText().contains("বাংলা")) {
		 * e.click(); break; } }
		 */
		Thread.sleep(5000);
		el.doSendKeys(emailId, "riya.ins@mheqa.com");
		el.doSendKeys(password, "Qa@123456");
		el.doClick(loginBtn);
		Thread.sleep(5000);
        el.ClickOnLink(footerLink, "Contact Us");
	}

}
