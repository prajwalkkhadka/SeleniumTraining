package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3a {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		homeTab();
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
		
		
		
		//driver.findElement(By.xpath(null));
		
	}
	static void homeTab() throws InterruptedException {
		
		
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		

	}

}
