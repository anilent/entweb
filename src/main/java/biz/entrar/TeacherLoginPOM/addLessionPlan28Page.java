package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class addLessionPlan28Page extends BaseTest{
	
	@FindBy (xpath="//*[.='Lesson Plan Add']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='teacher_id']") private WebElement teacherNam;
	@FindBy (xpath="//*[@id='lessonplan_type']") private WebElement lessionPlanTyp;
	@FindBy (xpath="//*[@id='month']") private WebElement seleMonth;
	@FindBy (xpath="//*[@id='start_date']") private WebElement selestartDate;
	@FindBy (xpath="//*[@id='end_date']") private WebElement seleEndDate;
	@FindBy (xpath="//*[@id='school_section_id']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='school_subject_id']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='chapter_id']") private WebElement chapter;
	@FindBy (xpath="//*[@id='topic_id']") private WebElement topic;
	@FindBy (xpath="//*[@id='module']") private WebElement module;
	@FindBy (xpath="//*[@name='objective']") private WebElement learnObject;
	@FindBy (xpath="//*[@id='objective_attachment']") private WebElement objtAttach;
	@FindBy (xpath="//*[@id='testing_of_previous_knowledge']") private WebElement testingKnowdg;
	@FindBy (xpath="//*[@name='testing_of_previous_knowledge_attachment[]']") private WebElement testingknowdgAttach;
	@FindBy (xpath="//*[@name='introduction_title']") private WebElement introductionTitle;
	@FindBy (xpath="//*[@id='introduction_title_attachment']") private WebElement introductionAttachment;
	@FindBy (xpath="//*[@id='method_of_teaching']") private WebElement methodofTeching;
	@FindBy (xpath="//*[@name='method_of_teaching_attachment[]']") private WebElement methodofTeachingAttach;
	@FindBy (xpath="//*[@name='creative_activities']") private WebElement cratetivActivity;
	@FindBy (xpath="//*[@name='creative_activities_attachment[]']") private WebElement creativaActivityAttach;
	@FindBy (xpath="//*[@id='teaching_aids_type']/..//*[.='Nothing selected']/*") private WebElement seleTeachingAids;
	@FindBy (xpath="//*[@data-id='teaching_aids_type']") private WebElement clickEvent;
	@FindBy (xpath="//*[@name='teaching_aids']") private WebElement otherTeachingAid;
	@FindBy (xpath="//*[@name='teaching_aids_attachment[]']") private WebElement teachAidsAttach;
	@FindBy (xpath="//*[@id='video_ict']") private WebElement videoLink;
	@FindBy (xpath="//*[@id='assignment_type']/..//*[.='Nothing selected']/*") private WebElement seleAssignment;
	@FindBy (xpath="//*[@data-id='assignment_type']") private WebElement clickevent1;
	@FindBy (xpath="//*[@name='assignments']") private WebElement assignments;
	@FindBy (xpath="//*[@name='assignment_attachment[]']") private WebElement assignmentAttach;
	@FindBy (xpath="//*[@id='additional_notes']") private WebElement additonalNote;
	@FindBy (xpath="//*[@name='additional_notes_attachment[]']") private WebElement additonalNoteAttach;
	@FindBy (xpath="//*[@id='reflection']") private WebElement reflection;
	@FindBy (xpath="//*[@name='reflection_attachment[]']") private WebElement reflectionAttach;
	@FindBy (xpath="//*[@id='add_lesson']") private WebElement addBtn;
	 

	public addLessionPlan28Page() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement seleYear()
	{
		return seleYear;
	}
	public WebElement teacherNam()
	{
		return teacherNam;
	}
	public WebElement lessionPlanTyp()
	{
		return lessionPlanTyp;
	}
	public WebElement seleMonth()
	{
		return seleMonth;
	}
	public WebElement selestartDate()
	{
		return selestartDate;
	}
	public WebElement seleEndDate()
	{
		return seleEndDate;
	}
	public WebElement seleStandard()
	{
		return seleStandard;
	}
	public WebElement seleSubject()
	{
		return seleSubject;
	}
	public WebElement chapter()
	{
		return chapter;
	}
	public WebElement topic()
	{
		return topic;
	}
	public WebElement module()
	{
		return module;
	}
	public WebElement learnObject()
	{
		return learnObject;
	}
	public WebElement objtAttach()
	{
		return objtAttach;
	}
	public WebElement testingKnowdg()
	{
		return testingKnowdg;
	}
	
	public WebElement testingknowdgAttach()
	{
		return testingknowdgAttach;
	}
	public WebElement introductionTitle()
	{
		return introductionTitle;
	}
	public WebElement introductionAttachment()
	{
		return introductionAttachment;
	}
	public WebElement methodofTeching()
	{
		return methodofTeching;
	}
	public WebElement methodofTeachingAttach()
	{
		return methodofTeachingAttach;
	}
	public WebElement cratetivActivity()
	{
		return cratetivActivity;
	}
	public WebElement creativaActivityAttach()
	{
		return creativaActivityAttach;
	}
	public WebElement seleTeachingAids()
	{
		return seleTeachingAids;
	}
	public WebElement seleTechAidsTxt(String str)
	{
		return driver.findElement(By.xpath("//*[@role='option']//*[.='"+str+"']"));
	}
	public WebElement clickEvent()
	{
		return clickEvent;
	}
	public WebElement otherTeachingAid()
	{
		return otherTeachingAid;
	}
	public WebElement teachAidsAttach()
	{
		return teachAidsAttach;
	}
	public WebElement videoLink()
	{
		return videoLink;
	}
	public WebElement seleAssignment()
	{
		return seleAssignment;
	}
	public WebElement seleAssignmentTex(String str)
	{
		return driver.findElement(By.xpath("//*[@role='option']//*[.='"+str+"']"));
	}
	public WebElement clickevent1()
	{
		return clickevent1;
	}
	public WebElement assignments()
	{
		return assignments;
	}
	public WebElement assignmentAttach()
	{
		return assignmentAttach;
	}
	public WebElement additonalNote()
	{
		return additonalNote;
	}
	
	
	public WebElement additonalNoteAttach()
	{
		return additonalNoteAttach;
	}
	public WebElement reflection()
	{
		return reflection;
	}
	public WebElement reflectionAttach()
	{
		return reflectionAttach;
	}
	public WebElement addBtn()
	{
		return addBtn;
	}

}
