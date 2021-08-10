package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class addVideoPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Add Video']") private WebElement pageTitle;

	public addVideoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}

}
