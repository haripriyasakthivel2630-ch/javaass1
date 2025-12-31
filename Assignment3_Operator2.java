package com.index;
import java.util.Scanner;

public class Assignment3_Operator2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of A :");
		int num=obj.nextInt();
		if(num<0) {
			System.out.println("It is a negative number:"+num);
		}
		else if (num>0) {
			System.out.println("It is a positive number:"+ num);
		}
		else {
			System.out.println("It's equal to zero ");
		}
       obj.close();
	}

}
