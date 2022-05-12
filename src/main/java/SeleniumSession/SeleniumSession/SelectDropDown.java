package SeleniumSession.SeleniumSession;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    
	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.launchbrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ElementUtil el = new ElementUtil(driver);
		br.EnterUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		
		By select_country = By.name("country");
		
		WebElement webEle_country = driver.findElement(select_country);
		//System.out.println(webEle_country.getSize());
		Select select= new Select(webEle_country);

		/*
		 * select class does not have default constructor so that we have to pass the WebElement parameter
		 * html tag should have Select 
		 * 
		 */

		/*
		 * selectByIndex
		 * selectByValue
		 * selectByVisibleText
		 * 
		 */
				
				
		
       
        select.selectByIndex(10); // 0 position - select a country so it will start from 1 to 10
        Thread.sleep(5000);
        select.selectByVisibleText("India");
        Thread.sleep(5000);
        select.selectByValue("147");
        Thread.sleep(5000);
        
        
        
        el.doSelectByIndex(select_country, 12);
        Thread.sleep(2000);
        el.doSelectByValue(select_country, "39");
        Thread.sleep(2000);
        el.doSelectByVisibleText(select_country, "India");
        Thread.sleep(5000);
        
        
        
        /*
         * select.getOPtions() -> which will return list of webElements
         * 
         * 
         */
       
       
        
        List<WebElement> optionCountry = select.getOptions();
        System.out.println(optionCountry.size()); // total number of country
        int c =0;
       
        for (WebElement e : optionCountry)
        {   
        	
        	System.out.println( c +" : "+ e.getText());
        	c++;
        }
         
       /* if(el.getDropDownOptionList(select_country).contains("India"))
        {
        	
        	
        	System.out.println("India is present");
        }
        else
        {
        	System.out.println("Not found");
        }
        
        */
		
		//el.selectValuefromDropdownOption(select_country, "Austria");
		
		
		/*
		 * using XPATH
		 * 
		 * 
		 */
		
		By xpath_country = By.xpath("//select[@id ='country']/option");		
		List<WebElement> xpath_List = driver.findElements(xpath_country);
		for (WebElement e : xpath_List)
		{
			if(e.getText().equals("India"))
			{
				e.click();
				break;
			}
		}
		
	}
}
      
