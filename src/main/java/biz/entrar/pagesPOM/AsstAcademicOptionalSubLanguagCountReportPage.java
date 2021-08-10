package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AsstAcademicOptionalSubLanguagCountReportPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Optional Subject Allocation Count Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='school_std_id']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='sub_area_code']") private WebElement selearea;

	public AsstAcademicOptionalSubLanguagCountReportPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page title Verification");
	}
	
	public AsstAcademicOptionalSubLanguagCountReportPage seleStandard(String text)
	{
		click(seleStandard);
		selectdropdownTxt(seleStandard, text);
		return this;
	}

	public AsstAcademicOptionalSubLanguagCountReportPage selearea(String text)
	{
		click(selearea);
		selectdropdownTxt(selearea, text);
		return this;
	}
}
