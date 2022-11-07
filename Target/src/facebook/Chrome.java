package facebook;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Chrome {    
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		
		
		JavascriptExecutor je = (JavascriptExecutor)driver;

//------------------------------GET URL AND TITLE----------------------------------------		
		
		String url = driver.getCurrentUrl();
		
		String title= driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
//----------------------------LOGIN ELEMENT----------------------------------------
		
		//By b = By.xpath("//input[@id='email']");
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		user.sendKeys("sarodeash28@gmail.com"); //(By.xpath("(//div[@class='_28p97w'])[1]"))
		pass.sendKeys("ashish28");
		log.click();
		Thread.sleep(15000);
//---------------------------homepage-----------------------------------------
		
//		Thread.sleep(2000);
//		WebElement notification = driver.findElement(By.xpath("//a[@aria-label='Notifications']"));
//		notification.click();
//		Thread.sleep(2000);
//		=========================massanger============================================
//		WebElement messanger = driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
//		messanger.click();
//		Thread.sleep(2000);
//		WebElement searchInput = driver.findElement(By.xpath("//input[@aria-label='Search Messenger']"));
//		searchInput.sendKeys("dipak dhake");
//		Thread.sleep(7000);
//		WebElement search = driver.findElement(By.xpath("(//span[text()='Dipak Dhake'])[1]"));
//		search.click();
//		
//		WebElement texttype = driver.findElement(By.xpath("//p[@class='kvgmc6g5 oygrvhab']"));
//		searchInput.sendKeys("namaskar");
//		Actions action= new Actions();
//		action.click().perform();
		
		
		
		
//=====================================your profile====================================
		
		WebElement yourProfile = driver.findElement(By.xpath("(//div[@aria-label='Your profile'])[1]"));
		yourProfile.click();
		
		Thread.sleep(5000);
		WebElement seeYourProfile = driver.findElement(By.xpath("//span[text()='Ashish Sarode']"));
		seeYourProfile.click();
		Thread.sleep(5000);
		WebElement photos = driver.findElement(By.xpath("//span[text()='Photos']"));
		photos.click();
		je.executeScript("window.scrollBy(0,50)");
		
		yourProfile.click();
		Thread.sleep(5000);
		WebElement out =driver.findElement(By.xpath("//span[text()='Log Out']"));
		out.click();   
}}