package biz.entrar.StudentPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StdOnlineAssesmViewFullResult extends BaseTest{
	
	@FindBy (xpath="//*[.='View Full Result']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='marks_type']//tbody//tr//td[5]") private List<WebElement> logStdAnswerd;
	@FindBy (xpath="//*[@id='marks_type']//tbody//tr//td[4]") private List<WebElement> logStdTecAnsrs;
	@FindBy (xpath="//*[@id='marks_type']//tbody//tr//td[3]") private List<WebElement> logStdMarks;

	public StdOnlineAssesmViewFullResult() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	
	public List<WebElement> logStdAnswerd()
	{
		return logStdAnswerd;
	}
	
	public List<WebElement> logStdTecAnsrs()
	{
		return logStdTecAnsrs;
	}
	
	public List<WebElement> logStdMarks()
	{
		return logStdMarks;
	}
	

}
