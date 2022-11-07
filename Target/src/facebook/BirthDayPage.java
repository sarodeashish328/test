package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BirthDayPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chrome new update\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
	
	  driver.get("https://www.facebook.com/");
	  String url= driver.getCurrentUrl();
	  String title=driver.getTitle();
	
	 
	  
	  
	  
	  
	
	
	
	
	
	}
}
