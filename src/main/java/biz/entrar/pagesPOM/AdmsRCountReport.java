package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRCountReport extends BaseTest{
	
	@FindBy(xpath="//*[@id='session']") private WebElement year;
	@FindBy(xpath="//*[@id='getcount']") private WebElement getCountBtn;
	@FindBy(xpath="//*[.='Total Student']/*/../..//td[2]") private WebElement totlaStudCoutn;
	@FindBy(xpath="//*[.='Overall Total']/*/../..//td[2]") private WebElement totlaOvralCount;
	

	public AdmsRCountReport(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public AdmsRCountReport year(String txt)
	{
		click(year);
		selectdropdownTxt(year, txt);
		return this;
	}
	
	public AdmsRCountReport getCountBtn()
	{
		click(getCountBtn);
		return this;
	}
	public String totlaStudCoutn()
	{
		return getAttribut(totlaStudCoutn, "Text", "Total Studnt Count");
	}
	public String totlaOvralCount()
	{
		return getAttribut(totlaOvralCount, "text", "OverAll Count");
	}
}
