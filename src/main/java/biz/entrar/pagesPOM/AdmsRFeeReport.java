package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRFeeReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Admission Fee Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='batch']") private WebElement AcademicYear;
	@FindBy(xpath="//*[@id='standards']") private WebElement Standard;
	@FindBy(xpath="//*[@id='from_date']") private WebElement FromDate;
	@FindBy (xpath="//*[@id='to_date']") private WebElement ToDate;
	@FindBy (xpath="//*[@id='to_date']/../../..//..//*[.='Search']") private WebElement SearchBtn;
	@FindBy (xpath="//*[@id='basic-btn_info']") private WebElement totalCount;
	

	public AdmsRFeeReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
	}
	public AdmsRFeeReport AcademicYear(String text)
	{
		click(AcademicYear);
		selectdropdownTxt(AcademicYear, text);
		return this;
	}

	public AdmsRFeeReport Standard(String text)
	{
		click(Standard);
		selectdropdownTxt(Standard, text);
		return this;
	}
	
	public AdmsRFeeReport FromDate(String text)
	{
		sendKeys(FromDate, text);
		return this;
	}
	public AdmsRFeeReport ToDate(String text)
	{
		sendKeys(ToDate, text);
		return this;
	}
	public AdmsRFeeReport SearchBtn()
	{
		click(SearchBtn);
		return this;
	}
	public String totalCount()
	{
		ScrolljavaScript(totalCount);
		return getAttribut(totalCount, "Text", "Total Records Count");
	}
	
}
