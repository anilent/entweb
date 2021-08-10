package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class myprofilePage extends BaseTest{
	
	@FindBy (xpath="//*[.='User Profile Setting']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Profile Update']") private WebElement profileUpdte;
	@FindBy (xpath="//*[@id='update_profile']") private WebElement profiUpdatButton;
	@FindBy (xpath="//*[@id='mytab']//*[.='Change Password']") private WebElement cangPassword;
	@FindBy (xpath="//*[@id='submit_btn']") private WebElement cngPasswSubtBtton;
	@FindBy (xpath="//*[.='Transport Update']") private WebElement transportUpdate;
	@FindBy (xpath="//*[@id='update_transport']") private WebElement transportUpdateBtton;
	
	
	public myprofilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement profileUpdte()
	{
		return profileUpdte;
	}
	
	public WebElement profiUpdatButton()
	{
		return profiUpdatButton;
	}
	public WebElement cangPassword()
	{
		return cangPassword;
	}
	
	public WebElement cngPasswSubtBtton()
	{
		return cngPasswSubtBtton;
	}
	
	public WebElement transportUpdate()
	{
		return transportUpdate;
	}
	public WebElement transportUpdateBtton()
	{return transportUpdateBtton;}

	
}
