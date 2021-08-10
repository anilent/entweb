package biz.entrar.pagesPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AdmsConfirmedAdmissionsViewPage extends BaseTest {

	//Page Factory - 
	public  String ss="TEST ADMN QA";
	/*@FindBy(xpath="//*[.='"+ss+"']/..//*[.='Collect Fee']/*")
	private WebElement collectFee;*/
	
//	 WebElement collectFee = driver.findElement(By.xpath("//*[.='"+ss+"']/..//*[.='Collect Fee']/*"));
	
	
	//initializing the page object
	public AdmsConfirmedAdmissionsViewPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);	
	}
	
	
	//actions
/*	public void clickdd()
	{
		System.out.println("Getting text");
		getAttribut(collectFee, "Text");
		System.out.println(collectFee.getText());
		System.out.println(collectFee);
		click(collectFee);

	}*/

	
}
