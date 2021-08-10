package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNASubjectDetialsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='CCE NON  Academic Subjects Details']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_area']") private WebElement seleSubjArea;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='strand']") private WebElement seleStrands;
	@FindBy (xpath="//*[@name='strand_details[]']") private List<WebElement> enterDetails;
	@FindBy (xpath="//*[@name='max_points[]']") private List<WebElement> selePoints;
	@FindBy (xpath="//*[@name='strands_add']") private WebElement addBtn;

	public AssmtNASubjectDetialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssmtNASubjectDetialsPage seleStandard(String txt)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, txt);
		return this;
	}
	
	public AssmtNASubjectDetialsPage seleSubjArea(String txt)
	{
		click(seleSubjArea);
		selectdropdownTxt(seleSubjArea, txt);
		return this;
	}
	
	public AssmtNASubjectDetialsPage seleSubject(String txt)
	{
		click(seleSubject);
		selectdropdownTxt(seleSubject, txt);
		return this;
	}
	
	public AssmtNASubjectDetialsPage seleStrands(int index)
	{
		selectdropdown(seleStrands, index);
		return this;
	}
	public List<WebElement> enterDetails()
	{
		return enterDetails;
	}
	public List<WebElement> selePoints()
	{
		return selePoints;
	}
	public AssmtNASubjectDetialsPage addBtn()
	{
		click(addBtn);
		return this;
	}
}
