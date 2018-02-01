package com.kuldeep.selenium;

public class StringHandling8 {

	public static void main (String [] args) {
		
		int [] array1 = {1,2,3,4,5};
        int array2 [] = array1;
        System.out.println(array2[2]);//3
        
        for (int i =0; i<array2.length; i++) {
        	System.out.println(array2[i]);
        }
	}
}
