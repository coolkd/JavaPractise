package com.kuldeep.selenium;

public class BuiltInMethods9 {

	public static void main(String[] args) {
	String str = "Welcome to Selenium Testing";
	
	System.out.println(str.endsWith("Selenium Testing"));//true
	System.out.println(str.endsWith("Testing"));//true
	System.out.println(str.endsWith("Selenium"));//false

	}

}
