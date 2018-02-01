package com.kuldeep.selenium;

import java.util.Scanner;

public class IoOperations7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read two numbers");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		scan.close();

	}

}
