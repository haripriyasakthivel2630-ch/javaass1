package com.index;

import java.util.Scanner;

public class Assignment_Do_While {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String phn;
		do {
			System.out.println("Enter your phone Number:");
			phn=sc.next();
			
		}
			while(phn.length()!=10);

	}

}
