package com.kuldeep.selenium;

import java.io.File;

public class IoOperations3 {

	public static void main(String[] args) {
		File fileObject = new File("/home/kuldeep/Downloads/Selenium");
		fileObject.mkdir();
		boolean a=fileObject.exists();
		if (a == true) {
			
			System.out.println("Folder Exists");
		}
		else
			System.out.println("Folder does not exist");
	}

}
