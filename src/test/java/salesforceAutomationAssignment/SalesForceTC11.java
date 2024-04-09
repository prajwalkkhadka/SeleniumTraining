package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC11 {

	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		//logintoApplication();
	//	accounts();
		
	
	//static void logintoApplication() throws InterruptedException {

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
		
		 WebElement account = driver.findElement(By.id("Account_Tab"));
		 account.click();
		 Thread.sleep(1000);
		 
		 WebElement newAccount = driver.findElement(By.xpath("//input[@value=' New ' and @type='button']"));
		 newAccount.click();
		 Thread.sleep(1000);
		 
		 WebElement accountName = driver.findElement(By.xpath("//input[@name='acc2']"));
		 accountName.sendKeys("Praj");
		 Thread.sleep(2000);
		 
		 WebElement typeDropdown = driver.findElement(By.id("acc6"));
		 Select type = new Select(typeDropdown);
		 type.selectByVisibleText("Technology Partner");
		 
		 WebElement customerPriority = driver.findElement(By.xpath("//select[@tabindex='26']"));
		 Select customer = new Select(customerPriority);
		 customer.selectByIndex(1);
		 Thread.sleep(1000);
		 
		 WebElement savebutton = driver.findElement(By.xpath("//input[@value=' Save ' and @type='submit']"));
		 savebutton.click();
		 
		 Thread.sleep(1000);
		 
		 String actualTitle = driver.getTitle();
			String expectedTitle = "Accounts Tab - Selected";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("User succesfully logged into the home page.");
				
			}
			else {
				
				System.out.println("Test Case Failed");
 
			

}  
			//driver.close();	 
	}

}
