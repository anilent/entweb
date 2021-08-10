package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRCancelReport extends BaseTest{
	
	@FindBy(xpath="//*[@class='card']//*[.='Admission Cancel Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='session_year']") private WebElement sessionYer;
	@FindBy(xpath="//*[@id='basic-btn_info']") private WebElement EntriesCount;

	public AdmsRCancelReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("AdmsRCancelReport");
	}
	
	public String pagTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
		
	}
	
	
	public AdmsRCancelReport sessionYer(String txt)
	{
		click(sessionYer);
		selectdropdownTxt(sessionYer, txt);
		return this;
	}
	
	public String totlaRecords()
	{
		waitForVisibility(EntriesCount);
		ScrolljavaScript(EntriesCount);
		return getAttribut(EntriesCount, "Text", "Total Record Count");
		
	}

}
