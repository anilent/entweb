package biz.entrar.pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class TeacherTechrCreate extends BaseTest{
	
	@FindBy (xpath="") private WebElement pageTitle;

	public TeacherTechrCreate() {
		PageFactory.initElements(driver, this);
	}

}
