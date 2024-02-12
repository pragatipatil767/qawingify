package com.tka.sum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "D:/121/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sakshingp.github.io/assignment/login.html");
		
		driver.findElement(By.id("username")).sendKeys("Pragati Patil");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input")).click();		
		WebElement login =driver.findElement(By.id("log-in"));
		login.click();		
        driver.findElement(By.id("amount")).click();	
		
	
	}

}
