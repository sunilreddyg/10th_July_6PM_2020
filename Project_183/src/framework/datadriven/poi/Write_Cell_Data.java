package framework.datadriven.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Write_Cell_Data 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Target sheet using sheetname
		HSSFSheet sht=book.getSheet("AppData");
		
		//Write data into Existing row and Existing cell
		sht.getRow(1).getCell(2).setCellValue(1025);
		
		//Write cell data into Existing row and New Cell
		sht.getRow(1).createCell(7).setCellValue("Testpass");
		
		//Write cell data into New Row and New Cell
		sht.createRow(2).createCell(0).setCellValue("12-12-2020");
		
		//Write entire book into output file.
		FileOutputStream fo=new FileOutputStream("TestData\\Book2.xls");
		book.write(fo);

	}

}
