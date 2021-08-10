package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AssmtNASubjectRemarksBankPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Non- Academic Subject wise Remark Bank']") private WebElement pageTitle;
	

	public AssmtNASubjectRemarksBankPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "Text", "Page Title Verifation");
	}

}
