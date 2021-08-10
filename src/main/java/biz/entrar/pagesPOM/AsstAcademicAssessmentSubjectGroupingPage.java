package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstAcademicAssessmentSubjectGroupingPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Assessment Subject Grouping']") private WebElement pageTitl;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_area']") private WebElement seleSubArea;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='subject_add']") private WebElement addBtn;
	@FindBy (xpath="//th") private List<WebElement> printHeader;
	@FindBy (xpath="//td") private List<WebElement> printData;
	@FindBy (xpath="//tbody//*[@class='cr']") private  List<WebElement> seleCheckBox;
	
	

	public AsstAcademicAssessmentSubjectGroupingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitl()
	{
		return getAttribut(pageTitl, "Text", "Page Title Verification");
	}
	
	public AsstAcademicAssessmentSubjectGroupingPage seleStandard(String txt)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, txt);
		return this;
	}
	public AsstAcademicAssessmentSubjectGroupingPage seleSubArea(String txt)
	{
		click(seleSubArea);
		selectdropdownTxt(seleSubArea, txt);
		return this;
	}
	public AsstAcademicAssessmentSubjectGroupingPage seleSubject(String txt)
	{
		click(seleSubject);
		selectdropdownTxt(seleSubject, txt);
		return this;
	}
	
	public AsstAcademicAssessmentSubjectGroupingPage addBtn()
	{
		click(addBtn);
		return this;
	}
	
	public List<WebElement> printHeader()
	{
		return printHeader;
	}

	public List<WebElement> printData()
	{
		return printData;
	}
	
	public List<WebElement> seleCheckBox()
	{
		return seleCheckBox;
	}
	
	
}
