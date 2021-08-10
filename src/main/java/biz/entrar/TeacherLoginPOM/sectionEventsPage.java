package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sectionEventsPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Section Events']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Add New']/*") private WebElement addNewBtn;
	@FindBy (xpath="//*[@type='search']") private WebElement serachTxt;
	

	public sectionEventsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public AddSectionEventsPage addNewBtn()
	{
		click(addNewBtn);
		return new AddSectionEventsPage();
	}
	public WebElement serachTxt()
	{
		return serachTxt;
	}

}
