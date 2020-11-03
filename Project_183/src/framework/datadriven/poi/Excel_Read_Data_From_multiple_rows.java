package framework.datadriven.poi;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_Read_Data_From_multiple_rows {

	public static void main(String[] args) throws Exception 
	{
	
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet access using index number
		HSSFSheet sht=book.getSheet("Sheet2");
		
		//Get number of rows data available at sheet
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows data available at sheet is --> "+Rcount);
				
		//Iterate for number of row times
		for (int i = 5; i <= Rcount; i++) 
		{
			
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(username+"   "+password);
			
		}
		
		
		
		
		//Get Cell data count at selected row
		int Last_row_Count=sht.getRow(5).getLastCellNum();
		System.out.println("Data available at last cell is ---> "+Last_row_Count);
		
		
		
		
		

	}

}
