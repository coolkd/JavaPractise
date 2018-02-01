package com.kuldeep.selenium;

public class StringHandling2 {
	
	public static void main (String [] args) {
		
		String str1 = "Selenium";
		String str2 = " Testing";
		System.out.println(str1 + str2);//Selenium Testing
		System.out.println("Selenium" + (1 + 1));//Selenium2
		System.out.println("Selenium" + 1 + 1);//Selenium11
		System.out.println(1 + 1 + "Selenium");//2Selenium
		System.out.println("1" + 1 + "Selenium");//11Selenium
			
	}

}
