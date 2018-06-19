/*package StepDefinitionsBDD;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import PageObjectModel.PageObjectsElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class FriendRequest extends AbstractPageStepDefinition {
	static Logger log=Logger.getLogger(FriendRequest.class.getName());
	WebDriver driver=getDriver();	

	@When("^I click on friend request button$")
	public void I_click_on_friend_request_button() throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		element.friendRequest();
	}
	@And("^I delete friend request$")
	public void I_delete_friend_request() throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		
	}

}
*/