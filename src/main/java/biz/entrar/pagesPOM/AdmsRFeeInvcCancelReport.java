package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRFeeInvcCancelReport extends BaseTest{
	
	@FindBy (xpath="//*[.='Cancel Fee Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='report_type']") private WebElement ReportTyp;
	@FindBy (xpath="//*[@id='sections']") private WebElement SeleSection;
	@FindBy (xpath="//*[@class='helper']/..//*[.='Admission Fee']") private WebElement SeleAmsFee;

	public AdmsRFeeInvcCancelReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
		
	}
	
	public AdmsRFeeInvcCancelReport ReportTyp(String txt)
	{
		click(ReportTyp);
		selectdropdownTxt(ReportTyp, txt);
		return this;
	}
	
	public AdmsRFeeInvcCancelReport SeleSection(String txt)
	{
		click(SeleSection);
		selectdropdownTxt(SeleSection, txt);
		return this;
	}
	
	public AdmsRFeeInvcCancelReport SeleAmsFee()
	{
		
		click(SeleAmsFee);
		return this;
	}
}
