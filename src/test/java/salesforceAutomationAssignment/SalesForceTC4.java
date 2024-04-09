package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC4 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		forgotpassword();
	}
		
		static void forgotpassword() throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://login.salesforce.com");
		 Thread.sleep(2000);
		 
		 WebElement forgotpassword = driver.findElement(By.id("forgot_password_link"));
		 forgotpassword.click();
		
		 
		 WebElement emailfield = driver.findElement(By.xpath("//input[@type='email']"));
		 emailfield.sendKeys("prajwal@mydomain.com");
		 Thread.sleep(2000);
		 
		 WebElement button = driver.findElement(By.name("continue"));
		 button.click();
		 Thread.sleep(2000);
		 
		//driver.close();
		 
		 String title=driver.getTitle();
			if(title.contains("Check Your Email | Salesforce")) {
				
				System.out.println("Resetting your password validated sucessfully");
			}
			else {
				System.out.println("Fail");
				
		 
			}
			driver.quit();
			 
		
	}

}
