package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsRRegFormCountReport extends BaseTest{

	@FindBy (xpath="//*[.='Issue and Submited Registration Form Report']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement year;
	@FindBy (xpath="//*[@id='getcount']") private WebElement getCountBtn;
	@FindBy (xpath="//tr") private List<WebElement> dataDetials;
	
	
	public AdmsRRegFormCountReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verifation");
	}
	
	public AdmsRRegFormCountReport year(String txt)
	{
		click(year);
		selectdropdownTxt(year, txt);
		return this;
	}
	public AdmsRRegFormCountReport getCountBtn()
	{
		click(getCountBtn);
		return this;
	}
	public AdmsRRegFormCountReport dataDetials()
	{
		for(int i=0;i<dataDetials.size();i++)
		{
			System.out.println(dataDetials.get(i).getText());
		}
		return this;
	}
}
