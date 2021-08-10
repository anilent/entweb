package biz.entrar.pagesPOM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import biz.entrarBase.BaseTest;

public class ProcessAdmissonPage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@id='counsellor']")
	private WebElement counsellor;
	
	@FindBy(xpath="//*[@id='counsellor_remark']")
	private WebElement counselrRemarks;
	
	@FindBy(xpath="//*[@id='test_taken_by']")
	private WebElement seleTecrTest;
	
	@FindBy(xpath="//*[@id='test_result']")
	private WebElement testResult;
	
	@FindBy (xpath="//*[@id='process_status']")
	private WebElement processStatus;
	
	@FindBy (xpath="//*[@id='adm_status']")
	private WebElement admStatus;
	
	@FindBy (xpath="//*[@id='add_enquiry']")
	private WebElement addEnquiry;
	
	@FindBy (xpath="//*[@id='I_followup_by']")
	private WebElement fistFollup;
	@FindBy (xpath="//*[@id='I_followup_remark']")
	private WebElement fistFollupRemk;
	@FindBy (xpath="//*[@id='I_followup_date']")
	private WebElement fistFollupDate;
	
	@FindBy (xpath="//*[.='Fill Admission Form ']")
	private WebElement fillAdmForm;
	
	//initializing the page object
	public ProcessAdmissonPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public ProcessAdmissonPage counsellor(int assindx)
	{
		selectdropdown(counsellor, assindx);
		return this;
	}
	
	public ProcessAdmissonPage counselrRemarks(String passw)
	{
		//password.clear();
		sendKeys(counselrRemarks,passw);
		return this;
	}
	
	public ProcessAdmissonPage seleTecrTest(int assindx)
	{
		selectdropdown(seleTecrTest, assindx);
		return this;
	}
	
	public ProcessAdmissonPage testResult(String text)
	{
		sendKeys(testResult, text);
		return this;
	}
	
	public ProcessAdmissonPage processStatus(String text)
	{
		selectdropdownTxt(processStatus,text);
		return this;
	}
	
	
	public ProcessAdmissonPage fistFollup(int assindx)
	{
		selectdropdown(fistFollup, assindx);
		return this;
	}
	
	public ProcessAdmissonPage fistFollupRemk(String text)
	{
		sendKeys(fistFollupRemk, text);
		return this;
	}
	
	public ProcessAdmissonPage fistFollupDate(String text)
	{
		sendKeys(fistFollupDate, text);
		return this;
	}
	public ProcessAdmissonPage admStatus(String text)
	{
		selectdropdownTxt(admStatus, text);
		return this;
	}
	
//	public addEnquiry()
//	{
//		click(addEnquiry);
//		return 
//	}
}
