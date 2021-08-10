package biz.entrar.TeacherPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class ViewStdResultPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Result']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Online Assessment Test Result']/../../../..//tr//td[2]/..//td[1]") private List<WebElement> StdResultMaster;
	@FindBy (xpath="//*[.='Online Assessment Test Result']/../../../..//tr//td[2]") private List<WebElement> stdResultdata;
	

	public ViewStdResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
		
	}
	public List<WebElement> StdResultMaster()
	{
		return StdResultMaster;
	}

	public List<WebElement> stdResultdata()
	{
		return stdResultdata;
	}
}
