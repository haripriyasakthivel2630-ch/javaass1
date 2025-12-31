package com.index;

import java.util.Scanner;
import java.util.scanner;
public class Assignment_java1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.prinltn("Menu");
			System.out.prinltn("1.Add");
			System.out.prinltn("2.Sub");
			System.out.prinltn("3.Exit");
			System.out.prinltn("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case1:
				System.out.println("Enter two numbers:");
			   int a=sc.nextInt();
			   int b=sc.nextInt();
			   System.out.println("Addition of two numbers:"+(a+b));
			   break;
			   case2:
					System.out.println("Enter two numbers:");
				   int a1=sc.nextInt();
				   int b1=sc.nextInt();
				   System.out.println("Subtraction of two numbers:"+(a1-b1));
				   break;
				   
				   case3:
					   System.out.println("Exit");
				       break;
				       
				       default:
				    	   System.out.println("Invalid choice");
			}
		}
		while(choice!=3);
	}
}
				    	   
			}
			
			
		}

	}

}
