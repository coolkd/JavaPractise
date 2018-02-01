package com.kuldeep.selenium;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class App {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/home/kuldeep/Downloads/geckodriver");
        FirefoxDriver f1 = new FirefoxDriver();
		ProfilesIni ini = new ProfilesIni();
		
		
		f1.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.chrome.driver","/home/kuldeep/Downloads/chromedriver");
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://yahoo.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
