package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		//Launch the browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin1234");
		
		WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		Login.click();
		Thread.sleep(2000);
		
		Alert alertbutton = driver.switchTo().alert();
		String text = alertbutton.getText();
		System.out.println("Please type the correct password");
		alertbutton.accept();
		Thread.sleep(3000);
		
		
	}
}