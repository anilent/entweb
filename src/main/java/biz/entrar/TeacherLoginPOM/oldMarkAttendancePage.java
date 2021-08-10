package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class oldMarkAttendancePage extends BaseTest{
	
	@FindBy (xpath="//*[.='Select Section to Mark Attendance']") private WebElement pageTitle;
	
	public oldMarkAttendancePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
}
