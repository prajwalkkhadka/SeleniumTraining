package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3a {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		logintoApplication();	
		homeTab();  
		switchToTab();
		alert();

	}
	static void logintoApplication() throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

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

	}				static void homeTab() throws InterruptedException {


		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		Thread.sleep(2000);


	}

	static void switchToTab() {

		WebElement switchto = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action = new Actions(driver); 
		action.moveToElement(switchto).build().perform();


	}

	static void alert() {
		WebElement Alert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		Alert.click();
		
		WebElement windowalert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		windowalert.click();
		
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String alertText = driver.switchTo().alert().getText();
		System.out.print(alertText);
		driver.switchTo().alert().accept();
		
	}
}
