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
				+ "2. Enter the Last Name\n"
				+ "3. Enter the Email Address\n"
				+ "4. Enter the Valid Phone Number\n"
				+ "5. Pass Word Rule 1\n"
				+ "6. Pass Word Rule 2\n"
				+ "7. Pass Word Rule 2\n");

		int option = sc.nextInt();
		System.out.println();
		switch (option) {
		//Check First Name
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
			
			//Check Last Name
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
			
			//Check Email Address
			
		case 3:
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter the Email Address");
			String email = sc3.next();

			String regex2 = "^[a-zA-Z]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

			Pattern p2 = Pattern.compile(regex2);
			Matcher m2 = p2.matcher(email);
			boolean r2 = m2.matches();
			if (r2)
				System.out.println("Email Address is Valid");
			else
				System.out.println("Email Address is Invalid");
			break;
			
			//Check Phone No.
			
		case 4:
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter the Phone No.");
			String phoneNo = sc4.nextLine();

			String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";

			Pattern p3 = Pattern.compile(regex3);
			Matcher m3 = p3.matcher(phoneNo);
			boolean r3 = m3.matches();
			if (r3)
				System.out.println("Phone No. is Valid");
			else
				System.out.println("Phone No. is Invalid");
			break;
			
			//Check Password Rule 1
			
		case 5:
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Enter the PassWord");
			String passWord = sc5.nextLine();

			String regex4 = "^[a-zA-Z0-9]{8,}$";

			Pattern p4 = Pattern.compile(regex4);
			Matcher m4 = p4.matcher(passWord);
			boolean r4 = m4.matches();
			if (r4)
				System.out.println("Pass Word is Valid");
			else
				System.out.println("Pass Word is Invalid");
			break;
			
			//Check Password Rule 2
			
		case 6:
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Enter the PassWord");
			String passWord1 = sc6.nextLine();

			String regex5 = "^[A-Z]{1}+[a-zA-Z0-9]{8,}$";

			Pattern p5 = Pattern.compile(regex5);
			Matcher m5 = p5.matcher(passWord1);
			boolean r5 = m5.matches();
			if (r5)
				System.out.println("Pass Word is Valid");
			else
				System.out.println("Pass Word is Invalid");
			break;
			
			//Check Password Rule 2
			
		case 7:
			Scanner sc7 = new Scanner(System.in);
			System.out.println("Enter the PassWord");
			String passWord2 = sc7.nextLine();

			String regex6 = "^[A-Z]{1}+[a-zA-Z].+[0-9].+{8,}$";

			Pattern p6 = Pattern.compile(regex6);
			Matcher m6 = p6.matcher(passWord2);
			boolean r6 = m6.matches();
			if (r6)
				System.out.println("Pass Word is Valid");
			else
				System.out.println("Pass Word is Invalid");
			break;
			
			
			}
	}
}
