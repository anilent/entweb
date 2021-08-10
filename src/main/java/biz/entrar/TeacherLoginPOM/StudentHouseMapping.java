package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StudentHouseMapping extends BaseTest{
	
	@FindBy (xpath="//*[.='Student House Allocation']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandatrd;
	@FindBy (xpath="//*[@id='Save']") private WebElement addBtn;

	public StudentHouseMapping() {
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
	
	public WebElement seleStandatrd()
	{
		return seleStandatrd;
	}

	public WebElement studentupdate(String stdNam)
	{
		return driver.findElement(By.xpath("//*[.='"+stdNam+"']/..//*[@id='house_id']"));
	}
	public WebElement addBtn()
	{
		return addBtn;
	}
}
