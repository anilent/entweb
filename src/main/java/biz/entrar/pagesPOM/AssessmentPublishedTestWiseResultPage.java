package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentPublishedTestWiseResultPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Published Exam Results Testwise']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='exam_name']") private WebElement seleExamNam;

	public AssessmentPublishedTestWiseResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public AssessmentPublishedTestWiseResultPage seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
		return this;
	}
	public AssessmentPublishedTestWiseResultPage seleStandard(String text)
	{
		selectdropdownTxt(seleStandard,text);
		return this;
	}
	
	public AssessmentPublishedTestWiseResultPage seleExamNam(int assindx)
	{
		selectdropdown(seleExamNam, assindx);
		return this;
	}

}
