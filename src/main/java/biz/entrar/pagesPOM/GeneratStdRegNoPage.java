package biz.entrar.pagesPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class GeneratStdRegNoPage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@id='add_reg_process']")
	private WebElement generateRegNo;
	
	/*@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='login100-form-btn']")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']")
	private WebElement captchCheckBox;*/
	
	
	//initializing the page object
	public GeneratStdRegNoPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public void generateRegNo()
	{
		click(generateRegNo);
	}
	
	/*public void password(String passw)
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
	}*/
	
}
