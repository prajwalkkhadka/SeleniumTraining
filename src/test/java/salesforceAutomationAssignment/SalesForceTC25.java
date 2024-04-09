package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC25 {

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
		Thread.sleep(2000);
		
		WebElement newButton = driver.findElement(By.xpath("//input[@class='btn' and @title='New']"));
		newButton.click();
		
		WebElement lastName = driver.findElement(By.id("name_lastlea2"));
		lastName.sendKeys("ABCD");
		Thread.sleep(1000);
		
		WebElement companyName = driver.findElement(By.id("lea3"));
		companyName.sendKeys("ABCD");
		Thread.sleep(1000);
		
		WebElement saveButton = driver.findElement(By.xpath("//input[@name='save' and @type='submit']"));
		saveButton.click();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
