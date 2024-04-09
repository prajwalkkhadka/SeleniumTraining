package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC19 {
	
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		logintoApplication();
		opportunities();
		
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

		
	}
	
	 static void opportunities() throws InterruptedException {
	  
		
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
		opportunityTab.click();
		Thread.sleep(2000);
		
		WebElement stuckOpportunities = driver.findElement(By.linkText("Stuck Opportunities"));
		stuckOpportunities.click();
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Stuck Opportunities ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User succesfully logged into the home page.");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		}}}

		
		
		
		
		
		//driver.close();
		


