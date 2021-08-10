package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class questionPaperUploadPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Question Sheet Upload']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='ques_sheet']") private WebElement chooseFile;
	@FindBy (xpath="//*[@id='submit']") private WebElement submitBtn;
	@FindBy (xpath="//*[.='Click here to download your uploaded file']/*") private WebElement uploadedFile;

	public questionPaperUploadPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement chooseFile()
	{
		return chooseFile;
	}
	
	public WebElement submitBtn()
	{
		return submitBtn;
	}
	
	public WebElement uploadedFile()
	{
		return uploadedFile;
	}
}
