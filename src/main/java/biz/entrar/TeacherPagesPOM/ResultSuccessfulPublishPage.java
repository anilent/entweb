package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class ResultSuccessfulPublishPage extends BaseTest{
	
	@FindBy (xpath="//body") private WebElement successfulMesag;

	public ResultSuccessfulPublishPage() {
		PageFactory.initElements(driver, this);
			}

	public WebElement successfulMesag()
	{
		return successfulMesag;
	}
}
