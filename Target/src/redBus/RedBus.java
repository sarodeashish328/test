package redBus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
//=============================loginPage============================================
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Pune");
		Thread.sleep(1000);
		from.click();
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Bhusawal");
		Thread.sleep(1000);
		to.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		date.click();
		Thread.sleep(1000);
		
		WebElement traveldate = driver.findElement(By.xpath("//td[text()='22']"));
		act.moveToElement(traveldate).click().perform();		
		
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search_btn']"));
		search.click();
		
 //=================================homePage============================================
		Thread.sleep(3000);
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,50)");
		
		WebElement avoid = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		avoid.click();
		Thread.sleep(2000);
//		WebElement viewseat = driver.findElement(By.xpath("//*[@id=\"12582850\"]/div/div[2]/div[1]"));
//		
//		act.moveToElement(viewseat).click().build().perform();
		
		
		
		
		
		
		//to find total no of buses on this route
	//	WebElement count =driver.findElement(By.xpath(""));
		
		
		//div[@class='clearfix bus-item'] slot of bus
		//span[@class='f-bold busFound']
	//	System.out.println("done");
		
		 
		

		
	}
}
