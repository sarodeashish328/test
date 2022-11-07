package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendMassage {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\automation\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		
		user.sendKeys("sarodeash28@gmail.com"); 
		
		pass.sendKeys("ashish28");
		
		log.click();
		
		Thread.sleep(5000);
		WebElement messanger = driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
		messanger.click();
		
//		Thread.sleep(2000);
		
//		WebElement searchInput = driver.findElement(By.xpath("//input[@aria-label='Search Messenger']"));
//		searchInput.sendKeys("dipak dhake");
		
		Thread.sleep(20000);
		
		WebElement searchD = driver.findElement(By.xpath("//span[text()='Dipak Dhake']"));
		searchD.click();
		Thread.sleep(8000);
		WebElement likeSend = driver.findElement(By.xpath("//div[@aria-label='Send a Like']"));
		likeSend.click();
		
		Thread.sleep(2000);
		WebElement yourProfile = driver.findElement(By.xpath("(//div[@aria-label='Your profile'])[1]"));
		yourProfile.click();
		
		Thread.sleep(5000);
	
		WebElement out =driver.findElement(By.xpath("//span[text()='Log Out']"));
		out.click();   
	
	
}}
