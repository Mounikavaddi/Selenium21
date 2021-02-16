package com.info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver","F:\\library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.gmail.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).submit();
		
		//driver.findElement(By.xpath("//span[text()='Selenium WebDriver']")).submit();
		

	}

}		