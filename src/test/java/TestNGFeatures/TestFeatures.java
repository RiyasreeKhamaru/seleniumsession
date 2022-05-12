package TestNGFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFeatures {

	@BeforeSuite
	public void createUser()
	{
		System.out.println("BeforeSuite - create user");
	}
	@BeforeTest
	public void connectDB()
	{
		System.out.println("BeforeTest - Connect Database");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BeforeClass - Launch Browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("BeforeMethod - Login");
	}
	@Test
	public void verifyPage()
	{
		System.out.println("Test - VerifyPage");
	}
	@Test
	public void searchData()
	{
		System.out.println("Test - search data");
	}
	@Test
	public void priceData()
	{
		System.out.println("Test - price data");
	}
	
	@AfterMethod
	public void logoutPage()
	{
		System.out.println("AfterMethod - logoutPage");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AfterClass- Close Browser");
	}
	
	@AfterTest
	public void disconnectDB()
	{
		System.out.println("AfterTest - Disconnect DB");
	}
	
	@AfterSuite
	public void deleteUSer()
	{
		System.out.println("AfterSuite - Delete User");
	}

}
