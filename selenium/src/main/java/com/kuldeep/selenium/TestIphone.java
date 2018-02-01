package com.kuldeep.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIphone {
	
	public static void main(String args[]) {
		
		Iphone ip = new Iphone();
		
		ip.call();
	    ip.recharge();
	    ip.Imaps();
	    
		
		Samsung s = new Samsung();
		
		s.call();
		s.recharge();
			
		
		System.out.println("----------------");
		
		
		Mobile m = new Samsung();
		
		m.call();
		m.recharge();
		
		Samsung s1 = new Samsung();
		
		s1.call();
		s1.recharge();
		
		System.out.println("----------------");
		
		
		Samsung s2 =null;
		
		s2 = new Samsung();
		
		s.call();
		s.recharge();
		
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		
	}
	
}


	


