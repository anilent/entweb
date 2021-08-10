package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class sal5SalaryRelease extends BaseTest{
	
	@FindBy (xpath="//*[@class='breadcrumb-header']") private WebElement pagetitle;
	
	

	public sal5SalaryRelease() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pagetitle()
	{
		return pagetitle;
	}

}
