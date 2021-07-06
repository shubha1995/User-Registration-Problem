package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration Problems\\n\\n"
				+ "Choose your option:\n"
				+ "1. Enter the First Name\n"
				+ "2. Enter the Last Name\n");
				
		int option = sc.nextInt();
		System.out.println();
		switch (option) {

		case 1:
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fname = sc1.next();
		
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		
		Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fname);
        boolean r = m.matches();
        if (r)
        	System.out.println("First name is Valid");
        else
        	System.out.println("Last name is Invalid");
        break;
        
		case 2:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the Last Name");
			String lname = sc2.next();
			
			String regex1 = "^[A-Z]{1}[a-z]{2,}$";
			
			Pattern p1 = Pattern.compile(regex1);
	        Matcher m1 = p1.matcher(lname);
	        boolean r1 = m1.matches();
	        if (r1)
	        	System.out.println("Last name is Valid");
	        else
	        	System.out.println("Last name is Invalid");
	        break;
    
			
	}

}
}
