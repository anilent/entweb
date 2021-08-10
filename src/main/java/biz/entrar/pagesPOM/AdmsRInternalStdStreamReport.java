package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRInternalStdStreamReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Student Stream Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='session']") private WebElement year;
	@FindBy(xpath="//*[@id='stream']") private WebElement SeleStream;
	@FindBy(xpath="//*[@id='standard']") private WebElement SeleClass;
	@FindBy(xpath="//*[@id='section']") private WebElement SeleSection;
	@FindBy(xpath="//*[@id='search']") private WebElement SearchBtn;

	public AdmsRInternalStdStreamReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String paegTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Titile Verifation");
	}
	
	public AdmsRInternalStdStreamReport year(String text)
	{
		sendKeys(year, text);
		return this;
	}
	public WebElement SeleStream()
	{
		return SeleStream;
	}
	public WebElement SeleClass()
	{
		return SeleClass;
	}
	public WebElement SeleSection()
	{
		return SeleSection;
	}
	public AdmsRInternalStdStreamReport SearchBtn()
	{
		click(SearchBtn);
		return this;
	}
}
