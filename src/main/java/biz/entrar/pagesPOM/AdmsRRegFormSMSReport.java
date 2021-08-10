package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRRegFormSMSReport extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='SMS Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='status']") private WebElement status;
	
	

	public AdmsRRegFormSMSReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verifation");
	}
	public WebElement status()
	{
		return status;
	}
}
