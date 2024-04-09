package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium-prd.firebaseapp.com/");
	Thread.sleep(3000);



	WebElement email = driver.findElement(By.id("email_field"));
	email.sendKeys("admin123@gmail.com");

	WebElement password = driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");

	WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	login.click();


	Thread.sleep(1000);
	WebElement calculator = driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
	calculator.click();
	
	WebElement add = driver.findElement(By.xpath("//input[@value='4']"));
	add.click();
	Thread.sleep(1000);
	
	WebElement addnum = driver.findElement(By.xpath("//input[@value='+']"));
	addnum.click();
	Thread.sleep(1000);
	
	WebElement add1 = driver.findElement(By.xpath("//input[@value='6']"));
	add1.click();
	Thread.sleep(1000);
	
	WebElement equals = driver.findElement(By.xpath("//input[@value='=']"));
	equals.click();
	Thread.sleep(1000);
	
	WebElement result = driver.findElement(By.id("display"));
	String resultValue = result.getAttribute("value");
	
	System.out.println("The value is: " +resultValue);
	
	
	
	
	
	
			

}

	}

