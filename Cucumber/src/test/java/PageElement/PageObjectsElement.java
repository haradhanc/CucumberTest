package PageElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.*;
import cucumber.api.DataTable;





public class PageObjectsElement {

	WebDriver driver ;
	//private WebElement username=driver.findElement(By.id("email"));
	//private WebElement password=driver.findElement(By.id("pass"));
	By username=By.id("email");
	By password=By.id("pass");
	By login=By.id("loginbutton");
	By homepage=By.partialLinkText("Home");
	
	//Create New Account 
	By firstname=By.name("firstname");
	By surname=By.name("lastname");
	By email=By.name("reg_email__");
	By newpassword=By.name("reg_passwd__");
	
	//Logout
	By accountsetting=By.id("userNavigationLabel");
	By logout=By.linkText("Log Out");
	//friend request
	By friendrequest=By.partialLinkText("Friend Requests");
	By friendname=By.linkText("Rajesh Kumar Das");
	By deletefrnd=By.xpath("//");
	
	public PageObjectsElement(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void login(String username1,String password1)
	{   driver.findElement(username).clear();
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
	}
	@Test
	public void clickLoginButon() {
		driver.findElement(login).click();
	}
	@Test
	public void verifyHomePage() 
	{   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals("Home", driver.findElement(homepage).getText());
		
	}
	@Test
	public void createAccount(DataTable table)
	{
		List<List<String>> data=table.raw();
		System.out.println(data.get(1).get(1));
		driver.findElement(firstname).sendKeys(data.get(1).get(1));
		driver.findElement(surname).sendKeys(data.get(2).get(1));
		driver.findElement(email).sendKeys(data.get(3).get(1));
		driver.findElement(newpassword).sendKeys(data.get(4).get(1));
	}
	@Test
	public void logout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(accountsetting)).click().build().perform();
//		List<WebElement> allaccsettings=driver.findElements(logout);
//		
//		for(WebElement allacc:allaccsettings)
//		{
//		if(allacc.getTagName().equalsIgnoreCase(settingoptions))
//		{
//			allacc.click();
//		}
		driver.findElement(logout).click();
		
		}
	@Test
	public void friendRequest()
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(friendrequest)).click().build().perform();
	}
	@Test
	public void deleteFriendRequest() {
	
		if(driver.findElement(friendname).isDisplayed())
		{
			//driver.findElement(by)
		}
	
		
		
		
	}
		
	}


		
			

