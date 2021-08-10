package biz.entrar.pagesPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class SubmissonAdnsFormPage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@id='batch']")
	private WebElement batchYear;
	
	@FindBy(xpath="//*[@id='standard']")
	private WebElement seleStandard;
	
	@FindBy(xpath="//*[@id='search_reports']")
	private WebElement searchData;
	
	@FindBy(xpath="//tbody//tr[1]//td[2]")
	private WebElement stdName;
	
	@FindBy (xpath="//tbody//tr[1]//*[@id='locality']")
	private WebElement localityCode;
	
	@FindBy (xpath="//tbody//tr[1]//*[@name='Reg_process_no']")
	private WebElement processReadio;
	
	
	@FindBy(xpath="//*[@id='reg_process']")
	private WebElement generateRegNo;
	
	
	//initializing the page object
	public SubmissonAdnsFormPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public SubmissonAdnsFormPage batchYear(String yer)
	{
		selectdropdownTxt(batchYear, yer);
		return this;
	}
	
	public SubmissonAdnsFormPage seleStandard(String clas)
	{
		selectdropdownTxt(seleStandard, clas);
		return this;
	}
	
	public SubmissonAdnsFormPage searchData()
	{
		click(searchData);
		return this;
	}
	
	public String stdName()
	{
		return getAttribut(stdName, "text","Student Name");
	}
	
	public SubmissonAdnsFormPage localityCode(int assindx)
	{
		selectdropdown(localityCode, assindx);
		return this;
	}
	
	public SubmissonAdnsFormPage processReadio()
	{
		click(processReadio);
		return this;
	}
	
	public GeneratStdRegNoPage generateRegNo()
	{
		click(generateRegNo);
		return new GeneratStdRegNoPage(driver);
	}
	
	
}
