package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstMstrAssessmentDetialsPage extends BaseTest{

	@FindBy (xpath="//*[.='Examination Details']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@name='exam_add']") private WebElement addBtn;
	
	@FindBy (xpath="//*[@name='exam_name[]']") private List<WebElement> entrExamName;
	@FindBy (xpath="//*[@name='new_exam_name[]']/.") private List<WebElement> entrNewExamName;
	@FindBy (xpath="//*[@name='print_name[]']") private List<WebElement> entrPrintName;
	@FindBy (xpath="//*[@name='new_print_name[]']") private List<WebElement> entrNewPrintName;
	@FindBy (xpath="//*[@name='close[]']") private List<WebElement> seleActive;
	@FindBy (xpath="//*[@name='new_close[]']") private List<WebElement> seleNewActive;
	@FindBy (xpath="//*[@name='start_date[]']") private List<WebElement> seleAttedStartDate;
	@FindBy (xpath="//*[@name='new_start_date[]']") private List<WebElement> seleNewAttedStartDate;
	@FindBy (xpath="//*[@name='end_date[]']") private List<WebElement> seleAttedEndDate;
	@FindBy (xpath="//*[@name='new_end_date[]']") private List<WebElement> seleNewAttedEndDate;
	@FindBy (xpath="//*[@name='breakups[]']") private List<WebElement> seleBrakupSubject;
	@FindBy (xpath="//*[@name='new_breakups[]']") private List<WebElement> seleNewBrakupSubject;
	@FindBy (xpath="//*[@name='skillexam[]']") private List<WebElement> seleSkillExam;
	@FindBy (xpath="//*[@name='new_skillexam[]']") private List<WebElement> seleNewSkillExam;
	@FindBy (xpath="//*[@name='fetch_type[]']") private List<WebElement> seleExamFetchType;
	@FindBy (xpath="//*[@name='new_fetch_type[]']") private List<WebElement> seleNewExamFetchType;
	
	@FindBy (xpath="//th") private List<WebElement> printHeader;
	@FindBy (xpath="//*[@name='exam_name[]']/../..//td") private List<WebElement> printData;
	
	public AsstMstrAssessmentDetialsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AsstMstrAssessmentDetialsPage seleYear(String text)
	{
		click(seleYear);
		selectdropdownTxt(seleYear, text);
		return this;
	}
	
	public AsstMstrAssessmentDetialsPage seleStandard(String text)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	
	public List<WebElement> entrExamName()
	{
		return entrExamName;
	}
	
	public List<WebElement> entrNewExamName()
	{
		return entrNewExamName;
	}
	
	public List<WebElement> entrPrintName()
	{
		return entrPrintName;
	}
	
	public List<WebElement> entrNewPrintName()
	{
		return entrNewPrintName;
	}

	public List<WebElement> seleActive()
	{
		return seleActive;
	}
	
	public List<WebElement> seleNewActive()
	{
		return seleNewActive;
	}
	
	public List<WebElement> seleAttedStartDate()
	{
		return seleAttedStartDate;
	}
	
	public List<WebElement> seleNewAttedStartDate()
	{
		return seleNewAttedStartDate;
	}
	
	public List<WebElement> seleAttedEndDate()
	{
		return seleAttedEndDate;
	}
	
	public List<WebElement> seleNewAttedEndDate()
	{
		return seleNewAttedEndDate;
	}
	
	public List<WebElement> seleBrakupSubject()
	{
		return seleBrakupSubject;
	}
	
	public List<WebElement> seleNewBrakupSubject()
	{
		return seleNewBrakupSubject;
	}
	
	public List<WebElement> seleSkillExam()
	{
		return seleSkillExam;
	}
	
	public List<WebElement> seleNewSkillExam()
	{
		return seleNewSkillExam;
	}
	
	public List<WebElement> seleExamFetchType()
	{
		return seleExamFetchType;
	}
	
	public List<WebElement> seleNewExamFetchType()
	{
		return seleNewExamFetchType;
	}
	
	public List<WebElement> printHeader()
	{
		return printHeader;
	}
	
	public List<WebElement> printData()
	{
		return printData;
	}
	
	public AsstMstrAssessmentDetialsPage addBtn()
	{
		click(addBtn);
		return this;
	}
}
