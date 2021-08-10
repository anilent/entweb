package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class wrongAttendanceDelete extends BaseTest{
	
	@FindBy (xpath="//*[.='Delete Attendance for Particular Date']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='from_date']") private WebElement seleDate;
	@FindBy (xpath="//*[@id='count_report_btn']") private WebElement deleteBtn;

	public wrongAttendanceDelete() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle() {
		return pageTitle;
	}
	public WebElement seleStandard()
	{
		return seleStandard;
	}
	public WebElement seleDate()
	{
		return seleDate;
	}
	public WebElement deleteBtn()
	{
		return deleteBtn;
	}
	
}
