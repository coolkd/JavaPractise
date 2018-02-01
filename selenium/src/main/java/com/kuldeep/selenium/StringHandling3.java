package com.kuldeep.selenium;

public class StringHandling3 {

	public static void main(String[] args) {
		
		String str1 = "selenium";
		String str2 = "SELENIUM";
		String str3 = "SELENIUM";
		String str4 = "zselenium";
		
		//String comparison using == operator
		
		System.out.println(str1 == str2);//false
		System.out.println(str2 == str3);//true
		
		//String Comparison using equal() method
       
		System.out.println(str1.equals(str2));//false
		System.out.println(str2.equals(str3));//true
		
		//String Comparison using compareTo() method
		
		System.out.println(str1.compareTo(str2));//Greater than 0
		System.out.println(str2.compareTo(str3));//0
		System.out.println(str1.compareTo(str4));//Less than 0
		
	}

}
