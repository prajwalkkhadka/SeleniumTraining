package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC6 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		logintoapplication();
		profile();
		driver.quit();
	
	}

	static void logintoapplication() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

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
		Thread.sleep(1000); 
		
	}
		static void profile() throws InterruptedException {
			
			WebElement profiletab = driver.findElement(By.id("userNav"));
			profiletab.click();
			Thread.sleep(3000);
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("Dropdown from username validated sucessfully");
				
			}
			else {
				System.out.println("Could not logged into home page");
			
				
		
		}
			
			
}
		}

		



