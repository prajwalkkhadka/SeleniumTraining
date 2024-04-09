package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC3 {

	static WebDriver driver;

	static void main(String[] args) throws InterruptedException {

		logintoApplication();
		logout();
		driver.quit();

	}

	static void logintoApplication() throws InterruptedException {

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
		Thread.sleep(0); 

	}

	static void logout() throws InterruptedException {
		WebElement myname = driver.findElement(By.id("userNav")); 
		myname.click();
		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();

		Thread.sleep(2000);
		


		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User succesfully logged into and logged out the home page.");
			
		}
		else {
			
			System.out.println("Test Case Failed");

	}}
}