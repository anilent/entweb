package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtAcademicAssessmentSubjectsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='NON CCE Subjects']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='sub_area_code']") private WebElement seleSubjectArea;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_code']") private WebElement enterSubjectCode;
	@FindBy (xpath="//*[@id='sub_name']") private WebElement enterSubjectName;
	@FindBy (xpath="//*[@id='seq_no']") private WebElement enterSequNum;
	@FindBy (xpath="//*[@id='optional_sub']/..//*[@class='cr']") private WebElement checkOptionalSubj;
	@FindBy (xpath="//*[@id='lang_cate']") private WebElement seleOptionalSubj;
	@FindBy (xpath="//*[@id='mock_sub']/..//*[@class='cr']") private WebElement checkMockTestSubj;
	@FindBy (xpath="//*[@id='acticestatus']") private WebElement seleStatus;
	@FindBy (xpath="//*[@id='noncce_add']") private WebElement addBtn;
	
	
	
	public AssmtAcademicAssessmentSubjectsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssmtAcademicAssessmentSubjectsPage seleSubjectArea(String txt)
	{
		click(seleSubjectArea);
		selectdropdownTxt(seleSubjectArea, txt);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage seleStandard(String txt)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, txt);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage enterSubjectCode(String txt)
	{
		sendKeys(enterSubjectCode, txt);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage enterSubjectName(String txt)
	{
		sendKeys(enterSubjectName, txt);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage enterSequNum(String txt)
	{
		sendKeys(enterSequNum, txt);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage checkOptionalSubj()
	{
		click(checkOptionalSubj);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage seleOptionalSubj(int indx)
	{
		click(seleOptionalSubj);
		selectdropdown(seleOptionalSubj, indx);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage checkMockTestSubj()
	{
		click(checkMockTestSubj);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage seleStatus(int indx)
	{
		click(seleStatus);
		selectdropdown(seleStatus, indx);
		return this;
	}
	
	public AssmtAcademicAssessmentSubjectsPage addBtn()
	{
		click(addBtn);
		return this;
	}
	
	}
	
	
	