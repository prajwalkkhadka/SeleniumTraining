package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		
		
		Thread.sleep(3000);
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
		
		WebElement male = driver.findElement(By.xpath("//input[@value='male']"));
		male.click();
		
		WebElement citydropdown = driver.findElement(By.id("city"));
		Select city = new Select(citydropdown);
		city.selectByVisibleText("GOA");
		
		
		WebElement coursedropdown = driver.findElement(By.name("course"));
		Select course = new Select(coursedropdown);
		course.selectByVisibleText("MBA");
		//course.selectByIndex(3); 
		
		
		WebElement districtdropdown = driver.findElement(By.name("district"));
		Select district = new Select(districtdropdown);
		district.selectByIndex(2);
		
		WebElement statedropdown = driver.findElement(By.id("state"));
		Select state = new Select(statedropdown);
		state.selectByValue("bca");
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Prajwal K.");
		
		WebElement Father = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
		Father.sendKeys("GB Khadka");
		
		WebElement postal = driver.findElement(By.id("postaladdress"));
		postal.sendKeys("22806 Claude Wintchester Dr");
		
	   WebElement address =  driver.findElement(By.id("personaladdress"));
	   address.sendKeys("Same as postal address");
	   
	   WebElement PinCode = driver.findElement(By.xpath("//input[@id='pincode']"));
	   PinCode.sendKeys("28262");
	   
	   WebElement Emailaddress = driver.findElement(By.xpath("//input[@id='emailid']"));
	   Emailaddress.sendKeys("prajwal@google.com");
	   
	   WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
	   submit.click();
	   Thread.sleep(3000);
	   
	   driver.close();
	   
	   
	   
	   
	    
		
		
		
		
		
		
			
		}
			 
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}
	
			
	
	
	


