package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class studentSearchPage extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']//*[.='Student Search']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='year']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='admission_no']") private WebElement admissionNum;
	

	public studentSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement seleYear()
	{
		return seleYear;
	}
	public WebElement admissionNum()
	{
		return admissionNum;
	}
	public WebElement stdId(String stdid)
	{
		return driver.findElement(By.xpath("//*[.='"+stdid+"']/*/../..//*[@class='btn btn-info btn-mini b-none']"));
	}

}
