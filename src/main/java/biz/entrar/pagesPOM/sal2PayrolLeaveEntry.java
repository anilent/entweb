package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal2PayrolLeaveEntry extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Leave Entry']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='calendar_id']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='employee_id']") private WebElement empId;
	@FindBy (xpath="//*[@id='leave_type']") private WebElement seleLeaveTyp;
	@FindBy (xpath="//*[@id='from_date']") private WebElement fromDate;
	@FindBy (xpath="//*[@id='to_date']") private WebElement toDate;
	@FindBy (xpath="//*[@id='days']") private WebElement days;
	@FindBy (xpath="//*[@id='remark']") private WebElement remarks;
	@FindBy (xpath="//*[@id='leave_entry']") private WebElement addLeavEtnry;
	@FindBy (xpath="//*[.='TST01E']/..//*[@class='icofont icofont-ui-edit']") private WebElement editleav;
	
	@FindBy (xpath="//*[@id='update_btn']") private WebElement updated;
	@FindBy (xpath="//*[.='Leave Details Edit']") private WebElement pageTitleEdit;

	public sal2PayrolLeaveEntry() {
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
	
	public WebElement empId()
	{
		return empId;
	}
	
	public WebElement seleLeaveTyp()
	{
		return seleLeaveTyp;
	}
	
	public WebElement fromDate()
	{
		return fromDate;
	}
	
	public WebElement toDate()
	{
		return toDate;
	}
	
	public WebElement days()
	{
		return days;
	}
	
	public WebElement remarks()
	{
		return remarks;
	}
	
	public WebElement addLeavEtnry()
	{
		return addLeavEtnry;
	}
	
	public WebElement editleav()
	{
		return editleav;
	}
	public WebElement updated()
	{
		return updated;
	}
	public WebElement pageTitleEdit()
	{
		return pageTitleEdit;
	}

}
