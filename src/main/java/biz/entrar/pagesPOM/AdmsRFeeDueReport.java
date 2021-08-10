package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRFeeDueReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Admissions']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='session']") private WebElement year;
	@FindBy(xpath="//*[@id='feeformat']") private WebElement feeFormat;
	@FindBy(xpath="//*[@id='sort_list']") private WebElement searchBtn;
	@FindBy(xpath="//*[@id='basic-btn']") private WebElement tableData;

	public AdmsRFeeDueReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AdmsRFeeDueReport year(String txt)
	{
		sendKeys(year, txt);
		return this;
	}
	public WebElement feeFormat()
	{
		return feeFormat;
	}
	
	public AdmsRFeeDueReport searchBtn()
	{
		click(searchBtn);
		return this;
	}
	
	public WebElement tableData()
	{
		return tableData;
	}
}
