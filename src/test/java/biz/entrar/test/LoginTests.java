package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.pagesPOM.AdmsnApAddEnquiryFrom;
import biz.entrar.pagesPOM.AdnProccEnquiryFrom;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrar.pagesPOM.GeneratStdRegNoPage;
import biz.entrar.pagesPOM.HomePage;
import biz.entrar.pagesPOM.InvoicePage;
import biz.entrar.pagesPOM.Login_page;
import biz.entrar.pagesPOM.MiscFeeCollectionPage;
import biz.entrar.pagesPOM.ProcessAdmissonPage;
import biz.entrar.pagesPOM.SubmissonAdnsFormPage;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;


import org.testng.annotations.AfterClass;

public class LoginTests extends BaseTest {
	
	HomePage hompag;
	Login_page loginpg;
	DashboardPage dashbord;
	AdnProccEnquiryFrom enquiryFormr;
	AdmsnApAddEnquiryFrom addenqryfrm;
	MiscFeeCollectionPage mislfee;
	InvoicePage invocepage;
	ProcessAdmissonPage prcsAdmFrm;
	SubmissonAdnsFormPage subtAdnFrm;
	GeneratStdRegNoPage genrtStdRegNo;
 
  @BeforeClass
  public void beforeClass() throws Exception {
//	  initialization("admin");
//	  System.out.println("------------ LoginTest Class Initializing the Driver------");
  }

  @AfterClass
  public void afterClass() {
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  //System.out.println("before test method");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @Parameters({"browser","port"})
  @Test
  public void initialization(String browser, String port) throws Exception
  {
	  System.out.println(browser+port);
	  initialization("admin",browser,port);
	  System.out.println("------------ LoginTest Class Initializing the Driver------");
  }
  @Test
  public void validCredentialsAdmin() throws Exception {
	  System.out.println("------------ Valid Login Validation TestCse -------");
	  
	  hompag=new HomePage(driver);
	    loginpg =new Login_page(driver);  
//	    hompag.home();
//	    hompag.features();
//	    Assert.assertEquals("Features and Benefits", hompag.featureTitle());
//	    hompag.contactUs();
	//  loginpg = hompag.login();
	    
	    loginpg.username(EnvironmentsData.usernameAdmin);
	    loginpg.password(EnvironmentsData.passwordAdmin);
	    //dashbord=loginpg.loginButton();
  }

  
  @Test
  public void AddEnqiryForm() throws Exception
  {
	  System.out.println("------------ Add new Enqiry Form TestCase -----------");
	  
	  Thread.sleep(3000);
		dashbord.admission();
		dashbord.adminssionprocess();
		enquiryFormr=dashbord.enquiryForm();
		
		//addenqryfrm=enquiryFormr.addenqury();
		/*addenqryfrm.entryDate(ExcelTestDataHandler.getDate());
		addenqryfrm.SeleAcadmiyer("2020-2021");
		addenqryfrm.enquriyRefNo("AUT/"+ExcelTestDataHandler.dms());
		String firstname=ExcelTestDataHandler.firstname();
		addenqryfrm.stdFirstNam(firstname);*/
		
//		addenqryfrm.stdMiddlNam("Auto");
//		String lstnam=ExcelTestDataHandler.secondname();
//		addenqryfrm.stdLstNam(lstnam);
		
		/*addenqryfrm.dob("09/14/2010");
		addenqryfrm.gender("Male");
		addenqryfrm.scolStdId("X");
		addenqryfrm.fatherName("Test Father");
		String mobil=mobilenum();
		addenqryfrm.fathMobile(mobil);
		addenqryfrm.motherName("Test Mother");
		String mobil1=mobilenum();
		addenqryfrm.motherMobile(mobil1);
		addenqryfrm.fatherEmail(ExcelTestDataHandler.emil());
		addenqryfrm.motherEmail(ExcelTestDataHandler.emil());
		addenqryfrm.prevScolName("entrar schoole");
		addenqryfrm.remarks("Test Remarks");
		enquiryFormr=addenqryfrm.addEnuiryBtn();*/	
		
		enquiryFormr=new AdnProccEnquiryFrom(driver);
		Thread.sleep(5000);
		enquiryFormr.academicyearid("2020-2021");
		Thread.sleep(5000);
		enquiryFormr.search("venkat karthikeya rachpupi");
		Thread.sleep(3000);
		enquiryFormr.search("venkat karthikeya rachpupi");
  }
 
  @Test
  public void FeeCollection() throws Exception
  {
	  System.out.println("------------ Fee Collection TestCase----------");
	  /*Thread.sleep(3000);
		dashbord.admission();
		dashbord.adminssionprocess();
		enquiryFormr=dashbord.enquiryForm();*/
		Thread.sleep(3000);
	  
		enquiryFormr=new AdnProccEnquiryFrom(driver);
		Thread.sleep(4000);
		mislfee=enquiryFormr.feeCollection();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    mislfee.feeReason("CA FEE (2020-2021)");
	    Thread.sleep(2000);
	    mislfee.actualAmount();
	    mislfee.modeOfPayment("Cheque");
	    mislfee.chequeNo("cheque1548");
	    mislfee.bankname("KARNATAKA BANK LTD");
	    mislfee.note("Testing Auto Note");
	    invocepage= mislfee.createInvoice();
	    Thread.sleep(3000);
	    invocepage.ReceiptNo();
	    invocepage.StdName();
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
  }
  
  @Test
  public void ProcessEnqrForm() throws Exception
  {
	  System.out.println("------------ Process Enauiry Form testCase---------");
	  Thread.sleep(3000);
	  enquiryFormr=new AdnProccEnquiryFrom(driver);
	  Thread.sleep(4000);
	  
	  //JavascriptExecutor je =(JavascriptExecutor) driver;
	 // WebElement ele=driver.findElement(By.xpath("//*[.='Fee Collection']/*/../..//*[17]/*"));
	 // je.executeScript("arguemnts[0].scrollIntoView(true)",ele);
	  
	 /* EventFiringWebDriver efwe=new EventFiringWebDriver(driver);
		efwe.executeScript("document.querySelector('div[class='table-responsive']').scrollLeft=500");*/
	  
	  enquiryFormr.processAdmission();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*Thread.sleep(2000);
	  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));

	    prcsAdmFrm=new ProcessAdmissonPage(driver);
	    prcsAdmFrm.counsellor(1);
	    prcsAdmFrm.counselrRemarks("Test remarks counseller");
	    prcsAdmFrm.seleTecrTest(1);
	    prcsAdmFrm.testResult("Test Result remarks");
	    prcsAdmFrm.processStatus("Yes");
	    prcsAdmFrm.fistFollup(1);
	    prcsAdmFrm.fistFollupRemk("First Follwoup Remarks");
	    prcsAdmFrm.fistFollupDate("09/14/2020");
	    prcsAdmFrm.admStatus("Yes");
	    //here it's going to blank page
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));*/
  }
  
  @Test
  public void SubmissionAdmForm() throws Exception
  {
	  System.out.println("------------ Submission Admission Form TestCase----------------");
	  dashbord.admission();
	  dashbord.adminssionprocess();
	  subtAdnFrm=dashbord.subissionAdmissFrom();
	  subtAdnFrm.batchYear("2020-2021");
	  subtAdnFrm.seleStandard("X");
	  subtAdnFrm.searchData();
	  subtAdnFrm.stdName();	
	  subtAdnFrm.localityCode(1);
	  subtAdnFrm.processReadio();
	  genrtStdRegNo=subtAdnFrm.generateRegNo();
	  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	  genrtStdRegNo.generateRegNo();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();	
	  driver.close();
	  driver.switchTo().window(tabs2.get(0));
  }
  
  @Test
  public void ScheduleEntranceTest()
  {
	  System.out.println("------------ Schedule Entrance Test TestCase----------------");
	  dashbord.admission();
	  dashbord.adminssionprocess();
	  dashbord.scheduleEntTest();
  }
}
