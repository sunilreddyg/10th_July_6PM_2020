package framework.datadriven.poi;

import java.io.FileInputStream;

public class Read_InputSteam_File 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//target raw file at local system 
		FileInputStream file=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		
		
		//Location of file with try catch  [When fileinputstream writen under try catch no need to add throws exception]
		FileInputStream fi;
		try {
			fi=new FileInputStream("TestData\\Book1.xlsx");
			System.out.println("file located");
			
		} catch (Exception e) {
			System.out.println("file not located");
		}
		
		
		
		
		
	}

}
