package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class ScheduleEntranceTestPage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@name='username']")
	private WebElement usernameu;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='login100-form-btn']")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']")
	private WebElement captchCheckBox;
	
	
	//initializing the page object
	public ScheduleEntranceTestPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public void username(String urnam)
	{
	
		sendKeys(usernameu,urnam);
	}
	
	public void password(String passw)
	{
		//password.clear();
		sendKeys(password,passw);
	}
	
	public DashboardPage loginButton()
	{
		click(loginButton);
		return new DashboardPage(driver);
	}
	
	public void captchCheckBox()
	{
		click(captchCheckBox);
	}
	
}
