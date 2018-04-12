package StepDefinitions;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import PageElement.PageObjectsElement;
import cucumber.api.java.en.When;

public class FacebookLogout extends AbstractPageStepDefinition {
	static Logger log=Logger.getLogger(FacebookLogout.class.getName());
	WebDriver driver=getDriver();	
	
	@When("^I click on logout button$")
	public void I_click_on_logout_button()throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		element.logout();
		log.info("clicked on logout button");
	}

}
