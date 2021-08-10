package biz.entrar.pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal1PayrolLeaveStructurePage extends BaseTest{
	
	@FindBy(xpath="//*[.='Add']/../../../../../../..//*[.='Leave Structure']") private WebElement pageTitle;
	@FindBy(xpath="//*[@data-target='#create-item']/..//*[.='Add']") private WebElement addLeaveStr;
	@FindBy(xpath="//*[.='Add']/../..//*[@id='leave_code']") private WebElement leavCode;
	@FindBy(xpath="//*[.='Add']/../..//*[@id='leave_format']") private WebElement leavFormat;
	@FindBy(xpath="//*[.='Add']/../..//*[@id='leave_applicable']") private WebElement seleLeavApplicable;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='gender']") private WebElement seleGeneder;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='mpy']") private WebElement maxPerYr;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='mpm']") private WebElement maxPerMoth;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='deduct_salary']/..//*[@class='cr-icon icofont icofont-ui-check ']/..")
	private WebElement seleDeductSal;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='reimbursalbe']/..//*[@class='cr-icon icofont icofont-ui-check ']/..")
	private WebElement seleReimbse;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='accumulatable']/..//*[@class='cr-icon icofont icofont-ui-check ']/..")
	private WebElement seleAccumulatable;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='active_for_request']/..//*[@class='cr-icon icofont icofont-ui-check ']/..")
	private WebElement seleOnlineLeavReqt;
	@FindBy (xpath="//*[.='Add']/../..//*[@id='mad']") private WebElement maxAccumlatableDays;
	@FindBy (xpath="//*[.='Add']/../..//*[.='Submit']") private WebElement submitBtn;

	@FindBy (xpath="//*[@class='view']") private WebElement tableViewData;
	
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='leave_code']") private WebElement editleavCode;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='leave_format']") private WebElement editleavFormat;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='leave_applicable']") private WebElement editseleLeavApplicable;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='gender']") private WebElement editseleGeneder;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='mpy']") private WebElement editmaxPerYr;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='mpm']") private WebElement editmaxPerMoth;
	@FindBy(xpath="//*[.='Edit ']/../..//*[@id='mad']") private WebElement editMaxAccumltDays; 
	@FindBy(xpath="//*[.='Edit ']/../..//*[.='Submit']") private WebElement editsubmitBtn;
	 

	public sal1PayrolLeaveStructurePage() {		
	PageFactory.initElements(driver, this);	
		
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public WebElement addLeaveStr()
	{
		return addLeaveStr;
	}

	public WebElement leavCode()
	{
		return leavCode;
	}
	
	public WebElement leavFormat()
	{
		return leavFormat;
	}
	
	public WebElement seleLeavApplicable()
	{
		return seleLeavApplicable;
	}
	
	public WebElement seleGeneder()
	{
		return seleGeneder;
	}
	
	public WebElement maxPerYr()
	{
		return maxPerYr;
	}
	
	public WebElement maxPerMoth()
	{
		return maxPerMoth;
	}
	
	public WebElement seleDeductSal()
	{
		return seleDeductSal;
	}
	
	public WebElement seleReimbse()
	{
		return seleReimbse;
	}
	
	public WebElement seleAccumulatable()
	{
		return seleAccumulatable;
	}
	
	public WebElement seleOnlineLeavReqt()
	{
		return seleOnlineLeavReqt;
	}
	
	public WebElement maxAccumlatableDays()
	{
		return maxAccumlatableDays;
	}
	
	public WebElement submitBtn()
	{
		return submitBtn;
	}

	public WebElement tableViewData(String id)
	{
		waitForVisibility(tableViewData);
		return tableViewData.findElement(By.xpath("//*[.='"+id+"']"));
	}
	
	public WebElement editBtn(String id)
	{
		waitForVisibility(tableViewData);
		return tableViewData.findElement(By.xpath("//*[.='"+id+"']/..//*[@data-target='#edit-item']"));
	}
	
	public WebElement editleavCode()
	{
		return editleavCode;
	}
	
	public WebElement editleavFormat()
	{
		return editleavFormat;
	}
	
	public WebElement editseleLeavApplicable()
	{
		return editseleLeavApplicable;
	}
	
	public WebElement editseleGeneder()
	{
		return editseleGeneder;
	}
	
	public WebElement editmaxPerYr()
	{
		return editmaxPerYr;
	}
	
	public WebElement editmaxPerMoth()
	{
		return editmaxPerMoth;
	}
	
	public WebElement editMaxAccumltDays()
	{
		return editMaxAccumltDays;
	}
	public WebElement editsubmitBtn()
	{
		return editsubmitBtn;
	}
	
	public WebElement deleteBtn(String id)
	{
		waitForVisibility(tableViewData);
		return tableViewData.findElement(By.xpath("//*[.='"+id+"']/..//*[@class='icofont icofont-ui-delete']"));
	}
	
}
