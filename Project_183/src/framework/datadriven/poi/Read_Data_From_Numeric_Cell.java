package framework.datadriven.poi;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Read_Data_From_Numeric_Cell {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet access using index number
		HSSFSheet sht=book.getSheetAt(0);
		
		//get row using sheet
		HSSFRow row=sht.getRow(1);
		
		
		//Target zero cell data and text from cell
		String Appurl=row.getCell(0).getStringCellValue();
		System.out.println(Appurl);
		
		
		//Read number from excel cell
		double cell_in_double=row.getCell(2).getNumericCellValue();
		
		//Convert Double value into text
		String Text_value=NumberToTextConverter.toText(cell_in_double);
		System.out.println("Double value converted to text--->"+Text_value);
		
		
		//Convert primitive double value into Wrapper Class
		Double Double_value=new Double(cell_in_double);
		System.out.println("Double value is ---> "+Double_value);
		
		//Convert double value into int value
		int Int_value=Double_value.intValue();
		System.out.println("Int value is --> "+Int_value);
		
		//Convert Interget value into text
		Integer x=new Integer(Int_value);
		String Text=x.toString();
		System.out.println("Text valu using wrapper class --> "+Text);
		
		
		

	}

}
