package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);

		WebElement emailfield = driver.findElement(By.xpath("//input[@type='email']"));
		emailfield.sendKeys("prajwal@mydomain.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(2000);
		

		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Wrong username/password validate sucessfully.");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		
		
			
			
		
		}
		driver.close();
		
	}
}