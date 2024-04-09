package salesforceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2 {

	public static void main(String[] args) {
		// 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();		
		
		

	}

}
