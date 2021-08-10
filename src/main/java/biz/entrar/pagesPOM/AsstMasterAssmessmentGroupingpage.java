package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstMasterAssmessmentGroupingpage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-item']/../../..//*[.='Assessment Grouping']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='academic_year']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='mode']") private WebElement EntrMode;
	@FindBy (xpath ="//*[@id='skill']") private WebElement seleSkill;
	@FindBy (xpath="//*[@id='descriptor']") private WebElement seleDescriptor;
	@FindBy (xpath="//*[@id='remark']") private WebElement seleRemarks;
	@FindBy (xpath="//*[@id='chart_exam']") private WebElement sleChart;
	@FindBy (xpath="//*[@id='ignore_sub_group']/..//*[@class='cr']") private WebElement seleIgnoreSubGroping;
	@FindBy (xpath="//*[@id='non_acad']") private WebElement seleNonAcademic;
	@FindBy (xpath="//*[@id='attendance']") private WebElement seleAttendance;
	@FindBy (xpath="//*[@id='report_marks']/..//*[@class='cr']") private WebElement seleCheckReportMarks;
	@FindBy (xpath="//*[@id='print_total']/..//*[@class='cr']") private WebElement seleCheckPrintTotal;
	@FindBy (xpath="//*[@id='details']") private WebElement entrDetails;
	@FindBy (xpath="//*[@id='assessgrouping_add']") private WebElement addBtn;
	@FindBy (xpath="//td[2]//input") private List<WebElement> seleCheckBox;
	@FindBy (xpath="//*[@name='seq_no[]']") private List<WebElement> enterSeqNum;
	@FindBy (xpath="//*[@name='weightage[]']") private List<WebElement> emterWeightage;
	@FindBy (xpath="//*[@class='tabledit-delete-button btn btn-danger waves-effect waves-light deleteletter']")
	private List<WebElement> deleteBtn;
	@FindBy (xpath="//*[.='Assessment List:']") private WebElement assmntListHeadr;
	
	public AsstMasterAssmessmentGroupingpage() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "page Title Verification");
	}
	public WebElement pageTitleScrol()
	{
		return pageTitle;
	}
	
	public AsstMasterAssmessmentGroupingpage seleYear(String text)
	{
		selectdropdownTxt(seleYear, text);
		return this;
	}
	
	public AsstMasterAssmessmentGroupingpage seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage EntrMode(String text)
	{
		sendKeys(EntrMode, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleSkill(int text)
	{
		selectdropdown(seleSkill, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleDescriptor(int text)
	{
		selectdropdown(seleDescriptor, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleRemarks(int text)
	{
		selectdropdown(seleRemarks, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage sleChart(int text)
	{
		selectdropdown(sleChart, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleIgnoreSubGroping()
	{
		click(seleIgnoreSubGroping);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleNonAcademic(int text)
	{
		selectdropdown(seleNonAcademic, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleAttendance(int text)
	{
		selectdropdown(seleAttendance, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleCheckReportMarks()
	{
		click(seleCheckReportMarks);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage seleCheckPrintTotal()
	{
		click(seleCheckPrintTotal);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage entrDetails(String text)
	{
		sendKeys(entrDetails, text);
		return this;
	}
	public AsstMasterAssmessmentGroupingpage addBtn()
	{
		click(addBtn);
		return this;
	}
	public List<WebElement> seleCheckBox()
	{
		return seleCheckBox;
	}
	
	public List<WebElement> enterSeqNum()
	{
		return enterSeqNum;
	}
	public List<WebElement> emterWeightage()
	{
		return emterWeightage;
	}
	public List<WebElement> deleteBtn()
	{
		return deleteBtn;
	}
	public WebElement assmntListHeadr()
	{
		return assmntListHeadr;
	}
	
}
