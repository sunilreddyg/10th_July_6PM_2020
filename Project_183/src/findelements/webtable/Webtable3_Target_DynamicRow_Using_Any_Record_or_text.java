package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3_Target_DynamicRow_Using_Any_Record_or_text {

	public static void main(String[] args)
	{
		
	
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		
		WebElement Markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		Markets_link.click(); 
		
		
		//identifying webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		//Find List of rows available under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Iterate for Number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//Target Each Dynamic row
			WebElement Dynamic_Row=rows.get(i);
			//Read text from each row
			String Row_text=Dynamic_Row.getText();
			
			//Accept Condition when required record matching
			if(Row_text.contains("ICIBAN"))
			{
				
				System.out.println("Text available at row number --> "+i);
				
				//Find list of cells under Targeted row
				List<WebElement> cells=Dynamic_Row.findElements(By.tagName("td"));
				
				//Target Required cell and Read Text inside cell
				String CompanyName=cells.get(0).getText();
				String HighPrice=cells.get(3).getText();
				String Previous_Close=cells.get(6).getText();
				
				
				System.out.println(CompanyName+"    "+HighPrice+"     "+Previous_Close);
			}
			
		
		}
		
		

	}

}
