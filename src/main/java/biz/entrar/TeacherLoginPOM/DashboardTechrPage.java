package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class DashboardTechrPage extends BaseTest{

	@FindBy (xpath="//*[.='Profile']") private WebElement profile;
	@FindBy (xpath="//*[.='About Me']") private WebElement aboutMe;
	@FindBy (xpath="//*[.='My Profile']") private WebElement myprofile;
	@FindBy (xpath="//*[.='My School']") private WebElement myscoole;
	@FindBy (xpath="//*[.='Class']") private WebElement classesSection;
	@FindBy (xpath="//*[.='Attendance']") private WebElement attendaceSecn;
	@FindBy (xpath="//*[.='Old Mark Attendance']") private WebElement oldMarkAttendance;
	@FindBy (xpath="//*[.='New Mark Attendance']") private WebElement newMarkAttendance;
	@FindBy (xpath="//*[.='View Attendance']") private WebElement viewAttendance;
	@FindBy (xpath="//*[.='Attendance Count Report']") private WebElement AttendanceCoutReprt;
	@FindBy (xpath="//*[.='Attendance Count Report Std Wise']") private WebElement stdWiseAttendncCoutRprt;
	@FindBy (xpath="//*[.='Wrong Attendance Delete']") private WebElement wrongAttendDelet;
	
	@FindBy (xpath="//*[.='Assignments Standard Wise']") private WebElement assignStandatrdWise;
	@FindBy (xpath="//*[.='Assignment Uploaded By Students']") private WebElement assignUploadStdWise;
	@FindBy (xpath="//*[.='Section Events']") private WebElement sectionEvents;
	@FindBy (xpath="//*[.='Lesson Plan']") private WebElement lessonPlan28;
//	@FindBy (xpath="//*[.='Lesson Plan 9 - 12']") private WebElement lessonPlan912;
//	@FindBy (xpath="//*[.='Lesson Plan Approval 2-8']") private WebElement lessonPlanApprove28;
	@FindBy (xpath="//*[.='Lesson Plan Approval']") private WebElement lessonPlanApprov;
	@FindBy (xpath="//*[.='Section Shuffling']") private WebElement sectionShuffling;
	@FindBy (xpath="//*[.='Section Shuffling']/../../..//*[.='Student House Mapping']") private WebElement stdHouseMapping;
	
	@FindBy (xpath="//*[.='School']") private WebElement schoolSection;
	@FindBy (xpath="//*[.='Student Search']") private WebElement stdSearch;
	@FindBy (xpath="//*[.='Teacher Notice Board']") private WebElement techernotcBord;
	@FindBy (xpath="//*[.='Announcements']") private WebElement announcements;
	@FindBy (xpath="//*[.='Video Gallery']") private WebElement videoGallery;
	
	
	
	public DashboardTechrPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public WebElement profile()
	{
		return profile;
	}
	
	public AboutMePage aboutMe()
	{
		click(aboutMe);
		return new AboutMePage();
	}
	
	public myprofilePage myprofile()
	{
		click(myprofile);
		return new myprofilePage();
	}

	public mySchoolPage myscoole()
	{
		click(myscoole);
		return new mySchoolPage();
	}
	public WebElement classesSection()
	{
		return classesSection;
	}
	public WebElement attendaceSecn()
	{
		return attendaceSecn;
	}
	public oldMarkAttendancePage oldMarkAttendance()
	{
		click(oldMarkAttendance);
		return new oldMarkAttendancePage();
	}
	
	public newMarkAttendancePage newMarkAttendance()
	{
		click(newMarkAttendance);
		return new newMarkAttendancePage();
	}
	public viewAttendancePage viewAttendance()
	{
		click(viewAttendance);
		return new viewAttendancePage();
	}
	public AttendanceCountReprt AttendanceCoutReprt()
	{
		click(AttendanceCoutReprt);
		return new AttendanceCountReprt();
	}
	public StdWiseAttendanceCoutRprt stdWiseAttendncCoutRprt()
	{
		click(stdWiseAttendncCoutRprt);
		return new StdWiseAttendanceCoutRprt();
	}
	public wrongAttendanceDelete wrongAttendDelet()
	{
		click(wrongAttendDelet);
		return new wrongAttendanceDelete();
	}
	public assignmentsStandardWise assignStandatrdWise()
	{
		click(assignStandatrdWise);
		return new assignmentsStandardWise();
	}
	public assignmentsUploadByStdsPage assignUploadStdWise()
	{
		click(assignUploadStdWise);
		return new assignmentsUploadByStdsPage();
	}
	public sectionEventsPage sectionEvents()
	{
		click(sectionEvents);
		return new sectionEventsPage();
	}
	public lessionPlan28Page lessonPlan28()
	{
		click(lessonPlan28);
		return new lessionPlan28Page();
	}
	public LesssionPlanApproval lessonPlanApprov()
	{
		click(lessonPlanApprov);
		return new LesssionPlanApproval();
	}
	public SectionShufflingPage sectionShuffling()
	{
		click(sectionShuffling);
		return new SectionShufflingPage();
	}
	public StudentHouseMapping stdHouseMapping()
	{
		click(stdHouseMapping);
		return new StudentHouseMapping();
	}
	public WebElement schoolSection()
	{
		return schoolSection;
	}
	public studentSearchPage stdSearch()
	{
		click(stdSearch);
		return new studentSearchPage();
	}
	public TeacherNoticBoardPage techernotcBord()
	{
		click(techernotcBord);
		return new TeacherNoticBoardPage();
	}
	public AnnouncementsPage announcements()
	{
		click(announcements);
		return new AnnouncementsPage();
	}
	public videoGalleryPage videoGallery()
	{
		click(videoGallery);
		return new videoGalleryPage();
	}
	
}
