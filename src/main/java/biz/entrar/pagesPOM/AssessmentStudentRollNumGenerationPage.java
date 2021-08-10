package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentStudentRollNumGenerationPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Student Roll No Generation']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='school_section_id']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='all_student']/..//*[@class='cr']") private WebElement autoRollNum;
	@FindBy (xpath="//*[@id='allocation_add']") private WebElement addBtn;
	@FindBy (xpath="//*[.='Anil  KN']/..//*[@name='roll_no[]']") private WebElement rollnumEtr;
	@FindBy (xpath="//*[.='Anil  KN']/..//td[1]") private WebElement rollnum;

	public AssessmentStudentRollNumGenerationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public AssessmentStudentRollNumGenerationPage seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
		return this;
	}
	public AssessmentStudentRollNumGenerationPage seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public WebElement rollnumEtr()
	{
		return rollnumEtr;
	}
	public AssessmentStudentRollNumGenerationPage addBtn()
	{ click(addBtn);
		return this;
	}
	public WebElement rollnum()
	{
		return rollnum;
	}

}
