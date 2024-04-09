package salesforceAutomationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTC7 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
		logintoApplication();
		myProfile();
		post();
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
		Thread.sleep(3000); 
		
		WebElement profiletab = driver.findElement(By.id("userNav"));
		profiletab.click();
		Thread.sleep(3000);
		
		}
		
		 static void myProfile() throws InterruptedException {
			 
			WebElement profile =  driver.findElement(By.xpath("//a[@title='My Profile']"));
			profile.click();
			Thread.sleep(2000);
			
			WebElement contact = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		    contact.click();
		    
		    WebElement frame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		    driver.switchTo().frame(frame);
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		    
		    WebElement lastname = driver.findElement(By.name("lastName"));
		    lastname.clear();
		    
		    WebElement lastname1 = driver.findElement(By.name("lastName"));
		    lastname1.sendKeys("Khadka");
		    
		    WebElement submit = driver.findElement(By.xpath("//input[@value='Save All']"));
		    submit.click();
		    
		    Thread.sleep(1000);
		
			}

				static  void post() throws InterruptedException {
					
					driver.switchTo().defaultContent();
					Thread.sleep(3000);
					
					WebElement post = driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
					post.click();
					
					driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
					driver.findElement(By.xpath("//body")).sendKeys("Automation!");
					driver.switchTo().defaultContent();
					//driver.findElement(By.xpath("//div[@class=bottomBarRight']")).click();
					
					//WebElement typetext = driver.findElement(By.xpath("//body[contains(text(),'Share an update')]"));
					//typetext.sendKeys("This is automation");
					
					
					
							
					WebElement submit = driver.findElement(By.id("publishersharebutton"));
					submit.click();
					Thread.sleep(1000);
					
					WebElement filelink = driver.findElement(By.xpath("//span[normalize-space()='File']"));
					filelink.click();
					
			
					WebElement uploadfile = driver.findElement(By.xpath("//a[contains(text(),'Upload a file from your computer')]"));
					uploadfile.click();
					Thread.sleep(3000);
					WebElement choosefile = driver.findElement(By.xpath("//input[@class='file']"));
					Thread.sleep(3000);
					choosefile.sendKeys("/Users/prajwalkhadka/Desktop/Screenshots/Screenshot 2024-03-15 at 4.44.59 PM.png");
					Thread.sleep(3000);
					//uploadphoto.sendKeys("/Users/prajwalkhadka/Desktop/Screenshots/Screenshot 2024-03-15 at 4.44.59 PM.png");
					
					WebElement savewebbutton = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save']"));
					savewebbutton.click();
					
				    WebElement lastsave = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save']"));
				    lastsave.click();
					
					WebElement addphoto = driver.findElement(By.xpath("/input[@id='chatterFile']"));
					addphoto.click(); 
					
					
					
					//WebElement 
					
					

				
			}    
	
		}

	


