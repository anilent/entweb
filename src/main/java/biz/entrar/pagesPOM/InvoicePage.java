package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import biz.entrarBase.BaseTest;

public class InvoicePage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@class='receipt_dtl_half col-md-6']//p[1]")
	private WebElement ReceiptNo;
	
	@FindBy(xpath="//*[@class='receipt_dtl_half col-md-6']//p[2]")
	private WebElement StdName;
		
	
	//initializing the page object
	public InvoicePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public String ReceiptNo()
	{
		return getAttribut(ReceiptNo, "text","Receipt Number");
	}
	
	public String StdName()
	{
		return getAttribut(StdName, "text","Student Name");
	}
	
	
	
}
