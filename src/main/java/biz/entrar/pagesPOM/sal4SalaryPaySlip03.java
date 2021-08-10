package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal4SalaryPaySlip03 extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='month']") private WebElement seleMonth;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingdevi;

	public sal4SalaryPaySlip03() {
		PageFactory.initElements(driver, this);
	}

	public WebElement  pageTitle()
	{
		return pageTitle;
	}
	public WebElement  seleYear()
	{
		return seleYear;
	}
	public WebElement  seleMonth()
	{
		return seleMonth;
	}
	public WebElement  accountingdevi()
	{
		return accountingdevi;
	}
}
