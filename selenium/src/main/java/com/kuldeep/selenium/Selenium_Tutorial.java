package com.kuldeep.selenium;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Tutorial {
	
	public static void main (String[] args, String browser) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of browser");
		browser = sc.toString();
		
		String browser1= "Mozilla";
		
		//Script
		
		WebDriver driver = null;
		
		if (browser1.equals("Mozilla")) {
			
			System.setProperty("webdriver.gecko.driver","/home/kuldeep/Downloads/geckodriver");
			driver = new FirefoxDriver();
			
		}	else if (browser1.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/home/kuldeep/Downloads/chromedriver");
			driver = new ChromeDriver();
			
			
		}
		
		// code
		
		driver.get("http://hmatravel.com");
		//interact
		//driver.quit();
		
		WebElement username =driver.findElement(By.xpath("//*[@id='userLoginForm:userName']"));
		username.sendKeys("hello");
		
		WebElement password =driver.findElement(By.xpath("//*[@id='userLoginForm:password']']"));
		password.click();
	}

}
