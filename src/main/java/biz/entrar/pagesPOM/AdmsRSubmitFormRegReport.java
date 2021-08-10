package biz.entrar.pagesPOM;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;



public class AdmsRSubmitFormRegReport extends BaseTest{
	
	@FindBy (xpath="//*[.='Registration Form Report']") private WebElement pageTitlel;
	@FindBy (xpath="//*[@id='standard']") private WebElement SelStandard;

	public AdmsRSubmitFormRegReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public String pageTitlel()
	{
		return getAttribut(pageTitlel, "text", "Page title Verification");
	}
	
	public AdmsRSubmitFormRegReport SelStandard(String text)
	{
		Dimension dd=SelStandard.getSize();
		System.out.println(dd+"size test");
		click(SelStandard);
		selectdropdownTxt(SelStandard, text);
		return this;
	}
}
