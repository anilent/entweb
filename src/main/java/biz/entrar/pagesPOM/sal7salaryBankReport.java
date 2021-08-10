package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal7salaryBankReport extends BaseTest{
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='month']") private WebElement selemonth;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingDevision;

	public sal7salaryBankReport() {
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
}
