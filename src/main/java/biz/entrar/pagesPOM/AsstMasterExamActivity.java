package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstMasterExamActivity extends BaseTest{

	@FindBy (xpath="//*[.='Examination Activity (Sub Exams)']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='exam_name']") private WebElement seleExamName;
	@FindBy (xpath="//*[@name='activity_add']") private WebElement addBtn;
	@FindBy (xpath="//*[@name='new_activity_name[]']") private List<WebElement> activityNameEtr;
	@FindBy (xpath="//*[@name='new_max_marks[]']") private List<WebElement> maxMarks;
	@FindBy (xpath="//*[@name='new_reduce_marks[]']") private List<WebElement> reduceMarks;
	@FindBy (xpath="//*[@name='new_status[]']") private List<WebElement> seleStatus;
	@FindBy (xpath="//*[@name='new_seq_no[]']") private List<WebElement> seqNum;
	
	@FindBy (xpath="//*[@name='activity_name[]']") private List<WebElement> activityNameEtrold;
	@FindBy (xpath="//*[@name='max_marks[]']") private List<WebElement> maxMarksold;
	@FindBy (xpath="//*[@name='reduce_marks[]']") private List<WebElement> reduceMarksold;
	@FindBy (xpath="//*[@name='status[]']") private List<WebElement> seleStatusold;
	@FindBy (xpath="//*[@name='seq_no[]']") private List<WebElement> seqNumold;
	
	
	public AsstMasterExamActivity() {
		PageFactory.initElements(driver, this);
	}

	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AsstMasterExamActivity seleYear(String text)
	{
		click(seleYear);
		selectdropdownTxt(seleYear, text);
		return this;
	}
	
	public AsstMasterExamActivity seleStandard(String text)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public AsstMasterExamActivity seleExamName(String text)
	{
		click(seleExamName);
		selectdropdownTxt(seleExamName, text);
		return this;
	}
	public AsstMasterExamActivity addBtn()
	{
		click(addBtn);
		return this;
	}
	
	public List<WebElement> activityNameEtr()
	{
		return activityNameEtr;
	}
	public List<WebElement> maxMarks()
	{
		return maxMarks;
	}
	public List<WebElement> reduceMarks()
	{
		return reduceMarks;
	}
	public List<WebElement> seleStatus()
	{
		return seleStatus;
	}
	public List<WebElement> seqNum()
	{
		return seqNum;
	}
	public List<WebElement> activityNameEtrold()
	{
		return activityNameEtrold;
	}
	public List<WebElement> maxMarksold()
	{
		return maxMarksold;
	}
	public List<WebElement> reduceMarksold()
	{
		return reduceMarksold;
	}
	public List<WebElement> seleStatusold()
	{
		return seleStatusold;
	}
	public List<WebElement> seqNumold()
	{
		return seqNumold;
	}
}
