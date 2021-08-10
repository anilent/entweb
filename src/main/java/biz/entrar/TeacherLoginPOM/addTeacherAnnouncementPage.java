package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class addTeacherAnnouncementPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']/h5") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='f_assignment_tag']") private WebElement annoncmentTag;
	@FindBy (xpath="//*[@id='f_assignment']") private WebElement annoncment;
	@FindBy (xpath="//*[@id='f_start_date']") private WebElement startDate;
	@FindBy (xpath="//*[@id='f_end_date']") private WebElement endDate;
	@FindBy (xpath="//*[@name='attachment']") private WebElement attachemnt;
	@FindBy (xpath="//*[@name='add']") private WebElement addBtn;

	public addTeacherAnnouncementPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement annoncmentTag()
	{
		return annoncmentTag;
	}
	public WebElement annoncment()
	{
		return annoncment;
	}
	public WebElement startDate()
	{
		return startDate;
	}
	public WebElement endDate()
	{
		return endDate;
	}
	public WebElement attachemnt()
	{
		return attachemnt;
	}
	public WebElement addBtn()
	{
		return addBtn;
	}
	
	public WebElement techerCheckBox(String techerID)
	{
		return driver.findElement(By.xpath("//*[@value='"+techerID+"']"));
	}

}
