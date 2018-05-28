package StepDefinitions;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import PageElement.PageObjectsElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;


public class CreateNewAccount extends AbstractPageStepDefinition{
	
	WebDriver driver=getDriver();
	static Logger log=Logger.getLogger(CreateNewAccount.class.getName());
	@When("^I enter valid data on page$")
	public void I_enter_valid_data_on_page(DataTable table1)throws Throwable
	{
		PageObjectsElement ele=new PageObjectsElement(driver);
		ele.createAccount(table1);
		log.info("Account creation data have been entered");
	}
}
