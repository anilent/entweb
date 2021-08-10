package biz.entrar.TeacherLoginPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class assignmentsStandardWise extends BaseTest{
	
	@FindBy (xpath="//*[.='Assignments Information Standard Wise']") private WebElement pageTitle;
	@FindBy (xpath="//*[.='Add New']/*") private WebElement AddnewAssign;
	@FindBy (xpath="//*[@type='search']") private WebElement searchFild;
	@FindBy (xpath="//*[@class='odd']") private WebElement searchData;

	public assignmentsStandardWise() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	public WebElement searchFild()
	{
		return searchFild;
	}
	public WebElement searchData()
	{
		return searchData;
	}
	
	public AddAssignmentStandardWise AddnewAssign()
	{
		click(AddnewAssign);
		return new AddAssignmentStandardWise();
	}

}
