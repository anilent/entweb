package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class viewAttendancePage extends BaseTest{
	
	@FindBy (xpath="//*[.='View Attendance ']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='section_id']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='year']") private WebElement seleyear2;
	@FindBy (xpath="//*[@id='Month']") private WebElement seleMonth;

	public viewAttendancePage() {
		PageFactory.initElements(driver,this);
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
	public WebElement seleyear2()
	{
		return seleyear2;
	}
	public WebElement seleMonth()
	{
		return seleMonth;
	}
	public WebElement stdId(String stdId)
	{
		return driver.findElement(By.xpath("//*[.='"+stdId+"']"));
	}
	public WebElement stdAttdnStatus(String date)
	{
		Integer datee=Integer.valueOf(date);
        datee=datee+6;
		return driver.findElement(By.xpath("//*[@class='rounded']/../th["+datee+"]/../../..//*[.='ENT/0030']/..//td["+datee+"]"));
	}
	
}
