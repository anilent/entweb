package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentSubjectWiseCommentPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Subject Comments']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_area']") private WebElement seleSubArea;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@name='comment_add']") private WebElement addBtn;
	@FindBy (xpath="//*[@name='comment_name[]']") private List<WebElement> commentsEtr;

	public AssessmentSubjectWiseCommentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssessmentSubjectWiseCommentPage seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public WebElement seleSubArea()
	{
		return seleSubArea;
	}
	public WebElement seleSubject()
	{
		return seleSubject;
	}
	public AssessmentSubjectWiseCommentPage addBtn()
	{
		click(addBtn);
		return this;
	}
	public List<WebElement> commentsEtr()
	{ 
		return commentsEtr;
	}
}
