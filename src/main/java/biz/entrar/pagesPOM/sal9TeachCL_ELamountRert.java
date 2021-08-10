package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal9TeachCL_ELamountRert extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='month']") private WebElement selemonth;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingDevision;
	@FindBy (xpath="//*[@id='order_by']") private WebElement orderBy;
	@FindBy (xpath="//*[@id='leave_calendar_id']") private WebElement leavepickFrm;
	@FindBy (xpath="//*[@id='search_btn']") private WebElement searchBtn;

	public sal9TeachCL_ELamountRert() {
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
	public WebElement selemonth()
	{
		return selemonth;
	}
	public WebElement accountingDevision()
	{
		return accountingDevision;
	}
	public WebElement orderBy()
	{
		return orderBy;
	}
	public WebElement leavepickFrm()
	{
		return leavepickFrm;
	}
	public WebElement searchBtn()
	{
		return searchBtn;
	}
}
