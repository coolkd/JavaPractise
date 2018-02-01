package com.kuldeep.selenium;

public class JavaMethod3 {
	//Create method without returning any value(without object)
	
public static void studentRank(int marks) {
if (marks >=500) {
System.out.println("Rank A");
}
else if (marks >=600) {
System.out.println("Rank B");
}
else { 
System.out.println("Rank C");
}
}
 public static void main (String [] args) {
//Call method without object
studentRank(450);
 
 }
 
 }
 
 


