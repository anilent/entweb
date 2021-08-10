package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstAcademicOptionalSubReportPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Optional Subject Allocation Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@type='search']") private WebElement searchTxt;
	@FindBy (xpath="//td") private List<WebElement> searchData;

	public AsstAcademicOptionalSubReportPage() {

		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AsstAcademicOptionalSubReportPage searchTxt(String text)
	{
		sendKeys(searchTxt, text);
		return this;
	}
	
	public List<WebElement> searchData()
	{
		return searchData;
	}
}
