package salesforceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
		forgotPassword.click();
		
		WebElement username = driver.findElement(By.id("un"));
		username.click();
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		
		

		
		
		

	}

}
