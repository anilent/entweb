package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsCreateStdAccount extends BaseTest{
	
	@FindBy (xpath="//*[.='Student Accounts Creation From Confirmed admissions']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='standards']") private WebElement SeleStandards;
	@FindBy (xpath="//*[@id='sections']") private WebElement SeleSection;
	@FindBy (xpath="//*[@id='save_changes']") private WebElement CreateAccounts;

	public AdmsCreateStdAccount(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
	}
	
	public AdmsCreateStdAccount SeleStandards(String assindx)
	{
		click(SeleStandards);
		selectdropdownTxt(SeleStandards, assindx);
		return this;
	}
	
	public AdmsCreateStdAccount SeleSection(int assindx)
	{
		click(SeleSection);
		selectdropdown(SeleSection, assindx);
		return this;
	} 
	
	public AdmsCreateStdAccount CreateAccounts()
	{
		click(CreateAccounts);
		return this;
	}
}
