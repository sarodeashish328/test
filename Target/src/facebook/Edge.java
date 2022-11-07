package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.edge.driver", "E:\\automation\\edgedriver_win64
		// (2)\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();
		// driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.edge.driver", "E:\\automation\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);

		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		user.sendKeys("sarodeash28@gmail.com");
		pass.sendKeys("ashish28");
		login.click();
		Thread.sleep(9000);
		WebElement profile = driver.findElement(By.xpath("//div[@aria-label='Your profile']"));
		profile.click();
		WebElement out = driver.findElement(By.xpath("//span[text()='Log Out']"));
		Thread.sleep(700);
		out.click();
	}
}