package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC34 {

	static WebDriver driver;

	static void main(String[] args) throws InterruptedException {

		logintoApplication();
		HomeTab();
		validation();
		driver.close();

	}
	
	 static void HomeTab() throws InterruptedException {
		WebElement homeTab = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		homeTab.click();
		
		WebElement myName = driver.findElement(By.linkText("Prajwal Khadka"));
		myName.click();
		Thread.sleep(3000);
		
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

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 

	}
	 static void validation() {
			String actualTitle = driver.getTitle();
			String expectedTitle = "User: Prajwal Khadka ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("User succesfully logged into FirstName LastName link in the home page.");
				
			}
			else {
				
				System.out.println("Test Case Failed");
				
			
			}
	 }

}
