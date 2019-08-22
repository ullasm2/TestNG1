package org.india.TestNG1;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
static WebDriver  driver;

@BeforeClass // Launch Browser
public void tc1() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\TestNG1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https:///www.facebook.com");
	}
@AfterClass // Quit
//public void tc2() {
//driver.close();
//}

@BeforeMethod // Start time
private void tc3() {
Date d=new Date();
System.out.println(d);
}
@AfterMethod // End Time
private void tc4() {
Date d1 = new Date();
System.out.println(d1);
}
@Test // Logic
private void tc5() {
	driver.findElement(By.id("email")).sendKeys("hi5ullas5@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("1233456789");
}













	
}
