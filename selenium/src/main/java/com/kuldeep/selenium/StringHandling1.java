package com.kuldeep.selenium;

public class StringHandling1 {
	
	public static void main (String []args) {
		
		String myTool = "Selenium";//String variable
		String [] myTools = {"UFT", "Selenium", "Loadrunner", "RFT"};//Array of string
		
		System.out.println("myTool");//Selenium
		
		for (String tool: myTools) {
			System.out.println(tool);
		}
	}

}
