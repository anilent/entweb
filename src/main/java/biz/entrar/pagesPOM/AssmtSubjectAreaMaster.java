package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtSubjectAreaMaster extends BaseTest{
	
	@FindBy (xpath="//*[.='Subject Area add']") private WebElement pageTitle;
	@FindBy (xpath="//*[@class=\"col-sm-12 \"]//*[.='Add']") private WebElement addBtn;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']") private WebElement popupTitl;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[@id='sub_area_code']") private WebElement subjtArea;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[@id='sub_area_name']") private WebElement areaName;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[@id='seq_no']") private WebElement seqNo;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[@id='print_name']") private WebElement printName;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[@id='status']") private WebElement status;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[.='Is academic area?:']/..//*[@class='cr']")
	private WebElement acadamicAreaCheckbox;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[.='Report in Grades:']/..//*[@class='cr']")
	private WebElement reportsInGradesCheckbox;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/../..//*[.='Submit']") private WebElement SubmitBtn;
	@FindBy (xpath="//*[@class='modal-header']//*[.='Add']/..//*[@class='close']//*[.='×']") private WebElement cancleBtn;
	@FindBy (xpath="//tbody//tr") private List<WebElement> dataCount;
	

	public AssmtSubjectAreaMaster(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssmtSubjectAreaMaster addBtn()
	{
		click(addBtn);
		return this;
	}
	
	public String popupTitl()
	{
		return getAttribut(popupTitl, "Text", "Popup Title Verifation");
	}
	
	public AssmtSubjectAreaMaster subjtArea(String sareanam)
	{
		sendKeys(subjtArea, sareanam);
		return this;
	}

	public AssmtSubjectAreaMaster areaName(String text)
	{
		sendKeys(areaName, text);
		return this;
	}
	
	public AssmtSubjectAreaMaster seqNo(String text)
	{
		sendKeys(seqNo, text);
		return this;
	}
	public AssmtSubjectAreaMaster printName(String text)
	{
		sendKeys(printName, text);
		return this;
	}
	public AssmtSubjectAreaMaster status(String text)
	{
		click(status);
		selectdropdownTxt(status, text);
		return this;
	}
	public AssmtSubjectAreaMaster acadamicAreaCheckbox()
	{
		click(acadamicAreaCheckbox);
		return this;
	}
	public AssmtSubjectAreaMaster reportsInGradesCheckbox()
	{
		click(reportsInGradesCheckbox);
		return this;
	}
	
	public AssmtSubjectAreaMaster SubmitBtn()
	{
		click(SubmitBtn);
		return this;
	}
	
	public AssmtSubjectAreaMaster cancleBtn()
	{
		click(cancleBtn);
		return this;
	}
	public int dataCount()
	{
		return dataCount.size();
	}
}
