package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentpublishActivityWiseResultsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='published Exam Results Activity Exam']") private WebElement pageTitle;

	public AssessmentpublishActivityWiseResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
}
