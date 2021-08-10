package biz.entrar.TeacherPagesPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class SchedulePublishTest extends BaseTest{
	
	@FindBy (xpath="//*[.='Test Setup & Publishing']") private WebElement pageTitle;
	@FindBy (xpath="//*[@class='form-group col-md-3']") private List<WebElement> testMasterData;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='section']/..//*[@class='filter-option']/..") private WebElement seleSchool;
	@FindBy (xpath="//*[@role='option']//*[.='ENTRAR']") private WebElement seleEntrar;
	@FindBy (xpath="//*[@id='testdate']") private WebElement seleDate;
	@FindBy (xpath="//*[@id='starthrs']") private WebElement entStartHr;
	@FindBy (xpath="//*[@id='startminute']") private WebElement entStarMit;
	@FindBy (xpath="//*[@id='endhrs']") private WebElement entEndHr;
	@FindBy (xpath="//*[@id='endminute']") private WebElement entEndMit;
	@FindBy (xpath="//*[@id='subject_add']") private WebElement addBtn;
	@FindBy (xpath="//tr//td/..") private WebElement scheduleData;
	
	
	public SchedulePublishTest() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public void seleStandard(String text)
	{
		selectdropdownTxt(seleStandard, text);
	}

	public void seleSchool()
	{
		click(seleSchool);
	}
	public void seleEntrar() throws Exception
	{
		ScrolljavaScript(seleEntrar);
		Thread.sleep(1000);
		click(seleEntrar);
	}
	public void seleDate(String text)
	{
		sendKeys(seleDate, text);
	}
	
	public void entStartHr(String text)
	{
		sendKeys(entStartHr, text);
	}
	
	public void entStarMit(String text)
	{
		sendKeys(entStarMit, text);
	}
	
	public void entEndHr(String text)
	{
		sendKeys(entEndHr, text);
	}
	public void entEndMit(String text)
	{
		sendKeys(entEndMit, text);
	}
	public void addBtn()
	{
		click(addBtn);
	}
	public String scheduleData()
	{
		return scheduleData.getText();
	}
	
	public List<WebElement> testMasterData()
	{
		return testMasterData;
	}
}
