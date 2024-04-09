package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC20 {
	
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
		
		WebElement interval = driver.findElement(By.id("quarter_q"));
		Select dropdown  = new Select(interval);
		dropdown.selectByVisibleText("Current and Next FQ");
		Thread.sleep(1000);
		
		WebElement include = driver.findElement(By.id("open"));
		Select dropdown1 = new Select(include);
		dropdown1.selectByVisibleText("All Opportunities");
		
		WebElement run = driver.findElement(By.xpath("//input[@value='Run Report']"));
		run.click();
		
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
