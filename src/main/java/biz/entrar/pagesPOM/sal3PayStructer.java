package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal3PayStructer extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Pay Structure']") private WebElement pageTitle;
	@FindBy (xpath="//*[@class='btn btn-success float-right']/..//*[.='Add']") private WebElement addBtn;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='pay_code']") private WebElement payCode;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='pay_name']") private WebElement payNam;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='pay_type']") private WebElement payType;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='based_on']") private WebElement basedOn;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='start_date_pay']") private WebElement startDate;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='end_date_pay']") private WebElement endDate;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='pay_applicable']") private WebElement payApplicable;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='texable']/..//*[@class='cr']") private WebElement taxableChck;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='deduct_leave']/..//*[@class='cr']") private WebElement leaveDeduct;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='calculation_on']") private WebElement calculatioN;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='exclude_actual_net']/..//*[@class='cr']") 
	private WebElement excludeActuralAmt;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='seq_slip']") private WebElement seqInSlip;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='upper_limit']") private WebElement upperLimit;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='include_report']/..//*[@class='cr']")
	private WebElement includeInReport;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='include_pre_report']/..//*[@class='cr']")
	private WebElement includePreReprot;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='monthly_allocatable']/..//*[@class='cr']")
	private WebElement montlyAllocat;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='change_all_allocation']/..//*[@class='cr']")
	private WebElement changeAllAllocation;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[@id='formula']//*[@name='formula']")
	private WebElement formula;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[.='Submit']") private WebElement submitBtn;
	
	
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[@id='pay_code']") private WebElement epayCode;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[@id='pay_name']") private WebElement epayNam;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[@id='seq_slip']") private WebElement eseqInSlip;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[@id='upper_limit']") private WebElement eupperLimit;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[@id='formula']//*[@name='formula']")
	private WebElement eformula;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Add']/../..//*[.='×']/*") private WebElement cancleBtn;
	
	@FindBy (xpath="//*[.='QAPay01']/..//*[@class='edit-item tabledit-edit-button btn btn-primary waves-effect waves-light deleteletter1']")
	private WebElement editBtn;
	@FindBy (xpath="//*[@id='myModalLabel']/..//*[.='Edit ']/../..//*[.='Submit']") private WebElement eSubmitBtn;
	
	public sal3PayStructer() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}

	public WebElement addBtn()
	{
		return addBtn;
	}
	public WebElement payCode()
	{
		return payCode;
	}
	public WebElement payNam()
	{
		return payNam;
	}
	public WebElement payType()
	{
		return payType;
	}
	public WebElement basedOn()
	{
		return basedOn;
	}
	public WebElement startDate()
	{
		return startDate;
	}
	public WebElement endDate()
	{
		return endDate;
	}
	public WebElement payApplicable()
	{
		return payApplicable;
	}
	public WebElement taxableChck()
	{
		return taxableChck;
	}
	public WebElement leaveDeduct()
	{
		return leaveDeduct;
	}
	public WebElement calculatioN()
	{
		return calculatioN;
	}
	public WebElement excludeActuralAmt()
	{
		return excludeActuralAmt;
	}
	public WebElement seqInSlip()
	{
		return seqInSlip;
	}
	public WebElement upperLimit()
	{
		return upperLimit;
	}
	public WebElement includeInReport()
	{
		return includeInReport;
	}
	public WebElement includePreReprot()
	{
		return includePreReprot;
	}
	public WebElement montlyAllocat()
	{
		return montlyAllocat;
	}
	public WebElement changeAllAllocation()
	{
		return changeAllAllocation;
	}
	public WebElement formula()
	{
		return formula;
	}
	public WebElement submitBtn()
	{
		return submitBtn;
	}
	
	public WebElement epayCode()
	{
		return epayCode;
	}
	public WebElement epayNam()
	{
		return epayNam;
	}
	public WebElement eseqInSlip()
	{
		return eseqInSlip;
	}
	public WebElement eupperLimit()
	{
		return eupperLimit;
	}
	public WebElement eformula()
	{
		return eformula;
	}
	
	public WebElement cancleBtn()
	{
		return cancleBtn;
	}
	public WebElement editBtn()
	{
		return editBtn;
	}
	public WebElement eSubmitBtn()
	{
		return eSubmitBtn;
	}
	
}
