package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstAcademicOptionalSubjAllocationPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Optional Subject Allocation']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleSession;
	@FindBy (xpath="//*[@id='school_section_id']") private WebElement seleStandrdSession;
	@FindBy (xpath="//*[@id='sub_area_code']") private WebElement seleSubArea;
	@FindBy (xpath="//*[@id='subject_lang_cate']") private WebElement seleSubjectType;
	@FindBy (xpath="//*[@id='subject_id']") private WebElement seleSubject;
	@FindBy (xpath="//*[@name='allocation_add']") private WebElement addBtn;
	@FindBy (xpath="//*[.='( ENT/004 )']//../..//td") private List<WebElement> printData;
	@FindBy (xpath="//*[.='( ENT/004 )']") private WebElement namScroll;
	@FindBy (xpath="//*[.='( ENT/004 )']//../..//td[5]//*[@class='cr']") private WebElement seleCheckBox;
	@FindBy (xpath="//th") private List<WebElement> printHeader;
	

	public AsstAcademicOptionalSubjAllocationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification : ");
	}
	
	public AsstAcademicOptionalSubjAllocationPage seleSession(String text)
	{
		click(seleSession);
		selectdropdownTxt(seleSession, text);
		return this;
	}
	public AsstAcademicOptionalSubjAllocationPage seleStandrdSession(String text)
	{
		click(seleStandrdSession);
		selectdropdownTxt(seleStandrdSession, text);
		return this;
	}
	public AsstAcademicOptionalSubjAllocationPage seleSubArea(String text)
	{
		click(seleSubArea);
		selectdropdownTxt(seleSubArea, text);
		return this;
	}
	public AsstAcademicOptionalSubjAllocationPage seleSubjectType(String text)
	{
		click(seleSubjectType);
		selectdropdownTxt(seleSubjectType, text);
		return this;
	}
	public AsstAcademicOptionalSubjAllocationPage seleSubject(String text)
	{
		click(seleSubject);
		selectdropdownTxt(seleSubject, text);
		return this;
	}
	
	public AsstAcademicOptionalSubjAllocationPage addBtn()
	{
		click(addBtn);
		return this;
	}
	
	public WebElement addBtnScoll()
	{return pageTitle;}
	
	
	public List<WebElement> printData()
	{
		return printData;
	}
	
	public WebElement seleCheckBox()
	{
		return seleCheckBox;
	}
	public List<WebElement> printHeader()
	{
		return printHeader;
	}
	public WebElement namScroll()
	{return namScroll;}
}
