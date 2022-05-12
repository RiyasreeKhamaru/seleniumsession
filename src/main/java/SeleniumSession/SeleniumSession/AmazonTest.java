package SeleniumSession.SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BrowserUtils browser = new BrowserUtils();
		  browser.launchbrowser("Firefox");
		  browser.EnterUrl("Https://www.amazon.com");
		  String p_title = browser.getPageTitle();
		  System.out.println(p_title);
		  if(p_title.contains("Amazon"))
		  {
			  System.out.println("Correct URL");
		  }
		  String url = browser.getPageUrl();
		  System.out.println(url);
		  
		  browser.quitBrowser();
	}

}
