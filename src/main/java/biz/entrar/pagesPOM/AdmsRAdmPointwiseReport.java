package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRAdmPointwiseReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Admission Report with Points']") private WebElement pageTitle;
	@FindBy(xpath="//*[@name='school_std_id']") private WebElement standard;
	@FindBy(xpath="//*[@id='status_filter']")private WebElement status;
	@FindBy(xpath="//*[@id='from_date']") private WebElement fromDate;
	@FindBy(xpath="//*[@id='sort_list']") private WebElement searchBtn;
	
	public AdmsRAdmPointwiseReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verifation");
	}
	
	public WebElement standard()
	{
		return standard;
	}

	public WebElement status()
	{
		return status;
	}
	
	public AdmsRAdmPointwiseReport fromDate(String date)
	{
		sendKeys(fromDate, date);
		return this;
	}
	
	public AdmsRAdmPointwiseReport searchBtn()
	{
		click(searchBtn);
		return this;
	}
}
