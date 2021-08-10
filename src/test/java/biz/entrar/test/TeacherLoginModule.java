package biz.entrar.test;

import org.testng.annotations.Test;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.TeacherLoginPOM.AboutMePage;
import biz.entrar.TeacherLoginPOM.AddAssignmentStandardWise;
import biz.entrar.TeacherLoginPOM.AddSectionEventsPage;
import biz.entrar.TeacherLoginPOM.AnnouncementsPage;
import biz.entrar.TeacherLoginPOM.AttendanceCountReprt;
import biz.entrar.TeacherLoginPOM.DashboardTechrPage;
import biz.entrar.TeacherLoginPOM.LesssionPlanApproval;
import biz.entrar.TeacherLoginPOM.SectionShufflingPage;
import biz.entrar.TeacherLoginPOM.StdWiseAttendanceCoutRprt;
import biz.entrar.TeacherLoginPOM.StudentHouseMapping;
import biz.entrar.TeacherLoginPOM.TeacherNoticBoardPage;
import biz.entrar.TeacherLoginPOM.addAnnouncementsPage;
import biz.entrar.TeacherLoginPOM.addLessionPlan28Page;
import biz.entrar.TeacherLoginPOM.addTeacherAnnouncementPage;
import biz.entrar.TeacherLoginPOM.addVideoPage;
import biz.entrar.TeacherLoginPOM.assignmentsStandardWise;
import biz.entrar.TeacherLoginPOM.assignmentsUploadByStdsPage;
import biz.entrar.TeacherLoginPOM.lessionPlan28Page;
import biz.entrar.TeacherLoginPOM.mySchoolPage;
import biz.entrar.TeacherLoginPOM.myprofilePage;
import biz.entrar.TeacherLoginPOM.newMarkAttendancePage;
import biz.entrar.TeacherLoginPOM.oldMarkAttendancePage;
import biz.entrar.TeacherLoginPOM.sectionEventsPage;
import biz.entrar.TeacherLoginPOM.studentSearchPage;
import biz.entrar.TeacherLoginPOM.videoGalleryPage;
import biz.entrar.TeacherLoginPOM.viewAttendancePage;
import biz.entrar.TeacherLoginPOM.wrongAttendanceDelete;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrar.pagesPOM.Login_page;
import biz.entrarBase.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;

public class TeacherLoginModule extends BaseTest{
	Login_page loginpg;
	DashboardPage admindasb;
	DashboardTechrPage tecrDash;
	AboutMePage aboutme;
	myprofilePage myprofil;
	mySchoolPage myschol;
	oldMarkAttendancePage oldMrkAttend;
	newMarkAttendancePage newMrkAttend;
	viewAttendancePage viewAttendc;
	AttendanceCountReprt attendCoutRrt;
	StdWiseAttendanceCoutRprt stdWiseRprot;
	wrongAttendanceDelete wrngAttendDelete;
	
	assignmentsStandardWise assignStdwiseview;
	AddAssignmentStandardWise addAssignStdWise;
	assignmentsUploadByStdsPage assignementUpload;
	sectionEventsPage sectionEvnt;
	AddSectionEventsPage addSectionEvt;
	lessionPlan28Page lessionPlan;
	addLessionPlan28Page addlessionPlan;
	LesssionPlanApproval lessionPlanApprovl;
	SectionShufflingPage seconShuffling;
	StudentHouseMapping houseMapping;
	studentSearchPage stdSrch;
	TeacherNoticBoardPage techrntcBrd;
	addTeacherAnnouncementPage addTechenotcBord;
	AnnouncementsPage announcemt;
	addAnnouncementsPage addannoumt;
	videoGalleryPage vidoGllry;
	addVideoPage addvidoG;
  
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
	  tecrDash= new DashboardTechrPage();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test
  public void login()
  {
	  System.out.println("------------ Login Test Case ------");
	  admindasb= loginAdmin(EnvironmentsData.teacherUsername, EnvironmentsData.teacherPassword);
	  
  }
  
  @Test
  public void AboutMe() throws Exception
  {
	  System.out.println("----------- About Me Page ------------");
	  click(tecrDash.profile());
	  Thread.sleep(1000);
	  aboutme= tecrDash.aboutMe();
	  AssertValidation(getAttribut(aboutme.pageTitle(), "Text", "Page Title Verification"), "User Profile");
	  ScrolljavaScriptEndPage();
	  click(aboutme.personalInfo());
	  click(aboutme.officeInfo());
	  click(aboutme.documtsInfo());
	  click(aboutme.workExrinfo());
  }
  
  @Test
  public void myProfile() throws Exception
  {
	  System.out.println(" ----------- My Profile Page --------");
	  click(tecrDash.profile());
	  Thread.sleep(1000);
	  myprofil=tecrDash.myprofile();
	  AssertValidation(getAttribut(myprofil.pageTitle(), "Text", "Page Title Verification"), "User Profile Setting");
	  click( myprofil.profileUpdte());
	  ScrolljavaScript(myprofil.profiUpdatButton());
	  Thread.sleep(1000);
	  ScrolljavaScript(myprofil.pageTitle());
	  click(myprofil.cangPassword());
	  ScrolljavaScript(myprofil.cngPasswSubtBtton());
	  Thread.sleep(1000);
	  ScrolljavaScript(myprofil.pageTitle());
	  click(myprofil.transportUpdate());
	  ScrolljavaScript(myprofil.transportUpdateBtton());
	  Thread.sleep(1000);
	  ScrolljavaScript(myprofil.pageTitle());
	  Thread.sleep(1000);
  }
  
  @Test
  public void mySchool() throws Exception
  {
	  System.out.println(" ---------- My school page ----------");
	  click(tecrDash.profile());
	  Thread.sleep(1000);
	  myschol=tecrDash.myscoole();
	  AssertValidation(getAttribut(myschol.pageTitle(), "Text", "Page Title Verification"), "School Information");
	  System.out.println(myschol.scholNam().getText());
  }
  
  @Test
  public void oldMarkAttendance() throws Exception
  {
	  System.out.println(" ---------- Old Mark Attendance page ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  oldMrkAttend=tecrDash.oldMarkAttendance();
	  AssertValidation(getAttribut(oldMrkAttend.pageTitle(), "Text", "Page Title Verification"), "Select Section to Mark Attendance");	  
	  Thread.sleep(2000);
  }
  @Test
  public void newMarkAttendance() throws Exception
  {
	  System.out.println(" ---------- Old Mark Attendance page ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  newMrkAttend=tecrDash.newMarkAttendance();
	  Thread.sleep(1000);
	  AssertValidation(getAttribut(newMrkAttend.pageTitle(), "Text", "Page Title verification"), "Mark Attendance");
	  Thread.sleep(1000);
	  selectdropdownTxt(newMrkAttend.seleYear(), "2020-2021");
	  /*click(newMrkAttend.seleSection());
	  click(driver.findElement(By.xpath("//*[]")));*/
	  //selectdropdownTxt(newMrkAttend.seleSection(), " II/ENTRAR ");
	  sendKeys(newMrkAttend.seleSection(), "II/ENTRAR");
	  sendKeys(newMrkAttend.seleDate(), "06/11/2021");
	  ScrolljavaScript(newMrkAttend.stdNam("ENT/0030"));
	  Thread.sleep(2000);
	  //click(e);
	  selectdropdownTxt(newMrkAttend.stdAttandce("ENT/0030"),"Absent");
	  Thread.sleep(1000);
	  ScrolljavaScript(newMrkAttend.markAttendBtn());	  
	  click(newMrkAttend.markAttendBtn());
	  waitForAlert(driver);
	  Thread.sleep(1000);
	  ScrolljavaScript(newMrkAttend.stdNam("ENT/0030"));
	  Thread.sleep(1000);
  }
  
  @Test
  public void viewAttendance() throws Exception
  {
	  System.out.println(" ---------- view Attendance page ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  viewAttendc=tecrDash.viewAttendance();
	  AssertValidation(getAttribut(viewAttendc.pageTitle(), "Text", "Page Title verification"), "View Attendance");
	  Thread.sleep(1000);
	  selectdropdownTxt(viewAttendc.seleYear(), "2020-2021");
	  sendKeys(viewAttendc.seleSection(), "II/ENTRAR");
	  selectdropdownTxt(viewAttendc.seleyear2(), "2021");
	  selectdropdownTxt(viewAttendc.seleMonth(), "June");
	  ScrolljavaScript(viewAttendc.stdId("ENT/0030"));
	  Thread.sleep(1000);
	  ScrolljavaScript(viewAttendc.stdAttdnStatus("11"));
  }
  
  @Test
  public void StdAttendanceCountReprt() throws Exception
  {
	  System.out.println(" ---------- Student Attendance Count Report ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  attendCoutRrt=tecrDash.AttendanceCoutReprt();
	  AssertValidation(getAttribut(attendCoutRrt.pageTitle(), "Text", "Page Title verification"), "Student Attendance Count Report");
	  Thread.sleep(1000);
	  selectdropdownTxt(attendCoutRrt.seleYear(), "2020-2021");
	  sendKeys(attendCoutRrt.seleStandard(),"II/ENTRAR");
	  sendKeys(attendCoutRrt.fromDate(), "06/11/2021");
	  sendKeys(attendCoutRrt.toDate(), "06/11/2021");
	  Thread.sleep(1000);
	  click(attendCoutRrt.searchBtn());
	  Thread.sleep(2000);
	  waitForVisibility(attendCoutRrt.searchText());
	  Thread.sleep(1000);
	  sendKeys(attendCoutRrt.searchText(), "ENT/0030");
	  Thread.sleep(2000);
  }
  
  @Test
  public void StdWiseAttendanceCoutRrprt() throws Exception
  {
	  System.out.println(" ---------- Student Wise Attendance Count Report ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  stdWiseRprot=tecrDash.stdWiseAttendncCoutRprt();
	  AssertValidation(getAttribut(stdWiseRprot.pageTitle(), "Text", "Page Title verification"), "Student Attendance Count Report");
	  Thread.sleep(1000);
	  attendCoutRrt= new AttendanceCountReprt();
	  selectdropdownTxt(attendCoutRrt.seleYear(), "2020-2021");
	  sendKeys(attendCoutRrt.seleStandard(),"II");
	  sendKeys(attendCoutRrt.fromDate(), "06/11/2021");
	  sendKeys(attendCoutRrt.toDate(), "06/11/2021");
	  Thread.sleep(1000);
	  //click(attendCoutRrt.searchBtn());
	  //Thread.sleep(3000);
	  //waitForVisibility(attendCoutRrt.searchText());
	  Thread.sleep(3000);
	  sendKeys(attendCoutRrt.searchText(), "ENT/0030");
	  Thread.sleep(2000);
  }
  
  
  @Test
  public void WrongAttendanceDelete() throws Exception
  {
	  System.out.println(" ---------- Wrong Attendance Delete ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  wrngAttendDelete=tecrDash.wrongAttendDelet();
	  AssertValidation(getAttribut(wrngAttendDelete.pageTitle(), "Text", "Page Title verification"), "Delete Attendance for Particular Date");
	  Thread.sleep(1000);
	  sendKeys(wrngAttendDelete.seleStandard(), "II/ENTRAR");
	  sendKeys(wrngAttendDelete.seleDate(), "06/11/2021");
	  click(wrngAttendDelete.deleteBtn());
  }
  
  @Test
  public void  AddAssignementStdWise() throws Exception
  {
	  System.out.println(" ---------- Wrong Attendance Delete ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  assignStdwiseview=tecrDash.assignStandatrdWise();
	  AssertValidation(getAttribut(assignStdwiseview.pageTitle(), "Text", "Page Title verification"), "Assignments Information Standard Wise");
	  Thread.sleep(1000);
	  addAssignStdWise= assignStdwiseview.AddnewAssign();
	  AssertValidation(getAttribut(addAssignStdWise.pageTitle(), "Text", "Page Title Verfication"), "Assignment Add Standard Wise");
	  sendKeys(addAssignStdWise.seleYear(), "2021-2021");
	  selectdropdownTxt(addAssignStdWise.seleTeacher(), "Radha");
	  selectdropdownTxt(addAssignStdWise.seleSubject(), "Science");
	  String assignameTag="QA TestTag "+dhms();
	  sendKeys(addAssignStdWise.assigmentTag(), assignameTag);
	  sendKeys(addAssignStdWise.assigment(), "QA TestAssign "+dhms());
	  sendKeys(addAssignStdWise.statDate(), currentDate());
	  sendKeys(addAssignStdWise.ednDate(), currentDate());
	  click(addAssignStdWise.ansSheetUplod());
	  sendKeys(addAssignStdWise.uploadDate(), currentDate());
	  sendKeys(addAssignStdWise.attachemtFile(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\TestPaper01.pdf");
	  click(addAssignStdWise.seleEntrarSection());
	  click(addAssignStdWise.AddnewBtn());
	  click(tecrDash.classesSection());
	  
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  assignStdwiseview=tecrDash.assignStandatrdWise();
	  sendKeys(assignStdwiseview.searchFild(), assignameTag);
	  System.out.println(assignStdwiseview.searchData().getText());
  }
  
  @Test
  public void AssignementStdUpload() throws Exception
  {
	  System.out.println(" ---------- Wrong Attendance Delete ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  assignementUpload=tecrDash.assignUploadStdWise();
	  AssertValidation(getAttribut(assignementUpload.pageTitle(), "Text", "Page Title Verification"), "Assignment Upload");
	  sendKeys(assignementUpload.seleYear(), "2020-2021");
	  sendKeys(assignementUpload.seleSection(), "II [ENTRAR]");
	  sendKeys(assignementUpload.startDate(), currentDate());
	  sendKeys(assignementUpload.endDate(), currentDate());
	  click(assignementUpload.searchBtn());
	  System.out.println(assignementUpload.noDataMsg().getText());
  }
  
  @Test
  public void sectionEvent() throws Exception
  {
	  System.out.println(" ---------- Section Events ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  sectionEvnt=tecrDash.sectionEvents();
	  AssertValidation(getAttribut(sectionEvnt.pageTitle(), "Text", "Page title Verification"), "Section Events");
	  addSectionEvt=sectionEvnt.addNewBtn();
	  AssertValidation(getAttribut(addSectionEvt.pageTitle(), "Text", "Page Title Verification"),"Section Event Add");
	  sendKeys(addSectionEvt.seleClassSection(), "II-ENTRAR");
	  String eventNam="QA Test"+dmhms();
	  sendKeys(addSectionEvt.everntName(), eventNam);
	  sendKeys(addSectionEvt.startDate(), currentDate());
	  sendKeys(addSectionEvt.endDate(), currentDate());
	  click(addSectionEvt.addBtn());	  
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  click(tecrDash.attendaceSecn());
	  Thread.sleep(1000);
	  tecrDash.sectionEvents();
	  sendKeys(sectionEvnt.serachTxt(), eventNam);
  }
  
  @Test
  public void LessonPlanAdd() throws Exception
  {
	  System.out.println(" ---------- Lession Plan ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  lessionPlan=tecrDash.lessonPlan28();
	  AssertValidation(getAttribut(lessionPlan.pageTitle(), "Text", "Page Tittle Verfication"), "Lesson Plan List");
	  addlessionPlan=lessionPlan.addnewBtn();
	  AssertValidation(getAttribut(addlessionPlan.pageTitle(), "Text", "Page Tittle Verfication"), "Lesson Plan Add");
	  sendKeys(addlessionPlan.seleYear(), "2021-2022");
	  sendKeys(addlessionPlan.teacherNam(), "RadhaSinghR S");
	  selectdropdownTxt(addlessionPlan.lessionPlanTyp(), "Daily");
	  selectdropdownTxt(addlessionPlan.seleMonth(), "June");
	  sendKeys(addlessionPlan.selestartDate(), currentDate());
	  sendKeys(addlessionPlan.seleEndDate(), currentDate());
	  selectdropdownTxt(addlessionPlan.seleStandard(), "6");
	  selectdropdownTxt(addlessionPlan.seleSubject(), "BIOLOGY");
	  sendKeys(addlessionPlan.chapter(), "Qa Test 01");
	  sendKeys(addlessionPlan.topic(), "Test Topic 01");
	  sendKeys(addlessionPlan.module(), "Test Module 01");
	  sendKeys(addlessionPlan.learnObject(), "Test Learning Obj 01");
	  sendKeys(addlessionPlan.objtAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.testingKnowdg(), "Test Prev Know 02");
	  sendKeys(addlessionPlan.testingknowdgAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.introductionTitle(), "Test Introduction 01");
	  sendKeys(addlessionPlan.introductionAttachment(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  ScrolljavaScript(addlessionPlan.introductionTitle());
	  sendKeys(addlessionPlan.methodofTeching(), "Test Method Teching 01");
	  sendKeys(addlessionPlan.methodofTeachingAttach(),"C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.cratetivActivity(), "Test Creative Active 01");
	  sendKeys(addlessionPlan.creativaActivityAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  click(addlessionPlan.seleTeachingAids());
	  click(addlessionPlan.seleTechAidsTxt("Docs"));
	  click(addlessionPlan.clickEvent());
//	  click(addlessionPlan.seleTeachingAids());
//	  sendKeys(addlessionPlan.seleTeachingAids(), "Docs");
	  sendKeys(addlessionPlan.otherTeachingAid(), "Test Other Teaching aid01");
	  Thread.sleep(1000);
	  sendKeys(addlessionPlan.teachAidsAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.videoLink(), "https://www.youtube.com/watch?v=04zg-ZWODH4");
	  ScrolljavaScript(addlessionPlan.videoLink());
	  click(addlessionPlan.seleAssignment());
	  click(addlessionPlan.seleAssignmentTex("Other Documents"));
	  //selectdropdownTxt(addlessionPlan.seleAssignment(), "Other Documents");
	  click(addlessionPlan.clickevent1());
	  sendKeys(addlessionPlan.assignments(), "Test Assignment 01");
	  sendKeys(addlessionPlan.assignmentAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.additonalNote(), "Test Additional Not01");
	  sendKeys(addlessionPlan.additonalNoteAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  sendKeys(addlessionPlan.reflection(), "Test Reflection 01");
	  sendKeys(addlessionPlan.reflectionAttach(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  click(addlessionPlan.addBtn());	  
  }
  
  @Test
  public void LessionPlanApproval() throws Exception
  {
	  System.out.println(" ---------- Lession Plan ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  lessionPlanApprovl=tecrDash.lessonPlanApprov();
	  AssertValidation(getAttribut(lessionPlanApprovl.pageTitle(), "Text", "Page Title Verification"), "Teacher's Lesson Plan List");
	  selectdropdownIndx(lessionPlanApprovl.seleTeacher(), 1);
  }
  
  @Test
  public void SectionShuffling() throws Exception
  {
	  System.out.println(" ---------- Lession Plan ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  seconShuffling=tecrDash.sectionShuffling();
	  AssertValidation(getAttribut(seconShuffling.pageTitle(), "Text", "Page Title Verification"), "Section Shuffling");
	  selectdropdownTxt(seconShuffling.seleAcademicYear(), "2020-2021");
	  selectdropdownTxt(seconShuffling.seleClass(), "II");
	  selectdropdownTxt(seconShuffling.seleSection(), "ENTRAR");
	  Thread.sleep(1000);
	  click(seconShuffling.seleStudent("Ashish Gupta ( ENT/0030 ) II / ENTRAR"));
	  ScrolljavaScript(seconShuffling.ConformBtn());
	  selectdropdownTxt(seconShuffling.seleToSection(), "A");
	  click(seconShuffling.moveRight());
	  Thread.sleep(1500);
	  click(seconShuffling.ConformBtn());
	  waitForAlert(driver);
  }
  
  @Test
  public void StudentHouseMapping() throws Exception
  {
	  System.out.println(" ---------- Student House Mapping ----------");
	  click(tecrDash.classesSection());
	  Thread.sleep(1000);
	  houseMapping =tecrDash.stdHouseMapping();
	  AssertValidation(getAttribut(houseMapping.pageTitle(), "Text", "Page Title Verfication"), "Student House Allocation");
	  sendKeys(houseMapping.seleYear(), "2020-2021");
	  sendKeys(houseMapping.seleStandatrd(), "II/ENTRAR ");
	  selectdropdownTxt(houseMapping.studentupdate("ANIL KUMAR REDDY"), "Stalwart");
	  click(houseMapping.addBtn());
  }
  
  @Test
  public void StudentSearch() throws Exception
  {
	  System.out.println(" ---------- Student Search Page ----------");
	  click(tecrDash.schoolSection());
	  Thread.sleep(1000);
	  stdSrch=tecrDash.stdSearch();
	  AssertValidation(getAttribut(stdSrch.pageTitle(), "Text", "Page Title Veification"), "Student Search");
	  selectdropdownTxt(stdSrch.seleYear(), "2020-2021");
	  sendKeys(stdSrch.admissionNum(), "ENT/0030");
	  stdSrch.admissionNum().sendKeys(Keys.ENTER);
	  ScrolljavaScript(stdSrch.stdId("ENT/0030"));
	  click(stdSrch.stdId("ENT/0030"));
	  //driver.switchTo().window(nameOrHandle)
  }
  
  @Test
  public void techernotcBord() throws Exception
  {
	  System.out.println(" ---------- Teacher Notice Board Page ----------");
	  click(tecrDash.schoolSection());
	  Thread.sleep(1000);
	  techrntcBrd=tecrDash.techernotcBord();
	  AssertValidation(getAttribut(techrntcBrd.pageTitle(), "Text", "Page Title Verification"), "Teacher's Notice Board");
	  addTechenotcBord=techrntcBrd.addBtn();
	  AssertValidation(getAttribut(addTechenotcBord.pageTitle(), "Text", "Page Title Verification"), "Add Teacher's Announcement");
	  sendKeys(addTechenotcBord.annoncmentTag(), "QA test AnnonTag");
	  sendKeys(addTechenotcBord.annoncment(), "QA Test Annon");
	  sendKeys(addTechenotcBord.startDate(), currentDate());
	  sendKeys(addTechenotcBord.endDate(), currentDate());
	  sendKeys(addTechenotcBord.attachemnt(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
	  click(addTechenotcBord.techerCheckBox("3"));
  }
  
  @Test
  public void announcement() throws Exception
  {
	  System.out.println(" ---------- Announcemnet Page ----------");
	  click(tecrDash.schoolSection());
	  Thread.sleep(1000);
	  announcemt=tecrDash.announcements();
	  AssertValidation(getAttribut(announcemt.pageTitle(), "Text", "Page Title Verification"), "Announcements");
	  addannoumt=announcemt.addBtn();
	  AssertValidation(getAttribut(addannoumt.pageTitle(), "Text", "Page Title Verification"), "Add Announcement");
	  sendKeys(addannoumt.seleYear(), "2020-2021");
	  sendKeys(addannoumt.announcemtTag(), "TestQA annouct Tag");
	  sendKeys(addannoumt.assignmen(), "Qa Test Announct");
	  sendKeys(addannoumt.startDate(), currentDate());
	  sendKeys(addannoumt.endDate(), currentDate());
	  sendKeys(addannoumt.attachement(), "C:\\Users\\Anil\\OneDrive\\Desktop\\TestDataImg\\testPdfFile.pdf");
  }
  
  @Test
  public void videoGallery() throws Exception
  {
	  System.out.println(" ---------- Video Gallery Page ----------");
	  click(tecrDash.schoolSection());
	  Thread.sleep(1000);
	  vidoGllry=tecrDash.videoGallery();
	  AssertValidation(getAttribut(vidoGllry.pageTitle(), "Text", "Page Title Verification"), "Video Gallery List");
	 addvidoG =vidoGllry.addBtn();
	 AssertValidation(getAttribut(vidoGllry.pageTitle(), "Text", "Page Title Verification"), "Add Video");
	 
  }
}
