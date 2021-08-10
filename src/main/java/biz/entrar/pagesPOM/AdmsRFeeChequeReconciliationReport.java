package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRFeeChequeReconciliationReport extends BaseTest{
	
	@FindBy (xpath="//*[.='Admission Fee Collection Cheque Reconciliation Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='bank']") private WebElement bank;
	@FindBy (xpath="//*[@id='filter_cheques']") private WebElement filterBtn;

	public AdmsRFeeChequeReconciliationReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public WebElement bank()
	{
		return bank;
	}
	
	public AdmsRFeeChequeReconciliationReport filterBtn()
	{
		click(filterBtn);
		return this;
	}

}
