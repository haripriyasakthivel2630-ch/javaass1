package com.index;
import java.util.Scanner;

public class Assignment3_Operator3 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.pritnln("Enter the age:");
		int age=sr.nextInt();
		if(age>=18 && age<=60) {
			System.out.println("Eligiable age");
		}
		else {
			System.out.println("Not Eligiable age");
		}
		sr.close();
	}

}
