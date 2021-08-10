package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class newMarkAttendancePage extends BaseTest{
	
	@FindBy (xpath="//*[.='Mark Attendance']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='f_school_section_id']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='date']") private WebElement seleDate;
	@FindBy (xpath="//*[@id='submit_attendnace']") private WebElement markAttendBtn;
	@FindBy (xpath="//*[@name='attendance_type']") private WebElement seleAttends;
//	@FindBy (xpath="//*[@name='attendance_type']/../../../..//td[contains(.,'ENT/0030')]") private WebElement stdNam;
//	@FindBy (xpath="//*[@name='attendance_type']/../../../..//td[contains(.,'ENT/0030')]/..//*[@id='attendance_type']")	private WebElement stdAttendance;
	
	

	public newMarkAttendancePage() {
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
	public WebElement seleDate()
	{
		return seleDate;
	}
	public WebElement markAttendBtn()
	{
		return markAttendBtn;
	}
	
	public WebElement stdNam(String stdId)
	{
		return driver.findElement(By.xpath("//*[@name='attendance_type']/../../../..//td[contains(.,'"+stdId+"')]"));
			
	}
	
	public WebElement stdAttandce(String stdId)
	{
		return driver.findElement(By.xpath("//*[@name='attendance_type']/../../../..//td[contains(.,'"+stdId+"')]/..//*[@id='attendance_type']"));
	}

}
