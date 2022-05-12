package SeleniumSession.SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	private WebDriver driver;
	/**
	 * this is the method 	is used to initialized the driver on the basis of browsername
	 * @param browser
	 * @return
	 */
	public WebDriver launchbrowser(String browser)
	{
		/*
		 * if(browser.equals("Chrome")) {
		 * //System.getProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Riyasree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
		 * if (browser.equals("Firefox")) {
		 * //System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Riyasree\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe")
		 * ; WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 * 
		 * 
		 * } else { System.out.println("Please pass the right browser"); }
		 */
		System.out.println("Browser name is : "+ browser);
		switch (browser)
		{
		case "Chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			/* Chrome driver is actually implementing the webDriver
			 or associate with the driver via remote webDriver */
			/*ChromeDRiver default constructor will be called where launch browser method 
			already present.*/
			break;
	
		case "Firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		    break;
		
		}
				
		return driver;
	}

	
	public void EnterUrl(String url)
	
	{
		System.out.println("URL is : " + url);
		if(url.contains("https")|| url.contains("http"))
		{
		driver.get(url);
		}
		else 
		{
			System.out.println("Incorrect URL");
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
