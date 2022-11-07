package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nchrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//for title and url
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		// for input text field
		
		WebElement user = driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
		user.sendKeys("ashish28");
		
	
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("ashish28");
		
		WebElement newacc = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		newacc.click();
		Thread.sleep(3000);
		
		WebElement frist = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		frist.sendKeys("ashish28ik");
		
		
		WebElement lastn = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastn.sendKeys("ashish28");
		
		
		WebElement mono = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mono.sendKeys("ashish28");
		
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
		pass1.sendKeys("ashish28"); 		
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
			Select s = new Select(day);
			//s.selectByValue("28");
			s.selectByIndex(28);
			//s.selectByVisibleText("28");
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select t = new Select(month);
		//t.selectByVisibleText("Mar");
		t.selectByValue("3");
		//t.selectByIndex(3);
			
		

		WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
    	Select u = new Select(year);
		//u.selectByValue("1994");
		u.selectByIndex(28);
		//u.selectByVisibleText("1994");

		WebElement male = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		male.click();
		
		WebElement custom = driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[3]"));
		//
		
		
		boolean result = custom.isSelected();
		
		if(result) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
			custom.click();
		}
		
		result = custom.isSelected();
		System.out.println(result);
		Thread.sleep(2000);
		
		
		WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label=\"Select your pronoun\"]"));
		Select w = new Select(pronoun);
		w.selectByIndex(2);
		
	
	
	
	
	
	
	}

}
