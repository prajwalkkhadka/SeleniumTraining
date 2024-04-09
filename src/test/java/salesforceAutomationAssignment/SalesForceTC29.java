package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC29 {

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
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();
		
		WebElement myContacts = driver.findElement(By.xpath("//select[@title='View:']"));
		Select dropdown = new Select(myContacts); 
		dropdown.selectByVisibleText("My Contacts");
		
		WebElement goButton = driver.findElement(By.xpath("//input[@title=\"Go!\"]"));
		goButton.click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Contacts ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("View from the drop down list in contacts page sucessfully validated.");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		
}
		
		driver.close();
}}