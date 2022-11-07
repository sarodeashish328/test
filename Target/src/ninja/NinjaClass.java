package ninja;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaClass {
	
//	public void excel() throws EncryptedDocumentException, IOException {
//		String path = "C:\\Users\\ASHISH SARODE\\Desktop\\Book1.xlsx";
//		FileInputStream file = new FileInputStream(path);
//
//		Workbook book = WorkbookFactory.create(file);
//	
//		Sheet sheet= book.getSheet("ashish");
//		int lastrow=sheet.getLastRowNum();
//		short lastcell =sheet.getRow(0).getLastCellNum();
//		System.out.println("row="+lastrow);
//		System.out.println("cell="+lastcell);
//		
//		for(int i=0;i<lastrow;i++) 
//		{
//			Row row =sheet.getRow(i);
//			
//		for(int j=0;j<lastcell;j++) {
//				Cell cell=row.getCell(j);
//				String value = cell.getStringCellValue();
//				System.out.print(value+"  ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sarodeash28@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ashish28");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		System.out.println("login succesfully");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
				
	}

}
