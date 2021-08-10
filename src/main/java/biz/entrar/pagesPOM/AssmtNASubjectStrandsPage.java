package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNASubjectStrandsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='CCE NON Academic Subjects Strands']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_area']") private WebElement seleSubjArea;	
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@name='strand_name[]']") private List<WebElement> strandsTxt;
	@FindBy (xpath="//*[@name='strands_add']") private WebElement addBtn;
	
	public AssmtNASubjectStrandsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification"); 
	}

	public AssmtNASubjectStrandsPage seleStandard(String txt)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, txt);
		return this;
	}
	
	public AssmtNASubjectStrandsPage seleSubjArea(String txt)
	{
		click(seleSubjArea);
		selectdropdownTxt(seleSubjArea, txt);
		return this;
	}
	
	public AssmtNASubjectStrandsPage seleSubject(String txt)
	{
		click(seleSubject);
		selectdropdownTxt(seleSubject, txt);
		return this;
	}
	
	public List<WebElement> strandsTxt()
	{
		return strandsTxt;
	}
	
	public AssmtNASubjectStrandsPage addBtn()
	{
		click(addBtn);
		return this;
	}
}
