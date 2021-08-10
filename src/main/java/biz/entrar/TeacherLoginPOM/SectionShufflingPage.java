package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class SectionShufflingPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Section Shuffling']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleAcademicYear;
	@FindBy (xpath="//*[@id='from_standards']") private WebElement seleClass;
	@FindBy (xpath="//*[@id='from_sections']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='selected_to_right']") private WebElement moveRight;
	@FindBy (xpath="//*[@id='to_sections']") private WebElement seleToSection;
	@FindBy (xpath="//*[@id='save_changes']") private WebElement ConformBtn;
	

	public SectionShufflingPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement seleAcademicYear()
	{
		return seleAcademicYear;
	}
	public WebElement seleClass()
	{
		return seleClass;
	}
	public WebElement seleSection()
	{
		return seleSection;
	}
	public WebElement seleStudent(String stdNam)
	{
		return driver.findElement(By.xpath("//*[.='"+stdNam+"']"));
	}
	public WebElement moveRight()
	{
		return moveRight;
	}
	public WebElement seleToSection()
	{
		return seleToSection;
	}
	public WebElement ConformBtn()
	{
		return ConformBtn;
	}
}
