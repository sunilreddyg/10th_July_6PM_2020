package framework.datadriven.poi;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("TestData\\Book1.xls");
			System.out.println("file located");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//Get Workbook Using above file location
		//To access 97-2003 workbook  [.xls extension file]
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet using above workbook
		HSSFSheet sht=book.getSheet("AppData");
		
		//Get row using above sheet
		HSSFRow row=sht.getRow(1);
		
		//Get cell using above row
		HSSFCell cell=row.getCell(0);
		
		//Get Characters from Cell
		String App_url=cell.getStringCellValue();
		System.out.println("Application url at first row and zero cell is --> "+App_url);
		
		
		
		//Read usename from firstrow and Firstcell
		String Username=book.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println("At first row and first cell data available is -->"+Username);
		
		
		/*
		 * 
		 * getStringCellValue:-->
		 * 			Method read characters from cell 
		 * getNumericCellValue:-->
		 * 			Method read number from cell and return in double format
		 * getDateCellValue:-->
		 * 			Method read data value from cell and return in Date format
		 * getBooleanvalue:-->
		 * 			Method read boolean value true/false from cell. 
		 */
		
	}

}
