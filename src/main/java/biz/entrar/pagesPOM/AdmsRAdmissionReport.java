package biz.entrar.pagesPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import biz.entrarBase.BaseTest;

public class AdmsRAdmissionReport extends BaseTest{
	
	@FindBy(xpath="//*[@id='batch']/../../../../../../..//*[.='Admission Report']") private WebElement admissionReportTitle;
	@FindBy(xpath="//*[@type='search']") private WebElement searchfield;
	@FindBy(xpath="//tbody//*[@role='row']")private List<WebElement> totalRecords;
	@FindBy(xpath="//thead//th") private  List<WebElement> headerTitle;
	@FindBy(xpath="//thead//th[24]") private WebElement tcField;
	@FindBy(xpath="//thead//th[1]") private WebElement srlNo;
	@FindBy(xpath="//tbody//td") private List<WebElement> stdNams;

	
	public AdmsRAdmissionReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String admissionReportTitle()
	{
		return getAttribut(admissionReportTitle, "text", "Page Title Verifation");
	}
	
	public AdmsRAdmissionReport searchfield(String text)
	{
		sendKeys(searchfield, text);
		return this;
	}
	
	public AdmsRAdmissionReport  headerTitle() throws Exception
	{
		for(int i=0;i<headerTitle.size();i++)
		{
			if(i<=14) {
			System.out.print(headerTitle.get(i).getText()+" | ");
			}else if(i==15)
			{
				ScrolljavaScript(tcField);
			/*	JavascriptExecutor js = (JavascriptExecutor) driver; 
				//WebElement a=driver.findElement(By.xpath("//thead//th[24]"));
				js.executeScript("arguments[0].scrollIntoView();",tcField );*/
				Thread.sleep(2000);
			}else if (i>=15){
				System.out.print(headerTitle.get(i).getText()+" | ");
			}	
		}
		return this;
	}
	
	public int totalRecords()
	{
		waitForVisibilityList(totalRecords);
		return totalRecords.size();
	}
	public void stdNams()
	{
		ScrolljavaScript(srlNo);
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].scrollIntoView();",srlNo );
		System.out.println();
		for(int i=0;i<stdNams.size();i++)
		{			
			if(i<=14) {
				System.out.print(stdNams.get(i).getText()+" | ");
				}else if(i==15)
				{
					ScrolljavaScript(tcField);
//					JavascriptExecutor jss = (JavascriptExecutor) driver; 
//					jss.executeScript("arguments[0].scrollIntoView();",tcField );	
				}else if(i>=15)
				{
					System.out.print(stdNams.get(i).getText()+" | ");
				}
		}
		
	}
}
