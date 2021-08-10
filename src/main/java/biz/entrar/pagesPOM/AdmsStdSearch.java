package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsStdSearch extends BaseTest{
	
	@FindBy(xpath="//*[.='Student Search']") private WebElement pageTitle;
	@FindBy(xpath="//*[@id='year']") private WebElement AcdmicYear;
	@FindBy(xpath="//*[@class='ti-angle-double-down form-control form-control-success']") private WebElement openDrop;
	@FindBy(xpath="//*[@name='select_class']") private WebElement SeleClass;
	@FindBy(xpath="//*[@name='select_section']") private WebElement SeleSection;
	@FindBy(xpath="//*[@id='search_students']") private WebElement searchBtn;
	 
	
	
	public AdmsStdSearch(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String pageTitle()
	{
		return getAttribut(pageTitle, "text", "Page Title Verification");
	}

	public AdmsStdSearch AcdmicYear(String text)
	{
		click(AcdmicYear);
		selectdropdownTxt(AcdmicYear, text);
		return this;
	}
	
	public AdmsStdSearch openDrop()
	{
		click(openDrop);
		return this;
	}
	
	public AdmsStdSearch SeleClass(String text)
	{
		selectdropdownTxt(SeleClass, text);
		return this;
	}
	public AdmsStdSearch SeleSection(String text)
	{
		selectdropdownTxt(SeleSection, text);
		return this;
	}
	public AdmsStdSearch searchBtn()
	{
		click(searchBtn);
		return this;
	}
}
