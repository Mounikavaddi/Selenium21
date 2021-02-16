package com.info;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	public static void launch(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\library\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
					
		}else if(browser.equals("Firefox")) {
				driver=new FirefoxDriver();
				
			}
		}
		
	
	public static void navigateUrl(String Url ){
		driver.get(Url);
		
	}
}
	

	

