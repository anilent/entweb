package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentpublishTermWiseResultsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Published Exam Results Testwise']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='term_name']") private WebElement termName;

	public AssessmentpublishTermWiseResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public AssessmentpublishTermWiseResultsPage termName(int num)
	{
		selectdropdown(termName, num);
		return this;
	}

}
