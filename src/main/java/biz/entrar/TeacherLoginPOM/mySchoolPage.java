package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class mySchoolPage extends BaseTest{
	
	@FindBy (xpath="//*[.='School Information']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='School Name']/..") private WebElement scholNam;
	
	

	public mySchoolPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement scholNam()
	{
		return scholNam;
	}

}
