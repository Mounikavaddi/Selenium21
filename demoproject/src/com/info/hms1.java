package com.info;

//import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;

public class hms1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("seleniumbymahesh");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md")).click();
		driver.findElement(By.linkText("HMS")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Vaddi");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Mounika");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Seshu");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Lakshmi");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Ms.");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Mother");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Others");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Teacher");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("USA");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Female");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("718456849");
		driver.findElement(By.name("AGE")).sendKeys("25");
		driver.findElement(By.name("ADDRESS1")).sendKeys("DMM");
		driver.findElement(By.name("ADDRESS2")).sendKeys("ATP");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9849882835");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("mounika@gmail.com");
		driver.findElement(By.name("ZIP")).sendKeys("515671");
		driver.findElement(By.name("DOB")).click();
		//driver.findElement(By.id("tcalPrevMonth")).click(); 
		driver.findElement(By.xpath("//td[text()='25']")).click();
		//driver.findElement(By.id("tcalNextMonth")).click(); 
		//driver.findElement(By.id("tcalNextMonth")).click(); 
		driver.findElement(By.cssSelector("input.photo")).click();
		driver.findElement(By.name("submit")).click(); 
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

