package StepDefinitionsBDD;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import FrameworkFunctions.FrameworkFunction;


import cucumber.api.Scenario;

public class AbstractPageStepDefinition {
	protected static WebDriver driver;
	static Logger log=Logger.getLogger(AbstractPageStepDefinition.class.getName());
	
    protected WebDriver getDriver()
    {
    	
	if(driver==null)
	{
		System.setProperty("webdriver.ie.driver","E:\\Project\\Cucumber\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		log.info("Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	else if(driver==null)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Project\\Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Browser opened");
	}
	else if (driver==null)
	{
		driver=new FirefoxDriver();
		log.info("Browser opened");
	}
return driver;
}
	
	public void closeBrowser(Scenario scenario)
	{
		System.out.println("enter the world");
		if (scenario.isFailed())
		{
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"E:\\Project\\Cucumber\\Screenshot\\screenshot.png");
			scenario.write("Scenario is failed");
		}
		else
		{
			scenario.write("Scenario is passed");
		}
		driver.quit();
		
	}
	
}
