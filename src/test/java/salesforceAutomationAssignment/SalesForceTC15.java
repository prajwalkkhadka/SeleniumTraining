package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC15 {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com");
			Thread.sleep(1000);

			WebElement email = driver.findElement(By.id("username"));
			email.sendKeys("prajwal@mydomain.com");

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("Automation123");

			WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
			login.click();
			Thread.sleep(1000); 
			
			WebElement account = driver.findElement(By.id("Account_Tab"));
			account.click();
			Thread.sleep(1000);
			
			WebElement accReport = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
			accReport.click();
			
			WebElement dateField = driver.findElement(By.xpath("//label[@id='ext-comp-1053']"));
			Select datefield = new Select(dateField);
			datefield.selectByVisibleText("Created Date");
			
			WebElement calender = driver.findElement(By.id("ext-gen3"));
			calender.click();
			Thread.sleep(2000);
	}
			
}
