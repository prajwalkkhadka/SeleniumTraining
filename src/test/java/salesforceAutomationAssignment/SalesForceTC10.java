package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC10 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("prajwal@mydomain.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		
		WebElement profiletab = driver.findElement(By.id("userNav"));
		profiletab.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();
		
			
	}  
	
	}


