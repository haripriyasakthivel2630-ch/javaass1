package com.index;

import java.util.Scanner;

public class Assignment2_while2 {

	public static void main(String[] args) {
		System.out.println("Enter your Password:");
		Scanner pass=new Scanner(System.in);
		String password=pass.next();
		while(password.length()<8) {
			System.out.println("Password is too short");
			System.out.println("Enter your Password:");
			password=pass.next();
		}

	}

}
