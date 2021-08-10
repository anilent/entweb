package biz.entrar.pagesPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import biz.entrarBase.BaseTest;

public class AdnProccEnquiryFrom extends BaseTest{
	
	@FindBy (xpath="//*[.='Add']")
	private WebElement add;
	
	@FindBy (xpath="//*[@id='academicyear_id']")
	private WebElement academicyearid;
	
	@FindBy (xpath="//*[@id='search']")
	private WebElement search;
	
	@FindBy (xpath="//*[.='Fee Collection']/*")
	private WebElement feeCollection;
	
	@FindBy (xpath="//*[.='Fee Collection']/*/../..//*[17]/*")
	private WebElement processAdmission;
	
	@FindBy (xpath="//*[@id='basic-btn']")
	private WebElement scroll;
	
	public AdnProccEnquiryFrom(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public AdmsnApAddEnquiryFrom addenqury()
	{
		click(add);
		return new AdmsnApAddEnquiryFrom(driver);
	}
	
	public AdnProccEnquiryFrom academicyearid(String id)
	{
		click(academicyearid);
		Select yer=new Select(academicyearid);
		yer.selectByVisibleText(id);
		click(academicyearid);
		return this;
	}
	
	public AdnProccEnquiryFrom search(String text)
	{
		search.clear();
		sendKeys(search, text);
		return this;
	}

	public MiscFeeCollectionPage feeCollection()
	{
		click(feeCollection);
		return new MiscFeeCollectionPage(driver);
	}
	
	public ProcessAdmissonPage processAdmission()
	{
		System.out.println("came for scrolling");
		//waitForVisibility(processAdmission);
		//scrolling(scroll);
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("document.getElementById('basic-btn').scrollLeft");
		//System.out.println("came for scrolling1");
		
		/*EventFiringWebDriver efwe=new EventFiringWebDriver(driver);
		efwe.executeScript("document.querySelector('div[class='table-responsive']').scrollLeft=500");*/
		
		System.out.println("came for scrolling3");
		click(processAdmission);
		return new ProcessAdmissonPage(driver);
	}
	 
}
