package com.index;
import java.util.Scanner;

public class Assignment4_java {
	static int staticVar;
	int instanceVar;
	void dsiplay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter local variable value:");
		int localvar=sc.nextInt();
		System.out.println("\nlocalVariable:"+loaclVar);
		System.out.println("Instance variable:"+instancevar);
		System.out.println("Static variable: "+staticvar);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Assignment4_java obj=new Assignment4_javaScanner();
		
		System.out.print("Enter instance variable value: ");
        obj.instanceVar = sc.nextInt();

        System.out.print("Enter static variable value: ");
        staticVar = sc.nextInt();

        obj.display();
        
        sc.close();
		

	}

}
