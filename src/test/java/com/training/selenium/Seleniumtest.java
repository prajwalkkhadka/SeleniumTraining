package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys("Automation");
		
		WebElement linkAbout = driver.findElement(By.linkText("About"));
		linkAbout.click();
		
		//WebElement searchButton = driver.findElement(By.className("gNO89b"));
		//searchButton.click();
		
		Thread.sleep(1000);
		driver.close();
	}

}
