package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC32 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement checkbox = driver.findElement(By.id("rememberUn"));
		checkbox.click();

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		Thread.sleep(2000);
		
		WebElement newView = driver.findElement(By.linkText("Create New View"));
		newView.click();
		
		WebElement viewName = driver.findElement(By.name("fname"));
		//viewName.clear();
		viewName.sendKeys("ABCD");
		
		WebElement uniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		//uniqueName.clear();
		uniqueName.sendKeys("EFGH");
		
		WebElement cancelButton = driver.findElement(By.xpath("//input[@value='Cancel']"));
		cancelButton.click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Cancel button sucessfully passed and returned back to Contact Home Page.");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		
	}
		driver.quit();
}
}