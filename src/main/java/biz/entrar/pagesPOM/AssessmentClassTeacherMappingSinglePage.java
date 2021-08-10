package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentClassTeacherMappingSinglePage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Class Teacher Mapping']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='year_tag']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='teacher_id']") private WebElement seleTeacher;
	@FindBy (xpath="//*[.='VII / A']/..//*[@type]") private WebElement seleCheckboxscroll;
	@FindBy (xpath="//*[.='IX / A']/..//*[@type]") private WebElement seleCheckbox;
	@FindBy (xpath="//*[.='IX / B']/..//*[@type]") private WebElement selecheckboxB;
	@FindBy (xpath="//*[.='IX / C']/..//*[@type]") private WebElement selecheckboxC;
	@FindBy (xpath="//*[@id='save_changes']") private WebElement addBtn;
	

	public AssessmentClassTeacherMappingSinglePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public AssessmentClassTeacherMappingSinglePage seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
		return this;
	}
	public AssessmentClassTeacherMappingSinglePage seleTeacher(String text)
	{
		selectdropdownValue(seleTeacher, text);
		return this;
	}
	public WebElement seleCheckbox()
	{
		return seleCheckbox;
	}
	public WebElement addBtn()
	{
		return addBtn;
	}
	public WebElement seleCheckboxscroll()
	{return seleCheckboxscroll;}
}
