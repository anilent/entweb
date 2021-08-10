package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRRegFormProcessFeeReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Process Fee Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='report_type']") private WebElement ReportType;
	@FindBy(xpath="//*[@id='standards']") private WebElement standards;
	@FindBy(xpath="//*[@id='paycode']") private WebElement payCode;
	@FindBy(xpath="//*[@id='basic-btn_info']") private WebElement dataCount;
	

	public AdmsRRegFormProcessFeeReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verifation");
	}
	public AdmsRRegFormProcessFeeReport ReportType()
	{
		click(ReportType);
		click(ReportType);
		return this;
	}
	public AdmsRRegFormProcessFeeReport standards()
	{
		click(standards);
		click(standards);
		return this;
	}
	public AdmsRRegFormProcessFeeReport payCode()
	{
		click(payCode);
		click(payCode);
		return this;
	}
	public String dataCount()
	{
		return getAttribut(dataCount, "Text", "Total Data Count");
	}
}
