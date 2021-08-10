package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StdWiseAttendanceCoutRprt extends BaseTest{
	
	@FindBy (xpath="//*[.='Student Attendance Count Report']") private WebElement pageTitle;
	

	public StdWiseAttendanceCoutRprt() {
		PageFactory.initElements(driver, this);		
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
}
