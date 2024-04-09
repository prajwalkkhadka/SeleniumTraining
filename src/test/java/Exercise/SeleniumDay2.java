package Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		
		//String strusername = username.getText();
		//System.out.println(strusername);
		
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("prajwal@mydomain.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Charlotte@123");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		
				
	}

}
