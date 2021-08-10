package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class addAnnouncementsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Add Announcement']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@name='f_transport_announcement_tag']") private WebElement announcemtTag;
	@FindBy (xpath="//*[@id='f_assignment']") private WebElement assignmen;
	@FindBy (xpath="//*[@id='f_start_date']") private WebElement startDate;
	@FindBy (xpath="//*[@id='f_end_date']") private WebElement endDate;
	@FindBy (xpath="//*[@id='attachment']") private WebElement attachement;
	@FindBy (xpath="//*[@id='radio_2']") private WebElement seleCheckBox;
	//@FindBy (xpath="")

	public addAnnouncementsPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement seleYear()
	{
		return seleYear;
	}
	public WebElement announcemtTag()
	{
		return announcemtTag;
	}
	public WebElement assignmen()
	{
		return assignmen;
	}
	public WebElement startDate()
	{
		return startDate;
	}
	public WebElement endDate()
	{
		return endDate;
	}
	public WebElement attachement()
	{
		return attachement;
	}
	public WebElement seleCheckBox()
	{
		return seleCheckBox;
	}
}
