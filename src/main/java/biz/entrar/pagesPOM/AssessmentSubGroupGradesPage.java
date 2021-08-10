package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentSubGroupGradesPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Subject Group Grades']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='sub_area']") private WebElement seleSubArea;
	@FindBy (xpath="//*[@id='sub_area_id_create']") private WebElement addBtn;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='grade_code']") private WebElement entrGradeCode;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='seq_no']") private WebElement entrSeqNum;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='from_per']") private WebElement entrFromPrcnt;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='to_per']") private WebElement entrTopPrcnt;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='details']") private WebElement entrDetails;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='colour']") private WebElement entrColorNam;
	@FindBy (xpath="//*[.='Add']/../..//*[.='Submit']") private WebElement submitBtn;
	
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='grade_code']") private WebElement editGradeCode;
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='seq_no']") private WebElement editSeqNum;
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='from_per']") private WebElement editFromPrcnt;
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='to_per']") private WebElement editTopPrcnt;
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='details']") private WebElement editDetails;
	@FindBy (xpath="//*[.='Edit ']/../..//*[@id='colour']") private WebElement editColorNam;
	@FindBy (xpath="//*[.='Edit ']/../..//*[.='Submit']") private WebElement editSubmitBtn;
	@FindBy (xpath="//*[@data-target='#edit-item']") private List<WebElement> deleteBtn;
	
	

	public AssessmentSubGroupGradesPage() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle(String title)
	{
		return getAttribut(pageTitle, "Text", title);
	}
	
	public WebElement seleSubArea()
	{
		
		return seleSubArea;
	}
	public AssessmentSubGroupGradesPage addBtn()
	{
		click(addBtn);
		return this;
	}
	
	public AssessmentSubGroupGradesPage entrGradeCode(String text)
	{
		sendKeys(entrGradeCode, text);
		return this;
	}
	public AssessmentSubGroupGradesPage entrSeqNum(String text)
	{
		sendKeys(entrSeqNum, text);
		return this;
	}
	public AssessmentSubGroupGradesPage entrFromPrcnt(String text)
	{
		sendKeys(entrFromPrcnt, text);
		return this;
	}
	public AssessmentSubGroupGradesPage entrTopPrcnt(String text)
	{
		sendKeys(entrTopPrcnt, text);
		return this;
	}
	public AssessmentSubGroupGradesPage entrDetails(String text)
	{
		sendKeys(entrDetails, text);
		return this;
	}
	
	public AssessmentSubGroupGradesPage entrColorNam(String text)
	{
		sendKeys(entrColorNam, text);
		return this;
	}
	
	public AssessmentSubGroupGradesPage submitBtn()
	{
		click(submitBtn);
		return this;
	}
	
	public AssessmentSubGroupGradesPage editGradeCode(String text)
	{
		editGradeCode.clear();
		sendKeys(editGradeCode, text);
		return this;
	}
	public AssessmentSubGroupGradesPage editSeqNum(String text)
	{
		editSeqNum.clear();
		sendKeys(editSeqNum, text);
		return this;
	}
	public AssessmentSubGroupGradesPage editFromPrcnt(String text)
	{
		editFromPrcnt.clear();
		sendKeys(editFromPrcnt, text);
		return this;
	}
	public AssessmentSubGroupGradesPage editTopPrcnt(String text)
	{
		editTopPrcnt.clear();
		sendKeys(editTopPrcnt, text);
		return this;
	}
	public AssessmentSubGroupGradesPage editDetails(String text)
	{
		editDetails.clear();
		sendKeys(editDetails, text);
		return this;
	}
	
	public AssessmentSubGroupGradesPage editColorNam(String text)
	{
		editColorNam.clear();
		sendKeys(editColorNam, text);
		return this;
	}
	
	public AssessmentSubGroupGradesPage editSubmitBtn()
	{
		
		click(editSubmitBtn);
		return this;
	}
	
	public List<WebElement> deleteBtn()
	{
		return deleteBtn;
	}
}
