package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssessmentClassTeacherMappingMultiplePage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Multiple Class Teacher Mapping']")
	private WebElement pageTitle;
	@FindBy (xpath="//*[.='IX / B']/..//*[@type]") private WebElement selecheckboxB;
	@FindBy (xpath="//*[.='IX / C']/..//*[@type]") private WebElement selecheckboxC;

	public AssessmentClassTeacherMappingMultiplePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement selecheckboxB()
	{
		return selecheckboxB;
	}
	public WebElement selecheckboxC()
	{
		return selecheckboxC;
	}

}
