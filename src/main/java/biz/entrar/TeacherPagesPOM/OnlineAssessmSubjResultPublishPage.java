package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class OnlineAssessmSubjResultPublishPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Online Assessment Recording']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='result_standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='section']") private WebElement seleSection;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='select2-test-container']") private WebElement seleTest;
	@FindBy (xpath="//*[@id='search_btn']") private WebElement searchBtn;
	@FindBy (xpath="//*[@id='result_publish']") private WebElement publishBtn;
	
	
	public OnlineAssessmSubjResultPublishPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
}
