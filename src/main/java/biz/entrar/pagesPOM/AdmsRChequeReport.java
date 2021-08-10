package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRChequeReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Admission Fee Cheque Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='from_date']") private WebElement frmDate;
	@FindBy(xpath="//*[@id='to_date']") private WebElement toDate;
	@FindBy(xpath="//*[.='Bank:']/..//*[.='Select All']/..//*[@class='cr']") private WebElement BnkSeltAll;
	@FindBy(xpath="//*[@class='mt-4']//*[@id='Allahabad Bank']/..//*[@class='cr']") private WebElement AllahabadBnk;
	@FindBy(xpath="//*[.=' Filter']") private WebElement FilterBtn;
	

	public AdmsRChequeReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verifation");
	}
	
	public AdmsRChequeReport frmDate(String text)
	{
		sendKeys(frmDate, text);
		return this;
	}
	
	public AdmsRChequeReport toDate(String text)
	{
		sendKeys(toDate, text);
		return this;
	}
	
	public AdmsRChequeReport BnkSeltAll()
	{
		click(BnkSeltAll);
		return this;
	}
	
	public AdmsRChequeReport AllahabadBnk()
	{
		click(AllahabadBnk);
		return this;
	}
	public AdmsRChequeReport FilterBtn()
	{
		click(FilterBtn);
		return this;
	}

}
