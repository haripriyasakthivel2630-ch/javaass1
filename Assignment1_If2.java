package com.index;

import java.util.Scanner;

public class Assignment1_If2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = obj.next();

        System.out.println("Enter your password:");
        String password = obj.next();

        if (username.equals("Priya") && password.equals("2630")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        obj.close();
    }
}









	}

}
