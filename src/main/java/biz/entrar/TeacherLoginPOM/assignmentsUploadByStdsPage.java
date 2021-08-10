package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class assignmentsUploadByStdsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Assignment Upload']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='f_school_section_id']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='f_start_date']") private WebElement startDate;
	@FindBy (xpath="//*[@id='f_end_date']") private WebElement endDate;
	@FindBy (xpath="//*[@id='update_ass']") private WebElement searchBtn;
	@FindBy (xpath="//*[@class='alert alert-danger background-danger']") private WebElement noDataMsg;
	

	public assignmentsUploadByStdsPage() {
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
	public WebElement seleSection()
	{
		return seleSection;
	}
	public WebElement startDate()
	{
		return startDate;
	}
	public WebElement endDate()
	{
		return endDate;
	}
	public WebElement searchBtn()
	{
		return searchBtn;
	}
	public WebElement noDataMsg()
	{
		return noDataMsg;
	}
}
