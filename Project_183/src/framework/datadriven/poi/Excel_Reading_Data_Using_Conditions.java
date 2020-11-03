package framework.datadriven.poi;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_Reading_Data_Using_Conditions {

	public static void main(String[] args) throws Exception 
	{
	
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet access using index number
		HSSFSheet sht=book.getSheet("conditions");
		
		//Get number of rows data available at sheet
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows data available at sheet is --> "+Rcount);
				
		//Iterate for number of row times
		for (int i = 5; i <= Rcount; i++) 
		{
			
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Condition only read when execution status yes at 2nd column
			if(Exe_status.equals("y"))
			{
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(username+"   "+password);
				
				
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				if(Stype.equals("text"))
				{
					System.out.println("text output captured"+"\n");
				}
				else if(Stype.equals("object"))
				{
					System.out.println("obj output captured"+"\n");
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("alert output captuted"+"\n");
				}
				else
				{
					System.out.println("Scenario type mismatch");
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
