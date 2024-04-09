package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC26 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		logintoApplication();
		contact();
		driver.quit();
	}
	static void contact() throws InterruptedException {

		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		contact.click();

		WebElement newButton = driver.findElement(By.xpath("//input[@class='btn' and @title='New']"));
		newButton.click();
		
		WebElement lastName = driver.findElement(By.id("name_lastcon2"));
		lastName.sendKeys("Khan");
		
		WebElement accName = driver.findElement(By.id("con4"));
		accName.sendKeys("Global Media");
		
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save' and @type='submit']"));
		saveButton.click();
	}

	static void logintoApplication() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000);

}}
