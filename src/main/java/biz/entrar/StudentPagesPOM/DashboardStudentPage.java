package biz.entrar.StudentPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class DashboardStudentPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Online Assessment']") private WebElement onlineAssessmentMaster;
	@FindBy (xpath="//*[.='Online Assessment ']") private WebElement onlineAssessment;
	@FindBy (xpath="//*[.='Assessment Result']") private WebElement onlineAssessmentResult;
	
	
	

	public DashboardStudentPage() {
		PageFactory.initElements(driver, this);
	}

	public void onlineAssessmentMaster()
	{
		click(onlineAssessmentMaster);
	}
	
	public WebElement onlineassmt()
	{
		return onlineAssessment;
	}
	public StdOnlineAssessmentViewPage onlineAssessment()
	{
		
		click(onlineAssessment);
		return new StdOnlineAssessmentViewPage();
	}
	public StdOnlineAssessmentResult onlineAssessmentResult()
	{
		ScrolljavaScript(onlineAssessmentResult);
		click(onlineAssessmentResult);
		return new StdOnlineAssessmentResult();
	}
}
