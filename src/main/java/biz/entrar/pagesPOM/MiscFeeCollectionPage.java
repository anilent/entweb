package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import biz.entrarBase.BaseTest;

public class MiscFeeCollectionPage extends BaseTest {
	
	@FindBy (xpath="//*[@name='fee_feecode_id']")
	private WebElement feeReason;
	
	@FindBy (xpath="//*[@id='paid_amount']")
	private WebElement actualAmot;
	
	@FindBy (xpath="//*[@name='mode_of_payment']")
	private WebElement modeOfPayment;
	
	@FindBy (xpath="//*[@name='cheque_no']")
	private WebElement chequeNo;
	
	@FindBy (xpath="//*[@id='create_invoice']")
	private WebElement createInvoice;
	
	@FindBy (xpath="//*[@name='bank']")
	private WebElement bankname;
	
	@FindBy (xpath="//*[@name='note']")
	private WebElement note;
	
	
	public MiscFeeCollectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public MiscFeeCollectionPage feeReason(String text)
	{
		click(feeReason);
		Select sele=new Select(feeReason);
		sele.selectByVisibleText(text);
		return this;
	}
	
	public String actualAmount()
	{
		return getAttribut(actualAmot, "text","Actural Amount");
	}
	
	public MiscFeeCollectionPage modeOfPayment(String text)
	{
		click(modeOfPayment);
		Select sele=new Select(modeOfPayment);
		sele.selectByVisibleText(text);
		return this;
	}
	
	public MiscFeeCollectionPage chequeNo(String text)
	{
		sendKeys(chequeNo, text);
		return this;
	}

	public MiscFeeCollectionPage bankname(String text)
	{
		click(bankname);
		Select sele=new Select(bankname);
		sele.selectByVisibleText(text);
		return this;
	}
	
	public MiscFeeCollectionPage note(String text)
	{
		sendKeys(note, text);
		return this;
	}
	
	public InvoicePage createInvoice()
	{
		click(createInvoice);
		return new InvoicePage(driver);
	}
}
