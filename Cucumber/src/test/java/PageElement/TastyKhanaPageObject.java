package PageElement;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.velocity.tools.generic.ResourceTool.Key;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FrameworkFunctions.FrameworkFunction;
import cucumber.api.DataTable;
import net.bytebuddy.implementation.bytecode.Throw;




public class TastyKhanaPageObject{
//475241
 WebDriver driver;
 By tastykhana_city=By.xpath("//input[@class='form-control twitter-typeahead tt-input']");
 By cityname=By.xpath("//div[@id='wrapper-element-1']/select[@id='cityId']");
 By tastykhana_area=By.id("area");
 By tastykhana_showrestaurant=By.id("button");
 By tastykhana_homepage=By.xpath("//span[@class='location-address-container']");
 By tastykhana_vendorname=By.xpath("//span[@class='vendor__name']");
 By tastykhana_menusel=By.xpath("//article/div/div/div/div[@class='menu-item__title']");
 By tastykhana_price=By.xpath("//div[@class='menu-item__variation__price']");
 
 public TastyKhanaPageObject(WebDriver driver) {
	this.driver=driver;
 }
  
 public void login(DataTable table1) 
 {
	 List<List<String>> data=table1.raw();
	 System.out.println(data.get(0).get(1));
	 System.out.println(data.get(1).get(1));
	 WebElement w=driver.findElement(tastykhana_city);
	 w.sendKeys(data.get(0).get(1));
	 w.sendKeys(Keys.ENTER);
	 
	WebElement a=driver.findElement(tastykhana_area);
	a.sendKeys(data.get(1).get(1));
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		System.out.println(e);
	}
	//fluent wait
	/*WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeSelected(tastykhana_area));
	wait.pollingEvery(10, TimeUnit.SECONDS);
*/	a.sendKeys(Keys.ENTER);
	driver.findElement(tastykhana_showrestaurant).click();
 }
public void verifyHomePage(String homepage)
{
	String a=driver.findElement(tastykhana_homepage).getText();
	System.out.println(a);
	Assert.assertTrue(driver.findElement(tastykhana_homepage).getText().contains(homepage));
	
}
public void selectRestaurant(DataTable table1)
{
	//Auto It code **********
	/*try {
		Runtime.getRuntime().exec("E:\\Project\\Cucumber\\FileUploadAutoIt.exe");
	} catch (IOException e1) {
	
	 System.out.println(e1);
	}*/
	List<List<String>> restaur=table1.raw();
	System.out.println(restaur.get(0).get(1));	
	List<WebElement> restlist=driver.findElements(tastykhana_vendorname);
	for(WebElement rest:restlist)
	{try {
		if(rest.getText().equals(restaur.get(0).get(1)))
				{			
			rest.click();
			
				}
	}catch(StaleElementReferenceException e)
	{
		driver.findElement(tastykhana_vendorname);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}}

}
public void menuSelection(DataTable table1)
{
	try {
	List<List<String>> menusel=table1.raw();
	System.out.println(menusel.get(0).get(1));
	System.out.println(menusel.get(0).get(2));
	List<WebElement> menu=driver.findElements(tastykhana_menusel);
	for(WebElement menuselect:menu)
	{
		if(menuselect.getText().equals(menusel.get(0).get(1)))
				{
			List<WebElement> pricesel=driver.findElements(tastykhana_price);
			for(WebElement price:pricesel)
			{
				if(price.getText().equals(menusel.get(0).get(2)))
						{
					price.click();
					System.out.println("function works");
						}
			}
				}
	}
}catch(StaleElementReferenceException e)
	{
	System.out.println(e);
	}
}}
