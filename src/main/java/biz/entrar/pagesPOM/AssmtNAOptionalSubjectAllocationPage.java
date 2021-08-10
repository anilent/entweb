package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNAOptionalSubjectAllocationPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Non- Academic Optional Subject Allocation']") private WebElement pageTitle;

	public AssmtNAOptionalSubjectAllocationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verification");
	}
}
