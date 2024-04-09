package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic4iFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li [contains(text(),'Item 1')]")).click();
		
	
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Item 5')]")).click();
		
		
		driver.close();

	}

}
