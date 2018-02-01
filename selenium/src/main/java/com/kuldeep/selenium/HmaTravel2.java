package com.kuldeep.selenium;

import java.util.ResourceBundle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HmaTravel2 {

	protected static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static void main(String args[]) throws InterruptedException {
		
		// Driver setup
		
		System.setProperty("webdriver.chrome.driver", "/home/kuldeep/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://atlas:hydra@test.hmatravel.com/travel/");
		
		
		// Test case 1 > valid username > invalid passowrd

		WebElement username = driver.findElement(By.xpath("//*[@id='userLoginForm:userName']"));

		username.sendKeys("xxxx");

		WebElement password = driver.findElement(By.xpath("//*[@id='userLoginForm:password']"));

		password.sendKeys("xxxx");

		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='userLoginForm:login']"));

		loginbutton.click();

		Thread.sleep(5000);

		boolean login = isElementPresent(driver, By.xpath("//span[@class='ui-messages-error-summary']"));
		if (login) {
			System.out.println("invalid password");
		}

		// driver.close();

		// Test case 2 invalid username and valid password

		WebElement username1 = driver.findElement(By.xpath("//*[@id='userLoginForm:userName']"));

		username1.sendKeys("xxxxx");

		WebElement password1 = driver.findElement(By.xpath("//*[@id='userLoginForm:password']"));

		password1.sendKeys("xxxxx");

		WebElement loginbutton2 = driver.findElement(By.xpath("//button[@id='userLoginForm:login']"));

		loginbutton2.click();

		Thread.sleep(5000);

		// Test case 3 valid username and passowrd

		WebElement username2 = driver.findElement(By.xpath("//*[@id='userLoginForm:userName']"));

		username2.sendKeys("kane-hma travels-kverma");

		WebElement password11 = driver.findElement(By.xpath("//*[@id='userLoginForm:password']"));

		password11.sendKeys("kane-hma travels-kverma");

		WebElement loginbutton1 = driver.findElement(By.id("userLoginForm:login"));

		loginbutton1.click();

		Thread.sleep(5000);

		driver.close();

	}

}
