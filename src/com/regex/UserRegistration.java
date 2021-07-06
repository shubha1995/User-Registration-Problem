package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problems");
		System.out.println("Enter the First Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		
		Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
        	System.out.println("First name is Valid");
        else
        	System.out.println("Last name is Invalid");
	}

}
