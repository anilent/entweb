package biz.entrar.pagesPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsAddNewAdmnPage extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[.='Admission Form ']") private WebElement pagTitle;
	@FindBy(xpath="//*[@id='academicyear_id']")	private WebElement joiningYear;
	@FindBy(xpath="//*[@id='interview_date']")	private WebElement interviewDate;
	@FindBy(xpath="//*[@id='invoice_no']")	private WebElement invoiceNo;
	@FindBy(xpath="//*[@id='admission_type']")	private WebElement admissionType;
	@FindBy(xpath="//*[@id='first_name']")	private WebElement firstNam;
	@FindBy(xpath="//*[@id='middle_name']")	private WebElement middleNam;	
	@FindBy(xpath="//*[@id='last_name']")	private WebElement lastNam;
	@FindBy(xpath="//*[@id='gender']")	private WebElement gender;
	@FindBy(xpath="//*[@id='date_of_birth']")	private WebElement dob;
	@FindBy(xpath="//*[@id='aadhar_no']")	private WebElement aadharNo;
	@FindBy(xpath="//*[@id='nationality']")	private WebElement nationality;
	@FindBy(xpath="//*[@id='mother_tongue']")	private WebElement motrTong;
	@FindBy(xpath="//*[@id='religion']")	private WebElement religion;
	@FindBy(xpath="//*[@id='blood_group']")	private WebElement bloodGroup;
	
	@FindBy(xpath="//*[@id='caste']")	private WebElement caste;
	@FindBy(xpath="//*[@class='cr']/..//*[@id='transport_required']/..")	private WebElement transport;
	@FindBy(xpath="//*[@id='school_std_id']")	private WebElement StdClass;
	@FindBy(xpath="//*[@id='seclang']")	private WebElement seleLang;
	@FindBy(xpath="//*[@id='thirdlang']")	private WebElement thirdLang;
	@FindBy(xpath="//*[@id='age']")	private WebElement age;
	@FindBy(xpath="//*[@id='email']")	private WebElement email;
	@FindBy(xpath="//*[@id='mobile']")	private WebElement mobile;
	
	@FindBy(xpath="//*[@id='correspondence_house_num']")	private WebElement AdrsHouseno;
	@FindBy(xpath="//*[@id='correspondence_house_name']")	private WebElement AdrsHousenam;
	@FindBy(xpath="//*[@id='correspondence_street']")	private WebElement AdrsSteet;
	@FindBy(xpath="//*[@id='correspondence_area']")	private WebElement AdrsArea;
	@FindBy(xpath="//*[@id='correspondence_town']")	private WebElement twon;
	@FindBy(xpath="//*[@id='correspondence_city']")	private WebElement city;
	@FindBy(xpath="//*[@id='correspondence_state']")	private WebElement state;
	@FindBy(xpath="//*[@id='correspondence_country']")	private WebElement country;
	@FindBy(xpath="//*[@id='correspondence_zip']")	private WebElement pincode;
	@FindBy(xpath="//*[@id='dist_frm_school']")	private WebElement distance;
	
	@FindBy(xpath="//*[@id='father_first_name']")	private WebElement fatherNam;
	@FindBy(xpath="//*[@id='mother_first_name']")	private WebElement motherNam;
	@FindBy(xpath="//*[@id='tc_submitted']")	private WebElement tcSubt;
	@FindBy(xpath="//*[@id='save_admission_form']")	private WebElement submitBtn;
	
	
	@FindBy(xpath="//*[@id='fcte_test']") private WebElement test1;
	@FindBy(xpath="//*[@id='fact_test22']") private WebElement test2;
	@FindBy(xpath="//*[@id='fact_test33']") private WebElement test3;
	@FindBy(xpath="//*[@id='fact_test44']") private WebElement test4;
	@FindBy(xpath="//*[@id='fact_test55']") private WebElement test5;
	@FindBy(xpath="//*[@id='fact_test66']") private WebElement test6;
	
	
	
	/*@FindBy(xpath="//*[@id='religion']")	private WebElement religion;
	@FindBy(xpath="//*[@id='religion']")	private WebElement religion;
	@FindBy(xpath="//*[@id='religion']")	private WebElement religion;
	@FindBy(xpath="//*[@id='religion']")	private WebElement religion;
	*/
	
	
	
	//initializing the page object
	public AdmsAddNewAdmnPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public String pagTitle() 
	{
		return getAttribut(pagTitle, "Text", "Page Title Verification");
	}
	
	public AdmsAddNewAdmnPage joiningYear(String year)
	{
		click(joiningYear);
		selectdropdownTxt(joiningYear, year);
		click(joiningYear);
		return this;
	}
	
	public AdmsAddNewAdmnPage interviewDate(String text)
	{
		sendKeys(interviewDate, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage admissionType(String year)
	{
		click(admissionType);
		selectdropdownTxt(admissionType, year);
		click(admissionType);
		return this;
	}
	
	public AdmsAddNewAdmnPage invoiceNo(String text)
	{
		sendKeys(invoiceNo, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage firstNam(String text)
	{
		sendKeys(firstNam, text);
		return this;
	}
	public AdmsAddNewAdmnPage middleNam(String text)
	{
		sendKeys(middleNam, text);
		return this;
	}
	public AdmsAddNewAdmnPage lastNam(String text)
	{
		sendKeys(lastNam, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage gender(String year)
	{
		click(gender);
		selectdropdownTxt(gender, year);
		click(gender);
		return this;
	}
	
	public AdmsAddNewAdmnPage dob(String text)
	{
		sendKeys(dob, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage aadharNo(String text)
	{
		sendKeys(aadharNo, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage nationality(String text)
	{
		sendKeys(nationality, text);
		return this;
	}
	public AdmsAddNewAdmnPage motrTong(String text)
	{
		sendKeys(motrTong, text);
		return this;
	}
	public AdmsAddNewAdmnPage religion(String text)
	{
		sendKeys(religion, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage bloodGroup(int year)
	{
		click(bloodGroup);
		selectdropdown(bloodGroup, year);
		click(bloodGroup);
		return this;
	}
	
	public AdmsAddNewAdmnPage StdClass(int assindx)
	{
		click(StdClass);
		selectdropdown(StdClass, assindx);
		return this;
	}
	
	public AdmsAddNewAdmnPage email(String text)
	{
		sendKeys(email, text);
		return this;
	}
	public AdmsAddNewAdmnPage mobile(String text)
	{
		sendKeys(mobile, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage AdrsHouseno(String text)
	{
		sendKeys(AdrsHouseno,text);
		return this;
	}
	
	public AdmsAddNewAdmnPage AdrsHousenam(String text)
	{
		sendKeys(AdrsHousenam,text);
		return this;
	}
	public AdmsAddNewAdmnPage AdrsSteet(String text)
	{
		sendKeys(AdrsSteet,text);
		return this;
	}
	public AdmsAddNewAdmnPage AdrsArea(String text)
	{
		sendKeys(AdrsArea,text);
		return this;
	}
	public AdmsAddNewAdmnPage twon(String text)
	{
		sendKeys(twon,text);
		return this;
	}
	public AdmsAddNewAdmnPage city(String text)
	{
		sendKeys(city,text);
		return this;
	}
	public AdmsAddNewAdmnPage state(String text)
	{
		sendKeys(state,text);
		return this;
	}
	public AdmsAddNewAdmnPage country(String text)
	{
		sendKeys(country,text);
		return this;
	}
	public AdmsAddNewAdmnPage pincode(String text)
	{
		sendKeys(pincode,text);
		return this;
	}
	public AdmsAddNewAdmnPage distance(String text)
	{
		sendKeys(distance,text);
		return this;
	}
	
	
	
	
	public AdmsAddNewAdmnPage fatherNam(String text)
	{
		sendKeys(fatherNam, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage motherNam(String text)
	{
		sendKeys(motherNam, text);
		return this;
	}
	
	public AdmsAddNewAdmnPage tcSubt(String year)
	{
		click(tcSubt);
		selectdropdownTxt(tcSubt, year);
		click(tcSubt);
		return this;
	}
	
	public AdmsNewAdmsViewPage submit()
	{
		click(submitBtn);
		return new AdmsNewAdmsViewPage(driver);
	}
	

}

