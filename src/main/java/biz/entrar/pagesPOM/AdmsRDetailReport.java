package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRDetailReport extends BaseTest{
	
	@FindBy(xpath="//*[@id='batch']/../../../../../../..//*[.='Admission Report']") private WebElement admissionReportTitle;
	@FindBy(xpath="//*[@id='basic-btn_info']") private WebElement totalRecords;
	
	public AdmsRDetailReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String admissionReportTitle()
	{
		return getAttribut(admissionReportTitle, "text", "Page Title Verifation");
	}
	
	public String totalRecords()
	{
		return getAttribut(totalRecords, "Text", "Total Records Details");

	}

}
