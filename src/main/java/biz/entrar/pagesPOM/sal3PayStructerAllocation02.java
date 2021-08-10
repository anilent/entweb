package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal3PayStructerAllocation02 extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pageTitle;
	
	@FindBy (xpath="//*[@id='calendar_id']") private WebElement seleYear;
	@FindBy (xpath = "//*[@id='category']") private WebElement categroy;
	@FindBy (xpath="//*[@id='employee_id']") private WebElement seleTeacher;
	@FindBy (xpath ="//*[@value='QAPay01']/../..//*[@id='check_all']/..//*[@class='cr']") private WebElement seleCheckbox;
	@FindBy (xpath="//*[@id='pay_allocate']") private WebElement allocateBtn;
	@FindBy (xpath="//*[.='QAPay01']/..//*[@class='tabledit-delete-button btn btn-danger waves-effect waves-light delete ']")
	private WebElement deleteBtn;
	
	 
	public sal3PayStructerAllocation02() {
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
	public WebElement categroy()
	{
		return categroy;
	}
	public WebElement seleTeacher()
	{
		return seleTeacher;
	}
	public WebElement seleCheckbox()
	{
		return seleCheckbox;
	}
	public WebElement allocateBtn()
	{
		return allocateBtn;
	}

	public WebElement deleteBtn()
	{
		return deleteBtn;
	}
}
