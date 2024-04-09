package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC37 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		logintoApplication();
		driver.quit();
		
	}

	private static void logintoApplication() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(3000); 
		
		WebElement homeTab = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		homeTab.click();
		
		WebElement dateLink = driver.findElement(By.linkText("Sunday March 31, 2024"));
		dateLink.click();
		
		WebElement timeLink = driver.findElement(By.linkText("8:00 PM"));
		timeLink.click();
		
		WebElement subjectCombo = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		subjectCombo.click();
		
		WebElement otherLink = driver.findElement(By.linkText("Other"));
		otherLink.click();
		
		WebElement endtime = driver.findElement(By.id("EndDateTime_time"));
		Select dropdown = new Select(endtime);
		dropdown.selectByVisibleText("9:00 PM");
		
		WebElement saveButton = driver.findElement(By.xpath("//input[@class='btn' and @title='Save']"));
		saveButton.click();
		Thread.sleep(3000);
		
	}

}
