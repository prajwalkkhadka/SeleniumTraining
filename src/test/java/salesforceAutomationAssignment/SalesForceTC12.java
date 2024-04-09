package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
	
	WebElement newView = driver.findElement(By.linkText("Create New View"));
	newView.click();
	Thread.sleep(1000);
	
	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.sendKeys("EastWest");
	
	WebElement uniqueName = driver.findElement(By.id("devname"));
	uniqueName.sendKeys("EastWest");
	Thread.sleep(1000);
	
	WebElement button = driver.findElement(By.xpath("//input[@value=' Save ' and @type='submit']"));
	button.click();
	Thread.sleep(1000);
	driver.close();
	
	
	

}
}