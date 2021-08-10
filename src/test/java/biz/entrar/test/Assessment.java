package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.pagesPOM.AssmtAcademicAssessmentSubjectsPage;
import biz.entrar.pagesPOM.AssmtNAOptionalSubjectAllocationPage;
import biz.entrar.pagesPOM.AssmtNASubjectDetialsPage;
import biz.entrar.pagesPOM.AssmtNASubjectGradMasterPage;
import biz.entrar.pagesPOM.AssmtNASubjectRemarksBankPage;
import biz.entrar.pagesPOM.AssmtNASubjectStrandsPage;
import biz.entrar.pagesPOM.AssmtNASubjectsMastersPage;
import biz.entrar.pagesPOM.AssmtSubjectAreaMaster;
import biz.entrar.pagesPOM.AsstAcademicAssessmentSubjectGroupingPage;
import biz.entrar.pagesPOM.AsstAcademicOptionalSubLanguagCountReportPage;
import biz.entrar.pagesPOM.AsstAcademicOptionalSubReportPage;
import biz.entrar.pagesPOM.AsstAcademicOptionalSubjAllocationPage;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Assessment extends BaseTest {
	
	DashboardPage dashbrd;
	AssmtSubjectAreaMaster subjetareaMstr;
	AssmtNASubjectsMastersPage naSubMaster;
	AssmtNASubjectStrandsPage naSubjStrands;
	AssmtNASubjectDetialsPage nasubjDetials;
	AssmtNASubjectGradMasterPage nasubjGradMstr;
	AssmtNASubjectRemarksBankPage nasubjremarksBank;
	AssmtNAOptionalSubjectAllocationPage naoptionSubjAllocation;
	AssmtAcademicAssessmentSubjectsPage academicAssmtSubjts;
	AsstAcademicAssessmentSubjectGroupingPage academicAssmtSubjtsGroping;
	AsstAcademicOptionalSubjAllocationPage optionalSubAllocation;
	AsstAcademicOptionalSubReportPage optinalSubReport;
	AsstAcademicOptionalSubLanguagCountReportPage optionalSubContRprt;
	
	
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("------------ Assessment TestCases ----------");
	  dashbrd =new DashboardPage(driver);
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }
  
  String subjectArea;
  String areaName;
  List<WebElement> header;
  List<WebElement> ele;
  int count;
  @Test
  public void AssmtSubjectAreaMasters() throws Exception
  {
	  System.out.println("------------ Assessment Subject Area Master ----------");
	  dashbrd.assessmentPage();
	  subjetareaMstr=dashbrd.SubAreaMatBtn();
	  AssertValidation(subjetareaMstr.pageTitle(), "Subject Area add");
	  
	  
	  System.out.println("Recordes Count is "+ subjetareaMstr.dataCount());
	  count=subjetareaMstr.dataCount()+1;
	  System.out.println("Recordes Count is "+count);
	  subjectArea="SubjectArea"+count;
	  
	  subjetareaMstr.addBtn();
	  AssertValidation(subjetareaMstr.popupTitl(), "Add");
	  //Data entring
	  subjetareaMstr.subjtArea(subjectArea);
	  areaName="TestAreaNam"+count;
	  subjetareaMstr.areaName(areaName);
	  String seqnum=""+count;
	  subjetareaMstr.seqNo(seqnum);
	  subjetareaMstr.printName("TestPrintNam"+count);
	  subjetareaMstr.status("Active");//In-Active
	  //subjetareaMstr.acadamicAreaCheckbox();
	  subjetareaMstr.reportsInGradesCheckbox();
//	  subjetareaMstr.cancleBtn();
	  subjetareaMstr.SubmitBtn();
	  Thread.sleep(1000);
	  driver.get(driver.getCurrentUrl());
	  Thread.sleep(2000);
	  header=driver.findElements(By.xpath("//th"));
	  Thread.sleep(1000);
	  ScrolljavaScript(driver.findElement(By.xpath("//*[.='"+subjectArea+"']")));
	  Thread.sleep(1000);
	  ele = driver.findElements(By.xpath("//*[.='"+subjectArea+"']/..//td"));
	  System.out.println("---- Recently Added Subject Are Masters Data -------");
	  for(int i=1;i<header.size()-1;i++)
	  {
		  System.out.print(header.get(i).getText()+ " -- ");
		  System.out.println(ele.get(i).getText());  
	  }
	  
  }
  String subjNam;
  @Test
  public void AssmtNASubjectMasters() throws Exception
  {
	  System.out.println("------------ Assessment NA Subject Master ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  naSubMaster=dashbrd.NAsubjetMaster();
	  AssertValidation(naSubMaster.pageTitl(), "CCE NON Academic Subjects");
	  Thread.sleep(2000);
	  naSubMaster.seleSubjetArea(areaName);//TestAeaNam33areaName
	  naSubMaster.seleStandard("IX");
	  naSubMaster.subjCode("001");
	  subjNam="SubNamTest001";
	  naSubMaster.subjNam(subjNam);
	  naSubMaster.seqNum("001");
	  naSubMaster.hasActivities();
	  naSubMaster.hasSubStrnds();
	  String poinnum=""+4;
	  naSubMaster.points(poinnum);
	  naSubMaster.gradeDesc("Grade Description test");
	  naSubMaster.status("Active");		
	  naSubMaster.gradeValue("A*,A,B*,B,C");
	  naSubMaster.addBtn();
	  Thread.sleep(2000);
	  System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
	  //System.out.println("testing snin");
      Thread.sleep(2000);
	  naSubMaster.seleSubjetArea(areaName);//areaName
	  Thread.sleep(2000);
	  ScrolljavaScript(driver.findElement(By.xpath("//*[.='"+subjNam+"']")));
	  Thread.sleep(2000);
	  header=driver.findElements(By.xpath("//th"));
	  ele = driver.findElements(By.xpath("//*[.='"+subjNam+"']/..//td"));//"+subjNam+"
	  System.out.println("---- Recently Added CCE NON Academic Subjects Data -------");
	  for(int i=1;i<header.size()-1;i++)
	  {
		  System.out.print(header.get(i).getText()+ " -- ");
		  System.out.println(ele.get(i).getText());
	  }
  }

  @Test
  public void AssmtNASubjectStrands() throws Exception
  {
	  System.out.println("------------ Assessment NA Subject Strands ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  naSubjStrands=dashbrd.NASubjetStrands();
	  naSubjStrands.seleStandard("IX");
	  naSubjStrands.seleSubjArea(areaName);//areaName"TestAreaNam37"
	  naSubjStrands.seleSubject(subjNam);//subjNam"SubNamTest001"
	  System.out.println(naSubjStrands.strandsTxt().size());
	  for(int i=0;i<=4;i++)
	  {
		  sendKeys(naSubjStrands.strandsTxt().get(i),"Strands"+i);
	  }
	  naSubjStrands.addBtn(); 
  }
  
  @Test
  public void AssmtNASubjectDetails() throws Exception
  {
	  System.out.println("------------ Assessment NA Subject Details ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  nasubjDetials=dashbrd.NASubjetDetails();
	  nasubjDetials.seleStandard("IX");
	  nasubjDetials.seleSubjArea(areaName);
	  nasubjDetials.seleSubject(subjNam);
	  nasubjDetials.seleStrands(1);
	  Thread.sleep(1000);
	  for(int i=0;i<3;i++)
	  {
		  sendKeys(nasubjDetials.enterDetails().get(i),"Details"+i);
		  Thread.sleep(1000);
		  int indx=i+1;
		  selectdropdown(nasubjDetials.selePoints().get(i), indx);
	  }
	  nasubjDetials.addBtn();
  }
  
  @Test
  public void AssmtNASubjectGradMaster() throws Exception 
  {
	  System.out.println("------------ Assessment NA Subject Grad Master ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  nasubjGradMstr=dashbrd.NASubjectGradeMstr();
	  nasubjDetials=new AssmtNASubjectDetialsPage(driver);
	  nasubjDetials.seleStandard("IX");
	  nasubjDetials.seleSubjArea(areaName);
	  nasubjDetials.seleSubject(subjNam);
	  nasubjDetials.seleStrands(1);
	  Thread.sleep(1000);
	  nasubjGradMstr.seleDetials(1);
	  for(int i=0;i<3;i++)
	  {
		  sendKeys(nasubjGradMstr.enterRemarks().get(i), "Remarks"+i);
		  int indx=i+1;
		  selectdropdown(nasubjGradMstr.seleGrad().get(i), indx);
	  }
	  nasubjGradMstr.addBtn();
  }
  
  @Test
  public void AssmtNASubjectRemarksBank() throws Exception
  {
	  System.out.println("------------ Assessment NA Subject Remarks Bank ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  nasubjremarksBank=dashbrd.NASubjectRemarksBank();
	  nasubjDetials=new AssmtNASubjectDetialsPage(driver);
	  nasubjDetials.seleStandard("IX");
	  nasubjDetials.seleSubjArea(areaName);
	  nasubjDetials.seleSubject(subjNam);
	  nasubjDetials.seleStrands(1);
	  Thread.sleep(2000);
	  for(int i=0;i<3;i++)
	  {
		  sendKeys(nasubjDetials.enterDetails().get(i),"Remarks Bank"+i);
	  }
	  nasubjDetials.addBtn();
  }
  
  @Test
  public void AssmtNAOptionalSubjectAllocation() throws Exception
  {
	  System.out.println("------------ Assessment NA Optional Subject Allocation ----------");
	  dashbrd.assessmentPage();
	  dashbrd.NAAreaMaster();
	  naoptionSubjAllocation=dashbrd.NAOptionalSubjAllocation();
	  AssertValidation(naoptionSubjAllocation.pageTitle(), "Non- Academic Optional Subject Allocation");
  }
  
  String subjNamMstr;
  @Test
  public void AssmtAcadmiAssesmentSubjects() throws Exception
  {
	  System.out.println("------------ Assessment Acadmic Assesment Subjects ----------");
	  dashbrd.assessmentPage();
	  dashbrd.academicSubjectsBtn();
	  academicAssmtSubjts=dashbrd.assessmentSubject();
	  academicAssmtSubjts.seleSubjectArea(areaName);//"TestAreaNam37"
	  academicAssmtSubjts.seleStandard("IX");
	  academicAssmtSubjts.enterSubjectCode("SubjectCode"+count+"001");
	  subjNamMstr="TestSubjectNamMaster"+count+"001";
	  academicAssmtSubjts.enterSubjectName(subjNamMstr);
	  academicAssmtSubjts.enterSequNum("001");
	  academicAssmtSubjts.checkOptionalSubj();
	  academicAssmtSubjts.seleOptionalSubj(1);
	  academicAssmtSubjts.checkMockTestSubj();
	  academicAssmtSubjts.seleStatus(1);
	  academicAssmtSubjts.addBtn();
	  
	  for(int i=0;i<=2;i++)
	  {
		  int num=i+2;
		  String snum=""+num;
		  academicAssmtSubjts.seleSubjectArea(areaName);//"TestAreaNam38"
		  academicAssmtSubjts.seleStandard("IX");
		  academicAssmtSubjts.enterSubjectCode("SubjectCode"+count+"00"+snum);
		/*  if(i==0) {
		  academicAssmtSubjts.enterSubjectName("TestSubjectNam00"+snum);
		  }else {*/
		  academicAssmtSubjts.enterSubjectName("TestSubjectNam"+count+"00"+snum);
//		  }
		  academicAssmtSubjts.enterSequNum(snum);
		  academicAssmtSubjts.checkOptionalSubj();
		  int optionsele=num-1;
		  academicAssmtSubjts.seleOptionalSubj(optionsele);
		  academicAssmtSubjts.checkMockTestSubj();
		  academicAssmtSubjts.seleStatus(1);
		  academicAssmtSubjts.addBtn();
	  }
  }
  
  @Test
  public void AssmtAcadmiAssesmentSubjectsGrouping() throws Exception
  {
	  System.out.println("------------ Assessment Acadmic Assesment Subjects Grouping ----------");
	  dashbrd.assessmentPage();
	  dashbrd.academicSubjectsBtn();
	  academicAssmtSubjtsGroping=dashbrd.assessmentSubjectGrouping();
	  AssertValidation(academicAssmtSubjtsGroping.pageTitl(), "Assessment Subject Grouping");
	  academicAssmtSubjtsGroping.seleStandard("IX");
	  academicAssmtSubjtsGroping.seleSubArea(areaName);//"TestAreaNam40"
	  academicAssmtSubjtsGroping.seleSubject(subjNamMstr);//"TestSubjectNamMaster001"
	  System.out.println("selected Subject : "+subjNamMstr);
	  academicAssmtSubjtsGroping.printHeader();
	  Thread.sleep(1000);
	  int data=academicAssmtSubjtsGroping.printData().size();
	  //int recordsCont=data/4;
	  //System.out.println(data+"----"+recordsCont);
	  for(int i=0;i<academicAssmtSubjtsGroping.printHeader().size();i++)
	  {
		  System.out.print(academicAssmtSubjtsGroping.printHeader().get(i).getText()+"----");
	  }
	  
		  System.out.println();
		  for(int j=0;j<data;j++)
		  {
			  if(j!=3||j!=7||j!=11)
			  {
			 System.out.print(academicAssmtSubjtsGroping.printData().get(j).getText()+"---");
			  }
			 if(j==3||j==7||j==11)
			 {
				 int check=0;
				 academicAssmtSubjtsGroping.seleCheckBox().get(check).click();
				 check++;
				 System.out.print("Checked");
				 System.out.println();
			 }
		  }
		  academicAssmtSubjtsGroping.addBtn();
  }
  
  @Test
  public void AssmtAcadmiOptionalSubjectAllocation() throws Exception
  {
	  System.out.println("------------ Assessment Acadmic Optional Subject Allocation ----------");
	  dashbrd.assessmentPage();
	  dashbrd.academicSubjectsBtn();
	  optionalSubAllocation=dashbrd.optionalSubjAllocation();
	  AssertValidation(optionalSubAllocation.pageTitle(), "Optional Subject Allocation");
	  optionalSubAllocation.seleSession("2020-2021");
	  optionalSubAllocation.seleStandrdSession("IX/A");
	  optionalSubAllocation.seleSubArea("TestAreaNam41");
	  optionalSubAllocation.seleSubjectType("II Language");
	  optionalSubAllocation.seleSubject("TestSubjectNamMaster41001");
	  Thread.sleep(2000);
	  for(int i=0;i<optionalSubAllocation.printHeader().size();i++)
	  {
		  System.out.print(optionalSubAllocation.printHeader().get(i).getText()+"----");
	  }
	  ScrolljavaScript(optionalSubAllocation.namScroll());
	  System.out.println();
	  for (int i = 0; i < optionalSubAllocation.printData().size(); i++) 
	  {
		  if(i<3)
		  {
			System.out.print(optionalSubAllocation.printData().get(i).getText()+"---");  
		  }else if(i==4)
		  {
			  optionalSubAllocation.seleCheckBox().click();
			  System.out.print("checked");
		  }
	  }
	  Thread.sleep(1000);
	  ScrolljavaScript(optionalSubAllocation.addBtnScoll());
	  Thread.sleep(1000);
	  optionalSubAllocation.addBtn();
	  Thread.sleep(6000);
	  /*WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(15));
      wait.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.AlertIsPresent());*/
	  driver.switchTo().alert().accept();
	  Thread.sleep(1000);
	  driver.get(driver.getCurrentUrl());
	  Thread.sleep(1000);
	  optionalSubAllocation.seleSession("2020-2021");
	  optionalSubAllocation.seleStandrdSession("IX/A");
	  optionalSubAllocation.seleSubArea("TestAreaNam41");
	  optionalSubAllocation.seleSubjectType("II Language");
	  Thread.sleep(1000);
	  optionalSubAllocation.seleSubject("TestSubjectNamMaster41001");
	  System.out.println();
	  Thread.sleep(2000);
	  for(int i=0;i<optionalSubAllocation.printHeader().size();i++)
	  {
		  System.out.print(optionalSubAllocation.printHeader().get(i).getText()+"----");
	  }
	  System.out.println();
	  ScrolljavaScript(optionalSubAllocation.namScroll());
	  for (int i = 0; i < optionalSubAllocation.printData().size(); i++) 
	  {
		  if(i<=3)
		  {
			System.out.print(optionalSubAllocation.printData().get(i).getText()+"---");  
		  }else if(i==4)
		  {
			  Thread.sleep(1000);
			   boolean check = optionalSubAllocation.seleCheckBox().isSelected();
			  System.out.print("checked Status - "+check);
		  }
	  }
  }
  
@Test
public void AssmtAcadmiOptionalSubjectReport() throws Exception
{
	System.out.println("------------ Assessment Acadmic Optional Subject Report ----------");
	  dashbrd.assessmentPage();
	  dashbrd.academicSubjectsBtn();
	  optinalSubReport=dashbrd.optionalsubjReport();
	  AssertValidation(optinalSubReport.pageTitle(), "Optional Subject Allocation Report");
	  
	  optionalSubAllocation = new AsstAcademicOptionalSubjAllocationPage();
	  optionalSubAllocation.seleSession("2020-2021");
	  optionalSubAllocation.seleStandrdSession("IX/A");
	  optionalSubAllocation.seleSubArea("TestAreaNam41");
	  optionalSubAllocation.seleSubjectType("II Language");
	  Thread.sleep(1000);
	  optionalSubAllocation.seleSubject("TestSubjectNamMaster41001");
	  Thread.sleep(2000);
	  optinalSubReport.searchTxt("anil");
	  Thread.sleep(1000);
	  for(int i=0;i<optionalSubAllocation.printHeader().size();i++)
	  {
		  System.out.print(optionalSubAllocation.printHeader().get(i).getText()+"----");
	  }
	  System.out.println();
	  for (int i = 0; i < optinalSubReport.searchData().size(); i++) 
	  {
		  System.out.print(optinalSubReport.searchData().get(i).getText()+"---");
	}
}

@Test
public void AsstAcademicOptionalSubLanguagCountReport() throws Exception
{
	System.out.println("------------ Assessment Acadmic Optional Subject Language Count Report ----------");
	  dashbrd.assessmentPage();
	  dashbrd.academicSubjectsBtn();
	  optionalSubContRprt= dashbrd.optionalSubjLangugContRprt();
	  AssertValidation(optionalSubContRprt.pageTitle(), "Optional Subject Allocation Count Report");
	  optionalSubAllocation = new AsstAcademicOptionalSubjAllocationPage();
	  optionalSubAllocation.seleSession("2020-2021");
	  optionalSubContRprt.seleStandard("IX");
	  optionalSubContRprt.selearea("TestAreaNam41");
	  Thread.sleep(1000);
	  for(int i=0;i<optionalSubAllocation.printHeader().size();i++)
	  {
		  System.out.print(optionalSubAllocation.printHeader().get(i).getText()+"----");
	  }
	  System.out.println();
	  optinalSubReport=new AsstAcademicOptionalSubReportPage();
	  for (int i = 0; i < optinalSubReport.searchData().size(); i++) 
	  {
		  System.out.print(optinalSubReport.searchData().get(i).getText()+"---/");
	  }
	  
}
}
