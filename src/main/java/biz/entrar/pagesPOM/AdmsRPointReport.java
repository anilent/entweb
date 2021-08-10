package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRPointReport extends BaseTest{
	
	@FindBy(xpath="//*[.='Student Admission Points Report']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='academic_year']") private WebElement seleyear;
	//@FindBy(xpath="")

	public AdmsRPointReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verifation");
	}

	public WebElement seleyear()
	{
		return seleyear;		
	}
}
