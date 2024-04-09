package salesforceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");
		
		WebElement checkbox = driver.findElement(By.id("rememberUn"));
		checkbox.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();		
		
		WebElement myname = driver.findElement(By.id("userNav")); 
		myname.click();
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
		Thread.sleep(2000);
		
	}

}
