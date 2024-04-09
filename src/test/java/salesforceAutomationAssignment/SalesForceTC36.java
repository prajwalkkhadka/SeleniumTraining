package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC36 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		logintoApplication();
		tab();
		driver.close();
		
	}

	 static void tab() throws InterruptedException {
		WebElement allTabs = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		allTabs.click();
		
		WebElement customTab = driver.findElement(By.xpath("//input[@title='Customize My Tabs']"));
		customTab.click();
		Thread.sleep(1000);
		
		WebElement customApp = driver.findElement(By.id("p4"));
		Select service = new Select(customApp);
		service.selectByVisibleText("Service");
		//customApp.click();
		Thread.sleep(2000);
				
		
		WebElement selectedTabs = driver.findElement(By.xpath("//label[contains(text(),'Selected Tabs')]"));
		Select tabSelect = new Select(selectedTabs);
		tabSelect.selectByVisibleText("Solutions"); 
		
		
	}

	 static void logintoApplication() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 
		
	}

}
