package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class videoGalleryPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Video Gallery List']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Add']") private WebElement addBtn;

	public videoGalleryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public addVideoPage addBtn()
	{
		click(addBtn);
		return new addVideoPage();
	}

}
