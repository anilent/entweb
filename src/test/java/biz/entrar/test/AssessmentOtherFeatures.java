package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.pagesPOM.AssessmentClassTeacherMappingMultiplePage;
import biz.entrar.pagesPOM.AssessmentClassTeacherMappingSinglePage;
import biz.entrar.pagesPOM.AssessmentPublishedTestWiseResultPage;
import biz.entrar.pagesPOM.AssessmentRemarksBank;
import biz.entrar.pagesPOM.AssessmentStudentMedicalDetailsPage;
import biz.entrar.pagesPOM.AssessmentStudentRollNumGenerationPage;
import biz.entrar.pagesPOM.AssessmentSubGroupGradesPage;
import biz.entrar.pagesPOM.AssessmentSubjectWiseCommentPage;
import biz.entrar.pagesPOM.AssessmentTeacherSignatureUpload;
import biz.entrar.pagesPOM.AssessmentTeacherSubAllocationPage;
import biz.entrar.pagesPOM.AssessmentpublishActivityWiseResultsPage;
import biz.entrar.pagesPOM.AssessmentpublishFinalWiseResultsPage;
import biz.entrar.pagesPOM.AssessmentpublishTermWiseResultsPage;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AssessmentOtherFeatures extends BaseTest{
	
	DashboardPage dashbrd;
	AssessmentTeacherSubAllocationPage tecrsuballowc;
	AssessmentSubjectWiseCommentPage subWisecommnts;
	AssessmentRemarksBank remarksBank;
	AssessmentSubGroupGradesPage subGroupGrade;
	AssessmentTeacherSignatureUpload teacherSignupload;
	AssessmentClassTeacherMappingSinglePage sigleTeachMapping;
	AssessmentStudentRollNumGenerationPage stdRollnumGeraion;
	AssessmentStudentMedicalDetailsPage stdMedicalDeil;
	AssessmentClassTeacherMappingMultiplePage multiplcalssTechMappin;
	AssessmentPublishedTestWiseResultPage testwiseResults;
	AssessmentpublishTermWiseResultsPage termwiseResults;
	AssessmentpublishFinalWiseResultsPage finalResults;
	AssessmentpublishActivityWiseResultsPage activityWise;
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("------------ Assessment Other Masters ----------");
	  dashbrd =new DashboardPage(driver);
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void AssmTeacherSubAllocation() throws Exception
  {
	  System.out.println("------------ Assessment Teacher subject Allocation ----------");
	  dashbrd.assessmentPage();
	  tecrsuballowc=dashbrd.teacherSubAllocation();
	  AssertValidation(tecrsuballowc.pageTitle(), "Teacher Subject Allocation");
	  tecrsuballowc.seleYear("2020-2021");
	  tecrsuballowc.seleStandard("IX");
	  tecrsuballowc.seleTeacher("8963");
	  int size=tecrsuballowc.seleSectionEle();
	  System.out.println(size);
	  if(size>0)
	  {
	  for(int i=0;i<size-1;i++)
	  {
		  Thread.sleep(1000);
		  tecrsuballowc.seleSection(i+1);
		  Thread.sleep(2000);
		  tecrsuballowc.seleAll();
		  Thread.sleep(1000);
		  tecrsuballowc.seleAll();
		  Thread.sleep(2000);
		  for(int j=1;j<=3;j++)
		  {
			  System.out.println(j+" checked");
			  Thread.sleep(1000);
			  tecrsuballowc.seleSubcheckbox().get(j).click();
			  Thread.sleep(1000);
		  }
		  tecrsuballowc.addBtn();
		  Thread.sleep(5000);
		  waitForAlert(driver);
		  Thread.sleep(1000);
	  }
	  }else {
		  System.out.println("no Sections are present to allocate the Subjects");
	  }
  }
  
  @Test
  public void AssmSubjectWiseComments() throws Exception
  {
	  System.out.println("------------ Assessment SubjectWise Comments ----------");
	  dashbrd.assessmentPage();
	  subWisecommnts=dashbrd.AssemSubWiseComments();
	  AssertValidation(subWisecommnts.pageTitle(), "Subject Comments");
	  subWisecommnts.seleStandard("IX");
	  int areaDsize=selectdropdowSize(subWisecommnts.seleSubArea());
	  Thread.sleep(1000);
	  selectdropdown(subWisecommnts.seleSubArea(), areaDsize-1);
	  int subjDsize=selectdropdowSize(subWisecommnts.seleSubject());
	  System.out.println(areaDsize+"SubArea ---Subject "+subjDsize);
	  for(int i=1;i<subjDsize;i++)
	  {
		  selectdropdown(subWisecommnts.seleSubject(), i);
		  Thread.sleep(1000);
		  for(int j=0;j<3;j++)
		  {
			  subWisecommnts.commentsEtr().get(j).sendKeys("Comments00"+j);
		  }
	  }
	  AssertValidation(subWisecommnts.pageTitle(), "Subject Commentss");
  }
  @Test
  public void AssmAssessmentRemarksBank() throws Exception
  {
	  System.out.println("------------ Assessment Remarks Bank ----------");
	  dashbrd.assessmentPage();
	  remarksBank= dashbrd.assesmRemarksBank();
	  AssertValidation(remarksBank.pageTitle(), "Remark Bank");
	  remarksBank.seleStandard("IX");
	  int remarSize=remarksBank.remarkstxt().size();
	  remarksBank.newRemarksEtr("Remark00"+(remarSize+1));
	  remarksBank.addBtn();
	  Thread.sleep(1000);	  
	  for(int i=0;i<remarSize;i++)
	  {
		  remarksBank.remarkstxt().get(i).clear();
		  remarksBank.remarkstxt().get(i).sendKeys("updatedRemarks"+(remarSize+i));
	  }
	  Thread.sleep(1000);
	  for(int j=0;j<remarSize;j++)
	  {
		  remarksBank.deleteBtn().get(j).click();
		  waitForAlert(driver);
	  }
  }
  
  @Test
  public void AssessmentSubjectGroupGrades() throws Exception
  {
	  System.out.println("------------ Assessment Subject Group Grades ----------");
	  dashbrd.assessmentPage();
	  subGroupGrade=dashbrd.assesmSubGroupGrades();
	  AssertValidation(subGroupGrade.pageTitle("\"Page Title Verification\""), "Subject Group Grades");
	  
	  int sizeofdrop=selectdropdowSize(subGroupGrade.seleSubArea());
	  selectdropdown(subGroupGrade.seleSubArea(), sizeofdrop-1);
	  subGroupGrade.addBtn();
	  subGroupGrade.entrGradeCode("B");
	  subGroupGrade.entrSeqNum("02");
	  subGroupGrade.entrFromPrcnt("50");
	  subGroupGrade.entrTopPrcnt("59");
	  subGroupGrade.entrDetails("detials002");
	  subGroupGrade.entrColorNam("Yellow");
	  Thread.sleep(1000);
	  subGroupGrade.submitBtn();
	  Thread.sleep(1000);
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  for(int i=0;i<1;i++)
	  {
		  selectdropdown(subGroupGrade.seleSubArea(), sizeofdrop-1);
		  subGroupGrade.deleteBtn().get(i).click();
		  subGroupGrade.editGradeCode("B");
		  subGroupGrade.editSeqNum("02");
		  subGroupGrade.editFromPrcnt("50");
		  subGroupGrade.editTopPrcnt("59");
		  subGroupGrade.editDetails("detials002");
		  subGroupGrade.editColorNam("Yellow");
	  }
  }
  
  @Test
  public void AssessmentTeacherSignatureUpload() throws Exception
  {
	  System.out.println("------------ Assessment Teacher Signature Upload ----------");
	  dashbrd.assessmentPage();
	  teacherSignupload=dashbrd.teacherSignUpload();
	  AssertValidation(getAttribut(teacherSignupload.pageTitle(), "Text", "Page Title Verification"), "Teacher Signature Upload");
	  teacherSignupload.seleYear("2020-2021");
	  ScrolljavaScript(teacherSignupload.teacherNam());
	  System.out.println(teacherSignupload.teacherNam().getText());
	  Thread.sleep(1000);
	  teacherSignupload.chooseFile().sendKeys("D:\\anil\\Automation\\biz.entrar\\src\\test\\resources\\images.png");
	  Thread.sleep(500);
	  ScrolljavaScript(teacherSignupload.pageTitle());
	  teacherSignupload.addBtn();
	  
  }
  @Test
  public void AssessmentClassTeacherMappingSingle() throws Exception
  {
	  System.out.println("------------ Assessment Single Class Teacher Mapping ----------");
	  dashbrd.assessmentPage();
	  sigleTeachMapping=dashbrd.calssTeacherMappingSingle();
	  AssertValidation(getAttribut(sigleTeachMapping.pageTitle(), "Text", "Page Title Verification"), "Class Teacher Mapping");
	  for(int i=0;i<2;i++)
	  {
	  sigleTeachMapping.seleYear("2020-2021");
	  sigleTeachMapping.seleTeacher("8963");
	  ScrolljavaScript(sigleTeachMapping.seleCheckboxscroll());
	  Thread.sleep(1000);
	  sigleTeachMapping.seleCheckbox().click();
	  Thread.sleep(1000);
	  ScrolljavaScript(sigleTeachMapping.pageTitle());
	  Thread.sleep(1000);
	  sigleTeachMapping.addBtn().click();
	  Thread.sleep(1000);
	  }
  }
  @Test
  public void AssessmentStudentRollNumGeneration() throws Exception
  {
	  System.out.println("------------ Assessment Student Roll Number Generaration ----------");
	  dashbrd.assessmentPage();
	  stdRollnumGeraion=dashbrd.generatStdRollNum();
	  AssertValidation(getAttribut(stdRollnumGeraion.pageTitle(), "Text", "Page Title Verification"), "Student Roll No Generation");
	  stdRollnumGeraion.seleYear("2020-2021");
	  stdRollnumGeraion.seleStandard("IX/A");
	  ScrolljavaScript(stdRollnumGeraion.rollnumEtr());
	  Thread.sleep(1000);
	  stdRollnumGeraion.rollnumEtr().clear();
	  stdRollnumGeraion.rollnumEtr().sendKeys(stdRollnumGeraion.rollnum().getText());
	  Thread.sleep(1000);
	  ScrolljavaScript(stdRollnumGeraion.pageTitle());
	  Thread.sleep(1000);
	  stdRollnumGeraion.addBtn();
	  Thread.sleep(1000);
	  stdRollnumGeraion.seleYear("2020-2021");
	  stdRollnumGeraion.seleStandard("IX/A");
	  ScrolljavaScript(stdRollnumGeraion.rollnumEtr());
	  Thread.sleep(1000);
  }
  
  @Test
  public void AssessmentStudentMedicalDetails() throws Exception
  {
	  System.out.println("------------ Assessment Student Medical Details ----------");
	  dashbrd.assessmentPage();
	  stdMedicalDeil=dashbrd.stdMedicalDetails();
	  AssertValidation(getAttribut(stdMedicalDeil.pagTitle(), "Text", "Page Title Verification"), "Height and Weight Termwise");	    
  }
  
  @Test
  public void AssessmentClassTeacherMappingMultiple() throws Exception
  {
	  System.out.println("------------ Assessment Multiple Class Teacher Mapping ----------");
	  dashbrd.assessmentPage();
	  multiplcalssTechMappin=dashbrd.calssTeacherMappingMultiple();
	  AssertValidation(getAttribut(multiplcalssTechMappin.pageTitle(),"Text","Page Title Verification"), "Multiple Class Teacher Mapping");
	  sigleTeachMapping=new AssessmentClassTeacherMappingSinglePage();
	  for(int i=0;i<2;i++)
	  {
	  sigleTeachMapping.seleYear("2020-2021");
	  sigleTeachMapping.seleTeacher("8963");
	  ScrolljavaScript(sigleTeachMapping.seleCheckboxscroll());
	  Thread.sleep(1000);
	  sigleTeachMapping.seleCheckbox().click();
	  multiplcalssTechMappin.selecheckboxB().click();
	  multiplcalssTechMappin.selecheckboxC().click();
	  Thread.sleep(1000);
	  ScrolljavaScript(multiplcalssTechMappin.pageTitle());
	  Thread.sleep(1000);
	  sigleTeachMapping.addBtn().click(); 
	  }
	  sigleTeachMapping.seleYear("2020-2021");
	  sigleTeachMapping.seleTeacher("8963");
	  ScrolljavaScript(sigleTeachMapping.seleCheckboxscroll());
	  Thread.sleep(1000);
  }
  
  
  @Test
  public void AssessmentPublishTestWiseResults() throws Exception
  {
	  System.out.println("------------ Assessment Publish Exam Results Test Wise ----------");
	  dashbrd.assessmentPage();
	  dashbrd.publishedResult();
	  testwiseResults=dashbrd.testWiseResults();
	  AssertValidation(getAttribut(testwiseResults.pageTitle(), "Text", "Page Title Verification"), "Published Exam Results Testwise");
	  testwiseResults.seleYear("2020-2021");
	  testwiseResults.seleStandard("IX/A");
	  Thread.sleep(1000);
	  testwiseResults.seleExamNam(1);
	  Thread.sleep(1000);
  }
  
  @Test
  public void AssessmentPublishTermWiseResults() throws Exception
  {
	  System.out.println("------------ Assessment Publish Exam Results Term Wise ----------");
	  dashbrd.assessmentPage();
	  dashbrd.publishedResult();
	  termwiseResults=dashbrd.termWiseResults();
	  AssertValidation(getAttribut(termwiseResults.pageTitle(), "Text", "Page Title Verification"), "Published Exam Results Testwise");
	  testwiseResults=new AssessmentPublishedTestWiseResultPage();
	  testwiseResults.seleYear("2020-2021");
	  testwiseResults.seleStandard("IX/A");
	  Thread.sleep(1000);
	  termwiseResults.termName(1);
  }
  
  
  
  @Test
  public void AssessmentPublishFinalResults() throws Exception
  {
	  System.out.println("------------ Assessment Publish Final Exam Results ----------");
	  dashbrd.assessmentPage();
	  dashbrd.publishedResult();
	  finalResults=dashbrd.finalExamResults();
	  AssertValidation(getAttribut(finalResults.pageTitle(), "Text", "Page Title Verification"), "Published Exam Results Final Exam");
	  testwiseResults=new AssessmentPublishedTestWiseResultPage();
	  testwiseResults.seleYear("2020-2021");
	  testwiseResults.seleStandard("IX/A");
	  Thread.sleep(1000);
	  selectdropdown(finalResults.finalName(), 1);
  }
  
  
  @Test
  public void AssessmentAcitvityWiseResults() throws Exception 
  {
	  System.out.println("------------ Assessment Publish Final Exam Results ----------");
	  dashbrd.assessmentPage();
	  dashbrd.publishedResult();
	  activityWise=dashbrd.activityWiseResults();
	  AssertValidation(getAttribut(activityWise.pageTitle(), "Text", "Page title Verification"), "Published Exam Results Activity Exam");
	  Thread.sleep(1000);
  }
}
