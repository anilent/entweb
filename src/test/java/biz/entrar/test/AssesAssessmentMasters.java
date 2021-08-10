package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.pagesPOM.AsstMasterAssmessmentGroupingpage;
import biz.entrar.pagesPOM.AsstMasterExamActivity;
import biz.entrar.pagesPOM.AsstMasterExamSubjectMarksPage;
import biz.entrar.pagesPOM.AsstMstrAssessmentDetialsPage;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AssesAssessmentMasters extends BaseTest{
	
	DashboardPage dashbrd;
	AsstMstrAssessmentDetialsPage assesmentDetails;
	AsstMasterExamActivity assmExamActivity;
	AsstMasterAssmessmentGroupingpage assmentGrouping;
	AsstMasterExamSubjectMarksPage examSubjectMarks;
	
  @BeforeClass
  public void beforeClass() {
	  System.out.println("------------ Assessment Assessement Masters ----------");
	  dashbrd =new DashboardPage(driver);
  }

  @AfterClass
  public void afterClass() {
  }
  
  String examNam ;
  String examNam2;
  String prntNam;
  @Test
  public void AMAssessmentDetails() throws Exception
  {
	  System.out.println("------------ Assessment Master Assessment Detials ----------");
	  dashbrd.assessmentPage();
	  dashbrd.assessmentMasterBtn();
	  assesmentDetails=dashbrd.assessmentDetials();
	  AssertValidation(assesmentDetails.pageTitle(), "Examination Details");
	  assesmentDetails.seleYear("2020-2021");
	  assesmentDetails.seleStandard("IX");
	  int count=assesmentDetails.entrExamName().size();
	  int newcount=assesmentDetails.entrNewExamName().size();
		System.out.println(count+" data-------new count "+newcount);
	 /* if(count>=1)
	  {
		for(int i=0;i<assesmentDetails.printHeader().size();i++)
		{
			System.out.print(assesmentDetails.printHeader().get(i).getText()+"--");
		}
		System.out.println();
		for(int i=0;i<=1;i++)
		{
			System.out.println("getting inside get text");
			System.out.println(assesmentDetails.entrExamName().get(i).getText());
			System.out.println(assesmentDetails.entrPrintName().get(i).getText());
			System.out.println( assesmentDetails.seleActive().get(i).getText());
			assesmentDetails.seleNewAttedStartDate().get(i).sendKeys("11/02/2020");
			  assesmentDetails.seleNewAttedEndDate().get(i).sendKeys("11/02/2020");
			  assesmentDetails.seleNewBrakupSubject().get(i).sendKeys("Yes");
			  assesmentDetails.seleNewSkillExam().get(i).sendKeys("Yes");
			System.out.println(assesmentDetails.seleExamFetchType().get(i).getText());
			//System.out.println(assesmentDetails.printData().get(i).getText()+"--");
			}
	  }*/
	  if(count>=1)
	  {
		  for(int i=0;i<=1;i++)
		  {
			  System.out.println(i+"adding new subject------");
			  assesmentDetails.entrExamName().get(i).clear();
			  if(i==0)
			  {
			  examNam="ExamNameTest"+dms();
			  assesmentDetails.entrExamName().get(i).sendKeys(examNam);
			  }
			  if(i==1)
			  {
				  Thread.sleep(1000);
			  examNam2="ExamNameTest"+dms();
			  assesmentDetails.entrExamName().get(i).sendKeys(examNam2);
			  }
			  prntNam="PrntNameTest"+dms();			  
			  Thread.sleep(1000);
			  assesmentDetails.entrPrintName().get(i).clear();
			  assesmentDetails.entrPrintName().get(i).sendKeys(prntNam);
			  assesmentDetails.seleActive().get(i).sendKeys("Yes");
			  assesmentDetails.seleAttedStartDate().get(i).sendKeys(currentDate());
			  assesmentDetails.seleAttedEndDate().get(i).sendKeys(currentDate());
			  assesmentDetails.seleBrakupSubject().get(i).sendKeys("Yes");
			  assesmentDetails.seleSkillExam().get(i).sendKeys("Yes");
			  assesmentDetails.seleExamFetchType().get(i).sendKeys("Actual");
		  }
		  assesmentDetails.addBtn();
	  }
	  assesmentDetails.seleYear("2020-2021");
	  assesmentDetails.seleStandard("IX");
  }
  
  @Test
  public void AMExamActivity() throws Exception
  {
	  System.out.println("------------ Assessment Master Exam Activity ----------");
	  dashbrd.assessmentPage();
	  dashbrd.assessmentMasterBtn();
	  assmExamActivity= dashbrd.examActivitys();
	  AssertValidation(assmExamActivity.pageTitle(), "Examination Activity (Sub Exams)");
	  for(int k=0;k<=1;k++)
	  {
	  assmExamActivity.seleYear("2020-2021");
	  assmExamActivity.seleStandard("IX");
	  if(k==0)
	  {
	  assmExamActivity.seleExamName(examNam);//examNam"ExamNameTest034101"
	  }else if(k==1)
	  {
		  assmExamActivity.seleExamName(examNam2);
	  }
	  int activitsize=assmExamActivity.activityNameEtrold().size();
	  System.out.println(activitsize);
	  if(activitsize>=1)
	  {
		  for(int i=0;i<=1;i++)
		  {
			  System.out.println(i+"old");
			  assmExamActivity.activityNameEtrold().get(i).clear();
			  assmExamActivity.activityNameEtrold().get(i).sendKeys("activityNamTest"+dms());
			  assmExamActivity.maxMarksold().get(i).clear();
			  assmExamActivity.maxMarksold().get(i).sendKeys("20");
			  assmExamActivity.reduceMarksold().get(i).clear();
			  assmExamActivity.reduceMarksold().get(i).sendKeys("10");
			  assmExamActivity.seleStatusold().get(i).sendKeys("Active");
			  assmExamActivity.seqNumold().get(i).clear();
			  assmExamActivity.seqNumold().get(i).sendKeys("01");
		  }
		  
	  }else {
		  for(int i=0;i<1;i++)
		  {
			  System.out.println("new");
			  assmExamActivity.activityNameEtr().get(i).sendKeys("activityNamTest0010");
			  assmExamActivity.maxMarks().get(i).sendKeys("50");
			  assmExamActivity.reduceMarks().get(i).sendKeys("25");
			  assmExamActivity.seleStatus().get(i).sendKeys("Active");
			  assmExamActivity.seqNum().get(i).sendKeys("01");
	  		}
	  }
	  assmExamActivity.addBtn();
	  }
	  Thread.sleep(1000);
	  assmExamActivity.seleYear("2020-2021");
	  assmExamActivity.seleStandard("IX");
	  //assmExamActivity.seleExamName(examNam);  
  }
  
  @Test
  public void AMAssessmentGrouping() throws Exception
  {
	  System.out.println("------------ Assessment Master Assessment Grouping ----------");
	  dashbrd.assessmentPage();
	  dashbrd.assessmentMasterBtn();
	  assmentGrouping=dashbrd.assessmentGrouping();
	  AssertValidation(assmentGrouping.pageTitle(), "Assessment Grouping");
	  assmentGrouping.seleYear("2020-2021");
	  assmentGrouping.seleStandard("IX");
	  ScrolljavaScript(assmentGrouping.assmntListHeadr());
	  Thread.sleep(1000);
	  int delete=assmentGrouping.deleteBtn().size();
	  System.out.println("Size is "+delete);
	  if(delete>0)
	  {
	  for(int i=1;i<=delete;i++)
	  {
		  int j=0;
		  System.out.println(i+"-"+delete+"-"+j);
		  ScrolljavaScript(assmentGrouping.deleteBtn().get(j));
		  assmentGrouping.deleteBtn().get(j).click();
		  Thread.sleep(2000);
		  ScrolljavaScript(assmentGrouping.pageTitleScrol());
		  assmentGrouping.seleYear("2020-2021");
		  assmentGrouping.seleStandard("IX");
	  }
	  assmentGrouping.seleYear("2020-2021");
	  assmentGrouping.seleStandard("IX");
	  assmentGrouping.EntrMode("MID TERM");
	  assmentGrouping.seleSkill(1);
	  assmentGrouping.seleDescriptor(1);
	  assmentGrouping.seleRemarks(1);
	  assmentGrouping.sleChart(1);
	  assmentGrouping.seleIgnoreSubGroping();
	  assmentGrouping.seleNonAcademic(1);
	  assmentGrouping.seleAttendance(1);
	  assmentGrouping.seleCheckReportMarks();
	  assmentGrouping.seleCheckPrintTotal();
	  assmentGrouping.entrDetails("MID TERM TEST");
	  int checkboxCount=assmentGrouping.seleCheckBox().size();
	  System.out.println("Assessment Count is "+checkboxCount);
	  for(int i=0;i<checkboxCount;i++)
	  {
		  assmentGrouping.seleCheckBox().get(i).click();
		  String seqnum=i+1+"";
		  assmentGrouping.enterSeqNum().get(i).sendKeys(seqnum);
		  assmentGrouping.emterWeightage().get(i).sendKeys("100");
	  }
	  assmentGrouping.addBtn();
	  Thread.sleep(1000);
	  assmentGrouping.seleYear("2020-2021");
	  assmentGrouping.seleStandard("IX");
	  ScrolljavaScript(assmentGrouping.assmntListHeadr());
	  Thread.sleep(1000);
	  }else if (delete==0)
	  {
		  assmentGrouping.EntrMode("MID TERM");
		  assmentGrouping.seleSkill(1);
		  assmentGrouping.seleDescriptor(1);
		  assmentGrouping.seleRemarks(1);
		  assmentGrouping.sleChart(1);
		  assmentGrouping.seleIgnoreSubGroping();
		  assmentGrouping.seleNonAcademic(1);
		  assmentGrouping.seleAttendance(1);
		  assmentGrouping.seleCheckReportMarks();
		  assmentGrouping.seleCheckPrintTotal();
		  assmentGrouping.entrDetails("MID TERM TEST");
		  int checkboxCount=assmentGrouping.seleCheckBox().size();
		  System.out.println("Assessment Count is "+checkboxCount);
		  for(int i=0;i<checkboxCount;i++)
		  {
			  assmentGrouping.seleCheckBox().get(i).click();
			  String seqnum=i+1+"";
			  assmentGrouping.enterSeqNum().get(i).sendKeys(seqnum);
			  assmentGrouping.emterWeightage().get(i).sendKeys("100");
		  }
		  assmentGrouping.addBtn();
		  Thread.sleep(1000);
		  assmentGrouping.seleYear("2020-2021");
		  assmentGrouping.seleStandard("IX");
		  ScrolljavaScript(assmentGrouping.assmntListHeadr());
		  Thread.sleep(1000);
	  }
	  	  
  }
  
  @Test
  public void AMExamSubjectMarks() throws Exception
  {
	  System.out.println("------------ Assessment Master Exam Subject Marks ----------");
	  Thread.sleep(1000);
	  dashbrd.assessmentPage();
	  dashbrd.assessmentMasterBtn();
	  examSubjectMarks=dashbrd.excamSubjctMarks();
	  AssertValidation(examSubjectMarks.pageTitle(), "Exam Subject Marks");
	  for(int i=0;i<2;i++)
	  {
	  examSubjectMarks.seleyear("2020-2021");
	  examSubjectMarks.seleStandard("IX");
	  int exmNam=i+1;
	  examSubjectMarks.seleExamNam(exmNam);
	  Thread.sleep(1000);
	  for(int j=0;j<examSubjectMarks.maxMarksNtr().size();j++)
	  {
		  System.out.println("maxmark count - "+examSubjectMarks.maxMarksNtr().size());
		  examSubjectMarks.maxMarksNtr().get(j).clear();
		  examSubjectMarks.maxMarksNtr().get(j).sendKeys("25");
		  examSubjectMarks.minMarksNtr().get(j).clear();
		  examSubjectMarks.minMarksNtr().get(j).sendKeys("10");
		  examSubjectMarks.maxMarksEntry().get(j).clear();
		  examSubjectMarks.maxMarksEntry().get(j).sendKeys("23");
		  examSubjectMarks.seleBestTst(examSubjectMarks.seleBest().get(j), 2);
		  examSubjectMarks.seleFixedList(examSubjectMarks.seleFixed().get(j), exmNam);
		  examSubjectMarks.seleRoundingList(examSubjectMarks.seleRounding().get(j), exmNam);
	  }
	  Thread.sleep(1000);
	  examSubjectMarks.addBtn();
	  Thread.sleep(1000);
	  }
	  examSubjectMarks.seleyear("2020-2021");
	  examSubjectMarks.seleStandard("IX");
	  examSubjectMarks.seleExamNam(1);
  }
  
  
}