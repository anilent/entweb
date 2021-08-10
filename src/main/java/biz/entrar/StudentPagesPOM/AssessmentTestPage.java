package biz.entrar.StudentPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentTestPage extends BaseTest{

	@FindBy (xpath="//*[.='Start Exam']") private WebElement statrtExam;
	@FindBy (xpath="//*[@id='submit_btn']") private WebElement submitBtn;
	@FindBy (xpath="//*[@class='question_section']//textarea") private WebElement subjectivQsn;
	@FindBy (xpath="//*[@type='radio']/..//*[@value='1']") private WebElement optionalAns;
	@FindBy (xpath="//*[@type='checkbox']/..//*[@value='1']") private WebElement checkboxAns;
	@FindBy (xpath="//*[@id='save_btn']") private WebElement saveBtn;
	@FindBy (xpath="//*[@id='next_ques']") private WebElement nextBtn;
	@FindBy (xpath="//*[@id='prev_ques']") private WebElement privsBtn;
	@FindBy (xpath="//*[@id='player-handwriting-title']//li") private List<WebElement> qustionPalte;
	@FindBy (xpath="//*[@id='player-handwriting-title']//*[.='1']/*") private WebElement firstQuestion;
	@FindBy (xpath="//*[@id='explanation']") private WebElement requestunlockTxt;
	@FindBy (xpath="//*[.='Request Unlock']") private WebElement UnlockBtn;
	@FindBy (xpath="//*[.='Request Unlock']") private List<WebElement> UnlockBtnList;
	@FindBy (xpath="//*[.='Locked Out']/../p") private WebElement unlockMessage;
	@FindBy (xpath="//*[.='YOU HAVE SUCCESSFULLY COMPLETED THE TEST.']") private WebElement successfulMesg;
	@FindBy (xpath="//*[.='The Exam is Ready']") private WebElement statExamPopup;
	@FindBy (xpath="//*[@id='total_no_ques']") private WebElement questionCount;
	@FindBy (xpath="//*[@id='no_ques']") private WebElement currentQuestion;
	//@FindBy (xpath="//*[@id='locked-small-Modal']/..//*[@style='display: block; padding-right: 2px;']//*[.='Locked Out']") private List<WebElement> unlockExamPopup1;
	@FindBy (xpath="//*[@id='pdf_view_div_btn']//tbody") private WebElement questionpgCountSubjective;
	@FindBy (xpath="//*[@id='page_num']") private WebElement pageNum;
	@FindBy (xpath="//*[@id='the-canvas']") private WebElement questionPriview;
	
	
	
	public AssessmentTestPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AssessmentTestPage statrtExam()
	{
		click(statrtExam);
		return this;
	}
	
	public WebElement submitBtn()
	{
		return submitBtn;
	}
	
	public AssessmentTestPage subjectivQsn(String text)
	{
		sendKeys(subjectivQsn, text);
		return this;
	}
	public AssessmentTestPage optionalAns()
	{
		click(optionalAns);
		return this;
	}
	public AssessmentTestPage checkboxAns()
	{
		click(checkboxAns);
		return this;
	}
	public List<WebElement> qustionPalte()
	{
		return qustionPalte;
	}
	public WebElement nextBtn()
	{
		return nextBtn;
	}
	
	public AssessmentTestPage requestunlockTxt(String text)
	{
		sendKeys(requestunlockTxt, text);
		return this;
	}
	public String unlockMessage()
	{
		return getAttribut(unlockMessage, "Text", "Reason of Locking");
	}
	public AssessmentTestPage UnlockBtn()
	{
		click(UnlockBtn);
		return this;
	}
	
	public List<WebElement> UnlockBtnList()
	{
		return UnlockBtnList;
	}
	
	public AssessmentTestPage firstQuestion()
	{
		click(firstQuestion);
		return this;
	}

	public WebElement successfulMesg()
	{
		return successfulMesg;
	}
	public WebElement statExamPopup()
	{
		return statExamPopup;
	}
//	public List<WebElement> unlockExamPopup1()
//	{
//		return unlockExamPopup1;
//	}
	public AssessmentTestPage saveBtn()
	{
		click(saveBtn);
		return this;
	}
	public WebElement questionCount()
	{
		return questionCount;
	}
	public WebElement currentQuestion()
	{
		return currentQuestion;
	}
	public WebElement privsBtn()
	{
		return privsBtn;
	}
	public WebElement questionpgCountSubjective()
	{
		return questionpgCountSubjective;
	}
	public WebElement pageNum()
	{
		return pageNum;
	}
	public WebElement questionPriview()
	{
		return questionPriview;
	}
}
