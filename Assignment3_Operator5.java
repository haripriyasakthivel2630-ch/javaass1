package com.index;

import java.util.Scanner;

public class Assignment3_Operator5 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the salary amount");
		int salary=obj.nextInt();
		salary+=1000;
		System.out.println(salary);
		salary-=1000;
		System.out.println(salary);
		salary*=7;
		System.out.println(salary);
		salary/=6;
		System.out.println(salary);

	}

}
