package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsFeeCollection extends BaseTest{
	
	@FindBy(xpath="//*[@id='admission_feeformat_id']")	private WebElement feeFormat;
	@FindBy(xpath="//*[@id='cheque_no']") private WebElement chequeNum;
	@FindBy(xpath="//*[@id='cheque_date']") private WebElement cheqDate;
	@FindBy(xpath="//*[@name='bank']") private WebElement bankNam;
	@FindBy(xpath="//*[@name='notes']") private WebElement note;
	@FindBy(xpath="//*[@id='create_invoice']") private WebElement submitPayment;
	
	public AdmsFeeCollection(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	public AdmsFeeCollection Seleformat(int assindx)
	{
		click(feeFormat);
		selectdropdown(feeFormat, assindx);
		return this;
	}
	
	public AdmsFeeCollection chequeNum(String cheqNum)
	{
		sendKeys(chequeNum, cheqNum);
		return this;
	}
	public AdmsFeeCollection cheqDate(String chqDat)
	{
		sendKeys(cheqDate, chqDat);
		return this;
	}
	public AdmsFeeCollection bankNam(int bnknam)
	{
		click(bankNam);
		selectdropdown(bankNam, bnknam);
		return this;
	}

	public AdmsFeeCollection note(String text)
	{
		sendKeys(note, text);
		return this;
	}
	public AdmsConfirmedAdmissionsViewPage submitPayment()
	{
		click(submitPayment);
		return new AdmsConfirmedAdmissionsViewPage(driver);
	}
}
