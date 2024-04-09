package salesforceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com");
		
		login();
		verifypassword();

	}
	static void login() throws InterruptedException{

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.clear();

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();	


	}
	static void verifypassword() throws InterruptedException {

		WebElement errorElement = driver.findElement(By.xpath("//div[@id='error']"));
		String errorMSg = errorElement.getText();

		String expectedError = "Please enter your password";
		if(errorMSg.equals(expectedError)) {
			System.out.println("Please please");
		}else {
			System.out.println("Sorry failed" + expectedError);
		}

	}

}
