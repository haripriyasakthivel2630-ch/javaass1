package com.index;

import java.util.Scanner;

public class Assignment1_Forjava {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Password:");
		String pwd=obj.nextLine();
		if(pwd.length()<8) {
			System.out.println("Weak password");
		}
		
		obj.close();

	}

}
