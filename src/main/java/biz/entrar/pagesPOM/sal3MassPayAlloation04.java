package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal3MassPayAlloation04 extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar_id_mass']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement accountingdivision;
	@FindBy (xpath="//*[@name='pay_code']") private WebElement payNam;
	@FindBy (xpath="//*[.='DPSE/05/14/345']") private WebElement empid;
	@FindBy (xpath="//*[@id='mass_allocate']") private WebElement allocatBtn;
 	
	
	public sal3MassPayAlloation04() {
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
	public WebElement accountingdivision()
	{
		return accountingdivision;
	}
	public WebElement payNam()
	{
		return payNam;
	}
	public WebElement empid()
	{
		return empid;
	}
	public WebElement allocatBtn()
	{
		return allocatBtn;
	}
}
