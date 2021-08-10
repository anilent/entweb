package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AddSectionEventsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Section Event Add']") private WebElement pageTitle;
	@FindBy (xpath="//*[@name='school_section_id']") private WebElement seleClassSection;
	@FindBy (xpath="//*[@name='event_name']") private WebElement everntName;
	@FindBy (xpath="//*[@name='start_date']") private WebElement startDate;
	@FindBy (xpath="//*[@name='end_date']") private WebElement endDate;
	@FindBy (xpath="//*[@id='add_section']") private WebElement addBtn;
	

	public AddSectionEventsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement seleClassSection()
	{
		return seleClassSection;
	}
	public WebElement everntName()
	{
		return everntName;
	}
	public WebElement startDate()
	{
		return startDate;
	}
	public WebElement endDate()
	{
		return endDate;
	}
	public WebElement addBtn()
	{
		return addBtn;
	}

}
