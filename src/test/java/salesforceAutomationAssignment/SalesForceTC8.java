package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC8 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		logintoApplication();
		mySettings();
		displayandlayout();
		emaillink();

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
		Thread.sleep(3000); 

		WebElement profiletab = driver.findElement(By.id("userNav"));
		profiletab.click();
		Thread.sleep(3000);

	}

	static void mySettings() throws InterruptedException {


		WebElement settings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		settings.click();	

		WebElement personal = driver.findElement(By.xpath("//span[text()='Personal']"));
		personal.click();

		WebElement loginhistory = driver.findElement(By.xpath("//span[text()='Login History']"));
		loginhistory.click();
		Thread.sleep(1000);

		WebElement download = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		download.click();
		Thread.sleep(2000);

	}

	static void displayandlayout() throws InterruptedException {

		WebElement display = driver.findElement(By.id("DisplayAndLayout_font"));
		display.click();

		Thread.sleep(2000);

		WebElement myTabs = driver.findElement(By.xpath("//span[contains(text(),'Customize My Tabs')]"));
		myTabs.click();

		// WebElement frame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		// driver.switchTo().frame(frame);


		WebElement tabdropdown = driver.findElement(By.xpath("//select[@id='p4']"));
		Select tab = new Select(tabdropdown);
		tab.selectByVisibleText("Salesforce Chatter");

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		Select tabSelect = new Select(dropDown);
		tabSelect.selectByVisibleText("Reports");

		WebElement imagebutton = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		imagebutton.click();



		WebElement button = driver.findElement(By.xpath("//input[@class='btn primary']"));
		button.click();

	}
	static void emaillink () throws InterruptedException {

		WebElement emailLink = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		emailLink.click();


		WebElement emailSettings = driver.findElement(By.id("EmailSettings_font"));
		emailSettings.click();

		WebElement emailName = driver.findElement(By.name("sender_name"));
		emailName.clear();
        emailName.sendKeys("Prajwal Khadka");

		WebElement emailAddress = driver.findElement(By.id("sender_email"));
		emailAddress.clear();
		emailAddress.sendKeys("prajwal@mydomain.com");

		WebElement Yes = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		Yes.click();

		WebElement submitButton = driver.findElement(By.xpath("//input[@class='btn primary']"));
		submitButton.click();			
		Thread.sleep(1000);
	
	}

		static void calendarandremainders () {
		WebElement calendarandremainders = driver.findElement(By.id("CalendarAndReminders_font"));
		calendarandremainders.click();
		
		WebElement activity = driver.findElement(By.id("Reminders_font"));
		activity.click();
		
		WebElement testremainder = driver.findElement(By.id("testbtn"));
		testremainder.click();
		
		driver.close();
		
	
		
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	


