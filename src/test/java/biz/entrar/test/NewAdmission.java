package biz.entrar.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.pagesPOM.AdmsRChequeReport;
import biz.entrar.pagesPOM.AdmsRCountReport;
import biz.entrar.pagesPOM.AdmsRDetailReport;
import biz.entrar.pagesPOM.AdmsRFeeChequeReconciliationReport;
import biz.entrar.pagesPOM.AdmsRFeeDetilReport;
import biz.entrar.pagesPOM.AdmsRFeeDueReport;
import biz.entrar.pagesPOM.AdmsRFeeInvcCancelReport;
import biz.entrar.pagesPOM.AdmsAddNewAdmnPage;
import biz.entrar.pagesPOM.AdmsCreateStdAccount;
import biz.entrar.pagesPOM.AdmsFeeCollection;
import biz.entrar.pagesPOM.AdmsNewAdmsViewPage;
import biz.entrar.pagesPOM.AdmsRAdmPointwiseReport;
import biz.entrar.pagesPOM.AdmsRAdmissionReport;
import biz.entrar.pagesPOM.AdmsRCancelReport;
import biz.entrar.pagesPOM.AdmsRFeeReport;
import biz.entrar.pagesPOM.AdmsRInternalStdStreamReport;
import biz.entrar.pagesPOM.AdmsRPointReport;
import biz.entrar.pagesPOM.AdmsRRegFormCountReport;
import biz.entrar.pagesPOM.AdmsRRegFormProcessFeeReport;
import biz.entrar.pagesPOM.AdmsRRegFormSMSReport;
import biz.entrar.pagesPOM.AdmsRSubmitFormRegReport;
import biz.entrar.pagesPOM.AdmsStdSearch;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrar.utils.ExcelTestDataHandler;
import biz.entrarBase.BaseTest;

public class NewAdmission extends BaseTest {
	DashboardPage dashbrd;
	AdmsNewAdmsViewPage viewpage;
	AdmsAddNewAdmnPage addnew;
	AdmsFeeCollection feecoll;
	AdmsCreateStdAccount crtAcct;
	AdmsStdSearch srchStd;
	AdmsRFeeReport admfeeRrt;
	AdmsRChequeReport admchequeRrt;
	AdmsRCountReport admCountRrt;
	AdmsRAdmissionReport admAdmissRrt;
	AdmsRDetailReport admsDetlRprt;
	AdmsRFeeDetilReport admsFeeDetlRrt;
	AdmsRCancelReport admsCancelRrt;
	AdmsRFeeInvcCancelReport admfeeInvcCacleRt;
	AdmsRSubmitFormRegReport admSubFormRept;
	AdmsRRegFormCountReport admRegCountRrt;
	AdmsRRegFormProcessFeeReport admRegProcessFeeRrt;
	AdmsRRegFormSMSReport admsRegFormSMSRrt;
	AdmsRAdmPointwiseReport admspointwiseRrt;
	AdmsRFeeChequeReconciliationReport feecheqReconRrt;
	AdmsRInternalStdStreamReport intrnalStdStremRrt;
	AdmsRFeeDueReport feeDueRrt;
	AdmsRPointReport pointsRrt;
	
	@BeforeClass
	  public void beforeClass() throws Exception {
		
		System.out.println("------------ Admission TestCases ----------");
		  dashbrd =new DashboardPage(driver);
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  public String nam;
  @Test
  public void AddNewAdmission() throws Exception {
	  
	  System.out.println("------------ Adding New Admission TestCase ------------");
	  dashbrd.admission();
	  viewpage=dashbrd.newAdmissions();
	  AssertValidation(viewpage.pageTitle(), "New Admissions");
	  addnew=viewpage.addAdm();
	  Assert.assertEquals(addnew.pagTitle(), "Admission Form");
	  addnew.joiningYear(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 4, 1));
	  addnew.interviewDate(ExcelTestDataHandler.getDate());
	  addnew.invoiceNo(ExcelTestDataHandler.firstname());
	  addnew.admissionType(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 5, 1));
	  nam=ExcelTestDataHandler.firstname();
	  
	  addnew.firstNam(nam);
	  //addnew.middleNam("Admn");
	  //addnew.lastNam("QA");
	  addnew.gender("Male");
	  String dte=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 6, 1);
	  String dateDOB=dte.replaceAll("'", "");
	  addnew.dob(dateDOB);
	  addnew.aadharNo(ExcelTestDataHandler.aadahnum());
	  addnew.nationality(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 17, 1));
	  addnew.bloodGroup(3);
	  WebElement ele = driver.findElement(By.xpath("//*[@id='caste']"));
	  scrolling(ele);
	  addnew.StdClass(9);
	  addnew.email(ExcelTestDataHandler.emil());
	  //addnew.mobile(mobilenum());
	  addnew.mobile("8904556692");
	  addnew.AdrsHouseno(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 10, 1));
	  addnew.AdrsHousenam(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 11, 1));
	  addnew.AdrsSteet(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 12, 1));
	  addnew.AdrsArea(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 13, 1));
	  addnew.twon(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 14, 1));
	  addnew.city(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 15, 1));
	  addnew.state(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 16, 1));
	  addnew.country(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 17, 1));
	  addnew.pincode(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 18, 1));
	  addnew.distance(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 19, 1));
	  addnew.fatherNam(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 7, 1));
	  addnew.motherNam(ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 8, 1));
	  addnew.tcSubt("Yes");
	  addnew.submit();
	  System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
      System.out.println("Added a new Admission with Student Name is "+nam+".");
  }
 
  String nams;
  @Test
  public void ConformNewAdmin()
  {
	  System.out.println("------------ Conforming New Admissions TestCase ----------");
	  nams=nam+"  ";
	  AdmsNewAdmsViewPage viewpage = new AdmsNewAdmsViewPage(driver);
	  List<WebElement> header=driver.findElements(By.xpath("//thead//th"));
	  List<WebElement> StdDeils= driver.findElements(By.xpath("//*[.='"+nams+"']/..//td"));
	  for (int i = 0; i < header.size(); i++) {
		  System.out.println(header.get(i).getText()+" - "+StdDeils.get(i).getText());	
	}
	  WebElement selconf = driver.findElement(By.xpath("//*[.='"+nams+"']/..//td[12]/*"));
	  click(selconf);
	  //viewpage.selectReadio();
	  viewpage.ConfirmAction("Confirm Admission");
	  viewpage.ConfirmAms();
	  System.out.println("Admission Confirm "+nams+" Student");
  }
  
  @Test
  public void FeeCollection() throws Exception
  {
	  System.out.println("------------ Fee Collectionn TestCase -------------");
	  System.out.println("Fee Collecting for "+nams+" Student");
	  WebElement collectFee = driver.findElement(By.xpath("//*[.='"+nams+"']/..//*[.='Collect Fee']/*"));
	  click(collectFee);
	  feecoll=new AdmsFeeCollection(driver);
	  feecoll.Seleformat(1);
	  feecoll.chequeNum("78484444");
	  feecoll.cheqDate("10/06/2020");
	  feecoll.bankNam(3);
	  feecoll.note("testing");
	  feecoll.submitPayment();
	  Thread.sleep(3000);
/*	  System.out.println("test1");
	  driver.navigate().refresh();
	  driver.navigate().refresh();
	  
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.ESCAPE).build().perform();
	  action.sendKeys(Keys.ESCAPE).perform();	
	  System.out.println("test1");
	  Thread.sleep(3000);
	  System.out.println("test2");*/
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ESCAPE);
	  robot.keyRelease(KeyEvent.VK_ESCAPE);
  }
  
  @Test
  public void CreateStdAccounts() throws Exception
  {
	  System.out.println("------------ Create Student Accounts -------------");
	  String namL=nam+" ";
	  System.out.println("Student Name : "+namL);
	  //String sticnam="TEST154405 ";
	  Thread.sleep(2000);
	  dashbrd.admission();
	  Thread.sleep(2000);
	  crtAcct =dashbrd.createStdAccounts();
	  Thread.sleep(1000);
	  AssertValidation(crtAcct.pageTitle(), "Student Accounts Creation From Confirmed admissions");
	  crtAcct.SeleStandards("IX");
	  crtAcct.SeleSection(2);
	  Thread.sleep(2000);
	  WebElement chckbox=driver.findElement(By.xpath("//*[.='"+namL+"']/..//td[8]//*[@class='cr']"));
	  
	  chckbox.click();
	  Thread.sleep(2000);
	  crtAcct.CreateAccounts();
  }
  
  @Test
  public void SearchStudent()
  {
	  System.out.println("------------ Search Student TestCase -----------------");
	  dashbrd.search();
	  srchStd=dashbrd.SrhStudent();
	  AssertValidation(srchStd.pageTitle(), "Student Search");
	  srchStd.openDrop();
	  srchStd.SeleClass("IX");
	  srchStd.SeleSection("B");
	  srchStd.searchBtn();
  }
  
  @Test
  public void FeeReports() throws Exception 
  {
	  System.out.println("------------ Admission Fee Reports TestCase ------------------");
	  	dashbrd.admission();
	  	dashbrd.ReportsBtn();
	  	Thread.sleep(2000);
	  	admfeeRrt=dashbrd.AdmFeeRprt();
	  	AssertValidation(admfeeRrt.pageTitle(), "Admission Fee Report");
	  	admfeeRrt.AcademicYear("2020-2021");
	  	admfeeRrt.Standard("IX");
	  	admfeeRrt.FromDate("10/06/2020");
	  	admfeeRrt.ToDate("10/07/2020");
	  	admfeeRrt.SearchBtn();
	  	admfeeRrt.totalCount();
  }
  
  @Test
  public void FeeChequeReport() throws Exception
  {
	  System.out.println("------------ Admission Cheque Fee Report TestCase -------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	  admchequeRrt=dashbrd.AdmChqRprt();
	  AssertValidation(admchequeRrt.pageTitle(), "Admission Fee Cheque Report");
	  admchequeRrt.frmDate("10/07/2020");
	  admchequeRrt.toDate("10/08/2020");
	  admchequeRrt.BnkSeltAll();
	  admchequeRrt.AllahabadBnk();
	  admchequeRrt.FilterBtn();
  }
  
  @Test
  public void AdmsCountReport() throws Exception
  {
	  System.out.println("------------ Admission Count Report TestCase ----------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	  admCountRrt=dashbrd.AdmCountRprt();
	  admfeeRrt=new AdmsRFeeReport(driver);
	  admCountRrt.year("2020-2021");
	  admfeeRrt.FromDate("10/06/2020");
	  admfeeRrt.ToDate("10/09/2020");
	  admCountRrt.getCountBtn();
	  admCountRrt.totlaStudCoutn();
	  admCountRrt.totlaOvralCount();	  
  }
  
  @Test
  public void AdmsReport() throws Exception
  {
	  System.out.println("------------ Admission Report TestCase ----------------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	  admAdmissRrt=dashbrd.AdmissionRprt();
	  String actualTxt=admAdmissRrt.admissionReportTitle();
	  AssertValidation(actualTxt,"Admission Report");//(actualText, expcetedText)
	  AdmsRFeeReport admfeeRrt1=new AdmsRFeeReport(driver);
	  admfeeRrt1.AcademicYear("2020-2021");
	  admfeeRrt1.Standard("IX");
	  admfeeRrt1.FromDate("10/06/2020");
	  admfeeRrt1.ToDate("10/09/2020");
	  admfeeRrt1.SearchBtn();
	  //admAdmissRrt.searchfield(nams);
	  System.out.println(admAdmissRrt.totalRecords());
	  admAdmissRrt.searchfield("TEST081052  ");
	  admAdmissRrt.headerTitle();
	  admAdmissRrt.stdNams();
  }
  
  @Test
  public void AdmsDetailsReport() throws Exception
  {
	  System.out.println("------------ Admission Detials Report TestCase ---------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	 admsDetlRprt =dashbrd.AdmDetilReport();
	 Thread.sleep(1000);
	 AssertValidation(admsDetlRprt.admissionReportTitle(), "Admission Report");
	  AdmsRFeeReport admfeeRrt1=new AdmsRFeeReport(driver);
	  admfeeRrt1.AcademicYear("2020-2021");
	  admfeeRrt1.Standard("IX");
	  admfeeRrt1.FromDate("10/06/2020");
	  admfeeRrt1.ToDate("10/09/2020");
	  admfeeRrt1.SearchBtn();
	  admsDetlRprt.totalRecords();
	  Thread.sleep(3000);
  }
  
  @Test
  public void AdmsFeeDtlReport() throws Exception
  {
	  System.out.println("------------ Admission Fee Detials Report TestCase ----------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	  admsFeeDetlRrt=dashbrd.AdmsFeeDtlRprt();
	  Thread.sleep(1000);
	  AssertValidation(admsFeeDetlRrt.pageTitle(), "Admission Fee Report");
	  AdmsRFeeReport admfeeRrt1=new AdmsRFeeReport(driver);
	  admfeeRrt1.AcademicYear("2020-2021");
	  admfeeRrt1.Standard("IX");
	  admfeeRrt1.FromDate("10/06/2020");
	  admfeeRrt1.ToDate("10/09/2020");
	  admfeeRrt1.SearchBtn();
	  admsFeeDetlRrt.totlaRecords();
  }
  
  @Test
  public void AdmsCancleReport() throws Exception
  {
	  System.out.println("------------ Admission Cancle Report -----------------");
	  dashbrd.admission();
	  //Thread.sleep(3000);
	  dashbrd.ReportsBtn();
	  admsCancelRrt=dashbrd.AdmsnCancelRprt();
	  AssertValidation(admsCancelRrt.pagTitle(), "Admission Cancel Report");
	  admsCancelRrt.sessionYer("2020-2021");
	  admsCancelRrt.totlaRecords();
  }
  
  @Test
  public void AdmsFeeInVoiceCancelReport() throws Exception
  {
	  System.out.println("------------ Admission Fee Invoice Cancle Report -------------");
	  dashbrd.admission();
	  //Thread.sleep(1000);
	  dashbrd.ReportsBtn();
	  admfeeInvcCacleRt=dashbrd.AdmsnFeeInvcCancel();
	  AssertValidation(admfeeInvcCacleRt.pageTitle(), "Cancel Fee Report");
	  AdmsRFeeReport admfeeRrt1=new AdmsRFeeReport(driver);
	  admfeeRrt1.AcademicYear("2020-2021");
	  admfeeInvcCacleRt.ReportTyp("Cancel Receipt");
	  admfeeRrt1.Standard("IX");
	  admfeeInvcCacleRt.SeleSection("B");
	  admfeeRrt1.FromDate("10/06/2020");
	  admfeeRrt1.ToDate("10/12/2020");
	  admfeeInvcCacleRt.SeleAmsFee();
	  admfeeRrt1.SearchBtn();
  }
  
  @Test
  public void AdmsSubmitedRegFormReport() throws Exception
  {
	  System.out.println("------------ Admission Sumited Reg Form Report ---------------");
	  dashbrd.admission();
	  //Thread.sleep(1000);
	  dashbrd.ReportsBtn();
	  admSubFormRept=dashbrd.SubmtRegFormRet();
	  AssertValidation(admSubFormRept.pageTitlel(), "Registration Form Report");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  admfeeRrt.AcademicYear("2020-2021");
	  admfeeRrt.FromDate("10/04/2020");
	  admfeeRrt.ToDate("10/12/2020");
	  admSubFormRept.SelStandard("IX");
	  admfeeRrt.SearchBtn();
	  admfeeRrt.totalCount();
  }
  
  @Test
  public void AdmsRRegFormCountReport() throws Exception
  {
	  System.out.println("------------ Admission Reg Form Count Report -----------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(1000);
	  admRegCountRrt=dashbrd.regFormCountRprt();
	  AssertValidation(admRegCountRrt.pageTitle(), "Issue and Submited Registration Form Report");
	  admRegCountRrt.year("2020-2021");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  admfeeRrt.FromDate("10/04/2020");
	  admfeeRrt.ToDate("10/12/2020");
	  admRegCountRrt.getCountBtn();
	  admRegCountRrt.dataDetials();	  
  }
  
  @Test
  public void AdmsRRegFormProcessFeeReport() throws Exception
  {
	  System.out.println("------------ Admission Reg Form Process Fee Report --------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  admRegProcessFeeRrt=dashbrd.regFormFeeRprt();
	  AssertValidation(admRegProcessFeeRrt.pageTitle(), "Process Fee Report");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  admfeeRrt.AcademicYear("2020-2021");
	  admRegProcessFeeRrt.ReportType();
	  admRegProcessFeeRrt.standards();
	  admRegProcessFeeRrt.payCode();
	  admfeeRrt.FromDate("10/04/2020");
	  admfeeRrt.ToDate("10/12/2020");
	  admfeeRrt.SearchBtn();
	  admRegProcessFeeRrt.dataCount();
	  Thread.sleep(2000);
  }
  
  @Test
  public void AdmsRRFormSMSReport() throws Exception
  {
	  System.out.println("------------ Admission Reg Form SMS Report ----------------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  admsRegFormSMSRrt=dashbrd.regFormSMSRprt();
	  AssertValidation(admsRegFormSMSRrt.pageTitle(), "SMS Report");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  Select se = new Select(admsRegFormSMSRrt.status());
	  List<WebElement> l = se.getOptions();
	  l.size();
	  for(int i=1;i<l.size();i++)
	  {
		  System.out.println(l.get(i).getText());
		  click(admsRegFormSMSRrt.status());
		  click(l.get(i));
		  admfeeRrt.FromDate("10/04/2020");
		  admfeeRrt.ToDate("10/12/2020");
		  admfeeRrt.SearchBtn();
		  Thread.sleep(2000);
	  }
  }
  
  @Test
  public void AdmsRAdmPointwiseReport() throws Exception
  {
	  System.out.println("------------ Admission PointWise Report -----------------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  admspointwiseRrt=dashbrd.admsPointwiseReport();
	  AssertValidation(admspointwiseRrt.pageTitle(), "Admission Report with Points");
	  Select se22=new Select(admspointwiseRrt.standard());
	  List<WebElement> ele22 = se22.getOptions();
	  Select staus33=new Select(admspointwiseRrt.status());
	  List<WebElement> ele333 =staus33.getOptions();
	  
	  for(int i=1;i<ele22.size();i++)
	  {
		 /* click(admspointwiseRrt.standard());
		  click(ele.get(i));*/
		  for(int j=1;j<ele333.size();j++)
		  {
			  Select se=new Select(admspointwiseRrt.standard());
			  List<WebElement> ele = se.getOptions();
			  System.out.print(ele.get(i).getText()+" - ");
			  click(admspointwiseRrt.standard());
			  click(ele.get(i));
			  Select staus=new Select(admspointwiseRrt.status());
			  List<WebElement> ele2 =staus.getOptions();
			  System.out.print(ele2.get(j).getText()+"- ");
			  click(admspointwiseRrt.status());
			  click(ele2.get(j));
			  admspointwiseRrt.fromDate("10/04/2020");
			  admspointwiseRrt.searchBtn();
			  Thread.sleep(2000);
		  }
	  }
  }
  
  @Test
  public void AdmsFeeCheqReConciliationReport() throws Exception
  {
	  System.out.println("------------ Admission Fee Collection Cheque Reconciliation Report ----");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  Thread.sleep(2000);
	  feecheqReconRrt=dashbrd.admsFeeChqReConsRrt();
	  Thread.sleep(2000);
	  AssertValidation(feecheqReconRrt.pageTitle(), "Admission Fee Collection Cheque Reconciliation Report");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  admfeeRrt.FromDate("10/04/2020");
	  admfeeRrt.ToDate("10/13/2020");
	  Select ele=new Select(feecheqReconRrt.bank());
	  List<WebElement> option=ele.getOptions();
	  for(int i=1;i<option.size();i++)
	  {
		  click(feecheqReconRrt.bank());
		  System.out.println(option.get(i).getText());
		  click(option.get(i));
		  feecheqReconRrt.filterBtn();
		  Thread.sleep(1000);
	  }
	  Thread.sleep(2000);
  }
  
  @Test
  public void AdmsInternalStdStreamReport() throws Exception
  {
	  Select ele;
	  List<WebElement> option;
	  Select eleN;
	  List<WebElement> optionN;
	  List<WebElement> option2;
	  Select ele2N;
	  List<WebElement> option2N;
	  Select ele3;
	  List<WebElement> option3;
	  Select ele3N;
	  List<WebElement> option3N;
	  System.out.println("------------ Admission Internal Student Stream Report ----------------");
	  admfeeRrt=new AdmsRFeeReport(driver);
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  intrnalStdStremRrt=dashbrd.intnalStdStreamRrt();
	  AssertValidation(intrnalStdStremRrt.paegTitle(), "Student Stream Report");
	  intrnalStdStremRrt.year("2020-2021");
	  ele=new Select(intrnalStdStremRrt.SeleStream());
	  option=ele.getOptions();
	  System.out.println("stream size"+option.size());
	  for(int i=1;i<option.size();i++)
	  {
		  System.out.println("stream index-"+i);
		  eleN=new Select(intrnalStdStremRrt.SeleStream());
		  optionN=eleN.getOptions();
		  click(intrnalStdStremRrt.SeleStream());
		  Thread.sleep(1000);
		  System.out.println(i+optionN.get(i).getText());
		  click(optionN.get(i));
		  Select ele2=new Select(intrnalStdStremRrt.SeleClass());
		  option2=ele2.getOptions();
		  Thread.sleep(1000);
		  System.out.println("section size"+option2.size());
		  for(int j=1;j<option2.size();j++)
		  {
			  System.out.println("class index-"+j);
			  ele2N=new Select(intrnalStdStremRrt.SeleClass());
			  option2N=ele2N.getOptions();
			  click(intrnalStdStremRrt.SeleClass());
			  Thread.sleep(1000);
			  click(option2N.get(j));
			  System.out.println("Class Selected text index"+j+option2N.get(j).getText());
			  Thread.sleep(2000);
			  ele3=new Select(intrnalStdStremRrt.SeleSection());
			  option3=ele3.getOptions();
			  Thread.sleep(1000);
			  System.out.println("section size"+option3.size());
			  for(int k=1;k<option3.size();k++)
			  {
				  System.out.println("selected index-"+k);
				  ele3N=new Select(intrnalStdStremRrt.SeleSection());
				  option3N=ele3N.getOptions();
				  click(intrnalStdStremRrt.SeleSection());
				  Thread.sleep(1000);
				  click(option3N.get(k));
				  System.out.println("section selected Text index -"+k+option3N.get(k).getText());
				  admfeeRrt.FromDate("10/04/2020");
				  admfeeRrt.ToDate("10/13/2020");
				  intrnalStdStremRrt.SearchBtn();
				  Thread.sleep(1000);
			  }
		  }
	  }
	  
  }
  
  @Test
  public void AdmsFeeDueReport() throws Exception
  {
	  System.out.println("------------ Admission Fee Due Report --------------------");
	  dashbrd.admission();
	  Thread.sleep(1000);
	  dashbrd.ReportsBtn();
	  Thread.sleep(1000);
	  feeDueRrt=dashbrd.amdsFeeDueRrt();
	  Thread.sleep(1000);
	  AssertValidation(feeDueRrt.pageTitle(), "Admissions");
	  feeDueRrt.year("2020-2021");
	  Thread.sleep(2000);
	  Select ele= new Select(feeDueRrt.feeFormat());
	  List<WebElement> option=ele.getOptions();
	  for(int i=1;i<option.size();i++)
	  {
		  Select ele1= new Select(feeDueRrt.feeFormat());
		  List<WebElement> option1=ele1.getOptions();
		  click(feeDueRrt.feeFormat());
		  click(option1.get(i));
		  System.out.println("Fee Format : "+option1.get(i).getText());
		  feeDueRrt.searchBtn();	
		  Thread.sleep(2000);
		  int eledisply=driver.findElements(By.xpath("//*[@id='basic-btn']")).size();
		  System.out.println("element status :"+eledisply);
		  if(eledisply==1)
		  {
			  System.out.println("Data Present");
		  }else if(eledisply==0)
		  {
			  System.out.println("No Data");
		  }
	  }
  }
  
  @Test
  public void AdmsPointsReport() throws Exception
  {
	  System.out.println("------------ Admission Points Report ------------------");
	  dashbrd.admission();
	  dashbrd.ReportsBtn();
	  pointsRrt=dashbrd.admsPointRrt();
	  AssertValidation(pointsRrt.pageTitle(), "Student Admission Points Report");
	  
  }
  
  
}
