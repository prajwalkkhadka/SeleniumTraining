package salesforceAutomationAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("prajwal@mydomain.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Automation123");

		WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
		Thread.sleep(1000); 
		
		WebElement profiletab = driver.findElement(By.id("userNav"));
		profiletab.click();
		
		WebElement devcon  = driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		devcon.click();
		//driver.close();
		
		String parentWindow = driver.getWindowHandle();
		System.out.print("parent window handle =" + parentWindow);
		Set<String> listOfHandles = driver.getWindowHandles();
		System.out.println("Total windows opened currently= " +listOfHandles.size());
		for(String handle:listOfHandles)
			
		{
			System.out.print("Current active window handle: "+handle);
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				String url = driver.getCurrentUrl();
				String title = driver.getTitle();
				System.out.print("url=" +url+" and title="+title);
				
			
			}
					
		}
		
		driver.switchTo().window(parentWindow);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.print("url="+url+" and title="+title); 
		
	
		
		//WebElement closebutton = driver.findElement(By.xpath("//button[contains='Close']"));
		//closebutton.click();
		Thread.sleep(2000);
		driver.quit();		
		
		
		
		
		


	}

}
