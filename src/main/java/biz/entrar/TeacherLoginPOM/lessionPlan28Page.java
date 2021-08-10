package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class lessionPlan28Page extends BaseTest{
	
	@FindBy (xpath="//*[.='Lesson Plan List']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Add New']") private WebElement addnewBtn;

	public lessionPlan28Page() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle() {
		return pageTitle;
	}
	
	public addLessionPlan28Page addnewBtn()
	{
		click(addnewBtn);
		return new addLessionPlan28Page();
	}

}
