package org.india.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	
@Test (priority=-10)
private void tc1() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\TestNG1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("hi5ullas5@gmail.com");
driver.findElement(By.id("pass")).sendKeys("123456");
	

}
@Test (priority=10)
private void tc2() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\TestNG1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.instagram.com");
WebElement button = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
button.click();



}





}
