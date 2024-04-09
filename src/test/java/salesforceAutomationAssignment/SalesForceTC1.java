package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
	
		String title=driver.getTitle();
		if(title.contains("Login | Salesforce")) {
			
			System.out.println("empty password validated sucessfully");
		}
		else {
			System.out.println("Fail");
			driver.close();
		}
		
	}
			
}
		
	
		





