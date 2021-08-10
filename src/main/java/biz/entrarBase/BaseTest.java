package biz.entrarBase;



import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrar.pagesPOM.DashboardPage;
import biz.entrar.pagesPOM.Login_page;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.*;//Assert


public class BaseTest {
 
	public static WebDriver driver =null;
	public static Properties prop;
	
	//protected static EnvironmentsData data =new EnvironmentsData(); //getting paths of drivers
	
	/*public BaseTest()  {
		this.driver=driver;
	}*/
	
	
	public static void initialization(String url) throws InterruptedException 
	{
	String Browsername=EnvironmentsData.browser;
	
	if(Browsername.equals("chrome"))
	{
		System.setProperty(EnvironmentsData.Chrome_key, EnvironmentsData.Chrome_value);
		Thread.sleep(3000);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("use-fake-ui-for-media-stream"); //avoids the need to grant camera/microphone permissions.
		driver =new ChromeDriver(option);
	}else if (Browsername.equals("FF"))
	{
		System.setProperty(EnvironmentsData.FF_key, EnvironmentsData.FF_value);
		Thread.sleep(3000);
		driver = new FirefoxDriver();
	}
	
	if(url.equals("admin"))
	{
	driver.get(EnvironmentsData.URL);
	}else if(url.equals("mangers"))
	{
		driver.get(EnvironmentsData.URL_manger);
	}
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//driver.manage().window().setSize(new Dimension(1600, 880));
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
/*public static void tearDown(Scenario scenario) throws IOException
	{	
		
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot_with_scenario_name,new File("./target/test-imgreport/" + scenario.getName() + ".png"));
				System.out.println(scenario.getName());
				scenario.embed(screenshot, "image/png");				
 			}catch (WebDriverException e) {
 				System.out.println(e.getMessage()); 				
 			}
		}
		driver.close();
	}*/
	
	 public void waitForVisibility(WebElement e)
	  {
		  WebDriverWait  wait = new WebDriverWait(driver, EnvironmentsData.waittime);
		  wait.until(ExpectedConditions.visibilityOf(e));
	  }
	 
	 public void waitForVisibility(List<WebElement> e)
	  {
		  WebDriverWait  wait = new WebDriverWait(driver, EnvironmentsData.waittime);
		  wait.until(ExpectedConditions.visibilityOf((WebElement) e));
	  }
	 public void waitForVisibilityList(List<WebElement> e)
	  {
		  WebDriverWait  wait = new WebDriverWait(driver, EnvironmentsData.waittime);
		  wait.until(ExpectedConditions.visibilityOfAllElements(e));
	  }
	 
	 public void click(WebElement e)
	  {
		  waitForVisibility(e);
		  e.click();
	  }
	 
	 public void clickJavaScript(WebElement e)
	 {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", e);
	 }
	 
	 public void clickList(List<WebElement> e)
	  {
		  waitForVisibility(e);
		  ((WebElement) e).click();
	  }
	  
	  public void sendKeys(WebElement e,String text)
	  {
		  waitForVisibility(e);
			System.out.println(text);
		  e.sendKeys(text);
	  }
	  
	  public String getAttribut(WebElement e,String attribute,String watxt)
	  {
		  waitForVisibility(e);
		  String name=e.getText();
//		  String gettxt=e.getAttribute(attribute);
		  System.out.println(watxt+" : ");
		  return name;
	  }
	  
	  public String getText(WebElement e)
	  {
		  waitForVisibility(e);
		  return e.getText();
	  }
	  
	  public void selectdropdown(WebElement ele,int num)
	  {
		  waitForVisibility(ele);
		  click(ele);
		  Select seleAsse=new Select(ele);
			seleAsse.selectByIndex(num);
			click(ele);
	  }
	  
	  public void selectdropdownList(List<WebElement> seleBest,int assindx)
	  {
		  waitForVisibility(seleBest);
		  clickList(seleBest);
		  Select seleAsse=new Select((WebElement) seleBest);
			seleAsse.selectByIndex(assindx);
			clickList(seleBest);
	  }
	  
	  public void selectdropdownTxt(WebElement e,String text)
	  {
		  waitForVisibility(e);
		  click(e);
		  Select seleAsse=new Select(e);
			seleAsse.selectByVisibleText(text);
	  }
	  public void selectdropdownValue(WebElement e,String text)
	  {
		  waitForVisibility(e);
		  click(e);
		  Select seleAsse=new Select(e);
			seleAsse.selectByValue(text);
	  }
	  public void selectdropdownIndx(WebElement e,int indexValue)
	  {
		  waitForVisibility(e);
		  click(e);
		  Select seleAsse=new Select(e);
			seleAsse.selectByIndex(indexValue);
	  }
	  public int selectdropdowSize(WebElement ele)
		{
			click(ele);
			Select se = new Select(ele);
			List<WebElement> l = se.getOptions();
			return l.size();
		}
	  
		public void scrolling(WebElement ele)
		{
			waitForVisibility(ele);
			
			
			/*JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");*/
			
			((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", ele);
		}
		
		static DateFormat dateFormat1;
		static Date date;
		public static String mobilenum()
		{
			dateFormat1= new SimpleDateFormat("ddhhmm:ss");
			date = new Date();
			String dms=dateFormat1.format(date);
			String dminsec=dms.replaceAll("[:]", "");
			int dd=Integer.parseInt(dminsec);
			String gg="44";
			return gg+dd;
		}
		
		public static String mobilenumNew()
		{
			dateFormat1= new SimpleDateFormat("ddhhmm:ss");
			date = new Date();
			String dms=dateFormat1.format(date);
			String dminsec=dms.replaceAll("[:]", "");
			int dd=Integer.parseInt(dminsec);
			String gg="99";
			System.out.println(gg+dd+" - test");
			//System.out.println(String.format(gg, dd));
			int mobilenum = Integer.parseInt(Integer.toString(99) + dd);			
			//System.out.println(mobilenum+"-----f46ds45f6sd");
			String mobilenumstg=String.valueOf(mobilenum);
			return mobilenumstg;
		}
		
		
		public static String dmhms()
		{		
			dateFormat1= new SimpleDateFormat("dd/MMHH:mm:ss");
			 date = new Date();
			String tim=dateFormat1.format(date);
			String time=tim.replaceAll("[/:]*", "");
			return time;
		}

		public static String dms()
		{
			dateFormat1= new SimpleDateFormat("ddmm:ss");
			date = new Date();
			String dms=dateFormat1.format(date);
			String dminsec=dms.replaceAll("[:]", "");
			//System.out.println("datetime : "+dminsec);
			return dminsec;	
		}
		public static String dhms()
		{
			dateFormat1= new SimpleDateFormat("ddhhmm:ss");
			date = new Date();
			String dms=dateFormat1.format(date);
			String dminsec=dms.replaceAll("[:]", "");
			System.out.println("datetime : "+dminsec);
			return dminsec;	
		}
		 public String currentDate() {  
			   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			   LocalDateTime now = LocalDateTime.now();
			   return dtf.format(now);
			  }
		 public int currentHour() {
			 int hh=0;
			 Calendar c = Calendar.getInstance();
			 int Hr24=c.get(Calendar.HOUR_OF_DAY);
			 if(Hr24>12)
			 {
				 hh=Hr24-12; 
			 }else {
				 hh=Hr24;
			 }
			 return hh;
			 }
		 public int currentMints() {
			 Calendar c = Calendar.getInstance();
			 int Min=c.get(Calendar.MINUTE);
			 return Min;
			 }
		public void AssertValidation(String actual , String expected)
		{
			System.out.println("Expected :"+expected);
			System.out.println("Actural :"+actual);
			//Assert.assertEquals(actual, expected);
		}
		
		public void ScrolljavaScript(WebElement ele)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView(true);",ele );
			js.executeScript("window.scrollBy(0,-100)");
			//*[normalize-space(.)='Exam Preview']
		}
		
		public void ScrolljavaScript2(WebElement ele)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView(true);",ele );
			js.executeScript("window.scrollBy(0,0)");
			//*[normalize-space(.)='Exam Preview']
		}
		
		public void ScrolljavaScriptEndPage()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			//This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		
		 public static void scroll_Page(WebElement webelement, int scrollPoints,WebElement target)
		    {
		    
		        System.out.println("---------------- Started - scroll_Page ----------------");
		       Actions dragger = new Actions(driver);

		        // drag downwards
		        int numberOfPixelsToDragTheScrollbarDown = 10;
		        for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown)
		        {
		            dragger.moveToElement(webelement).release(target);
		        }
		        System.out.println("---------------- Ending - scroll_Page ----------------");		    
		  }
		
		public void waitForAlert(WebDriver driver) throws Exception
		{
			Thread.sleep(1000);
		   int i=0;
		   while(i++<7)
		   {
		        try
		        {
		            Alert alert = driver.switchTo().alert();
		            System.out.println(alert.getText());
		            alert.accept();
		            break;
		        }
		        catch(NoAlertPresentException e)
		        {
		          Thread.sleep(1000);
		          continue;
		        }
		   }
		}
		public void waitForAlertDismiss(WebDriver driver) throws Exception
		{
			Thread.sleep(1000);
		   int i=0;
		   while(i++<7)
		   {
		        try
		        {
		            Alert alert = driver.switchTo().alert();
		            System.out.println(alert.getText());
		            alert.dismiss();
		            break;
		        }
		        catch(NoAlertPresentException e)
		        {
		          Thread.sleep(1000);
		          continue;
		        }
		   }
		}
		
		
		public DashboardPage loginAdmin(String urnam,String passw)
		{
			Login_page loginpg = new Login_page(driver);
			loginpg.username(urnam);
			loginpg.password(passw);
			return loginpg.loginButton();
		}
}
