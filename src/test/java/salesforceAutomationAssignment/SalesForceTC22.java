package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC22 {

	public static void main(String[] args) throws InterruptedException {
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 
		
		WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		
		WebElement View = driver.findElement(By.xpath("//select[@id='fcf']"));
		View.click();
		Thread.sleep(3000);
		
		
	}

}

