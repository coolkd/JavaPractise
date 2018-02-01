package com.kuldeep.selenium;

public class JavaMethodSample2 {
//Create method
public int add(int a, int b, int c) {
int result = a +  b + c;
return result ;
}
public static void main (String [] args) {
//Create object
JavaMethodSample2 obj1= new JavaMethodSample2();
//Calling Internal Method
int x = obj1.add(10,20,30);
System.out.println(x);

//Create object
JavaMethodSample1 obj2 = new JavaMethodSample1();
//Calling External Method
int y = obj2.multiply(10,20,30);
System.out.println(y);
		
	}

}
