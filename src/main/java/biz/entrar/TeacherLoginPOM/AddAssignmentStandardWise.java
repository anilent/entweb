package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AddAssignmentStandardWise extends BaseTest{
	
	@FindBy (xpath="//*[.='Assignment Add Standard Wise']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='f_teacher_id']") private WebElement seleTeacher;
	@FindBy (xpath="//*[@id='f_school_subject_id']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='f_assignment_tag']") private WebElement assigmentTag;
	@FindBy (xpath="//*[@id='f_assignment']") private WebElement assigment;
	@FindBy (xpath="//*[@id='f_start_date']") private WebElement statDate;
	@FindBy (xpath="//*[@id='f_end_date']") private WebElement ednDate;
	@FindBy (xpath="//*[@id='ans_sheet']") private WebElement ansSheetUplod;
	@FindBy (xpath="//*[@id='upload_date']") private WebElement uploadDate;
	@FindBy (xpath="//*[@id='attachment']") private WebElement attachemtFile;
	@FindBy (xpath="//*[@id='save_newsletter']") private WebElement AddnewBtn;
	@FindBy (xpath="//*[normalize-space(.)='II']/..//*[normalize-space(.)='ENTRAR']//*[@name='school_section_id[]']") 
	private WebElement seleEntrar;

	public AddAssignmentStandardWise() {
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
	public WebElement seleTeacher()
	{
		return seleTeacher;
	}
	public WebElement seleSubject()
	{
		return seleSubject;
	}
	public WebElement assigmentTag()
	{
		return assigmentTag;
	}
	public WebElement assigment()
	{
		return assigment;
	}
	public WebElement statDate()
	{
		return statDate;
	}
	public WebElement ednDate()
	{
		return ednDate;
	}
	public WebElement ansSheetUplod()
	{
		return ansSheetUplod;
	}
	public WebElement uploadDate()
	{
		return uploadDate;
	}
	public WebElement attachemtFile()
	{
		return attachemtFile;
	}
	public WebElement AddnewBtn()
	{
		return AddnewBtn;
	}
	public WebElement seleEntrarSection()
	{
		return seleEntrar;
	}
}
