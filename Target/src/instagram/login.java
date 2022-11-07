package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://www.instagram.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	WebElement withFacebook = driver.findElement(By.xpath("//span[contains(text(),'Log in with Facebook')]"));
	withFacebook.click();
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.clear();
	email.sendKeys("ashishsarode28");
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	pass.clear();
	pass.sendKeys("ashish28");
	
	WebElement loogin = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	loogin.click();
	}
}
