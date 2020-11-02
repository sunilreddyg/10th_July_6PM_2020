package framework.datadriven.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Read_Boolen_And_Data_CellValues {

	public static void main(String[] args) throws Exception {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet access using index number
		HSSFSheet sht=book.getSheetAt(0);
		
		//get row using sheet
		HSSFRow row=sht.getRow(1);
		
		
		//Read Boolean cell value
		boolean flag=row.getCell(3).getBooleanCellValue();
		System.out.println("boolean format value is --> "+flag);
		
		//Autoboxing--> Convert primitive boolean value into Object
		Boolean flag1=flag;
		String Txt_flag=flag1.toString();
		System.out.println("After convertion boolean value into text is --> "+Txt_flag);
		
		//Get Date from Excel cell
		Date date=sht.getRow(1).getCell(4).getDateCellValue();
		//Convert date into text format
		String date_in_text_frmt=date.toString();
		System.out.println("Date in Text format is --> "+date_in_text_frmt);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
		String New_date=sdf.format(date);
		System.out.println("Date in Required format is --> "+New_date);
		

	}

}
