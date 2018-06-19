/*package StepDefinitionsBDD;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import FrameworkFunctions.FrameworkFunction;
import PageObjectModel.TastyKhanaPageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TastyKhanaPageStepDefinition extends FrameworkFunction {
	//WebDriver driver;
	static Logger log=Logger.getLogger(TastyKhanaPageStepDefinition.class.getName());
	
	@When("^I enter city and area$")
	public void I_enter_city_and_area(DataTable table) throws Throwable
	{
		TastyKhanaPageObject obj=new TastyKhanaPageObject(driver);
		obj.login(table);
		log.info("city and area selection is done");
	}
	@Then("^user should be see the \"([^\"]*)\" food panda page$")
	public void user_should_be_see_the_food_panda_page(String verifyhome)throws Throwable
	{
		TastyKhanaPageObject obj=new TastyKhanaPageObject(driver);
		obj.verifyHomePage(verifyhome);
	}
	@And("^I select restaurant as$")
	public void I_select_restaurant_as(DataTable restaurant)throws Throwable
	{
		TastyKhanaPageObject obj=new TastyKhanaPageObject(driver);
		obj.selectRestaurant(restaurant);
	}
	@When("^I select menu item$")
	public void I_select_menu_item(DataTable table)throws Throwable
	{
		TastyKhanaPageObject obj=new TastyKhanaPageObject(driver);
		obj.menuSelection(table);
		
	}

}
*/