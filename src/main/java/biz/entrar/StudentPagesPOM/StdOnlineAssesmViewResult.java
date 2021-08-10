package biz.entrar.StudentPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class StdOnlineAssesmViewResult extends BaseTest{

	@FindBy (xpath="//*[.='Result']") private WebElement pagTitle;
	@FindBy (xpath="//*[.='Online Assessment Test Result']/../../../..//tr//td[2]") private List<WebElement> resultdat;
	
	public StdOnlineAssesmViewResult() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pagTitle()
	{
		return pagTitle;
	}
	
	public List<WebElement> resultdat()
	{
		return resultdat;
	}
}
