package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC35 {

	static WebDriver driver;

	static void main(String[] args) throws InterruptedException {

		logintoApplication();
		HomeTab();
		driver.close();

	}

	static void logintoApplication() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com");


		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 

	}

	static void HomeTab() throws InterruptedException {

		WebElement homeTab = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		homeTab.click();

		WebElement myName = driver.findElement(By.linkText("Prajwal Khadka"));
		myName.click();
		Thread.sleep(3000);

		WebElement contact = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		contact.click();

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		driver.switchTo().frame(frame);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();

		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.clear();

		WebElement lastname1 = driver.findElement(By.name("lastName"));
		lastname1.sendKeys("Abcd");

		WebElement submit = driver.findElement(By.xpath("//input[@value='Save All']"));
		submit.click();


	}

}
