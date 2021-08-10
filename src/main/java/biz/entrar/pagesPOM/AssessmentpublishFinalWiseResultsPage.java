package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentpublishFinalWiseResultsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Published Exam Results Final Exam']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='term_name']") private WebElement finalName;
	
	
	public AssessmentpublishFinalWiseResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement finalName()
	{
		return finalName;
	}
	
	 

}
