package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import biz.entrarBase.BaseTest;

public class AssessmentTeacherSubAllocationPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Teacher Subject Allocation']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='year_tag']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sections']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='teacher_id']") private WebElement seleTeacher;
	@FindBy (xpath="//*[@id='subjectalloc_add']") private WebElement addBtn;
	@FindBy (xpath="//td//*[@type='checkbox']") private List<WebElement> seleSubcheckbox;
	@FindBy (xpath="//*[@id='selectAll']/..//*[@class='cr']") private WebElement seleAll;

	public AssessmentTeacherSubAllocationPage() {
	PageFactory.initElements(driver, this);	
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssessmentTeacherSubAllocationPage seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
		return this;
	}
	public AssessmentTeacherSubAllocationPage seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public int seleSectionEle()
	{
		click(seleSection);
		Select se = new Select(seleSection);
		List<WebElement> l = se.getOptions();
		return l.size();
	}
	public AssessmentTeacherSubAllocationPage seleSection(int indx)
	{
		selectdropdown(seleSection, indx);
		return this;
	}
	public AssessmentTeacherSubAllocationPage seleTeacher(String text)
	{
		selectdropdownValue(seleTeacher, text);
		return this;
	}
	public AssessmentTeacherSubAllocationPage addBtn()
	{
		click(addBtn);
		return this;
	}
	public List<WebElement> seleSubcheckbox()
	{
		return seleSubcheckbox;
	}
	public AssessmentTeacherSubAllocationPage seleAll()
	{
		click(seleAll);
		return this;
	}
}
