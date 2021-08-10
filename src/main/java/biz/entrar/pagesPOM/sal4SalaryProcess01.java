package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal4SalaryProcess01 extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='pay_struc_calendar']") private WebElement seleYearpay;
	@FindBy (xpath="//*[@id='month']") private WebElement seleMonth;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingdevi;
	@FindBy (xpath ="//*[.='DPSE/05/14/345']/..//*[@id='processChk[]']") private WebElement checkBox;
	@FindBy (xpath="//*[@name='process_salary']") private WebElement procesalaryBtn;
	

	public sal4SalaryProcess01() {
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
	public WebElement  seleYearpay()
	{
		return seleYearpay;
	}
	public WebElement  accountingdevi()
	{
		return accountingdevi;
	}
	public WebElement  checkBox()
	{
		return checkBox;
	}
	public WebElement  procesalaryBtn()
	{
		return procesalaryBtn;
	}
}
