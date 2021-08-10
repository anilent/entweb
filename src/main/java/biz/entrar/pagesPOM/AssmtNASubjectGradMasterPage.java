package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNASubjectGradMasterPage extends BaseTest{

	@FindBy (xpath="//*[.='CCE NON  Academic Subjects Grade Remarks']") private WebElement pageTitle;
	@FindBy (xpath="//*[@name='strand_detail1']") private WebElement seleDetials;
	@FindBy (xpath="//*[@name='remark[]']") private List<WebElement> enterRemarks;
	@FindBy (xpath="//*[@id='grade']") private List<WebElement> seleGrad;
	@FindBy (xpath="//*[@id='add']") private WebElement addBtn;
	
	
	
	public AssmtNASubjectGradMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
	
	public AssmtNASubjectGradMasterPage seleDetials(int indx)
	{
		click(seleDetials);
		selectdropdown(seleDetials, indx);
		return this;
	}
	
	public List<WebElement> enterRemarks()
	{
		return enterRemarks;
	}
	public List<WebElement> seleGrad()
	{
		return seleGrad;
	}
	
	public AssmtNASubjectGradMasterPage addBtn()
	{
		click(addBtn);
		return this;
	}
}
