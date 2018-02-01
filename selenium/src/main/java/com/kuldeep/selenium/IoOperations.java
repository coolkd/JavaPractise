package com.kuldeep.selenium;

import java.util.Scanner;

public class IoOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//System.in is an input stream, 
		
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter Your City");
		String city = scan.next();
		System.out.println("Your city is "+city);
		
		System.out.println("Enter a Number");
		int num1 = scan.nextInt();
		System.out.println("Your number is "+num1);
		
		System.out.println("Enter a Mobile Number");
		long num2 = scan.nextLong();
		System.out.println("Your Mobile number is "+num2);
		
		System.out.println("Enter a value");
		double num3 = scan.nextDouble();
		System.out.println("Your value is "+num3);
		
		System.out.println("Enter a Character");
		char a = scan.next().charAt(1);
		System.out.println("Your Char is "+a);
		
		System.out.println("Enter a value");
		boolean val = scan.nextBoolean();
		System.out.println("Your value is "+val);

	}

}
