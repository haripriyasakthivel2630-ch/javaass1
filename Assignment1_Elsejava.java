package com.index;

import java.util.Scanner;


public class Assignment1_Elsejava {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=obj.nextInt();
		
		
		if(age<13) {
			System.out.println("Child");
		}else if(age<=20) {
			System.out.println("Teenager");
		}else if(age<=20 && age<60) {
			System.out.println("Adult");
			
		}else {
			System.out.println("Senoir citizen");
		}
		obj.close();

	}

}
