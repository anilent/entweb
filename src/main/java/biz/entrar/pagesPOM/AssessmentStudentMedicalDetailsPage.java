package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentStudentMedicalDetailsPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Height and Weight Termwise']") private WebElement pagTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='school_section_id']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='exam_name']") private WebElement seleExamName;
	@FindBy (xpath="//*[@id='changes']") private WebElement saveBtn;
	

	public AssessmentStudentMedicalDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pagTitle()
	{
		return pagTitle;
	}

}
