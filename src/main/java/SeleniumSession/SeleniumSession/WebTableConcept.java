package SeleniumSession.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableConcept {
   static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        By rows = By.xpath("//table[@id='customers']//tr");
        By cols = By.xpath("//table[@id='customers']//tr/th");
         
        RowCount(rows);
        printAllrows(rows);
        
        ColCount(cols);       
        printAllcols(cols);
        System.out.println(getCompanyName("Helen Bennett"));
        
        
        
      
			
			
        
        
        
        driver.close();
	}
	
	
	public static int RowCount(By rows)
	{
		List<WebElement> row = driver.findElements(rows);
		int rowCount = row.size();
		System.out.println(rowCount);
		return rowCount;
	}
	public static int ColCount(By cols)
	{
		
		List<WebElement> col = driver.findElements(cols);
		int colCount = col.size();
		System.out.print(colCount);
		return colCount;
	}
	
	public static void printAllrows(By rows)
	{
		List<WebElement> row = driver.findElements(rows);
		for(WebElement e : row)
		{
			System.out.println(e.getText());
		}
		
	}
	public static void printAllcols(By cols)
	{
		
		List<WebElement> col = driver.findElements(cols);
		for(WebElement e : col)
		{
			System.out.println(e.getText());
		}
	}
	
	public static String getCompanyName(String value)
	{
		
		WebElement company = driver.findElement(By.xpath("//td[text()='"+value+"']/preceding-sibling::td"));
		
			 return company.getText();
		
	}
	

}

