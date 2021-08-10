package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AnnouncementsPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Announcements']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='from_date']") private WebElement fromDate;
	@FindBy (xpath="//*[@id='to_date']") private WebElement toDate;
	@FindBy (xpath="//*[@name='search']") private WebElement searchBtn;
	@FindBy (xpath="//*[.='Add New']/*") private WebElement addBtn;

	public AnnouncementsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public addAnnouncementsPage addBtn()
	{
		click(addBtn);
		return new addAnnouncementsPage();
	}

}
