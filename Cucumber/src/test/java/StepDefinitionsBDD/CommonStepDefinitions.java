package StepDefinitionsBDD;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import FrameworkFunctions.FrameworkFunction;
import StepDefinitionLibrary.FacebookFunctionality;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CommonStepDefinitions {

	FacebookFunctionality facebookFunctionality;
	//WebDriver driver=getDriver();
	@Given("^Open (.*) and start application.$")
	public void Open_browser_and_start_application(String BrowserName)throws Throwable
	{
		FrameworkFunction.openApp(BrowserName);
		//driver.navigate().to("http://facebook.com");	
	    //log.info("Webpage opened");
	}
	
	@And("^I close the browser$")
	public void I_close_the_browser()throws Throwable
	{
		FrameworkFunction.fn_closeBrowser();
	}
	
	//@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login(String username2,String password2)throws Throwable
	{  	//PageObjectsElement element=new PageObjectsElement(driver);	
		System.out.println("User name and password entered");
		facebookFunctionality.loginTest(username2, password2);
	    //log.info("User name and Password entered");
		
	}

	@And("^I click on Login button$")
	public void I_click_on_login_button()throws Throwable
	{
		//PageObjectsElement element=new PageObjectsElement(driver);
		facebookFunctionality.clickLoginButon();
		//log.info("Login button clicked");
	}

	@Then("^user should be see the home page$")
	public void user_should_be_see_the_home_page()throws Throwable
	{
		//PageObjectsElement element=new PageObjectsElement(driver);
		facebookFunctionality.verifyHomePage();
		//log.info("Home page is displayed");
	}

}


