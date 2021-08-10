package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal2PayrolLeaveAllocationPage2 extends BaseTest{
	
	@FindBy (xpath="//*[@id='basic-btn']") private WebElement mainpagClick;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..") private WebElement radhaRow;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..//*[@id='forward_leave[]']") private WebElement carryForwdLev;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..//*[@id='check_all[]']") private WebElement levAllocate;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..//*[@id='taken[]']") private WebElement levTaken;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..//*[@id='total_balance_leave']") private WebElement levBalance;
	@FindBy (xpath="//*[@id='allocate']") private WebElement allocateBtn;
	
	

	public sal2PayrolLeaveAllocationPage2() {
		PageFactory.initElements(driver, this);
	}
	
	public void mainpagClick()
	{
		click(mainpagClick);
		
	}

	public WebElement radhaRow()
	{
		return radhaRow;
	}
	public WebElement carryForwdLev()
	{
		return carryForwdLev;
	}
	
	public WebElement levAllocate()
	{
		return levAllocate;
	}
	public WebElement levTaken()
	{
		return levTaken;
	}
	public WebElement levBalance()
	{
		return levBalance;
	}
	public WebElement  allocateBtn()
	{
		return allocateBtn;
	}
	
}
