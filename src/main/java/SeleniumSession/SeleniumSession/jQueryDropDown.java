package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jQueryDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		 driver = br.launchbrowser("Chrome");
		ElementUtil el = new ElementUtil(driver);
		br.EnterUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By select_mulSec = By.id("justAnInputBox");
		By selectChoice = By.xpath("//span[@class='comboTreeItemTitle']");
	    Thread.sleep(5000);
	    el.doClick(select_mulSec);
		
		//el.printElements(selectChoice);
	     //, null))
		
		/*
		 * List<WebElement> choice = driver.findElements(selectChoice);
		 *  for (WebElement
		 * e : choice) { if(e.getText().contains("choice 2 3")) { e.click();
		 * System.out.println("Click on : "+ e.getText()); break; } }
		 */
		
		/*
		 * 
		 * this is for single selection
		 */
		//el.ClickOnLink(selectChoice, "choice 2 1");
		/*
		 * for multiple selection
		 * 
		 */
		multipleselection(selectChoice, "choice 4", "choice 6 1", "choice 6 2 3");
		/*
		 * 
		 * All the selection
		 */
	}
	



			public static void multipleselection(By selectChoice, String... Value)
			{
				
				List<WebElement>  choice_Mul = driver.findElements(selectChoice);
				for(WebElement e : choice_Mul)
				{
					String store = e.getText();
					for(int i =0; i< Value.length; i++)
					{
						if(store.contains(Value[i]))
						{
							e.click();
							System.out.println("click on : "+ store);
							break;
						}
					}
				}
			}
}

	
