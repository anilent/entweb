package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class OnlineAssessmViewPublishingPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Online Assessment View Result And Publish Result']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='section']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@role='presentation']") private WebElement seleTest;
	@FindBy (xpath="//*[@type='search']") private WebElement enterTestNam;
	@FindBy (xpath="//*[@role='treeitem']") private WebElement seletestNam;
	@FindBy (xpath="//*[@id='search_btn']") private WebElement searchBtn;
	@FindBy (xpath="//*[@id='result_publish']") private WebElement resultPublishBtn;
	
	@FindBy (xpath="//*[@id='marks_type']") public WebElement marksDataTable;
	@FindBy (xpath="//*[.='Answer Sheet Annotation']") public WebElement annotationpdf;
	
	/*@FindBy (xpath="//*[.='ENT/0030']/..//td[5]") private WebElement StdAttendance;
	@FindBy (xpath="//*[.='ENT/0030']/..//*[.='View Full Result']/*") private WebElement veiwFullResults;
	@FindBy (xpath="//*[.='ENT/0030']/..//*[.='View Result']/*")*/
	


	public WebElement stdRowData(String sid){
	 return marksDataTable.findElement(By.xpath("//text()[contains(.,'"+sid+"')]/../.."));
	}
	
	public WebElement stdMarksRecording(String sid)
	{
		return marksDataTable.findElement(By.xpath("//text()[contains(.,'"+sid+"')]/../..//*[.='Mark Record']"));
	}
	
	public WebElement annotationpdf()
	{
		return annotationpdf;
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public OnlineAssessmViewPublishingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
	}
	public void seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
	}
	public void seleSection(String text)
	{
		selectdropdownTxt(seleSection, text);
	}
	public void seleSubject(String text)
	{
		selectdropdownTxt(seleSubject, text);
	}
	public void seleTest(String text)
	{
		click(seleTest);
		sendKeys(enterTestNam, text);
		click(seletestNam);
		
	}
	public void searchBtn()
	{
		click(searchBtn);
	}
	public WebElement resultPublishBtn()
	{
		return resultPublishBtn;
	}
	public ResultSuccessfulPublishPage publishbutton()
	{
		click(resultPublishBtn);
		return new ResultSuccessfulPublishPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String RequiredSystemNameXpath = "//td[contains(text(),'xxxxx')]";

	private WebElement prepareWebElementWithDynamicXpath (String xpathValue, String substitutionValue ) {

	        return driver.findElement(By.xpath(xpathValue.replace("xxxxx", substitutionValue)));
	}

	public void deleteSystem (String systemName) {
	    WebElement RequiredSystemName = prepareWebElementWithDynamicXpath(RequiredSystemNameXpath, systemName);
	    RequiredSystemName.click();

	}
	

}
