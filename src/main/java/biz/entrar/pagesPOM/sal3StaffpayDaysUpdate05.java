package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal3StaffpayDaysUpdate05 extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Allocated Pay days']") private WebElement allocatePaydaysBtn;
	
	@FindBy (xpath="//*[@id='calendar_id']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='month']") private WebElement seleMonth;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingDevison;
	@FindBy (xpath="//*[.='DPSE/05/14/345']") private WebElement empid;
	@FindBy (xpath="//*[@id='update_pay_days']") private WebElement updateBtn;
	
	
	

	public sal3StaffpayDaysUpdate05() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement allocatePaydaysBtn()
	{
		return allocatePaydaysBtn;
	}
	public WebElement seleYear()
	{
		return seleYear;
	}
	public WebElement seleMonth()
	{
		return seleMonth;
	}
	public WebElement accountingDevison()
	{
		return accountingDevison;
	}
	public WebElement empid()
	{
		return empid;
	}
	public WebElement updateBtn()
	{
		return updateBtn;
	}
}
