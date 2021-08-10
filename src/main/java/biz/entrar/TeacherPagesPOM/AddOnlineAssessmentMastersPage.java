package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AddOnlineAssessmentMastersPage extends BaseTest{

	@FindBy (xpath="//*[.='Online Assessment Master']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='session']") private WebElement seleYear;
	@FindBy (xpath="//*[@id='standard']") private WebElement seleStandard;
	@FindBy (xpath="//*[@id='subject']") private WebElement seleSubject;
	@FindBy (xpath="//*[@id='type']") private WebElement seleType;
	@FindBy (xpath="//*[@id='test']") private WebElement etrTestNam;
	@FindBy (xpath="//*[@id='time']") private WebElement etrTime;
	@FindBy (xpath="//*[@id='min_submit_time_min']") private WebElement minimTime;
	@FindBy (xpath="//*[@id='points']") private WebElement etrTotlMrks;
	@FindBy (xpath="//*[@id='desc']") private WebElement etrDescription;
	@FindBy (xpath="//*[@id='instruc']") private WebElement etrInstructions;
	@FindBy (xpath="//*[@id='ans_sheet']") private WebElement seleAnswerSheetUplod;
	@FindBy (xpath="//*[@id='sheet_time']") private WebElement seleAnsUploadTim;
	@FindBy (xpath="//*[@id='camera']") private WebElement seleCamera;
	@FindBy (xpath="//*[@id='multi_face_capture_active']") private WebElement seleMultiFace;
	@FindBy (xpath="//*[@id='camera_sec']") private WebElement seleCameraTim;
	@FindBy (xpath="//*[@id='is_screen_capture_active']") private WebElement seleSceenCapu;
	@FindBy (xpath="//*[@id='screen_capture_time']") private WebElement seleScrenTim;
	@FindBy (xpath="//*[@id='question_pallete']") private WebElement seleQusnPalette;
	@FindBy (xpath="//*[@id='full_screen_active']") private WebElement seleFullScreen;
	@FindBy (xpath="//*[@id='add_new_test']") private WebElement addBtn;
	@FindBy (xpath="//*[@id='QR_code']") private WebElement qrCodeChck;
	
	
	
	
	
	public AddOnlineAssessmentMastersPage() {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public void seleYear(String text)
	{
		click(seleYear);
		sendKeys(seleYear, text);
	}
	
	public WebElement seleStandard()
	{
		return seleStandard;
	}
	public WebElement seleSubject()
	{
		return seleSubject;
	}
	public WebElement seleType()
	{
		return seleType;
	}
	
	public void etrTestNam(String text)
	{
		sendKeys(etrTestNam, text);
	}
	public void etrTime(String text)
	{
		sendKeys(etrTime, text);
	}
	public void etrTotlMrks(String text)
	{
		sendKeys(etrTotlMrks, text);
	}
	public void minimTime(String text)
	{
		selectdropdownTxt(minimTime, text);
	}
	public void etrDescription(String text)
	{
		sendKeys(etrDescription,text);
	}
	public void etrInstructions(String text)
	{
		sendKeys(etrInstructions, text);
	}
	public void seleAnswerSheetUplod()
	{
		click(seleAnswerSheetUplod);
	}
	public void seleAnsUploadTim(String text)
	{
		click(seleAnsUploadTim);
		selectdropdownTxt(seleAnsUploadTim, text);
	}
	public void seleCamera()
	{
		click(seleCamera);
	}
	public void seleMultiFace()
	{
		click(seleMultiFace);
	}
	public void seleCameraTim(String text)
	{
		click(seleCameraTim);
		selectdropdownTxt(seleCameraTim, text);
	}
	
	public void seleSceenCapu()
	{
		click(seleSceenCapu);
	}
	
	public void seleScrenTim(String text)
	{
		click(seleScrenTim);
		selectdropdownTxt(seleScrenTim, text);
	}
	public void seleQusnPalette()
	{
		click(seleQusnPalette);
	}
	public WebElement seleAnswerSheetUplodScroll()
	{
		return seleAnswerSheetUplod;
	}
	public void seleFullScreen()
	{
		click(seleFullScreen);
	}
	public WebElement addBtn()
	{
		return addBtn;
	}
	public WebElement qrCodeChck()
	{
		return qrCodeChck;
	}
}
