package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class TeacherNoticBoardPage extends BaseTest{

	@FindBy (xpath="//*[@class='breadcrumb-header']/h5") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Add']") private WebElement addBtn;
	
	
	public TeacherNoticBoardPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public addTeacherAnnouncementPage addBtn() {
		click(addBtn);
		return new addTeacherAnnouncementPage();
	}
}
