package com.kuldeep.selenium;
import java.util.Scanner;

public class IoOperations10 {

	public static void main(String[] args) {
		int a =10;
		int b =0;
		
		int abc[] = new int[4];
		
        try {
        int result =a/b;
        System.out.println(result);
        
	}
        catch(ArithmeticException e) {
        	System.out.println("Divided by zero");
        	
        }
        System.out.println("Hello Java");
        try {
        	abc[30]=200;
            System.out.println(abc[30]);
        }
        catch (ArrayIndexOutOfBoundsException e2){
        	System.out.println("Array  index out of bounds error");
        }
        System.out.println("Hello Selenium");
}
}


