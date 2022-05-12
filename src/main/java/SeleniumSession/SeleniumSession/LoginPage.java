package SeleniumSession.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();
		
		WebDriver driver = br.launchbrowser("Chrome");
		
		br.EnterUrl("https://demo.opencart.com/index.php?route=account/login");
		String pageTitle = br.getPageTitle();
		System.out.println(pageTitle);
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		By registerLink = By.linkText("Register");
		By registerLink_partiall = By.partialLinkText("Forgot");
		By tagName_text = By.tagName("h1");
		String emailId1 ="input-email";
		String loginBtn1 = "//input[@type='submit']";
		
		ElementUtil el = new ElementUtil(driver);
		el.doSendKeys(emailId, "rims20193@gmail.com");
		el.doSendKeys(password, "1234567");
		el.doClick(loginBtn);
		el.doClick(registerLink);
		System.out.println(el.doGetText(registerLink));
		el.doClick(registerLink_partiall);
		String text = el.doGetText(tagName_text);
		System.out.println(text);
		
		el.doSendKeys("id", emailId1, "riyasree.khamaru@gmail.com")	;
		String value = el.doGetAttribute(emailId, "value");
		System.out.println(value);
		
		if(el.doIsDisplayed(emailId))
		{
			el.doClick("xpath", loginBtn1);
			
		}
		else
		{
		br.closeBrowser();
		}
	}

}
