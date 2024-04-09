package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicday3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		
		WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		HomeTab.click();
		Thread.sleep(2000);
		
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).build().perform();
		Thread.sleep(3000);
	  
		

	}

}
