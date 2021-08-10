package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRFeeDetilReport extends BaseTest{
	
	
	@FindBy(xpath="//*[.='Admission Fee Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='basic-btn_info']") private WebElement totlaRecords;

	public AdmsRFeeDetilReport(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verifation");
	}

	public String totlaRecords() {
		ScrolljavaScript(totlaRecords);
		return getAttribut(totlaRecords, "Text", "Totle Recordes Count");
	}

}
