package SeleniumSession.SeleniumSession;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
   private WebDriver driver;
	
   public ElementUtil(WebDriver driver) // Constructor is used to initialize the driver
   {
	   this.driver = driver;
   }
   
   
	 public WebElement getElement(By locator)
     {
 	   return driver.findElement(locator);
     }
    public void doSendKeys(By locator, String value)
    {
    	getElement(locator).sendKeys(value);
    }
    @overloading
    public void doSendKeys(String locatorType,String locatorValue, String value)
    {
    	getElement(getBy(locatorType, locatorValue)).sendKeys(value);
    }
	
    public void doClick(By locator)   
    {
    	getElement(locator).click();
    }
   
    public void doClick(String locatorType, String locatorValue)   
    {
    	getElement(getBy(locatorType,locatorValue)).click();
    }
    public String doGetText(By locator)   
    {
    	return getElement(locator).getText();
    }
    
    public String doGetAttribute(By locator, String att_name)
    {
    	return getElement(locator).getAttribute(att_name);
    }
    
    public boolean doIsDisplayed(By locator)
    {
    	return getElement(locator).isDisplayed();
    }
    
    public By getBy(String locatorType, String locatorValue) {
    	
    	By locator = null;
    	switch (locatorType.toLowerCase()) {
		case "id":
		locator = By.id(locatorValue);	
	    break;

		case "name":
			locator = By.name(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "CssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "classname":		
		    locator = By.className(locatorValue);
		    break;
		case "Linktext":  
			locator = By.linkText(locatorValue);
			break;
		case "PartiallyLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagName":
			locator = By.tagName(locatorValue);
		default:
			break;
		}
		return locator;
    }
    
    public List<WebElement> doGetElements(By locator)
    {
    	return driver.findElements(locator);
    }
    
    public int getElementCount(By locator)
    {
    	return doGetElements(locator).size();
    }
    
    
    /*
     * this method will return the list of element's text
     * 
     */
    public List<String> printElementsTextList(By locator)
    {
    	List<String> textList = new ArrayList<String>(); // this is the empty list
    	for(WebElement e :doGetElements(locator) )
    	{
    		//System.out.println(e.getText());
    		textList.add(e.getText());
    	}
    	return textList;
    }
    public void printElements(By locator)
    {
    	for(WebElement e :doGetElements(locator) )
    	{
    		System.out.println(e.getText());
    	}
    }
    
    
    public void printImgAttribute(By locator, String att_name)
    {
    	for (WebElement e : doGetElements(locator))
    	{
    		System.out.println(e.getAttribute(att_name));
    	}
    }
    
    public List<String> printImgAttributeList(By locator, String att_name)
    {
    	List<String> att_list = new ArrayList<>();
    	for (WebElement e : doGetElements(locator))
    	{
    		 att_list.add(e.getAttribute(att_name));
    		
    	}
    	return att_list;
    }
    
    public void ClickOnLink(By locator, String getTextValue)
    {
    	List<WebElement> linkList = doGetElements(locator);
    	System.out.println(linkList.size());
    	for(WebElement e : linkList)
    	{
    		//System.out.println(e.getText());
    		if(e.getText().contains(getTextValue))
    		{
    			e.click();
    			break;
    		}
    	}
    }
    
     
    public  void doSelectByIndex(By locator, int index)
	{    	   
		   Select select = new Select(getElement(locator));
		   select.selectByIndex(index);		
		   
		     
    }
    public  void doSelectByValue(By locator, String value)
   	{    	   
   		   Select select = new Select(getElement(locator));
   		   select.selectByValue(value);		   
   		     
    }
    public  void doSelectByVisibleText(By locator, String visibleText)
   	{    	   
   		   Select select = new Select(getElement(locator));
   		   select.selectByVisibleText(visibleText);		   
   		     
    }
    
    public List<String> getDropDownOptionList(By locator)
    {
    	Select select = new Select(getElement(locator));
    	List<String> optionsTextLink = new ArrayList<String>();
    	List<WebElement> StringOption = select.getOptions();
    	for (WebElement e : StringOption)
    	{
    		optionsTextLink.add(e.getText());
    		
    	}
    	 return optionsTextLink;
    }
    

    public void selectValuefromDropdownOption(By locator, String dropdownValue)
    {
    	Select select = new Select(getElement(locator));
    	List<WebElement> options = select.getOptions();
    	for (WebElement e : options)
    	{
    		if(e.getText().equals(dropdownValue))
    		{
    			e.click();
    		    break;	
    		}
        }
    }
    
    public WebElement waitForElementPresent(By locator, int timeout)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    	return wait.until(ExpectedConditions.presenceOfElementLocated((locator)));
    }
    
    
}
