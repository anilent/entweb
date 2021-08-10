package biz.entrar.test;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.StudentPagesPOM.AssessmentTestPage;
import biz.entrar.StudentPagesPOM.DashboardStudentPage;
import biz.entrar.StudentPagesPOM.StdOnlineAssesmViewFullResult;
import biz.entrar.StudentPagesPOM.StdOnlineAssesmViewResult;
import biz.entrar.StudentPagesPOM.StdOnlineAssessmentResult;
import biz.entrar.StudentPagesPOM.StdOnlineAssessmentViewPage;
import biz.entrar.TeacherPagesPOM.AddOnlineAssesmQuestionsPage;
import biz.entrar.TeacherPagesPOM.AddOnlineAssessmentMastersPage;
import biz.entrar.TeacherPagesPOM.DashboardTeacherPage;
import biz.entrar.TeacherPagesPOM.OnlineAssessmSubjResultPublishPage;
import biz.entrar.TeacherPagesPOM.OnlineAssessmViewPublishingPage;
import biz.entrar.TeacherPagesPOM.ResultSuccessfulPublishPage;
import biz.entrar.TeacherPagesPOM.SchedulePublishTest;
import biz.entrar.TeacherPagesPOM.ViewFullResultsTechrPage;
import biz.entrar.TeacherPagesPOM.ViewStdResultPage;
import biz.entrar.TeacherPagesPOM.questionPaperUploadPage;
import biz.entrar.pagesPOM.HomePage;
import biz.entrar.pagesPOM.Login_page;
import biz.entrar.utils.ExcelTestDataHandler;
import biz.entrarBase.BaseTest;
import java.util.*;

public class OnlineAssessment extends BaseTest {

	HomePage hompag;
	Login_page loginpg;
	DashboardTeacherPage dashbordTech;
	DashboardStudentPage dashbordStd;
	StdOnlineAssessmentViewPage onlinAssmStd;
	StdOnlineAssessmentResult onlinAssmstdResult;
	AddOnlineAssessmentMastersPage addAssessment;
	AddOnlineAssesmQuestionsPage addqustn;
	SchedulePublishTest schpublish;
	AssessmentTestPage assesmntTest;
	OnlineAssessmViewPublishingPage viewPublishRrlt;
	ViewFullResultsTechrPage fullResult;
	ViewStdResultPage overViewResult;
	ResultSuccessfulPublishPage rsultsuccfuPublis;
	StdOnlineAssesmViewFullResult stdfullResultpg;
	StdOnlineAssesmViewResult viewresultstd;
	OnlineAssessmSubjResultPublishPage subjectivResult;

	@BeforeClass
	public void beforeClass() throws Exception {
		// hompag=new HomePage(driver);
		loginpg = new Login_page(driver);
		dashbordStd=new DashboardStudentPage();
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {

	}

	@AfterMethod
	public void afterMethod() {
	}
	

	
	@Test
	public void validCredentialsTeacher() throws Exception {
		TeacherLogin();
	}

	@Test
	public void validCredentialsTeacher2() throws Exception {
		TeacherLogin();
	}
	
	public void TeacherLogin() throws Exception {
		System.out.println("------------ Teacher Valid Login TestCase -------");
		loginpg.username(EnvironmentsData.usernameTeacher);
		loginpg.password(EnvironmentsData.passwordTeacher);
		loginpg.entCaptchaa(loginpg.captcha());
		Thread.sleep(2000);
		dashbordTech = loginpg.loginButton2();
		Thread.sleep(3000);
	}

	// public String assmntName;
	String assmntName = "QA Scenice/22042054";

	@Test
	public void AddAssessmentMasters() throws Exception {
	
		System.out.println("------------ Add Assessment Masters TestCase ----------");
		dashbordTech.closepopup();		 
		dashbordTech.onlineAssessemnt();
		Thread.sleep(1000);
		addAssessment = dashbordTech.assementMaster();
		Thread.sleep(1000);
		AssertValidation("Online Assessment Master",
				getAttribut(addAssessment.pageTitle(), "Text", "Page Title Verification"));
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "MCQ Only");
		// Subjective OR Mix //Upload Subjective Question Sheet
		assmntName = "QA Scenice/" + BaseTest.dhms();
		addAssessment.etrTestNam(assmntName);
		addAssessment.etrTime("30");
		addAssessment.minimTime("05");
		Thread.sleep(3000);
		addAssessment.etrTotlMrks("30");
		addAssessment.etrDescription("Test Description content test");
		addAssessment.etrInstructions("Mention the following at the top of your answer sheet’s first page:\n"
				+ "•  Name, Admission Number, Class, Section, Roll No, Subject and Date of Examination \n"
				+ "• Please mention page numbers at the bottom of each page of the answers sheet.\n"
				+ "• Read all the questions carefully. \n" + "• All questions are compulsory. \n"
				+ "• Marks are allotted against each question.\n" + "• Instruction content Test 001\n");
		// addAssessment.seleAnswerSheetUplod();
		// addAssessment.seleAnsUploadTim("5");
		addAssessment.seleCamera();
		addAssessment.seleMultiFace();
		addAssessment.seleCameraTim("60");
		addAssessment.seleSceenCapu();
		addAssessment.seleScrenTim("60");
		addAssessment.seleQusnPalette();
		addAssessment.seleFullScreen();
		ScrolljavaScript(addAssessment.seleAnswerSheetUplodScroll());
		Thread.sleep(1000);
		addAssessment.addBtn().click();
		Thread.sleep(1000);
		waitForAlert(driver);
		Thread.sleep(1000);
		ScrolljavaScript(addAssessment.pageTitle());
		Thread.sleep(1000);
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "MCQ Only");
		Thread.sleep(1500);
		WebElement testnam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		System.out.println(testnam);
		Thread.sleep(1000);
		ScrolljavaScript(testnam);
		// scrolling(testnam);
		Thread.sleep(1000);
		WebElement addQusn = driver.findElement(By.xpath("//*[.='" + assmntName + "']/../td[11]//*[.='Add Question']"));
		System.out.println(addQusn);
		Thread.sleep(1000);
		addQusn.click();

	}

	@Test
	public void AddQuestions() throws Exception {
		System.out.println("------------ Add Assessment Questions TestCase -----------");
		
		//driver.get("https://entrar.in/online_exam_question/addQuestion/23195");

		addqustn = new AddOnlineAssesmQuestionsPage();
		AssertValidation("Online Assessment Question",
				getAttribut(addqustn.pageTitle(), "Text", "Page Title Verification"));

		for (int i =1; i <=4; i++) {
			if(i==1) {
			addqustn.etrQuestion(i
					+ ") ಡಾ.ಸುಬ್ರಮಣಿಯನ್  ಚಂದ್ರಶೇಖರ್ ವಿಶ್ವವಿಖ್ಯಾತ ಖಗೋಳ ಭೌತಶಾಸ್ತ್ರಜ್ಞರಾಗಿದ್ದಾರೆ. ಖಗೋಳ ಶಾಸ್ತ್ರದಲ್ಲಿ  ನಡೆಸಿದ ಅಸಾಧಾರಣ ಸಂಶೋಧನಾ ಕಾರ್ಯಕ್ಕಾಗಿ ಡಾ|| ಎಸ್ ಚಂದ್ರಶೇಖರ್ ಗೆ 1983 ರಲ್ಲಿ  ,ಭೌತಶಾಸ್ತ್ರ ವಿಭಾಗದ ನೊಬೆಲ್ ಪಾರಿತೋಷಕವನ್ನು ನೀಡಲಾಯಿತು. ಈ ಪಾರಿತೋಷಕವನ್ನು ಅವರು  ಅಮೆರಿಕಾದ ವಿರಿಯಮ್ ಫೌಲರ್ ಜೊತೆ ಹಂಚಿಕೊಂಡರು.-"
					+ dmhms());
			sendKeys(addqustn.qutionImg(), EnvironmentsData.questionImg);
			}else if(i==2) {	
				addqustn.etrQuestion(i
						+ ") भाषाई आधार पर सर्वप्रथम किस राज्य का गठन हुआ ? -"+ dmhms());
			}else if(i==3)
			{
				addqustn.etrQuestion(i
						+ ") If in two As ABC and DEF / ABDF=BCFE=CAED, - The decimal form of 129225775 is / The set A = {0,1, 2, 3, 4, …} represents the set of. -"
						+ dmhms());
			}
			else {
				addqustn.etrQuestion(i
						+ ") Automation added question 00 Once the student has completed attempting the question, you will no longer be able to edit or delete the question.-"
						+ dmhms());
			}
			
			// qusnum++;
			addqustn.entryType(1);
			addqustn.entMarks("1");

			for (int j = 0; j <= 2; j++) {
				addqustn.addOptionBtn();
			}
			for (int k = 0; k <= 3; k++) 
			{
				String options = k+1 + ") option-" + dms();
				driver.findElement(By.xpath("//*[@id='quesradio_" + k + "']")).sendKeys(options);
				if(k==0 & i==1)
				{
					
					Thread.sleep(1000);
					sendKeys(addqustn.optionImg1(), EnvironmentsData.optionImg);
				}
				System.out.println(options);
			}
			Thread.sleep(1000);
			addqustn.correctOptionAns();
			Thread.sleep(1000);
			addqustn.saveBtn();
			Thread.sleep(1000);
		}	
		/*
		 * for (int q=0;q<2;q++) {
		 * 
		 * 
		 * 
		 * //old for(int i=0;i<=2;i++) {
		 * addqustn.etrQuestion(qusnum+"Automation added question 00-"+dmhms());
		 * qusnum++; addqustn.entryType(i+1); //addqustn.entryType(1);
		 * addqustn.entMarks("5");
		 * 
		 * if(i<=0) { addqustn.saveBtn(); }else {
		 * 
		 * 
		 * for(int j=0;j<=2;j++) { if(i==1) { addqustn.addOptionBtn(); }else if(i==2) {
		 * addqustn.addCheckBtn(); } } for(int k=0;k<=3;k++) { int option=0; if(i==1) {
		 * option=k;
		 * driver.findElement(By.xpath("//*[@id='quesradio_"+option+"']")).sendKeys(
		 * "option-"+dms()+qusnum+k); }else if(i==2) { option=k;
		 * driver.findElement(By.xpath("//*[@id='quescheckbox_"+option+"']")).sendKeys(
		 * "chekcoption-"+dms()+qusnum+k); } } if(i==1) { addqustn.correctOptionAns();
		 * }else if(i==2) { addqustn.coorctCheckboxAns(); } Thread.sleep(1000);
		 * 
		 * addqustn.saveBtn(); Thread.sleep(1000); waitForAlert(driver); } } }
		 */
		ScrolljavaScriptEndPage();
	}

	@Test
	public void QuestionPrivew() throws Exception {
		System.out.println("------------ Assessment Question PreView TestCase -------");
		dashbordTech.onlineAssessemnt();
		Thread.sleep(1000);
		addAssessment = dashbordTech.assementMaster();
		Thread.sleep(1000);
		AssertValidation("Online Assessment Master",
				getAttribut(addAssessment.pageTitle(), "Text", "Page Title Verification"));
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "MCQ Only");
		Thread.sleep(1000);
		WebElement testnam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		System.out.println(testnam.getText());
		Thread.sleep(1000);
		ScrolljavaScript(testnam);
		// scrolling(testnam);
		Thread.sleep(1000);
		WebElement exmprview = driver
				.findElement(By.xpath("//*[.='" + assmntName + "']/../td[11]//*[normalize-space(.)='Exam Preview']"));
		exmprview.click();
		Thread.sleep(1000);
		ScrolljavaScriptEndPage();
	}

	@Test
	public void ExamPublish() throws Exception {
		System.out.println("------------ Assessment Exam Publishing TestCse -------");
		dashbordTech.onlineAssessemnt();
		Thread.sleep(1000);
		addAssessment = dashbordTech.assementMaster();
		Thread.sleep(1000);
		AssertValidation("Online Assessment Master",
				getAttribut(addAssessment.pageTitle(), "Text", "Page Title Verification"));
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "MCQ Only");
		Thread.sleep(1000);
		WebElement testnam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		System.out.println(testnam.getText());
		Thread.sleep(1000);
		ScrolljavaScript(testnam);
		// scrolling(testnam);
		Thread.sleep(1000);
		WebElement exmprview = driver
				.findElement(By.xpath("//*[.='" + assmntName + "']/../td[11]//*[normalize-space(.)='Exam Publish']"));
		exmprview.click();
		Thread.sleep(1000);
		schpublish = new SchedulePublishTest();
		AssertValidation("Test Setup & Publishing",
				getAttribut(schpublish.pageTitle(), "Text", "Page Title Verifcation"));
		for (int i = 0; i < schpublish.testMasterData().size() - 1; i++) {
			System.out.println(schpublish.testMasterData().get(i).getText());
		}

		schpublish.seleStandard(EnvironmentsData.section);
		schpublish.seleSchool();
		schpublish.seleEntrar();
		schpublish.seleDate(currentDate());
		int hr = currentHour();
		int min = currentMints();
		System.out.println(hr + ":" + min);
		schpublish.entStartHr("09");
		schpublish.entStarMit("00");
		schpublish.entEndHr("23");
		schpublish.entEndMit("00");
		Thread.sleep(1000);
		schpublish.addBtn();
		Thread.sleep(1000);
		waitForAlert(driver);
		Thread.sleep(1000);
		dashbordTech.profileLogout();
		dashbordTech.logout();
	}

	String stdId = EnvironmentsData.usernameStudent;

	public void StudentloginG() throws Exception
	{
		System.out.println("------------ Student Valid Login TestCase -------");
		loginpg.username(stdId);
		loginpg.password(EnvironmentsData.passwordStudent);
		//System.out.println(loginpg.captcha());
		Thread.sleep(2000);
		loginpg.entCaptchaa(loginpg.captcha());
		Thread.sleep(2000);
		dashbordStd = loginpg.loginButton3();
		Thread.sleep(3000);
	}
	@Test
	public void StudentLogin() throws Exception {
		StudentloginG();
	}

	ArrayList<String> stdAttamted;

	@Test
	public void StartAssessment() throws Exception {
		System.out.println("------------ Start and Submit Assessment TestCase ------------");
		dashbordStd.onlineAssessmentMaster();
		onlinAssmStd = dashbordStd.onlineAssessment();
		AssertValidation("Online Assessment", getAttribut(onlinAssmStd.pageTitle(), "Text", "Page Title Verification"));

		WebElement assessmentNam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		ScrolljavaScript(assessmentNam);
		Thread.sleep(1000);
		WebElement assessmentStart = driver.findElement(By.xpath("//*[.='" + assmntName + "']/..//*[.='Start']"));
		assessmentStart.click();
		assesmntTest = new AssessmentTestPage();
		Thread.sleep(1000);
		List<WebElement> statpop = driver.findElements(By.xpath("//*[.='The Exam is Ready']"));
		List<WebElement> popunlock = driver
				.findElements(By.xpath("//*[@id='locked-small-Modal']/..//*[.='Locked Out']"));
		System.out.println(popunlock.size() + " /Unloack popup - " + statpop.size() + " /Start popup");
		String unlock = null;
		if (popunlock.size() > 0 || statpop.size() > 0) {
			unlock = popunlock.get(0).getText();
			String stat = statpop.get(0).getText();

			if (stat.equals("The Exam is Ready")) {
				System.out.println("State");
				assesmntTest.statrtExam();

			} else if (unlock.equals("Locked Out")) {
				System.out.println("locked");
				assesmntTest.requestunlockTxt("Automation Test message");
				assesmntTest.UnlockBtn();
				Thread.sleep(1000);
			}
		}

		Thread.sleep(1000);
		String totalqa = assesmntTest.questionCount().getText();
		System.out.println(totalqa);
		String totalquestions = totalqa.replace("/ ", "");
		System.out.println(totalquestions);
		int qaTotalCount = Integer.parseInt(totalquestions);
		int qaCurrent = Integer.parseInt(assesmntTest.currentQuestion().getText());
		System.out.println(qaCurrent + " - " + qaTotalCount);

		assesmntTest.firstQuestion();
		int totalqus = assesmntTest.qustionPalte().size();
		System.out.println("Total Questions - " + totalqus);
		int anscounttCheck = 0;
		stdAttamted = new ArrayList<String>(totalqus);
		for (int i = 1; i <= totalqus; i++) {
			if (anscounttCheck > 3) {
				anscounttCheck = 0;
			}
			if (anscounttCheck <= 4) {
				WebElement answer = driver
						.findElement(By.xpath("//*[@type='radio']/..//*[@value='" + anscounttCheck + "']"));
				System.out.println(
						i + "-->question number - " + "/" + anscounttCheck + " Answer selected " + answer.getText());
				WebElement answerText = driver
						.findElement(By.xpath("//*[@type='radio']/..//*[@value='" + anscounttCheck + "']/.."));
				System.out.println(answerText.getText());

				stdAttamted.add(answerText.getText());
				answer.click();
				if (i < totalqus) {
					assesmntTest.nextBtn().click();
				}
			}
			anscounttCheck++;

		}
		System.out.println(stdAttamted.size());
		/*
		 * for(int j=0;j<stdAttamted.size();j++) {
		 * System.out.println(stdAttamted.get(j)); } //System.out.println(as);
		 */
		ScrolljavaScript(assesmntTest.submitBtn());
		assesmntTest.submitBtn().click();
		waitForAlertDismiss(driver);
		
		if (unlock.equals("Locked Out")) {
			System.out.println("locked");
			assesmntTest.requestunlockTxt("Automation Test message");
			assesmntTest.UnlockBtn();
			Thread.sleep(1000);
		}
		
		/*assesmntTest.submitBtn().click(); 
		  waitForAlert(driver);
		  AssertValidation("YOU HAVE SUCCESSFULLY COMPLETED THE TEST.",
		  getAttribut(assesmntTest.successfulMesg(), "Text",
		  "Assessment Successful Submit Verifcation"));*/
		Thread.sleep(1000);
		assesmntTest.requestunlockTxt("Automation Test message1");
		assesmntTest.UnlockBtn();
		dashbordTech = new DashboardTeacherPage();
		dashbordTech.profileLogout();
		dashbordTech.logout();

	}
	

	ArrayList<String> tabs2;
	ArrayList<String> stdAttemptedAnsTech;
	ArrayList<String> TechRightAnsTech;
	ArrayList<String> maxmarkslist;
	ArrayList<String> testRsultListTech;
	ArrayList<String> testRsultHeaderListTech;
	@Test
	public void AssessmentPublish() throws Exception {
		System.out.println("------------ Assessment Publishing TestCase -------");
		dashbordTech.onlineAssessemnt();
		viewPublishRrlt = dashbordTech.mcqResults();
		AssertValidation("Online Assessment View Result And Publish Result",
				getAttribut(viewPublishRrlt.pageTitle(), "Text", "Page Title Vierification"));
		viewPublishRrlt.seleYear(EnvironmentsData.year);
		viewPublishRrlt.seleStandard(EnvironmentsData.section);
		viewPublishRrlt.seleSection("ENTRAR");
		viewPublishRrlt.seleSubject(EnvironmentsData.subject);
		Thread.sleep(1000);
		viewPublishRrlt.seleTest(assmntName);
		viewPublishRrlt.searchBtn();
		Thread.sleep(2000);
		WebElement stdAttendance = driver.findElement(By.xpath("//text()[contains(.,'"+stdId+"')]/../..//td[4]"));
		ScrolljavaScript(stdAttendance);
		List<WebElement> stdDetials = driver.findElements(By.xpath("//text()[contains(.,'"+stdId+"')]/../..//td"));
		for (int i = 0; i < 8; i++) {
			if (i == 0) {
				System.out.println("Student Details :");
			}
			System.out.println(stdDetials.get(i).getText());
		}
		AssertValidation("Present", getAttribut(stdAttendance, "Text", "Student Attendance Status"));
		WebElement viewFullRslt = driver.findElement(By.xpath("//text()[contains(.,'"+stdId+"')]/../..//*[.='View Full Result']/*"));
		WebElement viewResult = driver.findElement(By.xpath("//text()[contains(.,'"+stdId+"')]/../..//*[.='View Result']/*"));
		viewFullRslt.click();
		// new tab opened

		Thread.sleep(1000);
		tabs2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs2.size() + " tabs size");
		driver.switchTo().window(tabs2.get(1));
		
		fullResult = new ViewFullResultsTechrPage();
		AssertValidation("View Full Result", getAttribut(fullResult.pageTitle(), "Text", "Page Title Verification"));
		driver.get(driver.getCurrentUrl());
		ScrolljavaScriptEndPage();
		scrolling(fullResult.pageTitle());
		Thread.sleep(2000);
		int stddetials = fullResult.stdAssemntData().size();

		for (int j = 0; j < stddetials - 2; j++) {
			System.out.println(fullResult.stdAssemntData().get(j).getText());
		}
		int totalStdAns = fullResult.stdAnswerd().size();
		int TechRightAns= fullResult.tecAnsrs().size();
		int maxMarks=fullResult.marks().size();
		
		System.out.println(fullResult.stdAssemntData().size() + " std details -- " + totalStdAns + " attemted Answers");
		//checking in Teacher login
		stdAttemptedAnsTech = new ArrayList<String>(totalStdAns);
		TechRightAnsTech= new ArrayList<String>(TechRightAns);
		maxmarkslist=new ArrayList<String>(maxMarks);
		
		for (int k = 0; k < TechRightAns; k++) {
			try {
				System.out.println(fullResult.stdAnswerd().get(k).getText());
				stdAttemptedAnsTech.add(fullResult.stdAnswerd().get(k).getText());
				TechRightAnsTech.add(fullResult.tecAnsrs().get(k).getText());
				maxmarkslist.add(fullResult.marks().get(k).getText());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		//comparing Student attempted and server saved Answers.
		for (int i = 0; i < totalStdAns; i++) {
			if (stdAttamted.get(i).equals(stdAttemptedAnsTech.get(i))) {
				System.out.println("Saved in server ---> " + stdAttamted.get(i) + " / " + stdAttemptedAnsTech.get(i) + "/ Makrs - "+ maxmarkslist.get(i));
			} else {
				System.out.println("Not Saved" + i);
			}
		}

		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		ScrolljavaScript(viewResult);
		Thread.sleep(1000);
		viewResult.click();
		Thread.sleep(1000);

		// activite stated
		tabs2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs2.size() + " - size of tabs");
		driver.switchTo().window(tabs2.get(2));
		overViewResult = new ViewStdResultPage();
		AssertValidation("Result", getAttribut(overViewResult.pageTitle(), "Text", "Page Title Verification"));
		driver.get(driver.getCurrentUrl());
		testRsultHeaderListTech = new ArrayList<String>(overViewResult.StdResultMaster().size());
		testRsultListTech = new ArrayList<String>(overViewResult.StdResultMaster().size());
		for (int k = 0; k < overViewResult.StdResultMaster().size(); k++) {
			System.out.println(overViewResult.StdResultMaster().get(k).getText() + "---"
					+ overViewResult.stdResultdata().get(k).getText());
			testRsultHeaderListTech.add(overViewResult.StdResultMaster().get(k).getText());
			testRsultListTech.add(overViewResult.stdResultdata().get(k).getText());
		}
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		WebElement seleCheckPublish = driver.findElement(By.xpath("//text()[contains(.,'"+stdId+"')]/../..//td//*[@id='check_all']"));
		ScrolljavaScript(seleCheckPublish);
		Thread.sleep(1000);
		if(seleCheckPublish.isSelected()==false)
		{
			seleCheckPublish.click();
		}
		ScrolljavaScript(viewPublishRrlt.pageTitle());
		Thread.sleep(1000);
		rsultsuccfuPublis = viewPublishRrlt.publishbutton();
		Thread.sleep(1000);
		tabs2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs2.size() + " - size of tabs");
		driver.switchTo().window(tabs2.get(3));
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(rsultsuccfuPublis.successfulMesag().getText());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs2.get(2));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		dashbordTech.profileLogout();
		dashbordTech.logout();
		
	}
	
	@Test
	public void StudentLogin2() throws Exception {
		System.out.println();
		System.out.println("------------ Student Valid Login TestCase -------");
		loginpg.username(stdId);
		loginpg.password(EnvironmentsData.passwordStudent);
		loginpg.captcha();
		dashbordStd = loginpg.loginButton3();
		Thread.sleep(3000);
	}
	
	
	ArrayList<String> tabs3;
	@Test
	public void CheckStdAssessmentResult() throws Exception
	{
		System.out.println();
		System.out.println("------------ Student Assessment Result TestCase -------");
		dashbordStd.onlineAssessmentMaster();
		Thread.sleep(1500);
		onlinAssmstdResult = dashbordStd.onlineAssessmentResult();
		AssertValidation(getAttribut(onlinAssmstdResult.pageTitle(), "Text", "Page Title Verfication"), "MCQ Test Result");
		
		List<WebElement> viewresultdetails =driver.findElements(By.xpath("//*[.='"+assmntName+"']/..//td"));
		for(int i =0; i<viewresultdetails.size();i++)
		{
			System.out.println(viewresultdetails.get(i).getText());
		}
		
		WebElement viewFullResult=driver.findElement(By.xpath("//*[.='"+assmntName+"']/..//td[5]/*"));
		viewFullResult.click();
		tabs3 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs3.size()+" - total tabs");
		
		driver.switchTo().window(tabs3.get(1));
		
		stdfullResultpg=new StdOnlineAssesmViewFullResult();
		System.out.println();
		System.out.println("--------------- View Full Student Result------------");
		AssertValidation(getAttribut(stdfullResultpg.pageTitle(), "Text", "Page Title Verification"), "View Full Result");
		driver.get(driver.getCurrentUrl());
		int stdmarkscount=stdfullResultpg.logStdMarks().size();
		int stdTechRightCount=stdfullResultpg.logStdTecAnsrs().size();
		int stdAttemtedAnsCount=stdfullResultpg.logStdAnswerd().size();
		System.out.println(stdmarkscount+" mrk-"+stdTechRightCount+" techRightans-"+stdAttemtedAnsCount+" stdAtteAns");
		ArrayList<String> markslist = new ArrayList<String>(stdmarkscount);
		ArrayList<String> techRightAnslist= new ArrayList<String>(stdTechRightCount);
		ArrayList<String> stdanslist=new ArrayList<String>(stdAttemtedAnsCount);
		
		for(int i=0;i<stdmarkscount;i++)
		{
			markslist.add(stdfullResultpg.logStdMarks().get(i).getText());
			techRightAnslist.add(stdfullResultpg.logStdTecAnsrs().get(i).getText());
			stdanslist.add(stdfullResultpg.logStdAnswerd().get(i).getText());
		}
		
		for (int j=0;j<stdmarkscount;j++)
		{
			if(stdAttemptedAnsTech.get(j).equals(stdanslist.get(j))& TechRightAnsTech.get(j).equals(techRightAnslist.get(j))& maxmarkslist.get(j).equals(markslist.get(j)) )
			{
				System.out.println("Successfully published Right Answer");
				System.out.println("Teacher side Details :"+stdAttemptedAnsTech.get(j)+" / "+TechRightAnsTech.get(j)+" / "+maxmarkslist.get(j));
				System.out.println("Student side Details :"+stdanslist.get(j)+" / "+techRightAnslist.get(j)+" / "+markslist.get(j));
			}																															
		}
		driver.switchTo().window(tabs2.get(0));
		WebElement viewResult=driver.findElement(By.xpath("//*[.='"+assmntName+"']/..//td[4]/*"));
		viewResult.click();
		tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		viewresultstd =new StdOnlineAssesmViewResult();
		System.out.println();
		System.out.println("--------------- View Student Result------------");
		AssertValidation(getAttribut(viewresultstd.pagTitle(), "text", "Page Title Verification"), "Result");
		int resltdatasize=viewresultstd.resultdat().size();
		ArrayList<String> resultListdata=new ArrayList<String>(resltdatasize);
		for (int k = 0; k < resltdatasize; k++) {
			resultListdata.add(viewresultstd.resultdat().get(k).getText());
		}

		for (int l = 0; l < resltdatasize; l++) {
			if (testRsultListTech.get(l).equals(resultListdata.get(l))) {
				System.out.println(testRsultHeaderListTech.get(l) + " : " + "Teacher Side - " + testRsultListTech.get(l)
						+ " / Student Side - " + resultListdata.get(l));
			} else {
				System.out.println("Data not Matched");
			}
		}
		Thread.sleep(1000);
		dashbordTech.profileLogout();
		dashbordTech.logout();
	}
	
	
	@Test
	public void addSubjectiveMastrExam() throws Exception
	{
			TeacherLogin();
			
			dashbordTech.onlineAssessemnt();
			Thread.sleep(1000);
			addAssessment = dashbordTech.assementMaster();
			Thread.sleep(1000);
			AssertValidation("Online Assessment Master",
					getAttribut(addAssessment.pageTitle(), "Text", "Page Title Verification"));
			Thread.sleep(3000);
			addAssessment.seleYear(EnvironmentsData.year);
			Thread.sleep(1000);
			selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
			Thread.sleep(1000);
			selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
			Thread.sleep(1000);
			selectdropdownTxt(addAssessment.seleType(), "Upload Subjective Question Sheet");
			// Subjective OR Mix //Upload Subjective Question Sheet
			assmntName = "QA SceniceSubj/" + BaseTest.dhms();
			addAssessment.etrTestNam(assmntName);
			addAssessment.etrTime("30");
			Thread.sleep(1000);
			addAssessment.etrTotlMrks("30");
			addAssessment.etrDescription("Subjectie Test Description content test");
			addAssessment.etrInstructions("Mention the following at the top of your answer sheet’s first page:\n"
					+ "•  Name, Admission Number, Class, Section, Roll No, Subject and Date of Examination \n"
					+ "• Please mention page numbers at the bottom of each page of the answers sheet.\n"
					+ "• Read all the questions carefully. \n" + "• All questions are compulsory. \n"
					+ "• Marks are allotted against each question.\n" + "• Instruction content Test 001\n");
			 //addAssessment.seleAnswerSheetUplod();
			 addAssessment.seleAnsUploadTim("05");
			addAssessment.seleCamera();
			addAssessment.seleMultiFace();
			addAssessment.seleCameraTim("60");
			addAssessment.seleSceenCapu();
			addAssessment.seleScrenTim("60");
			//addAssessment.seleQusnPalette();
			addAssessment.qrCodeChck().click();
			addAssessment.seleFullScreen();
			ScrolljavaScript(addAssessment.seleAnswerSheetUplodScroll());
			Thread.sleep(1000);
			addAssessment.addBtn().click();
			Thread.sleep(1000);
			waitForAlert(driver);
			Thread.sleep(1000);
	}
	
	@Test
	public void questionPaperUpload() throws Exception
	{
		ScrolljavaScript(addAssessment.pageTitle());
		Thread.sleep(3000);
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "Upload Subjective Question Sheet");
		Thread.sleep(1500);
		WebElement testnam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		System.out.println(testnam);
		Thread.sleep(1000);
		ScrolljavaScript(testnam);
		Thread.sleep(1000);			
		//click on upload question
		driver.findElement(By.xpath("//*[.='" + assmntName +"']/..//a[normalize-space(.)='Upload Question Sheet']")).click();
		
		questionPaperUploadPage paperUplod=new questionPaperUploadPage();
		AssertValidation("Question Sheet Upload",getAttribut(paperUplod.pageTitle(), "Text", "Page Title Verifation"));
		paperUplod.chooseFile().sendKeys("C:/Users/Anil/Downloads/TestPaper01.pdf");
		paperUplod.submitBtn().click();
		Thread.sleep(1000);
		waitForAlert(driver);
		Thread.sleep(1000);
		AssertValidation("Click here to download your uploaded file", getAttribut(paperUplod.uploadedFile(), "Text", "QuestionPaper Upload Status:"));
	}
	
	@Test
	public void SubjectiveExamPublish() throws Exception
	{
		//TeacherLogin();
		dashbordTech.onlineAssessemnt();
		Thread.sleep(1000);
		addAssessment = dashbordTech.assementMaster();
		Thread.sleep(1000);
		addAssessment.seleYear(EnvironmentsData.year);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleStandard(), EnvironmentsData.section);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleSubject(), EnvironmentsData.subject);
		Thread.sleep(1000);
		selectdropdownTxt(addAssessment.seleType(), "Upload Subjective Question Sheet");
		Thread.sleep(2000);
		WebElement testnam2 = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		Thread.sleep(1000);
		ScrolljavaScript(testnam2);
		WebElement publishSubExm=driver.findElement(By.xpath("//*[.='" + assmntName +"']/..//*[normalize-space(.)='Exam Publish']"));
		Thread.sleep(1000);
		ScrolljavaScript(publishSubExm);
		publishSubExm.click();
		
		Thread.sleep(1000);
		schpublish = new SchedulePublishTest();
		AssertValidation("Test Setup & Publishing",
				getAttribut(schpublish.pageTitle(), "Text", "Page Title Verifcation"));
		for (int i = 0; i < schpublish.testMasterData().size() - 1; i++) {
			System.out.println(schpublish.testMasterData().get(i).getText());
		}
		schpublish.seleStandard(EnvironmentsData.section);
		schpublish.seleSchool();
		schpublish.seleEntrar();
		schpublish.seleDate(currentDate());
		int hr = currentHour();
		int min = currentMints();
		System.out.println(hr + ":" + min);
		schpublish.entStartHr("09");
		schpublish.entStarMit("35");
		schpublish.entEndHr("23");
		schpublish.entEndMit("00");
		Thread.sleep(1000);
		schpublish.addBtn();
		Thread.sleep(1000);
		waitForAlert(driver);
		Thread.sleep(1000);
		dashbordTech.profileLogout();
		dashbordTech.logout();
	}
	
	@Test
	public void StartSubjectiveExam() throws Exception
	{
		StudentloginG();
		dashbordStd.onlineAssessmentMaster();
		onlinAssmStd = dashbordStd.onlineAssessment();
		AssertValidation("Online Assessment", getAttribut(onlinAssmStd.pageTitle(), "Text", "Page Title Verification"));

		WebElement assessmentNam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		ScrolljavaScript(assessmentNam);
		Thread.sleep(1000);
		WebElement assessmentStart = driver.findElement(By.xpath("//*[.='" + assmntName + "']/..//*[.='Start']"));
		assessmentStart.click();
		assesmntTest = new AssessmentTestPage();
		Thread.sleep(1000);
		List<WebElement> statpop = driver.findElements(By.xpath("//*[.='The Exam is Ready']"));
		List<WebElement> popunlock = driver.findElements(By.xpath("//*[@id='locked-small-Modal']/..//*[.='Locked Out']"));
		System.out.println(popunlock.size() + " /Unloack popup - " + statpop.size() + " /Start popup");
		String unlock = null;
		
		if (popunlock.size() > 0 || statpop.size() > 0) {
			unlock = popunlock.get(0).getText();
			String stat = statpop.get(0).getText();

			if (stat.equals("The Exam is Ready")) {
				System.out.println("State");
				assesmntTest.statrtExam();

			} else if (unlock.equals("Locked Out")) {
				System.out.println("locked");
				assesmntTest.requestunlockTxt("Automation Test message");
				assesmntTest.UnlockBtn();
				Thread.sleep(1000);
			}
		}
		waitForVisibility(assesmntTest.pageNum());
		System.out.println(assesmntTest.questionpgCountSubjective().getText());
		System.out.println("Question paper Display Status : "+assesmntTest.questionPriview().isDisplayed());
		boolean qustionpaperstatus=assesmntTest.questionPriview().isDisplayed();
		assertEquals(qustionpaperstatus, true);
		driver.navigate().back();
	}
	
	@Test
	public void UploadSubjAnswerSheet() throws Exception
	{
		WebElement assessmentNam = driver.findElement(By.xpath("//*[.='" + assmntName + "']"));
		ScrolljavaScript(assessmentNam);
		Thread.sleep(1000);
		WebElement assessmentStart = driver.findElement(By.xpath("//*[.='" + assmntName + "']/..//*[@accept='application/pdf']"));
		assessmentStart.sendKeys("C:/Users/Anil/Downloads/TestPaper03.pdf");
		onlinAssmStd.uploadBtn().click();		
		boolean fileuploadstatus =driver.findElement(By.xpath("//*[.='" + assmntName + "']/..//*[.='Successfully Uploaded.']")).isDisplayed();
		boolean filedownloadicon=driver.findElement(By.xpath("//*[.='" + assmntName + "']/..//img")).isDisplayed();
		System.out.println("Answer sheet uploaded status : "+ fileuploadstatus);
		System.out.println("Downloaded icon Display status : " + filedownloadicon);
		assertEquals( fileuploadstatus,true);
		assertEquals(filedownloadicon,true);
		Thread.sleep(1000);
		dashbordTech.profileLogout();
		dashbordTech.logout();
	}
	
	@Test
	public void subjectiveResultPublish() throws Exception
	{
		TeacherLogin();
		dashbordTech.onlineAssessemnt();
		Thread.sleep(1000);
		subjectivResult=dashbordTech.subjectiveResult();
		AssertValidation(getAttribut(subjectivResult.pageTitle(), "Text", "Page Title Verification"), "Online Assessment Recording");
		viewPublishRrlt=new OnlineAssessmViewPublishingPage();
		
		viewPublishRrlt.seleYear(EnvironmentsData.year);
		viewPublishRrlt.seleStandard(EnvironmentsData.section);
		viewPublishRrlt.seleSection("ENTRAR");
		viewPublishRrlt.seleSubject(EnvironmentsData.subject);
		Thread.sleep(1000);
		viewPublishRrlt.seleTest(assmntName);
		viewPublishRrlt.searchBtn();
		waitForVisibility(viewPublishRrlt.marksDataTable);
		ScrolljavaScript(viewPublishRrlt.stdRowData(stdId));
		System.out.println(viewPublishRrlt.stdRowData(stdId).getText());
		waitForVisibility(viewPublishRrlt.marksDataTable);
		viewPublishRrlt.stdMarksRecording(stdId).click();
		Thread.sleep(1000);
		ScrolljavaScript(viewPublishRrlt.annotationpdf());
		viewPublishRrlt.annotationpdf.click();
	}
	
}
