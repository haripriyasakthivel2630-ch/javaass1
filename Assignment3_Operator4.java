package com.index;
 import java.util.Scanner;
public class Assignment3_Operator4 {

	public static void main(String[] args) {
		System.out.println("Enter the first value:");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the second value:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("Before swapping:"+"a="+a+""+"b=+b");
		System.out.println("After swapping:");
		a=a+b;
		b=a-b;
		a=a-b;
	}
    System.out.println("a="+a"b="+b);
}
}