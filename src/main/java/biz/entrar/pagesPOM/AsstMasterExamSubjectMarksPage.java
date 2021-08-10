package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import biz.entrarBase.BaseTest;

public class AsstMasterExamSubjectMarksPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Exam Subject Marks']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleyear;
	@FindBy (xpath="//*[@id='standard_marks']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='examname']") private WebElement seleExamNam;
	@FindBy (xpath="//*[@name='max_marks_report[]']") private List<WebElement> maxMarksNtr;
	@FindBy (xpath="//*[@name='min_marks_report[]']") private List<WebElement> minMarksNtr;
	@FindBy (xpath="//*[@name='max_marks_entry[]']") private List<WebElement> maxMarksEntry;
	@FindBy (xpath="//*[@name='best_of[]']") private List<WebElement> seleBest;
	@FindBy (xpath="//*[@name='fixed[]']") private List<WebElement> seleFixed;
	@FindBy (xpath="//*[@name='rounding[]']") private List<WebElement> seleRounding;
	@FindBy (xpath="//*[@name='exam_marks_add']") private WebElement addBtn;
	

	public AsstMasterExamSubjectMarksPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}

	public AsstMasterExamSubjectMarksPage seleyear(String text)
	{
		click(seleyear);
		selectdropdownTxt(seleyear, text);
		return this;
	}
	public AsstMasterExamSubjectMarksPage seleStandard(String text)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public AsstMasterExamSubjectMarksPage seleExamNam(int text)
	{
		click(seleExamNam);
		selectdropdown(seleExamNam, text);
		return this;
	}
	public List<WebElement> maxMarksNtr()
	{
		return maxMarksNtr;
	}
	public List<WebElement> minMarksNtr()
	{
		return minMarksNtr;
	}
	public List<WebElement> maxMarksEntry()
	{
		return maxMarksEntry;
	}
	public List<WebElement> seleBest()
	{
		return seleBest;
	}
	public List<WebElement> seleBestTst(WebElement ele,int assindx)
	{
		Select seleAsse=new Select(ele);
		seleAsse.selectByIndex(assindx);
		click(ele);
		return seleBest;
	}

	public List<WebElement> seleFixed()
	{
		return seleFixed;
	}
	public List<WebElement> seleFixedList(WebElement ele,int assindx)
	{
		Select seleAsse=new Select(ele);
		seleAsse.selectByIndex(assindx);
		click(ele);
		return seleFixed;
	}
	public List<WebElement> seleRounding()
	{
		return seleRounding;
	}
	public List<WebElement> seleRoundingList(WebElement ele,int assindx)
	{
		Select seleAsse=new Select(ele);
		seleAsse.selectByIndex(assindx);
		click(ele);
		return seleRounding;
	}
	public AsstMasterExamSubjectMarksPage addBtn()
	{
		click(addBtn);
		return this;
	}
}
