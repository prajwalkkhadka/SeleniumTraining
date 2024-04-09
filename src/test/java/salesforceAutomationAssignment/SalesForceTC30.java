package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class SalesForceTC30 extends SalesForceTC3{

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		logintoApplication();
		contacttab();

	}

	static void contacttab() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		WebElement contactTab = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contactTab.click();

		WebElement recentContact = driver.findElement(By.linkText("ahahha"));
		recentContact.click();






	}


}
