package biz.entrar.TeacherPagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import biz.entrarBase.BaseTest;

public class AddOnlineAssesmQuestionsPage extends BaseTest{
	
	@FindBy (xpath="//*[.='Online Assessment Question']") private WebElement pageTitle;
	@FindBy (xpath="//*[@id='question_0']") private WebElement etrQuestion;
	
	@FindBy (xpath="//*[@id='elementtype_0']") private WebElement entryType;
	@FindBy (xpath="//*[@id='points_0']") private WebElement entMarks;
	@FindBy (xpath="//*[@id='addRadioOption_0']") private WebElement addOptionBtn;
	@FindBy (xpath="//*[@id='quesradio_0']") private WebElement option1;
	

	@FindBy (xpath="//*[@id='radioanswer_0']") private WebElement correctOptionAns;
	@FindBy (xpath="//*[@id='addCheckboxOption_0']") private WebElement addCheckBtn;
	
	@FindBy (xpath="//*[@id='checkboxanswer_0']") private WebElement coorctCheckboxAns;
	
	@FindBy (xpath="//*[@id='save']") private WebElement saveBtn;
	@FindBy (xpath="//*[@id='question_file']") private WebElement qutionImg;
	@FindBy (xpath="//*[@id='radioImg_0']") private WebElement optionImg1;
	
	
	public AddOnlineAssesmQuestionsPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageTitle()
	{
		return pageTitle;
	}
	
	public void etrQuestion(String text)
	{
		sendKeys(etrQuestion, text);
	}
	
	public void entryType(int num)
	{
		selectdropdown(entryType, num);
	}
	
	public void entMarks(String text)
	{
		sendKeys(entMarks, text);
	}
	public void addOptionBtn()
	{
		click(addOptionBtn);
	}
	
	public void saveBtn()
	{
		click(saveBtn);
	}
	public void addCheckBtn()
	{
		click(addCheckBtn);
	}
	public void correctOptionAns()
	{
		click(correctOptionAns);
		
	}
	public void coorctCheckboxAns()
	{click(coorctCheckboxAns);
	}
	public WebElement qutionImg()
	{
		return qutionImg;
	}
	public WebElement optionImg1()
	{
		return optionImg1;
	}
}
