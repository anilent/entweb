package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import biz.entrarBase.BaseTest;

public class AdmsNewAdmsViewPage extends BaseTest {
	
	@FindBy(xpath="//*[@class='breadcrumb-header']//*[.='New Admissions']") private WebElement pageTitle;
	@FindBy(xpath="//*[.='Add']") private WebElement addAdm;
	@FindBy (xpath="//*[@name='action']") private WebElement SeleAction;
	@FindBy (xpath="//*[@id='do_action']") private WebElement confirmBtn;
	
	
	
	//initializing the page object
	public AdmsNewAdmsViewPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
	}
	public AdmsAddNewAdmnPage addAdm()
	{
		click(addAdm);
		return new AdmsAddNewAdmnPage(driver);
	}
	
	public AdmsNewAdmsViewPage ConfirmAction(String assindx)
	{
		click(SeleAction);
		selectdropdownTxt(SeleAction, assindx);
		return this;
	}
	public AdmsConfirmedAdmissionsViewPage ConfirmAms()
	{
		click(confirmBtn);
		return new AdmsConfirmedAdmissionsViewPage(driver);
	}
}

