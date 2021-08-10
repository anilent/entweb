package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrar.pagesPOM.Login_page;
import biz.entrar.pagesPOM.sal1PayrolLeaveStructurePage;
import biz.entrar.pagesPOM.sal2PayrolLeaveAllocationPage;
import biz.entrar.pagesPOM.sal2PayrolLeaveAllocationPage2;
import biz.entrar.pagesPOM.sal2PayrolLeaveEntry;
import biz.entrar.pagesPOM.sal3MassPayAlloation04;
import biz.entrar.pagesPOM.sal3MonthlyPayAllocation03;
import biz.entrar.pagesPOM.sal3PayStructer;
import biz.entrar.pagesPOM.sal3PayStructerAllocation02;
import biz.entrar.pagesPOM.sal3StaffpayDaysUpdate05;
import biz.entrar.pagesPOM.sal4SalaryPaySlip03;
import biz.entrar.pagesPOM.sal4SalaryProcess01;
import biz.entrar.pagesPOM.sal4SalaryStatment02;
import biz.entrar.pagesPOM.sal5SalaryRelease;
import biz.entrar.pagesPOM.sal6preDefineSalStamt;
import biz.entrar.pagesPOM.sal7salaryBankReport;
import biz.entrar.pagesPOM.sal8salaryAnnualReport;
import biz.entrar.pagesPOM.sal9TeachCL_ELamountRert;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class PayRollSalary extends BaseTest{
 
	Login_page loginpg;
	DashboardPage admindasb;
	sal1PayrolLeaveStructurePage leaveStr;
	sal2PayrolLeaveAllocationPage leaveAllo;
	sal2PayrolLeaveAllocationPage2 leaveAllo2;
	sal2PayrolLeaveEntry leavEtry;
	sal3PayStructer payStr;
	sal3PayStructerAllocation02 payStrAllo;
	sal3MonthlyPayAllocation03 montlypayAllo;
	sal3MassPayAlloation04 masspayAllo;
	sal3StaffpayDaysUpdate05 staffpayupdt;
	sal4SalaryProcess01 salprocces;
	sal4SalaryStatment02 salStatment;
	sal4SalaryPaySlip03 salpaySlip;
	
	sal5SalaryRelease salreleas;
	sal6preDefineSalStamt predefsalStatm;
	sal7salaryBankReport salbankRert;
	sal8salaryAnnualReport salannurept;
	sal9TeachCL_ELamountRert teachCLamontrpt;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  loginpg = new Login_page(driver);
	  admindasb = new DashboardPage(driver);
		
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void login()
  {
	  System.out.println("------------ Login Test Case ------");
	  admindasb= loginAdmin(EnvironmentsData.usernameAdmin, EnvironmentsData.passwordAdmin);
	  
  }
  String leavId="TST01";
  @Test
  public void leaveStructerAdd() throws Exception {
	  System.out.println("------------ Add Leave Structer Test Case ------");
	  Thread.sleep(2000);
	  //scroll_Page(admindasb.payroll(),10,admindasb.payroll());
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.leaveMnu());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  leaveStr=admindasb.leaveStruct();
	  AssertValidation(getAttribut(leaveStr.pageTitle(), "Text", "Page Title Verification"), "Leave Structure");
	  leaveStr.addLeaveStr().click();
	  
	  leaveStr.leavCode().sendKeys(leavId);
	  leaveStr.leavFormat().sendKeys("Test format");
	  selectdropdownTxt(leaveStr.seleLeavApplicable(), "All");
	  selectdropdownTxt(leaveStr.seleGeneder(),"Male");
	  leaveStr.maxPerYr().sendKeys("10");
	  leaveStr.maxPerMoth().sendKeys("5");
	  leaveStr.seleDeductSal().click();
	  leaveStr.seleReimbse().click();
	  leaveStr.seleAccumulatable().click();
	  leaveStr.seleOnlineLeavReqt().click();
	  leaveStr.maxAccumlatableDays().sendKeys("3");
	  leaveStr.submitBtn().click();
	  System.out.println(leaveStr.tableViewData(leavId).getText());
  }
  
  String levFormt="Test format edit";
  @Test
  public void editLeaveStr() throws Exception
  {
	  leaveStr.editBtn(leavId).click();
	  leavId="TST01E";
	  leaveStr.editleavCode().clear();
	  leaveStr.editleavCode().sendKeys(leavId);
	  Thread.sleep(1000);
	  leaveStr.editleavFormat().clear();
	  leaveStr.editleavFormat().sendKeys(levFormt);
	  selectdropdownTxt(leaveStr.editseleLeavApplicable(), "All");
	  selectdropdownTxt(leaveStr.editseleGeneder(),"Female");
	  leaveStr.editmaxPerYr().sendKeys("5");
	  leaveStr.editmaxPerMoth().sendKeys("10");
	  leaveStr.editMaxAccumltDays().sendKeys("7");
	  leaveStr.editsubmitBtn().click(); 
  }
  
  @Test
  public void DeleteLeaveStr() throws Exception
  {
	  leaveStr.deleteBtn(leavId).click();
	  waitForAlertDismiss(driver);  
  }
  
  @Test
  public void LeaveAllocation() throws Exception
  {
	  System.out.println("------------ Leave Allocation page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.leaveMnu());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  leaveAllo =admindasb.leaveAllocation();
	  Thread.sleep(1000);
	  AssertValidation(getAttribut(leaveAllo.pageTitl(), "Text", "Page Title Verification"), "Leave Allocation");
	  Thread.sleep(1000);
	  selectdropdownTxt(leaveAllo.selAccoutnDevision(), "ENTRAR");
	  selectdropdownTxt(leaveAllo.seleDepartment(),"TEACHER");
	  selectdropdownTxt(leaveAllo.seleCalendar(),"2020-2021");
	  selectdropdownTxt(leaveAllo.seleLeaveTyp(),levFormt);
	  
	 // System.out.println(leaveAllo.dataNotFoundMsg().getText());
	 // AssertValidation(getAttribut(leaveAllo.dataNotFoundMsg(), "Text", "Alert Message Verification"), "Data Not Found.");
	  leaveAllo2= leaveAllo.alloctLeaveBtn();
	  selectdropdownTxt(leaveAllo.selAccoutnDevision(), "ENTRAR");
	  selectdropdownTxt(leaveAllo.seleDepartment(),"TEACHER");
	  selectdropdownTxt(leaveAllo.seleCalendar(),"2020-2021");
	  selectdropdownTxt(leaveAllo.seleLeaveTyp(),levFormt);	 
	  waitForVisibility(leaveAllo2.radhaRow());
	  Thread.sleep(1000);
	  ScrolljavaScript(leaveAllo2.radhaRow());
	  Thread.sleep(1000);
	  ScrolljavaScript2(leaveAllo2.levBalance());
	  leaveAllo2.carryForwdLev().clear();
	  leaveAllo2.carryForwdLev().sendKeys("5");
	  leaveAllo2.levAllocate().clear();
	  leaveAllo2.levAllocate().sendKeys("10");
	  leaveAllo2.levTaken().clear();
	  leaveAllo2.levTaken().sendKeys("2");
	  leaveAllo2.mainpagClick();
	  Thread.sleep(1000);
	  System.out.println(leaveAllo2.levBalance().getText());
	  ScrolljavaScript(leaveAllo2.allocateBtn());
	  leaveAllo2.allocateBtn().click();	
	  }
  
  @Test
  public void LeaveEntry() throws Exception
  {
	  System.out.println("------------ Leave Entry page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.leaveMnu());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  leavEtry=admindasb.leaveEntryBtn();
	  AssertValidation(getAttribut(leavEtry.pageTitle(), "Text", "Page Title Verification"), "Leave Entry");
	  selectdropdownTxt(leavEtry.seleYear(), "2020-2021");
	  selectdropdownTxt(leavEtry.empId(), "Radha Singh");
	  Thread.sleep(2000);
	  selectdropdownTxt(leavEtry.seleLeaveTyp(), "Test format edit");
/*	  selectdropdownTxt(leavEtry.fromDate(), "04/18/2021");
	  selectdropdownTxt(leavEtry.toDate(), "04/19/2021");*/
	  leavEtry.days().sendKeys("2");
	  leavEtry.remarks().sendKeys("Testing remarks Leave");
	  leavEtry.addLeavEtnry();
	  waitForAlert(driver);
	  
	  Thread.sleep(1000);
	  leavEtry.editleav().click();
	  Thread.sleep(20000);
	  AssertValidation(getAttribut(leavEtry.pageTitleEdit(), "Text", "Page Title Verification"), "Leave Details Edit");
	  leavEtry.days().sendKeys("1");
	  leavEtry.updated().click();
	  waitForAlert(driver);
	    
  }
  
  @Test
  public void payStructer() throws Exception
  {
	  System.out.println("------------ Leave Entry page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.payStruSetup());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  payStr= admindasb.payStrutr2();
	  AssertValidation(getAttribut(payStr.pageTitle(), "Text", "Page Title Verification"), "Pay Structure");
	  payStr.addBtn().click();
	  
	  payStr.payCode().sendKeys("TSTCOD007");
	  payStr.payNam().sendKeys("TSTName");
	  selectdropdownTxt(payStr.payType(), "Addition");
	  selectdropdownTxt(payStr.basedOn(), "General");
	  payStr.startDate().sendKeys("04/20/2021");
	  payStr.endDate().sendKeys("04/20/2021");
	  selectdropdownTxt(payStr.payApplicable(), "All");
	  payStr.taxableChck().click();
	  payStr.leaveDeduct().click();
	  selectdropdownTxt(payStr.calculatioN(), "Actual Amount");
	  payStr.excludeActuralAmt().click();
	  payStr.seqInSlip().sendKeys("TST001");
	  payStr.upperLimit().sendKeys("5000");
	  payStr.includeInReport().click();
	  payStr.includePreReprot().click();
	  payStr.montlyAllocat().click();
	  payStr.changeAllAllocation().click();
	  payStr.formula().sendKeys("BASIC*0.10");
	  payStr.cancleBtn().click();
	  Thread.sleep(1000);
	  ScrolljavaScript(payStr.editBtn());
	  payStr.editBtn().click();
	  
	  payStr.epayCode().clear();
	  payStr.epayCode().sendKeys("QAPay01");
	  payStr.epayNam().clear();
	  payStr.epayNam().sendKeys("QAPAY");
	  payStr.eseqInSlip().clear();
	  payStr.eseqInSlip().sendKeys("777");
	  payStr.eupperLimit().clear();
	  payStr.eupperLimit().sendKeys("12000");
	  payStr.eformula().clear();
	  payStr.eformula().sendKeys("BASIC*0.30");
	  payStr.eSubmitBtn().click();
	  
  }
  
  @Test
  public void payStructerAllocation() throws Exception
  {
	  System.out.println("------------ Pay Structer Allocation page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.payStruSetup());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  payStrAllo= admindasb.payStrutrAlloc();
	  
	  AssertValidation(getAttribut(payStrAllo.pageTitle(), "Text", "Page Title Verification"), "Teacher's Pay Structure Allocation");
	  selectdropdownTxt(payStrAllo.seleYear(), "2020-2021");
	  selectdropdownTxt(payStrAllo.categroy(), "All");
	  selectdropdownTxt(payStrAllo.seleTeacher(), "Radha Singh");
	  ScrolljavaScript(payStrAllo.seleCheckbox());
	  payStrAllo.seleCheckbox().click();
	  ScrolljavaScript(payStrAllo.allocateBtn());
	  payStrAllo.allocateBtn().click();
	  waitForAlert(driver);
	  ScrolljavaScript(payStrAllo.deleteBtn());
	  payStrAllo.deleteBtn().click();
	  Thread.sleep(1000);
	  selectdropdownTxt(payStrAllo.seleYear(), "2020-2021");
	  selectdropdownTxt(payStrAllo.categroy(), "All");
	  selectdropdownTxt(payStrAllo.seleTeacher(), "Radha Singh");
	  ScrolljavaScript(payStrAllo.seleCheckbox());
	  payStrAllo.seleCheckbox().click();
	  ScrolljavaScript(payStrAllo.allocateBtn());
	  payStrAllo.allocateBtn().click();
	  waitForAlert(driver);
	  
  }
  
  @Test
  public void monthlyPayAlloction() throws Exception
  {
	  System.out.println("------------ monthly Pay Alloction page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.payStruSetup());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  montlypayAllo= admindasb.mothlyPayAlloc();
	  AssertValidation(getAttribut(montlypayAllo.pageTitle(), "Text", "Page Title Verification"), "Monthly Pay Allocation");
	  selectdropdownTxt(montlypayAllo.accotingDevis(), "ENTRAR");
	  System.out.println("error multiple records are displaying");
	  ScrolljavaScriptEndPage();
	  Thread.sleep(1000);	  
  }
  
  @Test
  public void MassPayAllocation() throws Exception
  {
	  System.out.println("------------ Mass Pay Allocation page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.payStruSetup());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  masspayAllo=admindasb.massPayAlloc();
	  AssertValidation(getAttribut(masspayAllo.pageTitle(), "Text", "Page Title Verification"), "Mass Pay Allocation");
	  
	  selectdropdownTxt(masspayAllo.seleYear(), "2020-2021");
	  selectdropdownTxt(masspayAllo.accountingdivision(), "ENTRAR");
	  selectdropdownTxt(masspayAllo.payNam(), "QAPAY");
	  ScrolljavaScript(masspayAllo.empid());
	  Thread.sleep(2000);
	  ScrolljavaScript(masspayAllo.allocatBtn());
	  masspayAllo.allocatBtn().click();
	  waitForAlert(driver);
  }
  
  @Test
  public void staffPayDayUpdate() throws Exception
  {
	  System.out.println("------------ Staff Pay Day Update page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.payStruSetup());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  staffpayupdt=admindasb.staffPayDayUpdte();
	  AssertValidation(getAttribut(staffpayupdt.pageTitle(), "Text", "PageTitle Verification"), "Teacher Pay days Allocation");
	  staffpayupdt.allocatePaydaysBtn().click();
	  selectdropdownTxt(staffpayupdt.seleYear(), "2020-2021");
	  selectdropdownTxt(staffpayupdt.seleMonth(), "April");
	  selectdropdownTxt(staffpayupdt.accountingDevison(), "ENTRAR");
	  ScrolljavaScript(staffpayupdt.empid());
	  Thread.sleep(2000);
	  ScrolljavaScript(staffpayupdt.updateBtn());
	  staffpayupdt.updateBtn().click();
	  waitForAlert(driver);
  }
  
  @Test
  public void processSalary() throws Exception
  {
	  System.out.println("------------ Process Salary page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.salaryNewMethod());
	  Thread.sleep(3000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salprocces=admindasb.newProccessSal();
	  AssertValidation(getAttribut(salprocces.pageTitle(), "Text", "Page Title Verification"), "Process Salary");
	  
	  selectdropdownTxt(salprocces.seleYear(), "2020-2021");
	  selectdropdownTxt(salprocces.seleYearpay(), "2020-2021");
	  selectdropdownTxt(salprocces.seleMonth(), "April");
	  selectdropdownTxt(salprocces.accountingdevi(), "ENTRAR");
	  Thread.sleep(2000);
	  salprocces.checkBox().click();
	  salprocces.checkBox().click();
	  salprocces.procesalaryBtn().click();
	  //waitForAlert(driver);
  }
  
  @Test
  public void salaryStatment() throws Exception
  {
	  System.out.println("------------ Salary Statment page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(3000);
	  click(admindasb.salaryNewMethod());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salStatment=admindasb.salaryStatmnt();
	  AssertValidation(getAttribut(salStatment.pageTitle(), "Text", "Page Title Verfication"), "Salary Statement");
	  
	  selectdropdownTxt(salStatment.seleYear(), "2020-2021");
	  selectdropdownTxt(salStatment.seleMonth(), "April");
	  selectdropdownTxt(salStatment.accountingdevi(), "ENTRAR");
	  selectdropdownTxt(salStatment.orderBy(), "Designation");
	  Thread.sleep(2000);
	  salStatment.exceldownlod().click();	  
  }
  
  @Test
  public void salaryPaySlip() throws Exception
  {
	  System.out.println("------------ Salary Pay Slip page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  click(admindasb.salaryNewMethod());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salpaySlip=admindasb.salryPaySlip();
	  
AssertValidation(getAttribut(salpaySlip.pageTitle(), "Text", "Page Title Verfication"), "Salary Pay Slip");
	  
	  selectdropdownTxt(salpaySlip.seleYear(), "2020-2021");
	  selectdropdownTxt(salpaySlip.seleMonth(), "April");
	  selectdropdownTxt(salpaySlip.accountingdevi(), "ENTRAR");
  }
  
  @Test
  public void salaryRelease() throws Exception
  {
	  System.out.println("------------ salary Release page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salreleas=admindasb.salaryRelease();
	  AssertValidation(getAttribut(salreleas.pagetitle(), "Text", "Page Title verfication"), "High Security OTP");
	  
  }
  
  @Test
  public void preDefineSalaryStatment() throws Exception
  {
	  System.out.println("------------ pre Define Salary Statment page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  predefsalStatm=admindasb.preDefineSalStamt();
	  
	  AssertValidation(getAttribut(predefsalStatm.pageTitle(), "Text", "Page Title Verfication"), "Salary Statement");
	  
	  selectdropdownTxt(predefsalStatm.seleYear(), "2020-2021");
	  selectdropdownTxt(predefsalStatm.selemonth(), "April");
	  selectdropdownTxt(predefsalStatm.accountingDevision(), "ENTRAR");
	  selectdropdownTxt(predefsalStatm.orderBy(), "Name");
	  predefsalStatm.exceldownlod().click();
	  	  
  }
  
  @Test
  public void salaryBankReprot() throws Exception
  {
	  System.out.println("------------ salary Bank Reprot page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salbankRert=admindasb.salBankReport();
	  
AssertValidation(getAttribut(salbankRert.pageTitle(), "Text", "Page Title Verfication"), "Salary Bank Report");
	  
	  selectdropdownTxt(salbankRert.seleYear(), "2020-2021");
	  selectdropdownTxt(salbankRert.selemonth(), "April");
	  selectdropdownTxt(salbankRert.accountingDevision(), "ENTRAR");
  }
  
  @Test
  public void salaryAnnualReprot() throws Exception
  {
	  System.out.println("------------ salary Annual Reprot page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  salannurept= admindasb.annualSalReport();
	  
	  assertEquals(getAttribut(salannurept.pageTitle(), "Text", "Page Title Verfication"), "Salary Anuual Report New");
	  
	  selectdropdownTxt(salannurept.seleYear(), "2020-2021");
	  selectdropdownTxt(salannurept.accountingDevision(), "ENTRAR");
	  salannurept.selemonthcheck().click();
	  salannurept.additionPay().click();
	  salannurept.deductionpay().click();
	  selectdropdownTxt(salannurept.empname(), "Radha Singh");
	  //selectdropdownTxt(salannurept.filterBy(), "QAPay01");
	  salannurept.reprotBtn().click();	  
  }
  
  @Test
  public void teacherCLELamountReport() throws Exception
  {
	  System.out.println("------------ Teacher CL_EL amount Report page ------");
	  Thread.sleep(2000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  System.out.println(admindasb.payroll().getText());
	  click(admindasb.payroll());
	  Thread.sleep(1000);
	  ScrolljavaScript(admindasb.payroll());
	  Thread.sleep(1000);
	  teachCLamontrpt= admindasb.teacherCLELreprot();
	  
	  assertEquals(getAttribut(teachCLamontrpt.pageTitle(), "Text", "Page Title Verfication"), "Teacher CL/EL Amount Report");
	  
	  selectdropdownTxt(teachCLamontrpt.seleYear(), "2020-2021");
	  selectdropdownTxt(teachCLamontrpt.leavepickFrm(), "2020-2021");
	  selectdropdownTxt(teachCLamontrpt.accountingDevision(), "ENTRAR");
	  selectdropdownTxt(teachCLamontrpt.selemonth(), "April");
	  teachCLamontrpt.searchBtn().click();
	  ScrolljavaScriptEndPage();
	  Thread.sleep(1000);
  }
}
