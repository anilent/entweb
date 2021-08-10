package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import biz.entrarBase.BaseTest;

public class AdmsnApAddEnquiryFrom extends BaseTest{
	
	@FindBy (xpath="//*[@id='entry_date']")
	private WebElement entryDate;
	@FindBy (xpath="//*[@id='academicyear_id']")
	private WebElement SeleAcadmiyer;
	@FindBy (xpath="//*[@id='enquiry_ref_no']")
	private WebElement enquriyRefNo;
	@FindBy (xpath="//*[@id='student_first_name']")
	private WebElement stdFirstNam;
	@FindBy (xpath="//*[@id='student_middle_name']")
	private WebElement stdMiddlNam;
	@FindBy (xpath="//*[@id='student_last_name']")
	private WebElement stdLstNam;
	
	@FindBy (xpath="//*[@id='dob']")
	private WebElement dob;
	
	@FindBy (xpath="//*[@id='gender']")
	private WebElement gender;
	@FindBy (xpath="//*[@id='school_std_id']")
	private WebElement scolStdId;
	
	@FindBy (xpath="//*[@id='father_name']")
	private WebElement fatherName;
	@FindBy (xpath="//*[@id='father_mobile']")
	private WebElement fathMobile;
	
	@FindBy (xpath="//*[@id='mother_name']")
	private WebElement motherName;
	@FindBy (xpath="//*[@id='mother_mobile']")
	private WebElement motherMobile;
	
	@FindBy (xpath="//*[@id='father_email']")
	private WebElement fatherEmail;
	@FindBy (xpath="//*[@id='mother_email']")
	private WebElement motherEmail;
	@FindBy (xpath="//*[@id='prev_school']")
	private WebElement prevScolName;
	@FindBy (xpath="//*[@id='remark']")
	private WebElement remarks;
	@FindBy (xpath="//*[@id='add_enquiry']")
	private WebElement addEnuiryBtn;
	
	
	public AdmsnApAddEnquiryFrom(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public AdmsnApAddEnquiryFrom entryDate(String dte)
	{
		sendKeys(entryDate, dte);
		return this;
	}
	
	public AdmsnApAddEnquiryFrom SeleAcadmiyer(String acyer)
	{
		click(SeleAcadmiyer);
		Select yer=new Select(SeleAcadmiyer);
		yer.selectByVisibleText(acyer);
		return this;
	}
	
	public AdmsnApAddEnquiryFrom enquriyRefNo(String enqNo)
	{
		sendKeys(enquriyRefNo, enqNo);
		return this;
	}
	public AdmsnApAddEnquiryFrom stdFirstNam(String stdFistname)
	{
		sendKeys(stdFirstNam, stdFistname);
		return this;
	}
	public AdmsnApAddEnquiryFrom stdMiddlNam(String middlenam)
	{
		sendKeys(stdMiddlNam, middlenam);
		return this;
	}
	public AdmsnApAddEnquiryFrom stdLstNam(String lstname)
	{
		sendKeys(stdLstNam, lstname);
		return this;
	}
	
	
	public AdmsnApAddEnquiryFrom dob(String dobstr)
	{
		sendKeys(dob, dobstr);
		return this;
	}
	
	public AdmsnApAddEnquiryFrom gender(String gndr)
	{
		click(gender);
		Select yer=new Select(gender);
		yer.selectByVisibleText(gndr);
		return this;
	}
	public AdmsnApAddEnquiryFrom scolStdId(String id)
	{
		click(scolStdId);
		Select yer=new Select(scolStdId);
		yer.selectByVisibleText(id);
		return this;
	}
	
	public AdmsnApAddEnquiryFrom fatherName(String dobstr)
	{
		sendKeys(fatherName, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom fathMobile(String dobstr)
	{
		sendKeys(fathMobile, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom motherName(String dobstr)
	{
		sendKeys(motherName, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom motherMobile(String dobstr)
	{
		sendKeys(motherMobile, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom fatherEmail(String dobstr)
	{
		sendKeys(fatherEmail, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom motherEmail(String dobstr)
	{
		sendKeys(motherEmail, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom prevScolName(String dobstr)
	{
		sendKeys(prevScolName, dobstr);
		return this;
	}
	public AdmsnApAddEnquiryFrom remarks(String dobstr)
	{
		sendKeys(remarks, dobstr);
		return this;
	}
	
	public AdnProccEnquiryFrom addEnuiryBtn()
	{
		click(addEnuiryBtn);
		return new AdnProccEnquiryFrom(driver);
	}
}
