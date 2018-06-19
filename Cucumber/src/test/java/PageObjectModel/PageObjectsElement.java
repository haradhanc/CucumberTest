package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import FrameworkFunctions.FrameworkFunction;

public class PageObjectsElement {

	WebDriver driver ;
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement loginButton;
	
	@FindBy(partialLinkText="Home")
	private WebElement homepage;
	
	public WebElement getLoginButton() {return loginButton;}	
	public WebElement getPassword() {return password;}
	public WebElement getUserName() {return username;}
	public WebElement getHomePage() {return homepage;}
	
	
	
	/*By username=By.id("email");
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
	*/
	/*public PageObjectsElement(WebDriver driver) 
	{
		this.driver=driver;
	}
*/
			}
			
		
		
		
		
		
		
		
			    
			
			
			
			
		
		
	
	


		
			

