package biz.entrar.TeacherPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class ViewFullResultsTechrPage extends BaseTest{
	
	@FindBy (xpath="//*[.='View Full Result']") private WebElement pageTitle;
	@FindBy (xpath="//*[@class='row']//tr") private List<WebElement> stdAssemntData;
	@FindBy (xpath="//*[@id='basic-btn']//tbody//tr//td[5]") private List<WebElement> stdAnswerd;
	@FindBy (xpath="//*[@id='basic-btn']//tbody//tr//td[4]") private List<WebElement> tecAnsrs;
	@FindBy (xpath="//*[@id='basic-btn']//tbody//tr//td[3]") private List<WebElement> marks;
	
	public ViewFullResultsTechrPage()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public List<WebElement> stdAssemntData()
	{
		return stdAssemntData;
	}
	public List<WebElement> stdAnswerd()
	{
		return stdAnswerd;
	}
	public List<WebElement> tecAnsrs()
	{
		return tecAnsrs;
	}
	public List<WebElement> marks()
	{
		return marks;
	}
}
