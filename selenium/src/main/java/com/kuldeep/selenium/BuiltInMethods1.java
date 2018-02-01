package com.kuldeep.selenium;

public class BuiltInMethods1 {

	public static void main(String[] args) {
		String str1 = "selenium";
		String str2 =  "SELENIUM";
		String str3 =  "seleniuma";
		String str4 =  "selenium";
		System.out.println(str1.compareTo(str2));//Positive value
		System.out.println(str1.compareTo(str3));//Negative value
		System.out.println(str1.compareTo(str4));//0
	
}

}
