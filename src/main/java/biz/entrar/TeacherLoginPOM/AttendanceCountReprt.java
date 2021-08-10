package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AttendanceCountReprt extends BaseTest{
	
	@FindBy (xpath="//*[.='Student Attendance Count Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='from_date']") private WebElement fromDate;
	@FindBy (xpath="//*[@id='to_date']") private WebElement toDate;
	@FindBy (xpath="//*[@id='count_report_btn']") private WebElement searchBtn;
	@FindBy (xpath="//*[@type='search']") private WebElement searchText;

	public AttendanceCountReprt() {
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
	public WebElement seleStandard()
	{
		return seleStandard;
	}
	public WebElement fromDate()
	{
		return fromDate;
	}
	public WebElement toDate()
	{
		return toDate;
	}
	public WebElement searchBtn()
	{
		return searchBtn;
	}
	public WebElement searchText()
	{
		return searchText;
	}
}
