package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal2PayrolLeaveAllocationPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Leave Allocation']") private WebElement pageTitl;
	@FindBy (xpath="//*[@id='accountingdivision']") private WebElement selAccoutnDevision;
	@FindBy (xpath="//*[@id='department']") private WebElement seleDepartment;
	@FindBy (xpath="//*[@id='calendar_id']") private WebElement seleCalendar;
	@FindBy (xpath="//*[@id='leave']") private WebElement seleLeaveTyp;
	@FindBy (xpath="//*[@name='allocate']") private WebElement allocatBtn;
	@FindBy (xpath="//*[@id='allocated_leave']") private WebElement alloctLeaveBtn;
	
	@FindBy (xpath="//*[@class='alert alert-danger background-danger']/..") private WebElement dataNotFoundMsg;
	@FindBy (xpath="//*[.='DPSE/05/14/345']/..//*[@id='check_all[]']") private WebElement enterDays;
	//@FindBy (xpath="")
 	
	public sal2PayrolLeaveAllocationPage() 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitl()
	{
		return pageTitl;
	}
	
	public WebElement selAccoutnDevision()
	{
		return selAccoutnDevision;
	}
	public WebElement seleDepartment()
	{
		return seleDepartment;
	}
	public WebElement seleCalendar()
	{
		return seleCalendar;
	}
	public WebElement seleLeaveTyp()
	{
		return seleLeaveTyp;
	}
	public WebElement allocatBtn()
	{
		return allocatBtn;
	}
	
	public sal2PayrolLeaveAllocationPage2  alloctLeaveBtn()
	{
		click(alloctLeaveBtn);
		return new sal2PayrolLeaveAllocationPage2();
	}
	
	public WebElement dataNotFoundMsg()
	{
		return dataNotFoundMsg;
	}
	
}
