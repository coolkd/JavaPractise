package com.kuldeep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMATravel {


	public static void main(String args[]) throws InterruptedException {
		
		// setup your driver
		System.setProperty("webdriver.gecko.driver", "/home/kuldeep/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// test case 1 check invalid usernme
		checkInvalidUsernamePassword(driver);

		/// test case 2 check valid username

		Tocheckvalidusernme(driver);
		driver.quit();
	}

	private static void Tocheckvalidusernme(WebDriver driver) throws InterruptedException {
		driver.get("http://hmatravel.com/travel/");

		WebElement username1 = driver.findElement(By.xpath("//input[@id='userLoginForm:userName']"));

		username1.sendKeys("ashwin");

		WebElement password = driver.findElement(By.xpath("//input[@id='userLoginForm:password']"));

		password.sendKeys("welcome");

		WebElement loginbutton = driver.findElement(By.id("userLoginForm:login"));

		loginbutton.click();
		Thread.sleep(5000);

		WebElement validUsername = driver.findElement(By.xpath("//*[@id='app-logo']/img"));

		if (validUsername != null) {
			System.out.println("valid username/password");
		}
	}

	private static void checkInvalidUsernamePassword(WebDriver driver) throws InterruptedException {

		driver.get("http://hmatravel.com/travel/");

		WebElement username1 = driver.findElement(By.xpath("//input[@id='userLoginForm:userName']"));

		username1.sendKeys("hello");

		WebElement password = driver.findElement(By.xpath("//input[@id='userLoginForm:password']"));

		password.sendKeys("welcome");

		WebElement loginbutton = driver.findElement(By.id("userLoginForm:login"));

		loginbutton.click();
		Thread.sleep(3000);

		WebElement invalidUsername = driver.findElement(By.xpath("//span[@class='ui-messages-error-summary']"));

		if (invalidUsername != null) {
			System.out.println("invalid username/password");
		}
		// driver.close();
	}
}