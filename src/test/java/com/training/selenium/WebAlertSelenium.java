package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAlertSelenium {

	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_field']"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
		password.sendKeys("admin123");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		button.click();
		
		WebElement switchto = driver.findElement(By.xpath(""));
		Actions action = new Actions(driver); 
		action.moveToElement(switchto).build().perform();
		Thread.sleep(2000);
		
		
		

	
		
		
		
		
		
		
		

	}

}
