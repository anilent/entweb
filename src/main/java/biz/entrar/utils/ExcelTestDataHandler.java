package biz.entrar.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import biz.entrar.EnviromentData.EnvironmentsData;
import biz.entrarBase.BaseTest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

public class ExcelTestDataHandler extends BaseTest{
	
	public static  String getcellvalue(String sheet,int row,int cell)
	{
		 DataFormatter formatter = new DataFormatter();
		String value=" ";
	try {
		FileInputStream fil=new FileInputStream(EnvironmentsData.testDataExcel);	
	Workbook wb = WorkbookFactory.create(fil);
	Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
	//value = c.getStringCellValue();
	value=formatter.formatCellValue(c);
	wb.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		//Reporter.log("path is invalid",true);
		
	}
	return value;
	
	} 
	
	static DateFormat dateFormat1;
	static Date date;
	public static String getDate()
	{
		dateFormat1= new SimpleDateFormat("MM/dd/yyyy");
		 date = new Date();
		String tim=dateFormat1.format(date);
		return tim;
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
		System.out.println("datatime : "+dminsec);
		return dminsec;
		
	}
	
	public static String aadahnum()
	{
		dateFormat1= new SimpleDateFormat("ddhhmm:ss");
		date = new Date();
		String dms=dateFormat1.format(date);
		String dminsec=dms.replaceAll("[:]", "");
		int dd=Integer.parseInt(dminsec);
		String aa="4875";
		return aa+dd;
	}
	
//	public void scrolling(WebElement ele)
//	{
//		
////		JavascriptExecutor jse = (JavascriptExecutor)driver;
////		jse.executeScript("window.scrollBy(0,480)");
//		((JavascriptExecutor) driver).executeScript(
//	            "arguments[0].scrollIntoView();", ele);
//	}
	static String emailt;
	static String emadom;
	static String mail;
	
	
	public static String emil()
	{
		emailt=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 1, 3);
		emadom=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 1, 4);
		mail=emailt+ExcelTestDataHandler.dms()+emadom;
		return mail;
	}
	
	public static String firstname()
	{
		String fristname=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 1, 0);
						return fristname+ExcelTestDataHandler.dms();
	}
	
	public static String secondname()
	{
		String sernam=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 1, 1);
		return sernam;
	}
	public static String fathername()
	{
		String fathenam=ExcelTestDataHandler.getcellvalue(EnvironmentsData.sheetname, 1, 2);
		return fathenam;
	}
	
	public static void writeToExcel(String excelFile,String sheetnam,String data,int rownum,int celnum) throws Exception
	{
		try {
			FileInputStream fis = new FileInputStream(excelFile);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetnam);
			Row row = sheet.createRow(rownum);
			Cell cell = row.createCell(celnum);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(excelFile);
			workbook.write(fos);
			fos.close();
			System.out.println("END OF WRITING DATA IN EXCEL");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
