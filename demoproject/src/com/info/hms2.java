package com.info;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hms2 {
	public static WebDriver driver;
	public static void URL()
	{
		System.setProperty("webdriver.chrome.driver","F:\\library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("seleniumbymahesh");
		driver.findElement(By.name("btnK")).submit();	
		
	}
	public static void method2() throws InterruptedException
	{
		
		driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).click();
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		
			
		
	}
	public static void Registration() {
		driver.findElement(By.linkText("Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		driver.findElement(By.linkText("Feedback")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Object[] s = windows.toArray();
driver.switchTo().window((String) s[1]);
driver.findElement(By.id("name")).sendKeys("Baby");
driver.close();
driver.switchTo().window((String) s[0]);
driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Mounika");

		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		URL();
		method2();
		Registration();
		
		// TODO Auto-generated method stub

	}

}
