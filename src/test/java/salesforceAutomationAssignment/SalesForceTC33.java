package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC33 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		Thread.sleep(2000);
		
		WebElement newButton = driver.findElement(By.xpath("//input[@value=' New ']"));
		newButton.click();
		
		WebElement lastName = driver.findElement(By.name("name_lastcon2"));
		lastName.sendKeys("Indian");
		
		WebElement accountName = driver.findElement(By.id("con4"));
		accountName.sendKeys("Global Media");
		
		WebElement saveButton = driver.findElement(By.xpath("//td[@id='topButtonRow']/input[1]"));
		saveButton.click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Contact: Indian ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("New contact page sucessfully validated.");
			
		}
		else {
			
			System.out.println("Test Case Failed");

	}
			driver.quit();
}
}