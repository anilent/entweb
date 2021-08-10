package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentRemarksBank extends BaseTest{
	
	@FindBy (xpath="//*[.='Remark Bank']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='add_remark_id']") private WebElement newRemarksEtr;
	@FindBy (xpath="//*[@id='remarkadd1']") private WebElement addBtn;
	@FindBy (xpath="//*[@id='remarkupdate']") private WebElement updateBtn;
	@FindBy (xpath="//*[@name='old_remark_bank[]']") private List<WebElement> remarkstxt;
	@FindBy (xpath="//*[@type='button']") private List<WebElement> deleteBtn;
			
			
public AssessmentRemarksBank() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	public AssessmentRemarksBank seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
		return this;
	}
	public AssessmentRemarksBank newRemarksEtr(String text)
	{
		sendKeys(newRemarksEtr, text);
		return this;
	}
	public AssessmentRemarksBank addBtn()
	{
		click(addBtn);
		return this;
	}
	public AssessmentRemarksBank updateBtn()
	{
		click(updateBtn);
		return this;
	}
	public List<WebElement> remarkstxt()
	{
		return remarkstxt;
	}
	public List<WebElement> deleteBtn()
	{
		return deleteBtn;
	}
}
