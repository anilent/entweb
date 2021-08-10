package biz.entrar.StudentPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StdOnlineAssessmentResult extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='MCQ Test Result']") private WebElement pageTitle;
	
	
	
public StdOnlineAssessmentResult()
{
	PageFactory.initElements(driver, this);
}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
}
