package com.kuldeep.selenium;
import java.util.Scanner;

public class IoOperations9 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int result = a/b;
			System.out.println(result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by zero error");
		}
           System.out.println("Hello Java");
           System.out.println("Hello Selenium");
	}

}
