package SeleniumSession.SeleniumSession;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownPractice {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager is abstract class.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By mul_sel = By.id("justAnInputBox");
		By choice = By.xpath("//span[@class='comboTreeItemTitle']");
		
		driver.findElement(mul_sel).click();
		//String store = "choice 6";
		
		
		
		
		JqueryDropDownPractice jq = new JqueryDropDownPractice();
		//jq.singleChoice(choice,store);
		
		//jq.allValueSelection(choice, "choice 1", "choice 5", "choice 6 2 1");
		//jq.allValueSelection(choice, "ALL");
		//jq.allValueSelection(choice,"choice 1");
		jq.allValueSelection(choice, "choice 5","choice 9");
		driver.quit();
			}
    
	



	/*
	 * public void singleChoice(By choice ,String store) { List<WebElement>
	 * choiceList = driver.findElements(choice);
	 * 
	 * for(WebElement e : choiceList) {
	 * 
	 * if(store.contains(e.getText())) { e.click(); System.out.println("Click on : "
	 * + e.getText()); break; } } }
	 *   
     */
	
	
	public void allValueSelection(By choice, String... value) throws InterruptedException
	{
		boolean flag = false;
		List<WebElement> listofChoice = driver.findElements(choice);
		System.out.println(listofChoice.size());
		
		if(!value[0].equalsIgnoreCase("all"))
		{
		 for (WebElement e : listofChoice)
		 {   
			String store = e.getText();
			//System.out.println(store);
			for(int i=0; i< value.length ; i++)
			{
				if(store.equals(value[i]))
				{
					flag = true;
					e.click();					
					System.out.println("click on : "+ store);
					break;
				}
				else {
					flag = false;
				}
			}						
		 }
		}
		else
		{ 
			try
			{
			
			for(WebElement e :listofChoice )
			{
				flag = true;
				e.click(); 				
				System.out.println("click on : "+e.getText());
		    } 
				
			}
			catch(Exception e)
			{
				System.out.println("You have selected all the choices");
				
			}
			
		
		}
		if(flag == false)
		{
			System.out.println("You are try to select value wrong ");
		}
					
	}
	
	
	public void mulValueSelection(By choice, String... value) throws InterruptedException
	{
		
		List<WebElement> listofChoice = driver.findElements(choice);
		System.out.println(listofChoice.size());
		for (WebElement e : listofChoice)
		{   
			String store = e.getText();
			System.out.println(store);
			for(int i =0; i< value.length ; i++)
			{
				if(store.equals(value[i]))
				{
					Thread.sleep(1000);
					e.click();
					
					System.out.println("click on : "+ store);
					break;
				}
			}						
		}				
	}
	

}