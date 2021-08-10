package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class DashboardTeacherPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Online Assessment']") private WebElement onlineAssessemnt;
	@FindBy (xpath="//*[.='Assessment Master']") private WebElement assementMaster;
	@FindBy (xpath="//*[@class='ti-angle-down']") private WebElement profileLogout;
	@FindBy (xpath="//*[@class='ti-layout-sidebar-left']/..") private WebElement logout;
	@FindBy (xpath="//*[.='MCQ Result']") private WebElement mcqResults;
	@FindBy (xpath="//*[.='×']") private WebElement closepopup;
	@FindBy (xpath="//*[.='Subjective Marks Recording']") private WebElement subjectiveResult;	
	

	public DashboardTeacherPage() {
		PageFactory.initElements(driver, this);
	}

	public void onlineAssessemnt()
	{
		click(onlineAssessemnt);
	}
	public AddOnlineAssessmentMastersPage assementMaster()
	{
		click(assementMaster);
		return new AddOnlineAssessmentMastersPage();
	}
	public void profileLogout()
	{
		click(profileLogout);
	}
	public void logout()
	{
		click(logout);
	}
	public OnlineAssessmViewPublishingPage mcqResults()
	{
		click(mcqResults);
		return new OnlineAssessmViewPublishingPage();
	}
	public WebElement closepopup()
	 {
		 return closepopup;
	 }
	public OnlineAssessmSubjResultPublishPage subjectiveResult()
	{
		click(subjectiveResult);
		return new OnlineAssessmSubjResultPublishPage();
	}
}
