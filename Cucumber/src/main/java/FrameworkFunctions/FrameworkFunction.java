package FrameworkFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.PageObjectsElement;


public class FrameworkFunction {
	protected static WebDriver driver;
	//protected static Logger log=Logger.getLogger(FrameworkFunction.class.getName());
	//Application Open Function
	public static WebDriver openApp(String browsername) throws IOException
	{
		fn_LaunchBrowser(browsername);
		fn_OpenURL();
		return driver;
	}
	//URL open function
	public static void fn_OpenURL() throws IOException
	{
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"\\ObjectRepository.properties");
		obj.load(objfile);
		String url= obj.getProperty("ApplicationUrl");
		driver.get(url);
		driver.manage().window().maximize();
//		if(driver.findElement(By.partialLinkText("Home")).isDisplayed())
//		{
//			PageObjectsElement ele=new PageObjectsElement(driver);
//			ele.logout();
//			
//		}
//		 
		
	}
	//Browser launch function
	public static WebDriver fn_LaunchBrowser(String browsername)
	{
		switch(browsername)
		{
		case "InternetExplorer":
		{
			DesiredCapabilities capability=DesiredCapabilities.internetExplorer();
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP,true);
			System.setProperty("webdriver.ie.driver","E:\\Project\\Cucumber\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		}
		case "Chrome":
		{
			System.setProperty("webdriver.chrome.driver","E:\\Project\\Cucumber\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		}
		case "Firefox":
		{
			driver=new FirefoxDriver();
			break;
		}
		default: 
			System.setProperty("webdriver.chrome.driver","E:\\Project\\Cucumber\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		return driver;
		
		}
		/*if(browsername=="CH")
		{
			System.setProperty("webdriver.chrome.driver","E:\\Project\\Cucumber\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browsername=="IE")
		{
			DesiredCapabilities capability=DesiredCapabilities.internetExplorer();
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP,true);
			System.setProperty("webdriver.ie.driver","E:\\Project\\Cucumber\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			
		}
		else if(browsername=="FF")
		{
			driver=new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}*/
	//select by visible text function
	public static void fn_SelectByVisibleText(WebElement we,String VisibleText)
	{
		Select selObj=new Select(we);
		selObj.selectByVisibleText(VisibleText);
	}
	//select by index function
	public static void fn_SelectByIndex(WebElement we,int IndexValue )
	{
		Select selObj=new Select(we);
		selObj.selectByIndex(IndexValue);
	}
	//select by value function
	public static void fn_SelectByValue(WebElement we,String Value )
	{
		Select selObj=new Select(we);
		selObj.selectByValue(Value);
	}
	//mouse hover function
	public static void fn_mouseHover(WebElement we)
	{
		Actions actObj=new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}
	public static void fn_closeBrowser() 
	{
		driver.close();
	}
	public static void fn_switchToWindow(String windowname)
	{
		driver.switchTo().window(windowname);
	}
	
	public static void fn_switchToFrame(String framename)
	{
		driver.switchTo().frame(framename);
	}
	public static void fn_wait(WebElement locator,int timeout) 
	{
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(locator));
				
	}
 	
	
	
}
