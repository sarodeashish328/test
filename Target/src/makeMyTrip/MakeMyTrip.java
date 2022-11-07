package makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.instagram.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
