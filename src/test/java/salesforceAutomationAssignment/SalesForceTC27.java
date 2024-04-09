package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC27 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		logintoApplication();
		driver.close();
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
			
			WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contactTab.click();
			
			WebElement newView = driver.findElement(By.linkText("Create New View"));
			newView.click();
			
			WebElement viewName = driver.findElement(By.xpath("//input[@name='fname']"));
			viewName.sendKeys("Prajwalkk");
			
			WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
			saveButton.click();
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Contacts ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("User succesfully logged into the home page.");
				
			}
			else {
				
				System.out.println("Test Case Failed");
	
		

	}

}
}
