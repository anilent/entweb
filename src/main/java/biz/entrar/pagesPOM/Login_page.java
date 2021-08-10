package biz.entrar.pagesPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrar.StudentPagesPOM.DashboardStudentPage;
import biz.entrar.TeacherPagesPOM.DashboardTeacherPage;
import biz.entrarBase.BaseTest;

public class Login_page extends BaseTest {

	//Page Factory - 
	@FindBy(xpath="//*[@name='username']")
	private WebElement usernameu;
	
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//*[@class='label-input100']")
	private WebElement captcha;
	
	@FindBy (xpath="//*[@id='captcha']")
	private WebElement etrCaptcha;
	
	@FindBy(xpath="//*[@class='btn btn-success']")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']")
	private WebElement captchCheckBox;
	
	
	
	
	//initializing the page object
	public Login_page(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
	
	public void username(String urnam)
	{
		driver.navigate().refresh();
		sendKeys(usernameu,urnam);
	}
	
	public void password(String passw)
	{
		password.clear();
		sendKeys(password,passw);
	}
	
	public String captcha()
	{
		String cpatchstring=captcha.getText();
		char num0=cpatchstring.charAt(0);
		char num1=cpatchstring.charAt(4);
		int num2=num0-'0';
		int num3=num1-'0';
		String cpatch=num2+num3+"";
		return cpatch;
	}
	
	public void entCaptchaa(String cpt)
	{
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('captcha').setAttribute('Text', '"+cpt+"')");*/
		sendKeys(etrCaptcha, cpt);
		//etrCaptcha.sendKeys(Keys.ENTER);
	}
	
	public DashboardPage loginButton()
	{
		click(loginButton);
		return new DashboardPage(driver);
	}
	
	public DashboardTeacherPage loginButton2()
	{
		click(loginButton);
		return new DashboardTeacherPage();
	}
	public DashboardStudentPage loginButton3()
	{
		click(loginButton);
		return new DashboardStudentPage();
	}
	
	public void captchCheckBox()
	{
		click(captchCheckBox);
	}
	
	
}
