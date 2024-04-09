package salesforceAutomationAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC14 {

	public static void main(String[] args) throws InterruptedException {
		
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
			
			WebElement merge = driver.findElement(By.linkText("Merge Accounts"));
			merge.click();
			Thread.sleep(1000);
			
			WebElement searchAcc = driver.findElement(By.id("srch"));
			searchAcc.sendKeys("Praj");
			Thread.sleep(1000);
			
			WebElement searchbutton = driver.findElement(By.name("srchbutton"));
			searchbutton.click();
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("cid0"));
			checkbox.click();
			
			WebElement checkbox1 = driver.findElement(By.id("cid1"));
			checkbox1.click();
			
			WebElement nextbutton = driver.findElement(By.name("goNext"));
			nextbutton.click();
			Thread.sleep(1000);
			
			WebElement saveButton = driver.findElement(By.xpath("//input[@title='Merge']"));
			saveButton.click();
			
			Alert alertObject = driver.switchTo().alert();
			String text = alertObject.getText();
			alertObject.accept();
			Thread.sleep(3000);
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Accounts: Home ~ Salesforce - Developer Edition";
			
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("User succesfully merged the account");
				
			}
			else {
				
				System.out.println("Test Case Failed");
			
			}

	}

}
