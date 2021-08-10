package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class SubjectiveMarksRecordingPage extends BaseTest{

	@FindBy (xpath="//*[.='Mark Recording']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Download Student Answer Sheet']") private WebElement stdAnsSheet;
	@FindBy (xpath="//*[@id='obtain_mark']") private WebElement ObtnMarksEnt;
	@FindBy (xpath="//*[@id='teacher_ans_sheet']") private WebElement techerAnswSheet;
	@FindBy (xpath="//*[@id='Save']") private WebElement saveBtn;
	
	
	
	public SubjectiveMarksRecordingPage() {
		PageFactory.initElements(driver, this);
	}

}
