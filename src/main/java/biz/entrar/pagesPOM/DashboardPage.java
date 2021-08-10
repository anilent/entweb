package biz.entrar.pagesPOM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;



public class DashboardPage extends BaseTest{
	//Page Factory - 
	@FindBy (xpath="//*[.='Dashboard']") private WebElement dashbord;
	@FindBy (xpath="//*[.='Admission']") private WebElement admission;
	@FindBy (xpath="//*[.='Admission Process']/..") private WebElement adminssionprocess;
	@FindBy (xpath="//*[.='Enquiry FORM']") private WebElement enquiryForm;
	@FindBy (xpath="//*[.='Submission Admission Form']") private WebElement subissionAdmissFrom;
	@FindBy (xpath="//*[.='Schedule Entrance Test']") private WebElement scheduleEntTest;
	@FindBy (xpath="//*[.='Re-Schedule Entrance Test']") private WebElement rescheduleEntTest;
	@FindBy (xpath="//*[.='Entrance Test Result']") private WebElement entranceTestRelt;
	@FindBy (xpath="//*[.='Schedule Interview']") private WebElement scheduleIntrv;
	@FindBy (xpath="//*[.='Re-Schedule Interview']") private WebElement reScheduleIntrv;
	@FindBy (xpath="//*[.='Short Listed Student']") private WebElement shortListStd;
	@FindBy (xpath="//*[.='Test Portion Upload']") private WebElement testPortionUpload;
	@FindBy (xpath="//*[.='Student Enquiry Form Report']") private WebElement stdEnquiryFrmReport;
	
	@FindBy (xpath="//*[.='New Admissions']") private WebElement newAdmissions;
	@FindBy (xpath="//*[.='New Admissions']/../../..//*[.='Confirmed Admissions']") private WebElement confirmedAdms;
	@FindBy (xpath="//*[.='New Admissions']/../../..//*[.='Create Accounts']") private WebElement createAccounts;
	@FindBy (xpath="//*[.='Search']") private WebElement search;
	@FindBy (xpath="//*[.='Search']/../..//*[.='Students']") private WebElement SrhStudent;
	@FindBy (xpath="//*[.='Admission']/../..//*[.='Report']") private WebElement ReportsBtn;
	@FindBy (xpath="//*[.='Admission Fee']") private WebElement AdmFeeRprt;
	@FindBy (xpath="//*[.='Admission Cheque']") private WebElement AdmChqRprt;
	@FindBy (xpath="//*[.='Admission Count']") private WebElement AdmCountRprt;
	@FindBy (xpath="//*[.='Report']/../..//*[.='Admission Report']") private WebElement AdmissionRprt;
	@FindBy (xpath="//*[.='Admission Detail Report']") private WebElement AdmDetilReport;
	@FindBy (xpath="//*[.='Admission Fee Detail Report']") private WebElement AdmsFeeDtlRprt;
	@FindBy (xpath="//*[.='Report']/../..//*[.='Admission Cancel Report']") private WebElement AdmsnCancel;
	@FindBy (xpath="//*[.='Admission Fee Invoice Cancel Report']") private WebElement AdmsnFeeInvcCancel;
	@FindBy (xpath="//*[.='Submited Reg Form Report']") private WebElement SubmtRegFormRet;
	@FindBy (xpath="//*[.='Reg Form Count Report']") private WebElement regFormCountRprt;
	@FindBy (xpath="//*[.='Reg Form Process Report']") private WebElement regFormFeeRprt;
	@FindBy (xpath="//*[.='Reg Form SMS Report']") private WebElement regFormSMSRprt;
	@FindBy (xpath="//*[.='Admission Pointwise Report']") private WebElement  admsPointwiseReport;
	@FindBy (xpath="//*[.='Admission Fee Cheque Reconciliation Report']") private WebElement admsFeeChqReConsRrt;
	
	@FindBy (xpath="//*[.='Fee Concession Report']") private WebElement feeConsessionRrt;
	
	@FindBy (xpath="//*[.='Internal Student Stream Report']") private WebElement intnalStdStreamRrt;
	
	@FindBy (xpath="//*[.='External Student Stream report']") private WebElement externalStdStreamRrt;
	@FindBy (xpath="//*[.='Student Stream Count report']") private WebElement stdStrmCountRrt;
	
	@FindBy (xpath="//*[.='Admission Fee Due Report']") private WebElement amdsFeeDueRrt;
	@FindBy (xpath="//*[.='Admission Point Report']") private WebElement admsPointRrt;
	
	
	@FindBy (xpath="//*[.='Assessment']") private WebElement assessmentPage;
	@FindBy (xpath="//*[.='Subject Area Master']") private WebElement SubAreaMatBtn;
	@FindBy (xpath="//*[.='NA Area Master']") private WebElement NAAreaMaster;
	@FindBy (xpath="//*[.='NA Subjects Master']") private WebElement NAsubjetMaster;
	@FindBy (xpath="//*[.='NA Subject Strands']") private WebElement NASubjetStrands;
	@FindBy (xpath="//*[.='NA Subject Details']") private WebElement NASubjetDetails;
	@FindBy (xpath="//*[.='NA Subject Grade Master']") private WebElement NASubjectGradeMstr;
	@FindBy (xpath="//*[.='NA Subject Remark Bank']") private WebElement NASubjectRemarksBank;
	@FindBy (xpath="//*[.='NA Optional Subject allocation']") private WebElement NAOptionalSubjAllocation;
	
	@FindBy (xpath="//*[.='Academic Subjects']") private WebElement academicSubjectsBtn;
	@FindBy (xpath="//*[.='Assessment Subjects']") private WebElement assessmentSubject;
	@FindBy (xpath="//*[.='Assessment Subjects Grouping']") private WebElement assessmentSubjectGrouping;
	@FindBy (xpath="//*[.='Optional Subject allocation']") private WebElement optionalSubjAllocation;
	@FindBy (xpath="//*[.='Optional Subject Report']") private WebElement optionalsubjReport;
	@FindBy (xpath="//*[.='Optional Subject Language Count Report']") private WebElement optionalSubjLangugContRprt;
	
	@FindBy (xpath="//*[.='Assessment Master']") private WebElement assessmentMasterBtn;
	@FindBy (xpath="//*[.='Assessment Name']") private WebElement assessmentDetials;
	@FindBy (xpath="//*[.='Exam Activity']") private WebElement examActivitys;
	@FindBy (xpath="//*[.='Assessment Grouping']") private WebElement assessmentGrouping;
	@FindBy (xpath="//*[.='Exam Subject Marks']") private WebElement excamSubjctMarks;
	
	@FindBy (xpath="//*[@class=' ']//*[.='Teacher Subject Allocation']") private WebElement teacherSubAllocation;
	@FindBy (xpath="//*[.='Assessment Subjectwise Comment']") private WebElement AssemSubWiseComments;
	@FindBy (xpath="//*[.='Teacher Subject Mapping New']") private WebElement teacherSubMappingnew;
	@FindBy (xpath="//*[.='Assessment Remark Bank']") private WebElement assesmRemarksBank;
	@FindBy (xpath="//*[.='Subject Group Grades']") private WebElement subGroupGrades;
	@FindBy (xpath="//*[.='Teacher Sign Upload']") private WebElement teacherSignUpload;
	@FindBy (xpath="//a[contains(@href,'classteachermapping/index')]//*[.='Class Teacher Mapping']") 
	private WebElement calssTeacherMappingSingle;
	@FindBy (xpath="//*[.='Student Roll No Generation']") private WebElement generatStdRollNum;
	@FindBy (xpath="//*[.='Student Medical Detail']") private WebElement stdMedicalDetails;
	@FindBy (xpath="//a[contains(@href,'classteachermapping_multipel/index')]//*[.='Class Teacher Mapping']")
	private WebElement calssTeacherMappingMultiple;
	
	@FindBy (xpath="//*[.='Published Result '] ") private WebElement publishedResult;
	@FindBy (xpath="//*[.='Test Wise Results'] ") private WebElement testWiseResults;
	@FindBy (xpath="//*[.='Term Wise Results'] ") private WebElement termWiseResults;
	@FindBy (xpath="//*[.=' Final Exam Results'] ") private WebElement finalExamResults;
	@FindBy (xpath="//*[.=' Activity Wise Results'] ") private WebElement activityWiseResults;	
	
	@FindBy (xpath="//*[.='Payroll']/..") private WebElement payroll;
	@FindBy (xpath="//*[.='Leave']") private WebElement leaveMnu;
	@FindBy (xpath="//*[.='Leave']/../..//*[.='Leave Structure']") private WebElement leaveStruct;
	@FindBy (xpath="//*[.='Leave']/../..//*[.='Leave Allocation']") private WebElement leaveAllocation;
	@FindBy (xpath="//*[@id='mCSB_1_container']") private WebElement menuList;
	@FindBy (xpath="//*[.='Block Users']") private WebElement blokUser;
	
	@FindBy (xpath="//*[.='Leave Entry']") private WebElement leaveEntryBtn;
	
	@FindBy (xpath="//*[.='Pay Structure Setup']") private WebElement payStruSetup;
	@FindBy (xpath="//*[.='Pay Structure']") private WebElement payStrutr;
	@FindBy (xpath="//*[.='Pay Structure Allocation']") private WebElement payStrutrAlloc;
	@FindBy (xpath="//*[.='Monthly Pay Allocation']") private WebElement mothlyPayAlloc;
	@FindBy (xpath="//*[.='Mass Pay Allocation']") private WebElement massPayAlloc;
	@FindBy (xpath="//*[.='Staff Pay Days Update']") private WebElement staffPayDayUpdte;
	
	@FindBy (xpath="//*[.='Salary New Method']") private WebElement salaryNewMethod;
	@FindBy (xpath="//*[.='New Process Salary']") private WebElement newProccessSal;
	@FindBy (xpath="//*[.='New Salary Statement']") private WebElement salaryStatmnt;
	@FindBy (xpath="//*[.='New Salary Pay Slip']") private WebElement salryPaySlip;
	
	@FindBy (xpath="//*[.='Salary Release']") private WebElement salaryRelease;
	@FindBy (xpath="//*[.='Pre Define Salary Statement']") private WebElement preDefineSalStamt;
	@FindBy (xpath="//*[.='Salary Bank Report']") private WebElement salBankReport;
	@FindBy (xpath="//*[.='Annual Salary Report']") private WebElement annualSalReport;
	//@FindBy (xpath="//*[.='New Annual Salary Report']") private WebElement newAnnualsalRport;
	@FindBy (xpath="//*[.='Teacher CL/EL Amount Report']") private WebElement teacherCLELreprot;
	
	
	
	//initializing the page object
	public DashboardPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	//actions
	public DashboardPage admission()
	{
		click(admission);
		return this;
	}
	
	public DashboardPage adminssionprocess()
	{
		click(adminssionprocess);
		return this;
	}
	
	public AdnProccEnquiryFrom enquiryForm()
	{
		click(enquiryForm);
		return new AdnProccEnquiryFrom(driver);
	}

	public SubmissonAdnsFormPage subissionAdmissFrom()
	{
		click(subissionAdmissFrom);
		return new SubmissonAdnsFormPage(driver);
	}
	
	public ScheduleEntranceTestPage scheduleEntTest()
	{
		click(scheduleEntTest);
		return new ScheduleEntranceTestPage(driver);
	}
	
	public AdmsNewAdmsViewPage newAdmissions()
	{
		click(newAdmissions);
		return new AdmsNewAdmsViewPage(driver);
	}
	public AdmsConfirmedAdmissionsViewPage confirmedAdms()
	{
		click(confirmedAdms);
		return new AdmsConfirmedAdmissionsViewPage(driver);
	}
	
	public AdmsCreateStdAccount createStdAccounts()
	{
		click(createAccounts);
		return new AdmsCreateStdAccount(driver);
	}
	public DashboardPage search()
	{
		click(search);
		return this;
	}
	public AdmsStdSearch SrhStudent()
	{
		click(SrhStudent);
		return new AdmsStdSearch(driver);
	}
	public DashboardPage ReportsBtn()
	{
		click(ReportsBtn);
		return this;
	}
	public AdmsRFeeReport AdmFeeRprt()
	{
		click(AdmFeeRprt);
		return new AdmsRFeeReport(driver);
	}
	public AdmsRChequeReport AdmChqRprt()
	{
		click(AdmChqRprt);
		return new AdmsRChequeReport(driver);
	}
	
	public AdmsRCountReport AdmCountRprt()
	{
		click(AdmCountRprt);
		return new AdmsRCountReport(driver);
	}
	public AdmsRAdmissionReport AdmissionRprt()
	{
		click(AdmissionRprt);
		return new AdmsRAdmissionReport(driver);
	}
	public AdmsRDetailReport AdmDetilReport()
	{
		ScrolljavaScript(AdmDetilReport);
		click(AdmDetilReport);
		return new AdmsRDetailReport(driver);
	}
	public AdmsRFeeDetilReport AdmsFeeDtlRprt()
	{
		//ScrolljavaScript(AdmsFeeDtlRprt);
		click(AdmsFeeDtlRprt);
		return new AdmsRFeeDetilReport(driver);
	}
	public AdmsRCancelReport AdmsnCancelRprt() throws Exception
	{
		Thread.sleep(1000);
		//ScrolljavaScript(AdmsnCancel);
		click(AdmsnCancel);
		return new AdmsRCancelReport(driver);
	}
	public AdmsRFeeInvcCancelReport AdmsnFeeInvcCancel() throws Exception
	{
		Thread.sleep(1000);
		ScrolljavaScript(AdmsnFeeInvcCancel);
		click(AdmsnFeeInvcCancel);
		return new AdmsRFeeInvcCancelReport(driver);
	}
	public AdmsRSubmitFormRegReport SubmtRegFormRet() throws Exception
	{
		Thread.sleep(1000);
		ScrolljavaScript(SubmtRegFormRet);
		click(SubmtRegFormRet);
		return new AdmsRSubmitFormRegReport(driver);
	}
	public AdmsRRegFormCountReport regFormCountRprt() throws Exception
	{
		Thread.sleep(1000);
		ScrolljavaScript(regFormCountRprt);
		Thread.sleep(2000);
		click(regFormCountRprt);
		return new AdmsRRegFormCountReport(driver);
	}
	
	public AdmsRRegFormProcessFeeReport regFormFeeRprt() throws Exception
	{
		Thread.sleep(2000);
		ScrolljavaScript(regFormFeeRprt);
		Thread.sleep(2000);
		click(regFormFeeRprt);
		return new AdmsRRegFormProcessFeeReport(driver);
	}
	
	public AdmsRRegFormSMSReport regFormSMSRprt() throws Exception
	{
		ScrolljavaScript(regFormSMSRprt);
		Thread.sleep(2000);
		click(regFormSMSRprt);
		return new AdmsRRegFormSMSReport(driver);
	}
	
	 public AdmsRAdmPointwiseReport admsPointwiseReport() throws Exception
	 {
		 ScrolljavaScript(admsPointwiseReport);
		 Thread.sleep(2000);
		 click(admsPointwiseReport);
		 return new AdmsRAdmPointwiseReport(driver);
	 }
	 
	 public AdmsRFeeChequeReconciliationReport admsFeeChqReConsRrt() throws Exception
	 {
		 Thread.sleep(1000);
		 scrolling(admsFeeChqReConsRrt);
		 Thread.sleep(2000);
		 click(admsFeeChqReConsRrt);
		 return new AdmsRFeeChequeReconciliationReport(driver);
	 }
	 
	 public AdmsRInternalStdStreamReport intnalStdStreamRrt() throws Exception
	 {
		 Thread.sleep(2000);
		 ScrolljavaScript(intnalStdStreamRrt);
		 Thread.sleep(2000);
		 click(intnalStdStreamRrt);
		 return new AdmsRInternalStdStreamReport(driver);
	 }
	 
	 public AdmsRFeeDueReport amdsFeeDueRrt() throws Exception
	 {
		 Thread.sleep(2000);
		 ScrolljavaScript(amdsFeeDueRrt);
		 Thread.sleep(2000);
		 click(amdsFeeDueRrt);
		 return new AdmsRFeeDueReport(driver);
	 }
	 public AdmsRPointReport admsPointRrt() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(admsPointRrt);
		 Thread.sleep(1000);
		 click(admsPointRrt);
		 return new AdmsRPointReport(driver);
	 }
	 
	 public DashboardPage assessmentPage() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentPage);
		 Thread.sleep(1000);
		 click(assessmentPage);
		 return this;
	 }
	 
	 public AssmtSubjectAreaMaster SubAreaMatBtn() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(SubAreaMatBtn);
		 Thread.sleep(1000);
		 click(SubAreaMatBtn);
		 return new AssmtSubjectAreaMaster(driver);
	 }
	  
	 public DashboardPage NAAreaMaster() throws Exception
	 {
		 Thread.sleep(1000);
		 click(NAAreaMaster);
		 return this;
	 }
	 
	 public AssmtNASubjectsMastersPage NAsubjetMaster() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NAAreaMaster);
		 click(NAsubjetMaster);
		 return new AssmtNASubjectsMastersPage(driver);
	 }
	 
	 public AssmtNASubjectStrandsPage NASubjetStrands() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NASubjetStrands);
		 click(NASubjetStrands);
		 return new AssmtNASubjectStrandsPage(driver);
	 }
	 
	 public AssmtNASubjectDetialsPage NASubjetDetails() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NASubjetDetails);
		 click(NASubjetDetails);
		 return new AssmtNASubjectDetialsPage(driver);
	 }
	 
	 public AssmtNASubjectGradMasterPage NASubjectGradeMstr() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NASubjectGradeMstr);
		 click(NASubjectGradeMstr);
		 return new AssmtNASubjectGradMasterPage(driver);
	 }
	 
	 public AssmtNASubjectRemarksBankPage NASubjectRemarksBank() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NASubjectRemarksBank);
		 click(NASubjectRemarksBank);
		 return new AssmtNASubjectRemarksBankPage(driver);
	 }
	 
	 public AssmtNAOptionalSubjectAllocationPage NAOptionalSubjAllocation() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(NAOptionalSubjAllocation);
		 click(NAOptionalSubjAllocation);
		 return new AssmtNAOptionalSubjectAllocationPage(driver);
	 }
	 
	 public DashboardPage academicSubjectsBtn() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(academicSubjectsBtn);
		 click(academicSubjectsBtn);
		 return this;
	 }
	 
	 public AssmtAcademicAssessmentSubjectsPage  assessmentSubject() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentSubject);
		 click(assessmentSubject);
		 return new AssmtAcademicAssessmentSubjectsPage(driver);
	 }
	 
	 public AsstAcademicAssessmentSubjectGroupingPage assessmentSubjectGrouping() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentSubjectGrouping);
		 click(assessmentSubjectGrouping);
		 return new AsstAcademicAssessmentSubjectGroupingPage(driver);
	 }
	 public AsstAcademicOptionalSubjAllocationPage optionalSubjAllocation() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(optionalSubjAllocation);
		 click(optionalSubjAllocation);
		 return new AsstAcademicOptionalSubjAllocationPage();
	 }
	 
	 public AsstAcademicOptionalSubReportPage optionalsubjReport() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(optionalsubjReport);
		 click(optionalsubjReport);
		 return new AsstAcademicOptionalSubReportPage();
	 }
	 
	 public AsstAcademicOptionalSubLanguagCountReportPage optionalSubjLangugContRprt() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(optionalSubjLangugContRprt);
		 click(optionalSubjLangugContRprt);
		 return new AsstAcademicOptionalSubLanguagCountReportPage();
	 }
	 
	 public DashboardPage assessmentMasterBtn() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentMasterBtn);
		 click(assessmentMasterBtn);
		 return this;
	 }
	 
	 public AsstMstrAssessmentDetialsPage assessmentDetials() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentDetials);
		 click(assessmentDetials);
		 return new AsstMstrAssessmentDetialsPage();
	 }
	 
	 public AsstMasterExamActivity examActivitys() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(examActivitys);
		 click(examActivitys);
		 return new AsstMasterExamActivity();
	 }
	 
	 public AsstMasterAssmessmentGroupingpage assessmentGrouping() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assessmentGrouping);
		 click(assessmentGrouping);
		 return new AsstMasterAssmessmentGroupingpage();
	 }
	 public AsstMasterExamSubjectMarksPage excamSubjctMarks() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(excamSubjctMarks);
		 click(excamSubjctMarks);
		 return new AsstMasterExamSubjectMarksPage();
	 }
	 
	 public AssessmentTeacherSubAllocationPage teacherSubAllocation() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(teacherSubAllocation);
		 click(teacherSubAllocation);
		 return new AssessmentTeacherSubAllocationPage();
	 }
	 public AssessmentSubjectWiseCommentPage AssemSubWiseComments() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(AssemSubWiseComments);
		 click(AssemSubWiseComments);
		 return new AssessmentSubjectWiseCommentPage();
	 }
	 public AssessmentRemarksBank assesmRemarksBank() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(assesmRemarksBank);
		 click(assesmRemarksBank);
		 return new AssessmentRemarksBank();
	 }
	 public AssessmentSubGroupGradesPage assesmSubGroupGrades() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(subGroupGrades);
		 click(subGroupGrades);
		 return new AssessmentSubGroupGradesPage();
	 }
	 public AssessmentTeacherSignatureUpload teacherSignUpload() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(teacherSignUpload);
		 click(teacherSignUpload);
		 return new AssessmentTeacherSignatureUpload();
	 }
	 public AssessmentClassTeacherMappingSinglePage calssTeacherMappingSingle() throws Exception {
		 Thread.sleep(1000);
		 ScrolljavaScript(calssTeacherMappingSingle);
		 click(calssTeacherMappingSingle);
		 return new AssessmentClassTeacherMappingSinglePage();
	 }
	 public AssessmentStudentRollNumGenerationPage generatStdRollNum() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(generatStdRollNum);
		 click(generatStdRollNum);
		 return new AssessmentStudentRollNumGenerationPage();
	 }
	 public AssessmentStudentMedicalDetailsPage stdMedicalDetails() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(stdMedicalDetails);
		 click(stdMedicalDetails);
		 return new AssessmentStudentMedicalDetailsPage();
	 }
	 public AssessmentClassTeacherMappingMultiplePage calssTeacherMappingMultiple() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(calssTeacherMappingMultiple);
		 click(calssTeacherMappingMultiple);
		 return new AssessmentClassTeacherMappingMultiplePage();
	 }
	 public DashboardPage publishedResult() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(publishedResult);
		 click(publishedResult);
		 return this;
	 }
	 public AssessmentPublishedTestWiseResultPage testWiseResults() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(testWiseResults);
		 click(testWiseResults);
		 return new AssessmentPublishedTestWiseResultPage();
	 }
	 public AssessmentpublishTermWiseResultsPage termWiseResults() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(termWiseResults);
		 click(termWiseResults);
		 return new AssessmentpublishTermWiseResultsPage();
	 }
	 public AssessmentpublishFinalWiseResultsPage finalExamResults() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(finalExamResults);
		 click(finalExamResults);
		 return new AssessmentpublishFinalWiseResultsPage();
	 }
	 public AssessmentpublishActivityWiseResultsPage activityWiseResults() throws Exception
	 {
		 Thread.sleep(1000);
		 ScrolljavaScript(activityWiseResults);
		 click(activityWiseResults);
		 return new AssessmentpublishActivityWiseResultsPage();
	 }
	 
	 public WebElement payroll()
		{
			return payroll;
		}
		public WebElement leaveMnu()
		{
			return leaveMnu;
		}
		public sal1PayrolLeaveStructurePage leaveStruct()
		{
			click(leaveStruct);
			return new sal1PayrolLeaveStructurePage();
		}
	 public WebElement menuList()
	 {
		 return menuList;
	 }
	 
	 public WebElement dashbord() throws Exception
	 {
		/* Thread.sleep(1000);
		 click(dashbord);
		 return dashbord.findElement(By.xpath("//*[.='Payroll']/.."));*/
		 return dashbord;
	 }
	 public WebElement blokUser()
	 {
		 return blokUser;
	 }
	 public sal2PayrolLeaveAllocationPage leaveAllocation()
	 {
		 click(leaveAllocation);
		 return new sal2PayrolLeaveAllocationPage();
	 }
	 
	 public sal2PayrolLeaveEntry leaveEntryBtn()
	 {
		 click(leaveEntryBtn);
		 return new sal2PayrolLeaveEntry();
	 }
	 
	 public WebElement payStruSetup()
	 {
		 return payStruSetup;
	 }
	 
	 public WebElement payStrutr()
	 {
		 return payStrutr;
	 }
	 
	 public sal3PayStructer payStrutr2()
	 {
		 click(payStrutr);
		 return new sal3PayStructer();
	 }
	 
	 public sal3PayStructerAllocation02 payStrutrAlloc()
	 {
		 click(payStrutrAlloc);
		 return new sal3PayStructerAllocation02();
	 }
	 public sal3MonthlyPayAllocation03 mothlyPayAlloc()
	 {
		 click(mothlyPayAlloc);
		 return new sal3MonthlyPayAllocation03();
	 }
	 public sal3MassPayAlloation04 massPayAlloc()
	 {
		 click(massPayAlloc);
		 return new sal3MassPayAlloation04();
	 }
	 public sal3StaffpayDaysUpdate05 staffPayDayUpdte()
	 {
		 click(staffPayDayUpdte);
		 return new sal3StaffpayDaysUpdate05();
	 }
	 
	 public WebElement salaryNewMethod()
	 {
		 return salaryNewMethod;
	 }
	 public sal4SalaryProcess01 newProccessSal()
	 {
		 click(newProccessSal);
		 return new sal4SalaryProcess01();
	 }
	 public sal4SalaryStatment02 salaryStatmnt()
	 {
		 click(salaryStatmnt);
		 return new sal4SalaryStatment02();
	 }
	 public sal4SalaryPaySlip03 salryPaySlip()
	 {
		 click(salryPaySlip);
		 return new sal4SalaryPaySlip03();
	 }
	 public sal5SalaryRelease salaryRelease()
	 {
		 click(salaryRelease);
		 return new sal5SalaryRelease();
	 }
	 
	 public sal6preDefineSalStamt preDefineSalStamt()
	 {
		click(preDefineSalStamt);
		return new sal6preDefineSalStamt();
	 }
	 
	 public sal7salaryBankReport salBankReport()
	 {
		 click(salBankReport);
		 return new sal7salaryBankReport();
	 }
	 public sal8salaryAnnualReport annualSalReport()
	 {
		 click(annualSalReport);
		 return new sal8salaryAnnualReport();
	 }
	 public  sal9TeachCL_ELamountRert teacherCLELreprot()
	 {
		 click(teacherCLELreprot);
		 return new sal9TeachCL_ELamountRert();
	 }
}
