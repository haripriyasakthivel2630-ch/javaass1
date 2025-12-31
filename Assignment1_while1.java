package com.index;

import java.util.Scanner;

public class Assignment1_while1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a PIN:");
		int pin=obj.nextInt();
		while(pin!=1234) {
			System.out.println("Incorrect please retry!");
			System.out.println("Enter the PIN:");
			pin=obj.nextInt();
		}
		
       System.out.println("access granted!");
       obj.close();
		
	}

}
