package biz.entrar.StudentPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StdOnlineAssessmentViewPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Online Assessment']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='upload_answer_sheet']") private WebElement uploadBtn;
//	@FindBy (xpath="//*[.='Successfully Uploaded.']") private WebElment SuccfulUplodTxt;
	

	public StdOnlineAssessmentViewPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement uploadBtn()
	{
		return uploadBtn;
	}
}
