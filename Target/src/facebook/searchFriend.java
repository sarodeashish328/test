package facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchFriend {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("----disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement loginB = driver.findElement(By.xpath("//button[@name='login']"));
		
		userId.sendKeys("ashishsarode28");
		
		pass.sendKeys("ashish28");
		
		loginB.click();
		Thread.sleep(24000);
		
		WebElement finfFrnd =driver.findElement(By.xpath("//label[@class='lzcic4wl gs1a9yip br7"
			+ "hx15l h2jyy9rg n3ddgdk9 owxd89k7 rq0escxv j83agx80 a5nuqjux l9j0dhe7 k4urc"
			+ "fbm kbf60n1y b3i9ofy5']"));
		
		finfFrnd.click();
		Thread.sleep(4000);
		
		finfFrnd.sendKeys("sagar patil");
		Thread.sleep(9000);
		
		
		WebElement selectFrnd =driver.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[2]"));
		
		 selectFrnd.click();
		 Thread.sleep(7000);
		 
		 WebElement photos =driver.findElement(By.xpath("//span[text()='Photos']"));
			
		 photos.click();
			Thread.sleep(4000);
			

		 TakesScreenshot photo= (TakesScreenshot)driver;
		File source = photo.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\auto screenshot\\sagar.png");
		
		FileHandler.copy(source, dest);
		
		System.out.println("ok");
		
		Thread.sleep(2000);
		WebElement yourProfile = driver.findElement(By.xpath("(//div[@aria-label='Your profile'])[1]"));
		yourProfile.click();
		
		Thread.sleep(5000);
	
		WebElement out =driver.findElement(By.xpath("//span[text()='Log Out']"));
		out.click();   
	
		
		
		
		
		
		
		
		
		
	}
}
