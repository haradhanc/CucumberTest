package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

import PageElement.PageObjectsElement;
import cucumber.api.java.en.When;

public class ExcelReadStepDefinition extends AbstractPageStepDefinition {
	WebDriver driver=getDriver();
	static Logger log=Logger.getLogger(AbstractPageStepDefinition.class.getName());
	@When("^test data is passing$")
	public void test_data_is_passing() throws Throwable
	{
		PageObjectsElement element=new PageObjectsElement(driver);
		//element.excelReadFunctionality();
	}
	
	
	
}