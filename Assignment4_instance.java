package com.index;

import java.util.Scanner;

public class Assignment4_instance {
	static int staticVar;
	int InstanceVar;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Assignment4_instance obj1=new Assignment4_instance ();
		Assignment4_instance  obj2=new Assignment4_instance ();
		
		System.out.println("Enter value for static variable:");
		staticVar=sc.nextInt();
		
		System.out.println("Enter value for instance variable(obj1):");
		obj1.InstanceVar=sc.nextInt();
		
		System.out.println("\n Static Variable (Shared):"+staticVar);
		System.out.println("Instance Variable(obj1):"+ obj1.InstanceVar);
		System.out.println("Instance Variable(obj2):"+obj2.InstanceVar);
		
		
      sc.close();
	}

}
