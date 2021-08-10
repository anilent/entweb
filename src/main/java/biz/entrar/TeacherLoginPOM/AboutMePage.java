package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AboutMePage extends BaseTest{

	@FindBy (xpath="//*[.='User Profile']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Personal Info']") private WebElement personalInfo;
	@FindBy (xpath="//*[@id='mytab']//*[.='Official Info']") private WebElement officeInfo;
	@FindBy (xpath="//*[@id='mytab']//*[.='Documents']") private WebElement documtsInfo;
	@FindBy (xpath="//*[@id='mytab']//*[.='Work Experience']") private WebElement workExrinfo;
	
	
	public AboutMePage() {
		
		PageFactory.initElements(driver, this);		
	}
	public  WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement personalInfo()
	{
		return personalInfo;
	}
	public WebElement officeInfo()
	{
		return officeInfo;
	}
	public WebElement documtsInfo()
	{
		return documtsInfo;
	}
	public WebElement workExrinfo()
	{
		return workExrinfo;
	}
}
