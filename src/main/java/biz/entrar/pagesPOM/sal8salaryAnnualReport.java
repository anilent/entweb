package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal8salaryAnnualReport extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingDevision;
	@FindBy (xpath="//*[@id='monthhead']/..//*[@class='cr']") private WebElement selemonthcheck;
	@FindBy (xpath="//*[@id='paycodehead']/..//*[@class='cr']") private WebElement additionPay;
	@FindBy (xpath="//*[@id='dedpaycodehead']/..//*[@class='cr']") private WebElement deductionpay;
	@FindBy (xpath="//*[@id='staff']") private WebElement empname;
	@FindBy (xpath="//*[@id='paycodecomp']") private WebElement filterBy;
	@FindBy (xpath="//*[@id='salaryreport_search']") private WebElement reprotBtn;
	
	public sal8salaryAnnualReport() {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement seleYear()
	{
		return seleYear;
	}
	public WebElement accountingDevision()
	{
		return accountingDevision;
	}
	public WebElement selemonthcheck()
	{
		return selemonthcheck;
	}
	
	public WebElement additionPay()
	{
		return additionPay;
	}
	public WebElement deductionpay()
	{
		return deductionpay;
	}
	public WebElement empname()
	{
		return empname;
	}
	
	public WebElement filterBy()
	{
		return filterBy;
	}
	public WebElement reprotBtn()
	{
		return reprotBtn;
	}
}
