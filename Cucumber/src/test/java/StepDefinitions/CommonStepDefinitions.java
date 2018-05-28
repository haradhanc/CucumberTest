package StepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import FrameworkFunctions.FrameworkFunction;
import PageElement.PageObjectsElement;
import PageElement.TastyKhanaPageObject;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CommonStepDefinitions extends FrameworkFunction {

	
	//WebDriver driver=getDriver();
	@Given("^Open browser and start application.$")
	public void Open_browser_and_start_application()throws Throwable
	{
		FrameworkFunction.openApp("CH");
		//driver.navigate().to("http://facebook.com");	
	    log.info("Webpage opened");
	}
	
	@And("^I close the browser$")
	public void I_close_the_browser()throws Throwable
	{
		FrameworkFunction.fn_closeBrowser();
	}
	
	@When("^I enter username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login(String username2,String password2)throws Throwable
	{  	PageObjectsElement element=new PageObjectsElement(driver);
	    element.login(username2, password2);	
	    log.info("User name and Password entered");
		
	}

	@And("^I click on Login button$")
	public void I_click_on_login_button()throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		element.clickLoginButon();
		log.info("Login button clicked");
	}

	@Then("^user should be see the home page$")
	public void user_should_be_see_the_home_page()throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		element.verifyHomePage();
		log.info("Home page is displayed");
	}

@After()
public void tearDown(Scenario scenario)
{
	scenario.write("Finished Scenario");
	if(scenario.isFailed())
	{
		scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
		System.out.println("Test Environment Destroyed");
		System.out.println("--------------------------------");
		driver.close();
		driver.quit();
	}
	}
}


