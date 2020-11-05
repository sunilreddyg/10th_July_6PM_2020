package keyword_drivern_Framework;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;


public class Driver_Engine 
{

	public static void main(String[] args) throws Exception
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("src\\keyword_drivern_Framework\\Book1.xls");
		//Get workbook access
		HSSFWorkbook book=new HSSFWorkbook(fi);
		//get sheet using book
		HSSFSheet sht=book.getSheet("Sheet3");
		
		
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("https://www.facebook.com/r.php");
		obj.set_timeout(30);
		
		
		//Get number of rows available
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
			
				String Property_Name=sht.getRow(i).getCell(1).getStringCellValue();
				String Property_Value=sht.getRow(i).getCell(2).getStringCellValue();
				String Keyword=sht.getRow(i).getCell(3).getStringCellValue();
				String InputData=sht.getRow(i).getCell(4).getStringCellValue();
				
				
				By Locator=Locators.convert_locator(Property_Name, Property_Value);
				
				
				switch (Keyword) {
				case "enter_text":
					obj.Enter_text(Locator, InputData);
					break;

				case "select_dropdown":
					obj.Select_dropdown(Locator, InputData);
					break;
					
				case "click_element":
					obj.Click_element(Locator);
					break;
					
				case "switchto_window":
					obj.switchto_window(InputData);
					break;
					
				case "switchto-alert":
					obj.isAlert_presented();
					break;
					
				case "mouse_hover":
					obj.MouseHover(Locator);
					break;
					
				case "Verify_title":
					obj.is_title_presented(InputData);
					break;
					
				case "CaptureScreen":
					obj.Capturescreen(InputData);
					break;
				
				case "Alert_Close":
					obj.CloseAlert();
					break;
				default:
					break;
				}
				
				
				
				
		}
	}

}
