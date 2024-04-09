package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC23 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		logintoApplication();
		//todaysLead();
		//logout();
		//logback();
	}

	static void logintoApplication() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 

		WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		Thread.sleep(2000);


		WebElement View = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select todaysleads = new Select(View);
		todaysleads.selectByVisibleText("Today's Leads");
		Thread.sleep(2000);

		WebElement View1 = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select leads1 = new Select(View1);
		leads1.selectByVisibleText("My Unread Leads");
		Thread.sleep(3000);

		WebElement myname = driver.findElement(By.id("userNav")); 
		myname.click();
		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		logout.click();

		Thread.sleep(2000);

		
		//driver.get("https://login.salesforce.com");
		WebElement emailagain = driver.findElement(By.id("username"));
		emailagain.sendKeys("prajwal@mydomain.com");

		WebElement passwordagain = driver.findElement(By.id("password"));
		passwordagain.sendKeys("Automation123");

		WebElement loginagain = driver.findElement(By.xpath("//input[@name='Login']"));
		loginagain.click();
		Thread.sleep(3000); 

		WebElement leadsagain = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leadsagain.click();
		Thread.sleep(2000);
		
		WebElement goButton = driver.findElement(By.name("go"));
		goButton.click();
		Thread.sleep(3000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Leads ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User succesfully logged into the home page.");
			
		}
		else {
			
			System.out.println("Test Case Failed");
		
		
		
		
		
		
		
		//driver.close();

	}
	

}


}


