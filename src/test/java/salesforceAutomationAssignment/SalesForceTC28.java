package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC28 {
	
	static WebDriver  driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver.close();
	
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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		
		WebElement display = driver.findElement(By.id("hotlist_mode"));
		Select recent = new Select(display);
		recent.selectByVisibleText("Recently Created");
		Thread.sleep(2000);
	}
		
		//public static void verifypageTitle() {
		
		//String title = driver.getTitle();
		//System.out.println("the page title is:" +title);
		//Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
		
		
	
	}


