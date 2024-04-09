package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC17 {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		
		WebElement oppTab = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		oppTab.click();
		Thread.sleep(3000);
		
		WebElement New = driver.findElement(By.name("new"));
		New.click();
		
		WebElement oppName = driver.findElement(By.name("opp3"));
		oppName.sendKeys("Rainbow");
		
		WebElement lookup = driver.findElement(By.xpath("//img[@class='lookupIcon']"));
		//WebElement lookup = driver.findElement(By.xpath("//img[@class='lookupIcon']"));
		lookup.click();
		
		
		WebElement searchField = driver.findElement(By.xpath("//input[@id='opp4']"));
		searchField.sendKeys("Global Media");
		Thread.sleep(1000);
		
		WebElement closedate = driver.findElement(By.id("opp9"));
		closedate.sendKeys("4/2/2024");
		
		WebElement stage = driver.findElement(By.name("opp4"));
		Select workingstage = new Select(stage);
		workingstage.selectByVisibleText("Closed Won");
		
		WebElement probability = driver.findElement(By.name("opp12"));
		probability.sendKeys("100");
		
		WebElement leadsource = driver.findElement(By.xpath("//label[contains(text(),'Lead Source')]"));
		Select source = new Select(leadsource);
		source.selectByVisibleText("Other");
		
		WebElement campaignsource = driver.findElement(By.name("opp17"));
		campaignsource.sendKeys("International Electrical Engineers Association Trade Show - Mar 4-5, 2002");
		
		
		WebElement savebutton = driver.findElement(By.xpath("//*[@id='bottomButtonRow']input[1]"));
		savebutton.click();
		
		driver.close();
		
	}

}
