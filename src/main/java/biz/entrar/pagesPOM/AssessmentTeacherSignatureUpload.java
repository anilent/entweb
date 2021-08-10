package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentTeacherSignatureUpload extends BaseTest{
	
	@FindBy (xpath="//*[.='Teacher Signature Upload']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='year_tag']") private WebElement seleYear;
	@FindBy (xpath="//*[@name='signature_add']") private WebElement addBtn;
	@FindBy (xpath="//*[.='anilTtest']") private WebElement teacherNam;
	@FindBy (xpath="//*[.='anilTtest']/..//input[@type='file'][1]") private WebElement chooseFile;
	@FindBy (xpath="//*[.='anilTtest']/..//*[@class='tabledit-delete-button btn btn-danger waves-effect waves-light deleteletter']")
	private WebElement deleteBtn;
	

	public AssessmentTeacherSignatureUpload() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public AssessmentTeacherSignatureUpload seleYear(String text) {
		selectdropdownTxt(seleYear, text);
		return this;
	}
	public WebElement addBtn()
	{
		return addBtn;
	}
	public WebElement teacherNam()
	{
		return teacherNam;
	}
	public WebElement chooseFile()
	{
		return chooseFile;
	}
	public WebElement deleteBtn()
	{
		return deleteBtn;
	}
	

}
