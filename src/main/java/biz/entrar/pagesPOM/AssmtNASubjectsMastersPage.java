package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNASubjectsMastersPage extends BaseTest{
	
	@FindBy (xpath="//*[.='CCE NON Academic Subjects']") private WebElement pageTitl;
	@FindBy (xpath="//*[@id='sub_area_code']") private WebElement seleSubjetArea;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_code']") private WebElement subjCode;
	@FindBy (xpath="//*[@id='sub_name']") private WebElement subjNam;
	@FindBy (xpath="//*[@id='seq_no']") private WebElement seqNum;
	@FindBy (xpath="//*[.='Has activities?']/..//*[@class='cr']") private WebElement hasActivities;
	@FindBy (xpath="//*[.='Has sub strands?']/..//*[@class='cr']") private WebElement hasSubStrnds;
	@FindBy (xpath="//*[@id='points']") private WebElement points;
	@FindBy (xpath="//*[@id='grade_desc']") private WebElement gradeDesc;
	@FindBy (xpath="//*[@id='active']") private WebElement status;
	@FindBy (xpath="//*[@id='grade_value']") private WebElement gradeValue;
	@FindBy (xpath="//*[@id='noncce_add']") private WebElement addBtn;
	
	public AssmtNASubjectsMastersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitl()
	{
		return getAttribut(pageTitl, "Text", "Page Title Verification");
	}
	
	public AssmtNASubjectsMastersPage seleSubjetArea(String txt)
	{
		click(seleSubjetArea);
		selectdropdownTxt(seleSubjetArea, txt);
		return this;
	}
	
	public AssmtNASubjectsMastersPage seleStandard(String txt)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, txt);
		return this;
	}
	
	public AssmtNASubjectsMastersPage subjCode(String txt)
	{
		sendKeys(subjCode, txt);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage subjNam(String txt)
	{
		sendKeys(subjNam, txt);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage seqNum(String txt)
	{
		sendKeys(seqNum, txt);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage hasActivities()
	{
		click(hasActivities);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage hasSubStrnds()
	{
		click(hasSubStrnds);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage points(String txt)
	{
		sendKeys(points, txt);
		return this;		
	}
	public AssmtNASubjectsMastersPage gradeDesc(String txt)
	{
		sendKeys(gradeDesc, txt);
		return this;		
	}
	public AssmtNASubjectsMastersPage status(String txt)
	{
		selectdropdownTxt(status, txt);
		return this;		
	}
	public AssmtNASubjectsMastersPage gradeValue(String txt)
	{
		sendKeys(gradeValue, txt);
		return this;		
	}
	
	public AssmtNASubjectsMastersPage addBtn()
	{
		click(addBtn);
		return this;
	}
	
}
