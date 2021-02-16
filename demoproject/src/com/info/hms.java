package com.info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.jetty.html.Select;
//import org.openqa.selenium.support.ui.Select;


public class hms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("kajol");
		driver.findElement(By.name("btnK")).submit();
		//driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).click();
		//driver.findElement(By.linkText("FAQ’s")).click();
		//new Select(driver.findElement(By.id("menu-item-84"))).selectByVisibleText("Manual FAQ’s");
		/*//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("admin");

		// TODO Auto-generated method stub*/

	}

}