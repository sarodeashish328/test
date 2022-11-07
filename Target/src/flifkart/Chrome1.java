package flifkart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Chrome1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	
	 String url1 = driver.getCurrentUrl();
	 System.out.println(url1);
	 Thread.sleep(5000);
	 
//	--------------------------  FOR LOGIN FLIFKART-------------------------------------------------------------
	
	 WebElement inp=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	 WebElement pass=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	 WebElement login =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	 inp.sendKeys("7218201965");
	 Thread.sleep(1000);
	 pass.sendKeys("Flipkart123");////input[@class='_3704LK']
	 login.click();
//	 driver.manage().window().maximize();
	 Thread.sleep(5000);
//	 ------------------------------SEARCH ITEM -------------------------------
	 
//	 WebElement search =driver.findElement(By.xpath("//input[@class='_3704LK']"));
//	 		Thread.sleep(3000);
//	 search.sendKeys("mi tv");
//	 WebElement submit =driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//	 		Thread.sleep(500);
//	 submit.click();	
//	 	Thread.sleep(6000);
//	 	
//----------------------------------CLICK ITEM--------------------------------------
	 	
//	 WebElement select =driver.findElement(By.xpath("//div[@class='_4rR01T']"));
//	 select.click();	 
//	 	Thread.sleep(5000);
	 	
////-----------------------------SWITCH TO CHILD BROWSER---------------------------	 	
//	 	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//	 	String addofchild = addr.get(1);
//	 	driver.switchTo().window(addofchild);
//	 	 String url2 = driver.getCurrentUrl();
//	 	System.out.println(url2);
//	 	
//--------------------------------ADD TO CART-----------------------------------------
//	 	TakesScreenshot photo = (TakesScreenshot)driver; 
//	 	File source = photo.getScreenshotAs(OutputType.FILE);
//	 	File dest =new File("E:\\auto screenshot\\abc.png");
//	 	FileHandler.copy(source, dest);
//	 	
//	 	WebElement add =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//	 	Thread.sleep(2000);
//	 	 add.click();
//	 	driver.switchTo().window(addr.get(0));
//	 	
//	 	WebElement ashish  =driver.findElement(By.xpath("//div[text()='Ashish ']"));
//	 	Thread.sleep(5000);
//	 	
//	 	
//	 	Actions act = new Actions(driver);
//	 	 act.moveToElement(ashish).perform();
// 
//	 	WebElement logout  =driver.findElement(By.xpath("//div[text()='Logout']")); 
//	 	 
//	 	 logout.click();
//	 	
//	 	 driver.close();
//	 	 
	}

}
