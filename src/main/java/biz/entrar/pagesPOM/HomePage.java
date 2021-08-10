package biz.entrar.pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;



public class HomePage extends BaseTest {
		
	@FindBy(xpath="//*[@class='nav-item mega_menu mega_menu_two'][1]/*")
	private WebElement home;
	
	@FindBy(xpath="//*[@class='nav-item mega_menu mega_menu_two'][2]/*")
	private WebElement features;
	
	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]")
	private WebElement proudcts;
	
	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]//*[.='Entrar ERP']/*")
	private WebElement entrarERP;
/*	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]")
	private WebElement usernameu;
	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]")
	private WebElement usernameu;
	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]")
	private WebElement usernameu;
	@FindBy(xpath="//*[@class='dropdown submenu nav-item'][1]")
	private WebElement usernameu;*/
	
	
	@FindBy(xpath="//*[@class='nav-item mega_menu mega_menu_two'][3]/*")
	private WebElement contactUs;
	
	@FindBy(xpath="//*[.='Log In']")
	private WebElement login;
	
	@FindBy(xpath="//*[.='Features and Benefits']")
	private WebElement featureTitle;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage home()
	{
		click(home);
		return this;
	}
	
	public HomePage features()
	{
		click(features);
		return this;
	}
	
	public HomePage proudcts()
	{
		click(proudcts);
		click(entrarERP);
		return this;
	}
	
	public HomePage contactUs()
	{
		click(contactUs);
		return this;
	}
	
	public Login_page login()
	{
		click(login);
		return new Login_page(driver);
	}
	
	public String featureTitle()
	{
		return getAttribut(featureTitle, "text","Page Title Verifation");
	}

}
