package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC13 {

	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {


		logintoapplication();
		AdditionalFields();

	}
	static void logintoapplication() throws InterruptedException {
		

	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

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

	WebElement goButton = driver.findElement(By.name("go"));
	goButton.click();
	Thread.sleep(0);

	WebElement editButton = driver.findElement(By.linkText("Edit"));
	editButton.click();
	Thread.sleep(1000);

	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.clear();
	Thread.sleep(2000);

	WebElement newviewName = driver.findElement(By.id("fname"));
	newviewName.sendKeys("NewEastWest");
	Thread.sleep(2000);

}

     static void AdditionalFields() {
	// TODO Auto-generated method stub

	WebElement accName = driver.findElement(By.id("fcol1"));
	Select Field = new Select(accName);
	Field.selectByVisibleText("Account Name");

	WebElement opeName = driver.findElement(By.id("fop1"));
	Select Operator = new Select(opeName);
	Operator.selectByVisibleText("equals");

	WebElement Value = driver.findElement(By.name("fval1"));
	Value.sendKeys("<a>");

	WebElement accName1 = driver.findElement(By.id("fcol2"));
	Select Field1 = new Select(accName1);
	Field1.selectByVisibleText("Account Name");

	WebElement opeName1 = driver.findElement(By.id("fop2"));
	Select Operator1 = new Select(opeName1);
	Operator1.selectByVisibleText("equals");

	WebElement Value1 = driver.findElement(By.name("fval2"));
	Value1.sendKeys("<a>");
	
	WebElement accName2 = driver.findElement(By.id("fcol3"));
	Select Field2 = new Select(accName2);
	Field2.selectByVisibleText("Account Name");

	WebElement opeName2 = driver.findElement(By.id("fop3"));
	Select Operator2 = new Select(opeName2);
	Operator2.selectByVisibleText("equals");

	WebElement Value2 = driver.findElement(By.name("fval3"));
	Value2.sendKeys("<a>");
  
	WebElement accName3 = driver.findElement(By.id("fcol4"));
	Select Field3 = new Select(accName3);
	Field3.selectByVisibleText("Account Name");

	WebElement opeName3 = driver.findElement(By.id("fop4"));
	Select Operator3 = new Select(opeName3);
	Operator3.selectByVisibleText("equals");

	WebElement Value3 = driver.findElement(By.name("fval4"));
	Value3.sendKeys("<a>");
	
	WebElement accName4 = driver.findElement(By.id("fcol5"));
	Select Field4 = new Select(accName4);
	Field4.selectByVisibleText("Account Name");

	WebElement opeName4 = driver.findElement(By.id("fop5"));
	Select Operator4 = new Select(opeName4);
	Operator4.selectByVisibleText("equals");

	WebElement Value4 = driver.findElement(By.name("fval5"));
	Value4.sendKeys("<a>");
	
	WebElement button = driver.findElement(By.name("save"));
	button.click();
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "Accounts ~ Salesforce - Developer Edition";
	if(actualTitle.equalsIgnoreCase(expectedTitle))
	{
		System.out.println("User succesfully validated the page");
		
	}
	else {
		
		System.out.println("Test Case Failed");
    
    driver.close();
    
    


}

     }}
