package com.kuldeep.selenium;

public class BuiltInMethods11 {

	public static void main(String[] args) {
		// Integer class wraps a value of the primitive type int in an object
		// An object of Type Integer contains a single field whose type is int.
		int x= 5;
		Integer a = x;
		System.out.println(a.compareTo(5));//0
	    System.out.println(a.compareTo(6));//-1
		System.out.println(a.compareTo(4));//1

	}

}
